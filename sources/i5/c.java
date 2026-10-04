package i5;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class c {
    public static void a(Activity activity) {
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 512);
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(0);
    }

    public static void b(Activity activity) {
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    @Deprecated
    public static void c(Activity activity) {
        b(activity);
    }

    public static boolean d(Activity activity, boolean z10) {
        Window window = activity.getWindow();
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i10 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            if (z10) {
                method.invoke(window, Integer.valueOf(i10), Integer.valueOf(i10));
            } else {
                method.invoke(window, 0, Integer.valueOf(i10));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(Activity activity, boolean z10) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i10 = declaredField.getInt(null);
            int i11 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z10 ? i11 | i10 : (~i10) & i11);
            activity.getWindow().setAttributes(attributes);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f(Activity activity, int i10) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(i10);
    }

    public static void g(Activity activity, int i10) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i10);
    }

    public static boolean h(Activity activity, boolean z10) {
        boolean zD = d(activity, z10);
        if (!zD) {
            zD = e(activity, z10);
        }
        if (!zD && z10) {
            View decorView = activity.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return true;
        }
        if (zD || z10) {
            return zD;
        }
        View decorView2 = activity.getWindow().getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        return true;
    }

    public static void i(Activity activity, int i10, int i11) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i10);
        window.setNavigationBarColor(i11);
    }
}
