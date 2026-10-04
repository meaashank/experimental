package com.android.launcher3;

import android.content.BroadcastReceiver;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.PackageInstallerCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.graphics.LauncherIcons;
import com.android.launcher3.model.AddWorkspaceItemsTask;
import com.android.launcher3.model.BaseModelUpdateTask;
import com.android.launcher3.model.BgDataModel;
import com.android.launcher3.model.CacheDataUpdatedTask;
import com.android.launcher3.model.LoaderResults;
import com.android.launcher3.model.LoaderTask;
import com.android.launcher3.model.ModelWriter;
import com.android.launcher3.model.PackageInstallStateChangedTask;
import com.android.launcher3.model.PackageUpdatedTask;
import com.android.launcher3.model.ShortcutsChangedTask;
import com.android.launcher3.model.UserLockStateChangedTask;
import com.android.launcher3.provider.LauncherDbUtils;
import com.android.launcher3.shortcuts.DeepShortcutManager;
import com.android.launcher3.shortcuts.ShortcutInfoCompat;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.ItemInfoMatcher;
import com.android.launcher3.util.MultiHashMap;
import com.android.launcher3.util.PackageUserKey;
import com.android.launcher3.util.Preconditions;
import com.android.launcher3.util.Provider;
import com.android.launcher3.util.ViewOnDrawExecutor;
import com.android.launcher3.widget.WidgetListRowEntry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class LauncherModel extends BroadcastReceiver implements LauncherAppsCompat.OnAppsChangedCallbackCompat {
    private static final boolean DEBUG_RECEIVER = false;
    static final String TAG = "Launcher.Model";
    public static final BgDataModel sBgDataModel;
    static final Handler sWorker;
    static final HandlerThread sWorkerThread;
    final LauncherAppState mApp;
    private final AllAppsList mBgAllAppsList;
    WeakReference<Callbacks> mCallbacks;
    boolean mIsLoaderTaskRunning;
    LoaderTask mLoaderTask;
    private boolean mModelLoaded;
    private final MainThreadExecutor mUiExecutor = new MainThreadExecutor();
    final Object mLock = new Object();
    private final Runnable mShortcutPermissionCheckRunnable = new Runnable() { // from class: com.android.launcher3.LauncherModel.1
        @Override // java.lang.Runnable
        public void run() {
            if (!LauncherModel.this.mModelLoaded || DeepShortcutManager.getInstance(LauncherModel.this.mApp.getContext()).hasHostPermission() == LauncherModel.sBgDataModel.hasShortcutHostPermission) {
                return;
            }
            LauncherModel.this.forceReload();
        }
    };

    public interface CallbackTask {
        void execute(Callbacks callbacks);
    }

    public interface Callbacks {
        void bindAllApplications(ArrayList<AppInfo> arrayList);

        void bindAllWidgets(ArrayList<WidgetListRowEntry> arrayList);

        void bindAppInfosRemoved(ArrayList<AppInfo> arrayList);

        void bindAppsAdded(ArrayList<Long> arrayList, ArrayList<ItemInfo> arrayList2, ArrayList<ItemInfo> arrayList3);

        void bindAppsAddedOrUpdated(ArrayList<AppInfo> arrayList);

        void bindDeepShortcutMap(MultiHashMap<ComponentKey, String> multiHashMap);

        void bindItems(List<ItemInfo> list, boolean z10);

        void bindPromiseAppProgressUpdated(PromiseAppInfo promiseAppInfo);

        void bindRestoreItemsChange(HashSet<ItemInfo> hashSet);

        void bindScreens(ArrayList<Long> arrayList);

        void bindShortcutsChanged(ArrayList<ShortcutInfo> arrayList, UserHandle userHandle);

        void bindWidgetsRestored(ArrayList<LauncherAppWidgetInfo> arrayList);

        void bindWorkspaceComponentsRemoved(ItemInfoMatcher itemInfoMatcher);

        void clearPendingBinds();

        void executeOnNextDraw(ViewOnDrawExecutor viewOnDrawExecutor);

        void finishBindingItems();

        void finishFirstPageBind(ViewOnDrawExecutor viewOnDrawExecutor);

        int getCurrentWorkspaceScreen();

        void onPageBoundSynchronously(int i10);

        void rebindModel();

        void startBinding();
    }

    public class LoaderTransaction implements AutoCloseable {
        private final LoaderTask mTask;

        @Override // java.lang.AutoCloseable
        public void close() {
            synchronized (LauncherModel.this.mLock) {
                try {
                    LauncherModel launcherModel = LauncherModel.this;
                    if (launcherModel.mLoaderTask == this.mTask) {
                        launcherModel.mLoaderTask = null;
                    }
                    launcherModel.mIsLoaderTaskRunning = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void commit() {
            synchronized (LauncherModel.this.mLock) {
                LauncherModel.this.mModelLoaded = true;
            }
        }

        private LoaderTransaction(LoaderTask loaderTask) throws CancellationException {
            synchronized (LauncherModel.this.mLock) {
                try {
                    if (LauncherModel.this.mLoaderTask != loaderTask) {
                        throw new CancellationException("Loader already stopped");
                    }
                    this.mTask = loaderTask;
                    LauncherModel.this.mIsLoaderTaskRunning = true;
                    LauncherModel.this.mModelLoaded = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public interface ModelUpdateTask extends Runnable {
        void init(LauncherAppState launcherAppState, LauncherModel launcherModel, BgDataModel bgDataModel, AllAppsList allAppsList, Executor executor);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("launcher-loader");
        sWorkerThread = handlerThread;
        handlerThread.start();
        sWorker = new Handler(handlerThread.getLooper());
        sBgDataModel = new BgDataModel();
    }

    public LauncherModel(LauncherAppState launcherAppState, IconCache iconCache, AppFilter appFilter) {
        this.mApp = launcherAppState;
        this.mBgAllAppsList = new AllAppsList(iconCache, appFilter);
    }

    public static void checkItemInfo(final ItemInfo itemInfo) {
        final StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        final long j10 = itemInfo.f136873id;
        runOnWorkerThread(new Runnable() { // from class: com.android.launcher3.LauncherModel.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (LauncherModel.sBgDataModel) {
                    LauncherModel.checkItemInfoLocked(j10, itemInfo, stackTrace);
                }
            }
        });
    }

    public static void checkItemInfoLocked(long j10, ItemInfo itemInfo, StackTraceElement[] stackTraceElementArr) {
        ItemInfo itemInfo2 = sBgDataModel.itemsIdMap.get(j10);
        if (itemInfo2 == null || itemInfo == itemInfo2) {
            return;
        }
        if ((itemInfo2 instanceof ShortcutInfo) && (itemInfo instanceof ShortcutInfo)) {
            ShortcutInfo shortcutInfo = (ShortcutInfo) itemInfo2;
            ShortcutInfo shortcutInfo2 = (ShortcutInfo) itemInfo;
            if (shortcutInfo.title.toString().equals(shortcutInfo2.title.toString()) && shortcutInfo.intent.filterEquals(shortcutInfo2.intent) && shortcutInfo.f136873id == shortcutInfo2.f136873id && shortcutInfo.itemType == shortcutInfo2.itemType && shortcutInfo.container == shortcutInfo2.container && shortcutInfo.screenId == shortcutInfo2.screenId && shortcutInfo.cellX == shortcutInfo2.cellX && shortcutInfo.cellY == shortcutInfo2.cellY && shortcutInfo.spanX == shortcutInfo2.spanX && shortcutInfo.spanY == shortcutInfo2.spanY) {
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("item: ");
        sb2.append(itemInfo != null ? itemInfo.toString() : "null");
        sb2.append("modelItem: ");
        sb2.append(itemInfo2.toString());
        sb2.append("Error: ItemInfo passed to checkItemInfo doesn't match original");
        RuntimeException runtimeException = new RuntimeException(sb2.toString());
        if (stackTraceElementArr == null) {
            throw runtimeException;
        }
        runtimeException.setStackTrace(stackTraceElementArr);
        throw runtimeException;
    }

    public static Looper getWorkerLooper() {
        return sWorkerThread.getLooper();
    }

    public static ArrayList<Long> loadWorkspaceScreensDb(Context context) {
        return LauncherDbUtils.getScreenIdsFromCursor(context.getContentResolver().query(LauncherSettings.WorkspaceScreens.CONTENT_URI, null, null, null, LauncherSettings.WorkspaceScreens.SCREEN_RANK));
    }

    private static void runOnWorkerThread(Runnable runnable) {
        if (sWorkerThread.getThreadId() == Process.myTid()) {
            runnable.run();
        } else {
            sWorker.post(runnable);
        }
    }

    public static void setWorkerPriority(int i10) {
        Process.setThreadPriority(sWorkerThread.getThreadId(), i10);
    }

    public static void updateWorkspaceScreenOrder(Context context, ArrayList<Long> arrayList) {
        final ArrayList arrayList2 = new ArrayList(arrayList);
        final ContentResolver contentResolver = context.getContentResolver();
        final Uri uri = LauncherSettings.WorkspaceScreens.CONTENT_URI;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).longValue() < 0) {
                it.remove();
            }
        }
        runOnWorkerThread(new Runnable() { // from class: com.android.launcher3.LauncherModel.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<ContentProviderOperation> arrayList3 = new ArrayList<>();
                arrayList3.add(ContentProviderOperation.newDelete(uri).build());
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ContentValues contentValues = new ContentValues();
                    Long l10 = (Long) arrayList2.get(i10);
                    l10.longValue();
                    contentValues.put("_id", l10);
                    contentValues.put(LauncherSettings.WorkspaceScreens.SCREEN_RANK, Integer.valueOf(i10));
                    arrayList3.add(ContentProviderOperation.newInsert(uri).withValues(contentValues).build());
                }
                try {
                    contentResolver.applyBatch(LauncherProvider.AUTHORITY, arrayList3);
                    BgDataModel bgDataModel = LauncherModel.sBgDataModel;
                    synchronized (bgDataModel) {
                        bgDataModel.workspaceScreens.clear();
                        bgDataModel.workspaceScreens.addAll(arrayList2);
                    }
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
        });
    }

    public void addAndBindAddedWorkspaceItems(List<Pair<ItemInfo, Object>> list) {
        enqueueModelUpdateTask(new AddWorkspaceItemsTask(list));
    }

    public LoaderTransaction beginLoader(LoaderTask loaderTask) throws CancellationException {
        return new LoaderTransaction(loaderTask);
    }

    public void dumpState(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (strArr.length > 0) {
            int i10 = 0;
            if (TextUtils.equals(strArr[0], "--all")) {
                StringBuilder sbA = android.support.v4.media.f.a(str, "All apps list: size=");
                sbA.append(this.mBgAllAppsList.data.size());
                printWriter.println(sbA.toString());
                ArrayList<AppInfo> arrayList = this.mBgAllAppsList.data;
                int size = arrayList.size();
                while (i10 < size) {
                    AppInfo appInfo = arrayList.get(i10);
                    i10++;
                    AppInfo appInfo2 = appInfo;
                    StringBuilder sbA2 = android.support.v4.media.f.a(str, "   title=\"");
                    sbA2.append((Object) appInfo2.title);
                    sbA2.append("\" iconBitmap=");
                    sbA2.append(appInfo2.iconBitmap);
                    sbA2.append(" componentName=");
                    sbA2.append(appInfo2.componentName.getPackageName());
                    printWriter.println(sbA2.toString());
                }
            }
        }
        sBgDataModel.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void enqueueModelUpdateTask(ModelUpdateTask modelUpdateTask) {
        modelUpdateTask.init(this.mApp, this, sBgDataModel, this.mBgAllAppsList, this.mUiExecutor);
        runOnWorkerThread(modelUpdateTask);
    }

    public void forceReload() {
        synchronized (this.mLock) {
            stopLoader();
            this.mModelLoaded = false;
        }
        Callbacks callback = getCallback();
        if (callback != null) {
            startLoader(callback.getCurrentWorkspaceScreen());
        }
    }

    public AllAppsList getAllAppsList() {
        return this.mBgAllAppsList;
    }

    public Callbacks getCallback() {
        WeakReference<Callbacks> weakReference = this.mCallbacks;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public ModelWriter getWriter(boolean z10, boolean z11) {
        return new ModelWriter(this.mApp.getContext(), this, sBgDataModel, z10, z11);
    }

    public void initialize(Callbacks callbacks) {
        synchronized (this.mLock) {
            Preconditions.assertUIThread();
            this.mCallbacks = new WeakReference<>(callbacks);
        }
    }

    public boolean isCurrentCallbacks(Callbacks callbacks) {
        WeakReference<Callbacks> weakReference = this.mCallbacks;
        return weakReference != null && weakReference.get() == callbacks;
    }

    public boolean isModelLoaded() {
        boolean z10;
        synchronized (this.mLock) {
            try {
                z10 = this.mModelLoaded && this.mLoaderTask == null;
            } finally {
            }
        }
        return z10;
    }

    public void onInstallSessionCreated(final PackageInstallerCompat.PackageInstallInfo packageInstallInfo) {
        enqueueModelUpdateTask(new BaseModelUpdateTask() { // from class: com.android.launcher3.LauncherModel.4
            @Override // com.android.launcher3.model.BaseModelUpdateTask
            public void execute(LauncherAppState launcherAppState, BgDataModel bgDataModel, AllAppsList allAppsList) {
                allAppsList.addPromiseApp(launcherAppState.getContext(), packageInstallInfo);
                if (allAppsList.added.isEmpty()) {
                    return;
                }
                final ArrayList arrayList = new ArrayList(allAppsList.added);
                allAppsList.added.clear();
                scheduleCallbackTask(new CallbackTask() { // from class: com.android.launcher3.LauncherModel.4.1
                    @Override // com.android.launcher3.LauncherModel.CallbackTask
                    public void execute(Callbacks callbacks) {
                        callbacks.bindAppsAddedOrUpdated(arrayList);
                    }
                });
            }
        });
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onPackageAdded(String str, UserHandle userHandle) {
        enqueueModelUpdateTask(new PackageUpdatedTask(1, userHandle, str));
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onPackageChanged(String str, UserHandle userHandle) {
        enqueueModelUpdateTask(new PackageUpdatedTask(2, userHandle, str));
    }

    public void onPackageIconsUpdated(HashSet<String> hashSet, UserHandle userHandle) {
        enqueueModelUpdateTask(new CacheDataUpdatedTask(1, userHandle, hashSet));
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onPackageRemoved(String str, UserHandle userHandle) {
        onPackagesRemoved(userHandle, str);
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onPackagesAvailable(String[] strArr, UserHandle userHandle, boolean z10) {
        enqueueModelUpdateTask(new PackageUpdatedTask(2, userHandle, strArr));
    }

    public void onPackagesRemoved(UserHandle userHandle, String... strArr) {
        enqueueModelUpdateTask(new PackageUpdatedTask(3, userHandle, strArr));
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onPackagesSuspended(String[] strArr, UserHandle userHandle) {
        enqueueModelUpdateTask(new PackageUpdatedTask(5, userHandle, strArr));
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onPackagesUnavailable(String[] strArr, UserHandle userHandle, boolean z10) {
        if (z10) {
            return;
        }
        enqueueModelUpdateTask(new PackageUpdatedTask(4, userHandle, strArr));
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onPackagesUnsuspended(String[] strArr, UserHandle userHandle) {
        enqueueModelUpdateTask(new PackageUpdatedTask(6, userHandle, strArr));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
            forceReload();
            return;
        }
        if ("android.intent.action.MANAGED_PROFILE_ADDED".equals(action) || "android.intent.action.MANAGED_PROFILE_REMOVED".equals(action)) {
            UserManagerCompat.getInstance(context).enableAndResetCache();
            forceReload();
            return;
        }
        if (!"android.intent.action.MANAGED_PROFILE_AVAILABLE".equals(action) && !"android.intent.action.MANAGED_PROFILE_UNAVAILABLE".equals(action) && !"android.intent.action.MANAGED_PROFILE_UNLOCKED".equals(action)) {
            if (LauncherAppState.ACTION_FORCE_ROLOAD.equals(action)) {
                forceReload();
                return;
            }
            return;
        }
        UserHandle userHandle = (UserHandle) intent.getParcelableExtra("android.intent.extra.USER");
        if (userHandle != null) {
            if ("android.intent.action.MANAGED_PROFILE_AVAILABLE".equals(action) || "android.intent.action.MANAGED_PROFILE_UNAVAILABLE".equals(action)) {
                enqueueModelUpdateTask(new PackageUpdatedTask(7, userHandle, new String[0]));
            }
            if ("android.intent.action.MANAGED_PROFILE_UNAVAILABLE".equals(action) || "android.intent.action.MANAGED_PROFILE_UNLOCKED".equals(action)) {
                enqueueModelUpdateTask(new UserLockStateChangedTask(userHandle));
            }
        }
    }

    @Override // com.android.launcher3.compat.LauncherAppsCompat.OnAppsChangedCallbackCompat
    public void onShortcutsChanged(String str, List<ShortcutInfoCompat> list, UserHandle userHandle) {
        enqueueModelUpdateTask(new ShortcutsChangedTask(str, list, userHandle, true));
    }

    public void refreshAndBindWidgetsAndShortcuts(@Nullable final PackageUserKey packageUserKey) {
        enqueueModelUpdateTask(new BaseModelUpdateTask() { // from class: com.android.launcher3.LauncherModel.7
            @Override // com.android.launcher3.model.BaseModelUpdateTask
            public void execute(LauncherAppState launcherAppState, BgDataModel bgDataModel, AllAppsList allAppsList) {
                bgDataModel.widgetsModel.update(launcherAppState, packageUserKey);
                bindUpdatedWidgets(bgDataModel);
            }
        });
    }

    public void refreshShortcutsIfRequired() {
        if (Utilities.ATLEAST_NOUGAT_MR1) {
            Handler handler = sWorker;
            handler.removeCallbacks(this.mShortcutPermissionCheckRunnable);
            handler.post(this.mShortcutPermissionCheckRunnable);
        }
    }

    public void setPackageState(PackageInstallerCompat.PackageInstallInfo packageInstallInfo) {
        enqueueModelUpdateTask(new PackageInstallStateChangedTask(packageInstallInfo));
    }

    public boolean startLoader(int i10) {
        InstallShortcutReceiver.enableInstallQueue(2);
        synchronized (this.mLock) {
            try {
                WeakReference<Callbacks> weakReference = this.mCallbacks;
                if (weakReference != null && weakReference.get() != null) {
                    final Callbacks callbacks = this.mCallbacks.get();
                    MainThreadExecutor mainThreadExecutor = this.mUiExecutor;
                    Objects.requireNonNull(callbacks);
                    mainThreadExecutor.execute(new Runnable() { // from class: com.android.launcher3.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            callbacks.clearPendingBinds();
                        }
                    });
                    stopLoader();
                    LoaderResults loaderResults = new LoaderResults(this.mApp, sBgDataModel, this.mBgAllAppsList, i10, this.mCallbacks);
                    if (this.mModelLoaded && !this.mIsLoaderTaskRunning) {
                        loaderResults.bindWorkspace();
                        loaderResults.bindAllApps();
                        loaderResults.bindDeepShortcuts();
                        loaderResults.bindWidgets();
                        return true;
                    }
                    startLoaderForResults(loaderResults);
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startLoaderForResults(LoaderResults loaderResults) {
        synchronized (this.mLock) {
            stopLoader();
            LoaderTask loaderTask = new LoaderTask(this.mApp, this.mBgAllAppsList, sBgDataModel, loaderResults);
            this.mLoaderTask = loaderTask;
            runOnWorkerThread(loaderTask);
        }
    }

    public void startLoaderForResultsIfNotLoaded(LoaderResults loaderResults) {
        synchronized (this.mLock) {
            try {
                if (!isModelLoaded()) {
                    Log.d(TAG, "Workspace not loaded, loading now");
                    startLoaderForResults(loaderResults);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopLoader() {
        synchronized (this.mLock) {
            try {
                LoaderTask loaderTask = this.mLoaderTask;
                this.mLoaderTask = null;
                if (loaderTask != null) {
                    loaderTask.stopLocked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateAndBindShortcutInfo(final ShortcutInfo shortcutInfo, final ShortcutInfoCompat shortcutInfoCompat) {
        updateAndBindShortcutInfo(new Provider<ShortcutInfo>() { // from class: com.android.launcher3.LauncherModel.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.android.launcher3.util.Provider
            public ShortcutInfo get() {
                shortcutInfo.updateFromDeepShortcutInfo(shortcutInfoCompat, LauncherModel.this.mApp.getContext());
                LauncherIcons launcherIconsObtain = LauncherIcons.obtain(LauncherModel.this.mApp.getContext());
                launcherIconsObtain.createShortcutIcon(shortcutInfoCompat).applyTo(shortcutInfo);
                launcherIconsObtain.recycle();
                return shortcutInfo;
            }
        });
    }

    public void updatePinnedShortcuts(String str, List<ShortcutInfoCompat> list, UserHandle userHandle) {
        enqueueModelUpdateTask(new ShortcutsChangedTask(str, list, userHandle, false));
    }

    public void updateSessionDisplayInfo(String str) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        enqueueModelUpdateTask(new CacheDataUpdatedTask(2, Process.myUserHandle(), hashSet));
    }

    public void updateAndBindShortcutInfo(final Provider<ShortcutInfo> provider) {
        enqueueModelUpdateTask(new BaseModelUpdateTask() { // from class: com.android.launcher3.LauncherModel.6
            @Override // com.android.launcher3.model.BaseModelUpdateTask
            public void execute(LauncherAppState launcherAppState, BgDataModel bgDataModel, AllAppsList allAppsList) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) provider.get();
                ArrayList<ShortcutInfo> arrayList = new ArrayList<>();
                arrayList.add(shortcutInfo);
                bindUpdatedShortcuts(arrayList, shortcutInfo.user);
            }
        });
    }
}
