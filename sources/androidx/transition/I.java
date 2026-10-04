package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f117741a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f117742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f117743c;

    public static int a(@NonNull ViewGroup viewGroup, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i10);
        }
        if (!f117743c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f117742b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f117743c = true;
        }
        Method method = f117742b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i10))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i10;
    }

    public static F b(@NonNull ViewGroup viewGroup) {
        return new E(viewGroup);
    }

    @e.T(18)
    @SuppressLint({"NewApi"})
    public static void c(@NonNull ViewGroup viewGroup, boolean z10) {
        if (f117741a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f117741a = false;
            }
        }
    }

    public static void d(@NonNull ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            c(viewGroup, z10);
        }
    }
}
