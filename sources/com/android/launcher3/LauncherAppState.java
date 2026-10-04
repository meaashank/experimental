package com.android.launcher3;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.service.notification.NotificationListenerService;
import android.util.Log;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.PackageInstallerCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.extension.ExtensionFactory;
import com.android.launcher3.extension.LauncherAppStateExtension;
import com.android.launcher3.notification.NotificationListener;
import com.android.launcher3.util.ConfigMonitor;
import com.android.launcher3.util.Preconditions;
import com.android.launcher3.util.SettingsObserver;
import com.prism.commons.utils.C3840d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public class LauncherAppState {
    public static final String ACTION_FORCE_ROLOAD = "force-reload-launcher";
    private static LauncherAppState INSTANCE = null;
    private static final String TAG = "LauncherAppState";
    private final Context mContext;
    private final IconCache mIconCache;
    private final InvariantDeviceProfile mInvariantDeviceProfile;
    private final LauncherModel mModel;
    private final SettingsObserver mNotificationBadgingObserver;
    private final WidgetPreviewLoader mWidgetCache;
    private LauncherAppStateExtension extension = ExtensionFactory.getLauncherAppStateExtension();
    private U6.p stopWatch = new U6.p("####", false);

    private LauncherAppState(Context context) {
        com.prism.commons.utils.I.a(TAG, "LauncherAppState instance create");
        this.stopWatch.f();
        if (getLocalProvider(context) == null) {
            throw new RuntimeException("Initializing LauncherAppState in the absence of LauncherProvider");
        }
        Preconditions.assertUIThread();
        this.mContext = context;
        InvariantDeviceProfile invariantDeviceProfile = new InvariantDeviceProfile(context);
        this.mInvariantDeviceProfile = invariantDeviceProfile;
        IconCache iconCache = new IconCache(context, invariantDeviceProfile);
        this.mIconCache = iconCache;
        this.mWidgetCache = new WidgetPreviewLoader(context, iconCache);
        LauncherModel launcherModel = new LauncherModel(this, iconCache, AppFilter.newInstance(context));
        this.mModel = launcherModel;
        LauncherAppsCompat.getInstance(context).addOnAppsChangedCallback(launcherModel);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_ADDED");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_REMOVED");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_AVAILABLE");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNAVAILABLE");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNLOCKED");
        intentFilter.addAction(ACTION_FORCE_ROLOAD);
        C3840d.a(context, launcherModel, intentFilter);
        UserManagerCompat.getInstance(context).enableAndResetCache();
        new ConfigMonitor(context).register();
        Log.d(TAG, "" + this.stopWatch.h("1"));
        if (context.getResources().getBoolean(com.app.hider.master.promax.R.bool.notification_badging_enabled)) {
            SettingsObserver.Secure secure = new SettingsObserver.Secure(context.getContentResolver()) { // from class: com.android.launcher3.LauncherAppState.2
                @Override // com.android.launcher3.util.SettingsObserver
                public void onSettingChanged(boolean z10) {
                    if (z10) {
                        NotificationListenerService.requestRebind(new ComponentName(LauncherAppState.this.mContext, (Class<?>) NotificationListener.class));
                    }
                }
            };
            this.mNotificationBadgingObserver = secure;
            secure.register(SettingsActivity.NOTIFICATION_BADGING, new String[0]);
        } else {
            this.mNotificationBadgingObserver = null;
        }
        Log.d(TAG, "" + this.stopWatch.h("2"));
        LauncherAppStateExtension launcherAppStateExtension = this.extension;
        if (launcherAppStateExtension != null) {
            launcherAppStateExtension.init(context, launcherModel);
        }
        Log.d(TAG, "" + this.stopWatch.h("extension init"));
        Log.d(TAG, "" + this.stopWatch.b());
    }

    public static InvariantDeviceProfile getIDP(Context context) {
        return getInstance(context).getInvariantDeviceProfile();
    }

    public static LauncherAppState getInstance(final Context context) {
        if (INSTANCE == null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                try {
                    return (LauncherAppState) new MainThreadExecutor().submit(new Callable<LauncherAppState>() { // from class: com.android.launcher3.LauncherAppState.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.concurrent.Callable
                        public LauncherAppState call() throws Exception {
                            return LauncherAppState.getInstance(context);
                        }
                    }).get();
                } catch (InterruptedException | ExecutionException e10) {
                    throw new RuntimeException(e10);
                }
            }
            INSTANCE = new LauncherAppState(context.getApplicationContext());
        }
        return INSTANCE;
    }

    public static LauncherAppState getInstanceNoCreate() {
        return INSTANCE;
    }

    private static LauncherProvider getLocalProvider(Context context) throws Exception {
        ContentProviderClient contentProviderClientAcquireContentProviderClient = null;
        try {
            contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(LauncherProvider.AUTHORITY);
            LauncherProvider launcherProvider = (LauncherProvider) contentProviderClientAcquireContentProviderClient.getLocalContentProvider();
            if (Build.VERSION.SDK_INT >= 24) {
                Q0.g.a(contentProviderClientAcquireContentProviderClient);
            }
            return launcherProvider;
        } catch (Throwable th) {
            if (contentProviderClientAcquireContentProviderClient != null && Build.VERSION.SDK_INT >= 24) {
                Q0.g.a(contentProviderClientAcquireContentProviderClient);
            }
            throw th;
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public IconCache getIconCache() {
        return this.mIconCache;
    }

    public InvariantDeviceProfile getInvariantDeviceProfile() {
        return this.mInvariantDeviceProfile;
    }

    public LauncherModel getModel() {
        return this.mModel;
    }

    public WidgetPreviewLoader getWidgetCache() {
        return this.mWidgetCache;
    }

    public void onTerminate() {
        this.mContext.unregisterReceiver(this.mModel);
        LauncherAppsCompat.getInstance(this.mContext).removeOnAppsChangedCallback(this.mModel);
        PackageInstallerCompat.getInstance(this.mContext).onStop();
        SettingsObserver settingsObserver = this.mNotificationBadgingObserver;
        if (settingsObserver != null) {
            settingsObserver.unregister();
        }
    }

    public LauncherModel setLauncher(Launcher launcher) {
        getLocalProvider(this.mContext).setLauncherProviderChangeListener(launcher);
        this.mModel.initialize(launcher);
        return this.mModel;
    }
}
