package com.bykv.vk.openvk.preload.geckox.utils;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f140625a;

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            GeckoLogger.w("gecko-debug-tag", "getVersion:", e10);
            return "null";
        }
    }

    public static String b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo == null ? "" : applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            GeckoLogger.w("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(android.content.Context r3) {
        /*
            java.lang.String r0 = com.bykv.vk.openvk.preload.geckox.utils.a.f140625a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r3 = com.bykv.vk.openvk.preload.geckox.utils.a.f140625a
            return r3
        Lb:
            java.lang.String r0 = a()
            com.bykv.vk.openvk.preload.geckox.utils.a.f140625a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.String r3 = com.bykv.vk.openvk.preload.geckox.utils.a.f140625a
            return r3
        L1a:
            java.lang.String r0 = b()
            com.bykv.vk.openvk.preload.geckox.utils.a.f140625a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r3 = com.bykv.vk.openvk.preload.geckox.utils.a.f140625a
            return r3
        L29:
            if (r3 == 0) goto L56
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = "activity"
            java.lang.Object r3 = r3.getSystemService(r1)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            if (r3 == 0) goto L56
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L56
            java.util.Iterator r3 = r3.iterator()
        L43:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r2 = r1.pid
            if (r2 != r0) goto L43
            java.lang.String r3 = r1.processName
            goto L57
        L56:
            r3 = 0
        L57:
            com.bykv.vk.openvk.preload.geckox.utils.a.f140625a = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.utils.a.c(android.content.Context):java.lang.String");
    }

    private static String a() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static String b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void a(Throwable th) {
        GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th);
    }
}
