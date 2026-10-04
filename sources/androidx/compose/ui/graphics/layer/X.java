package androidx.compose.ui.graphics.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final X f101282a = new X();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Method f101283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f101284c;

    public final boolean a() {
        return true;
    }

    @e.T(22)
    @NotNull
    public final Canvas b(@NotNull Surface surface) {
        return Y.f101285a.a(surface);
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final Canvas c(Surface surface) throws IllegalAccessException, InvocationTargetException {
        Method methodD = d();
        if (methodD == null) {
            return surface.lockCanvas(null);
        }
        Object objInvoke = methodD.invoke(surface, null);
        kotlin.jvm.internal.G.n(objInvoke, "null cannot be cast to non-null type android.graphics.Canvas");
        return (Canvas) objInvoke;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final Method d() {
        Method method;
        synchronized (this) {
            method = null;
            try {
                Method method2 = f101283b;
                if (f101284c) {
                    method = method2;
                } else {
                    f101284c = true;
                    Method declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    f101283b = declaredMethod;
                    method = declaredMethod;
                }
            } catch (Throwable unused) {
                f101283b = null;
            }
        }
        return method;
    }
}
