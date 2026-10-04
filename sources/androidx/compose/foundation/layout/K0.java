package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C1675e;
import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements androidx.compose.animation.core.X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f90552a;

    public K0(@NotNull InterfaceC4814e interfaceC4814e) {
        this.f90552a = interfaceC4814e.a() * 386.0878f * 160.0f * 0.84f;
    }

    @Override // androidx.compose.animation.core.X
    public float a() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.X
    public float b(long j10, float f10, float f11) {
        long jC = c(0.0f, f11);
        return ((C1675e.a.f(C1675e.f90900a.b(jC > 0 ? j10 / jC : 1.0f)) * f(f11)) / jC) * 1.0E9f;
    }

    @Override // androidx.compose.animation.core.X
    public long c(float f10, float f11) {
        return (long) (Math.exp(g(f11) / WindowInsetsConnection_androidKt.f90719f) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.X
    public float d(float f10, float f11) {
        return f(f11) + f10;
    }

    @Override // androidx.compose.animation.core.X
    public float e(long j10, float f10, float f11) {
        long jC = c(0.0f, f11);
        return (C1675e.a.e(C1675e.f90900a.b(jC > 0 ? j10 / jC : 1.0f)) * f(f11)) + f10;
    }

    public final float f(float f10) {
        double dG = g(f10);
        return Math.signum(f10) * ((float) (Math.exp((WindowInsetsConnection_androidKt.f90718e / WindowInsetsConnection_androidKt.f90719f) * dG) * ((double) (WindowInsetsConnection_androidKt.f90715b * this.f90552a))));
    }

    public final double g(float f10) {
        return C1675e.f90900a.a(f10, WindowInsetsConnection_androidKt.f90715b * this.f90552a);
    }
}
