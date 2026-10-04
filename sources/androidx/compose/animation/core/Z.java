package androidx.compose.animation.core;

import e.InterfaceC4348w;
import kotlin.jvm.internal.C4969v;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class Z implements X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88061c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88063b;

    /* JADX WARN: Illegal instructions before constructor call */
    public Z() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    @Override // androidx.compose.animation.core.X
    public float a() {
        return this.f88062a;
    }

    @Override // androidx.compose.animation.core.X
    public float b(long j10, float f10, float f11) {
        return f11 * ((float) Math.exp(((j10 / 1000000) / 1000.0f) * this.f88063b));
    }

    @Override // androidx.compose.animation.core.X
    public long c(float f10, float f11) {
        return ((long) ((((float) Math.log(this.f88062a / Math.abs(f11))) * 1000.0f) / this.f88063b)) * 1000000;
    }

    @Override // androidx.compose.animation.core.X
    public float d(float f10, float f11) {
        if (Math.abs(f11) <= this.f88062a) {
            return f10;
        }
        double dLog = Math.log(Math.abs(r1 / f11));
        float f12 = this.f88063b;
        return ((f11 / f12) * ((float) Math.exp((((double) f12) * ((dLog / ((double) f12)) * ((double) 1000))) / ((double) 1000.0f)))) + (f10 - (f11 / f12));
    }

    @Override // androidx.compose.animation.core.X
    public float e(long j10, float f10, float f11) {
        float f12 = this.f88063b;
        return ((f11 / f12) * ((float) Math.exp((f12 * (j10 / 1000000)) / 1000.0f))) + (f10 - (f11 / f12));
    }

    public Z(@InterfaceC4348w(from = 0.0d, fromInclusive = false) float f10, @InterfaceC4348w(from = 0.0d, fromInclusive = false) float f11) {
        this.f88062a = Math.max(1.0E-7f, Math.abs(f11));
        this.f88063b = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    public /* synthetic */ Z(float f10, float f11, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.1f : f11);
    }
}
