package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final F f88668a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88669b = 0;

    @NotNull
    public final EdgeEffect a(@NotNull Context context) {
        return Build.VERSION.SDK_INT >= 31 ? C1652g.f89117a.a(context, null) : new T(context);
    }

    public final float b(@NotNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1652g.f89117a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(@NotNull EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float d(@NotNull EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1652g.f89117a.c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    public final void e(@NotNull EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof T) {
            ((T) edgeEffect).a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
