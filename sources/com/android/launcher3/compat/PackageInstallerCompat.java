package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInstaller;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PackageInstallerCompat {
    public static final int STATUS_FAILED = 2;
    public static final int STATUS_INSTALLED = 0;
    public static final int STATUS_INSTALLING = 1;
    private static PackageInstallerCompat sInstance;
    private static final Object sInstanceLock = new Object();

    public static PackageInstallerCompat getInstance(Context context) {
        PackageInstallerCompat packageInstallerCompat;
        synchronized (sInstanceLock) {
            try {
                if (sInstance == null) {
                    sInstance = new PackageInstallerCompatVL(context);
                }
                packageInstallerCompat = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return packageInstallerCompat;
    }

    public abstract List<PackageInstaller.SessionInfo> getAllVerifiedSessions();

    public abstract void onStop();

    public abstract HashMap<String, PackageInstaller.SessionInfo> updateAndGetActiveSessionCache();

    public static final class PackageInstallInfo {
        public final ComponentName componentName;
        public final String packageName;
        public final int progress;
        public final int state;

        private PackageInstallInfo(@NonNull PackageInstaller.SessionInfo sessionInfo) {
            this.state = 1;
            String appPackageName = sessionInfo.getAppPackageName();
            this.packageName = appPackageName;
            this.componentName = new ComponentName(appPackageName, "");
            this.progress = (int) (sessionInfo.getProgress() * 100.0f);
        }

        public static PackageInstallInfo fromInstallingState(PackageInstaller.SessionInfo sessionInfo) {
            return new PackageInstallInfo(sessionInfo);
        }

        public static PackageInstallInfo fromState(int i10, String str) {
            return new PackageInstallInfo(str, i10, 0);
        }

        public PackageInstallInfo(String str, int i10, int i11) {
            this.state = i10;
            this.packageName = str;
            this.componentName = new ComponentName(str, "");
            this.progress = i11;
        }
    }
}
