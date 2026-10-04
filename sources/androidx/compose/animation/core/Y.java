package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f88058a = -4.2f;

    @NotNull
    public static final InterfaceC1579d<Float, C1595l> a(@NotNull X x10, float f10, float f11) {
        return AnimationKt.a(x10, f10, f11);
    }

    public static InterfaceC1579d b(X x10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return AnimationKt.a(x10, f10, f11);
    }
}
