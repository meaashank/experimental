package com.android.launcher3.compat;

import android.content.Context;
import android.content.pm.PackageInstaller;
import android.os.Handler;
import android.os.Process;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.launcher3.IconCache;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.compat.PackageInstallerCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PackageInstallerCompatVL extends PackageInstallerCompat {
    private static final boolean DEBUG = false;
    private final Context mAppContext;
    private final IconCache mCache;
    private final PackageInstaller.SessionCallback mCallback;
    final PackageInstaller mInstaller;
    private final Handler mWorker;
    final SparseArray<String> mActiveSessions = new SparseArray<>();
    private final HashMap<String, Boolean> mSessionVerifiedMap = new HashMap<>();

    public PackageInstallerCompatVL(Context context) {
        PackageInstaller.SessionCallback sessionCallback = new PackageInstaller.SessionCallback() { // from class: com.android.launcher3.compat.PackageInstallerCompatVL.1
            private PackageInstaller.SessionInfo pushSessionDisplayToLauncher(int i10) {
                PackageInstallerCompatVL packageInstallerCompatVL = PackageInstallerCompatVL.this;
                PackageInstaller.SessionInfo sessionInfoVerify = packageInstallerCompatVL.verify(packageInstallerCompatVL.mInstaller.getSessionInfo(i10));
                if (sessionInfoVerify == null || sessionInfoVerify.getAppPackageName() == null) {
                    return null;
                }
                PackageInstallerCompatVL.this.mActiveSessions.put(i10, sessionInfoVerify.getAppPackageName());
                PackageInstallerCompatVL.this.addSessionInfoToCache(sessionInfoVerify, Process.myUserHandle());
                LauncherAppState instanceNoCreate = LauncherAppState.getInstanceNoCreate();
                if (instanceNoCreate != null) {
                    instanceNoCreate.getModel().updateSessionDisplayInfo(sessionInfoVerify.getAppPackageName());
                }
                return sessionInfoVerify;
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onActiveChanged(int i10, boolean z10) {
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onBadgingChanged(int i10) {
                pushSessionDisplayToLauncher(i10);
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onCreated(int i10) {
                pushSessionDisplayToLauncher(i10);
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onFinished(int i10, boolean z10) {
                String str = PackageInstallerCompatVL.this.mActiveSessions.get(i10);
                PackageInstallerCompatVL.this.mActiveSessions.remove(i10);
                if (str != null) {
                    PackageInstallerCompatVL.this.sendUpdate(PackageInstallerCompat.PackageInstallInfo.fromState(z10 ? 0 : 2, str));
                }
            }

            @Override // android.content.pm.PackageInstaller.SessionCallback
            public void onProgressChanged(int i10, float f10) {
                PackageInstallerCompatVL packageInstallerCompatVL = PackageInstallerCompatVL.this;
                PackageInstaller.SessionInfo sessionInfoVerify = packageInstallerCompatVL.verify(packageInstallerCompatVL.mInstaller.getSessionInfo(i10));
                if (sessionInfoVerify == null || sessionInfoVerify.getAppPackageName() == null) {
                    return;
                }
                PackageInstallerCompatVL.this.sendUpdate(PackageInstallerCompat.PackageInstallInfo.fromInstallingState(sessionInfoVerify));
            }
        };
        this.mCallback = sessionCallback;
        this.mAppContext = context.getApplicationContext();
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        this.mInstaller = packageInstaller;
        this.mCache = LauncherAppState.getInstance(context).getIconCache();
        Handler handler = new Handler(LauncherModel.getWorkerLooper());
        this.mWorker = handler;
        packageInstaller.registerSessionCallback(sessionCallback, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PackageInstaller.SessionInfo verify(PackageInstaller.SessionInfo sessionInfo) {
        if (sessionInfo == null || sessionInfo.getInstallerPackageName() == null || TextUtils.isEmpty(sessionInfo.getAppPackageName())) {
            return null;
        }
        String installerPackageName = sessionInfo.getInstallerPackageName();
        synchronized (this.mSessionVerifiedMap) {
            try {
                if (!this.mSessionVerifiedMap.containsKey(installerPackageName)) {
                    boolean z10 = true;
                    if (LauncherAppsCompat.getInstance(this.mAppContext).getApplicationInfo(installerPackageName, 1, Process.myUserHandle()) == null) {
                        z10 = false;
                    }
                    this.mSessionVerifiedMap.put(installerPackageName, Boolean.valueOf(z10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.mSessionVerifiedMap.get(installerPackageName).booleanValue()) {
            return sessionInfo;
        }
        return null;
    }

    public void addSessionInfoToCache(PackageInstaller.SessionInfo sessionInfo, UserHandle userHandle) {
        String appPackageName = sessionInfo.getAppPackageName();
        if (appPackageName != null) {
            this.mCache.cachePackageInstallInfo(appPackageName, userHandle, sessionInfo.getAppIcon(), sessionInfo.getAppLabel());
        }
    }

    @Override // com.android.launcher3.compat.PackageInstallerCompat
    public List<PackageInstaller.SessionInfo> getAllVerifiedSessions() {
        ArrayList arrayList = new ArrayList(this.mInstaller.getAllSessions());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (verify((PackageInstaller.SessionInfo) it.next()) == null) {
                it.remove();
            }
        }
        return arrayList;
    }

    @Override // com.android.launcher3.compat.PackageInstallerCompat
    public void onStop() {
        this.mInstaller.unregisterSessionCallback(this.mCallback);
    }

    public void sendUpdate(PackageInstallerCompat.PackageInstallInfo packageInstallInfo) {
        LauncherAppState instanceNoCreate = LauncherAppState.getInstanceNoCreate();
        if (instanceNoCreate != null) {
            instanceNoCreate.getModel().setPackageState(packageInstallInfo);
        }
    }

    @Override // com.android.launcher3.compat.PackageInstallerCompat
    public HashMap<String, PackageInstaller.SessionInfo> updateAndGetActiveSessionCache() {
        HashMap<String, PackageInstaller.SessionInfo> map = new HashMap<>();
        UserHandle userHandleMyUserHandle = Process.myUserHandle();
        for (PackageInstaller.SessionInfo sessionInfo : getAllVerifiedSessions()) {
            addSessionInfoToCache(sessionInfo, userHandleMyUserHandle);
            if (sessionInfo.getAppPackageName() != null) {
                map.put(sessionInfo.getAppPackageName(), sessionInfo);
                this.mActiveSessions.put(sessionInfo.getSessionId(), sessionInfo.getAppPackageName());
            }
        }
        return map;
    }
}
