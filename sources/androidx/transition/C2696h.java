package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.transition.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(21)
public class C2696h implements InterfaceC2694f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f117858b = "GhostViewApi21";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class<?> f117859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f117860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f117861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f117862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f117863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f117864h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f117865a;

    public C2696h(@NonNull View view) {
        this.f117865a = view;
    }

    public static InterfaceC2694f b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = f117861e;
        if (method != null) {
            try {
                return new C2696h((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
        return null;
    }

    public static void c() {
        if (f117862f) {
            return;
        }
        try {
            d();
            Method declaredMethod = f117859c.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f117861e = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f117858b, "Failed to retrieve addGhost method", e10);
        }
        f117862f = true;
    }

    public static void d() {
        if (f117860d) {
            return;
        }
        try {
            f117859c = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e10) {
            Log.i(f117858b, "Failed to retrieve GhostView class", e10);
        }
        f117860d = true;
    }

    public static void e() {
        if (f117864h) {
            return;
        }
        try {
            d();
            Method declaredMethod = f117859c.getDeclaredMethod("removeGhost", View.class);
            f117863g = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            Log.i(f117858b, "Failed to retrieve removeGhost method", e10);
        }
        f117864h = true;
    }

    public static void f(View view) {
        e();
        Method method = f117863g;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e10) {
                throw new RuntimeException(e10.getCause());
            }
        }
    }

    @Override // androidx.transition.InterfaceC2694f
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.InterfaceC2694f
    public void setVisibility(int i10) {
        this.f117865a.setVisibility(i10);
    }
}
