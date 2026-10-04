package U9;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.prism.commons.utils.C3841e;

/* JADX INFO: loaded from: classes6.dex */
public class L0 {
    public static void a(Activity activity, String str) {
        try {
            try {
                if (C3841e.d()) {
                    c(activity, str);
                    return;
                }
                if (C3841e.J()) {
                    g(activity, str);
                    return;
                }
                if (C3841e.C()) {
                    e(activity, str);
                    return;
                }
                if (C3841e.I()) {
                    f(activity, str);
                } else if (C3841e.u()) {
                    d(activity, str);
                } else {
                    b(activity, str);
                }
            } catch (Exception unused) {
                b(activity, str);
            }
        } catch (Exception unused2) {
        }
    }

    public static void b(Activity activity, String str) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", str, null));
        intent.setFlags(268435456);
        activity.startActivity(intent);
    }

    public static void c(Activity activity, String str) {
        ComponentName componentName = (!C3841e.v() && C3841e.s()) ? new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity") : new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    public static void d(Activity activity, String str) {
        ComponentName componentName = C3841e.t() ? new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity") : new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.startup.StartupAppListActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.setData(Uri.fromParts("package", str, null));
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    public static void e(Activity activity, String str) {
        ComponentName componentName = new ComponentName("com.samsung.android.sm", "com.samsung.android.sm.ui.ram.AutoRunActivity");
        try {
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            activity.startActivity(intent);
        } catch (Exception unused) {
            ComponentName componentName2 = new ComponentName("com.samsung.android.sm_cn", "com.samsung.android.sm.ui.ram.AutoRunActivity");
            Intent intent2 = new Intent();
            intent2.setComponent(componentName2);
            intent2.addFlags(268435456);
            activity.startActivity(intent2);
        }
    }

    public static void f(Activity activity, String str) {
        ComponentName componentName = new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    public static void g(Activity activity, String str) {
        ComponentName componentName = new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }
}
