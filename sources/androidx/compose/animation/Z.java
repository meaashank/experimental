package androidx.compose.animation;

import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class Z implements androidx.compose.animation.core.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f87545b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C f87546a;

    public Z(@NotNull InterfaceC4814e interfaceC4814e) {
        this.f87546a = new C(a0.a(), interfaceC4814e);
    }

    private final float f(float f10) {
        return Math.signum(f10) * this.f87546a.b(f10);
    }

    @Override // androidx.compose.animation.core.X
    public float a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.X
    public float b(long j10, float f10, float f11) {
        return this.f87546a.d(f11).j(j10 / 1000000);
    }

    @Override // androidx.compose.animation.core.X
    public long c(float f10, float f11) {
        return this.f87546a.c(f11) * 1000000;
    }

    @Override // androidx.compose.animation.core.X
    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    @Override // androidx.compose.animation.core.X
    public float e(long j10, float f10, float f11) {
        return this.f87546a.d(f11).i(j10 / 1000000) + f10;
    }
}
