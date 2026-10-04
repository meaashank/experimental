package androidx.compose.animation.core;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,265:1\n71#2,16:266\n*S KotlinDebug\n*F\n+ 1 FloatAnimationSpec.kt\nandroidx/compose/animation/core/FloatTweenSpec\n*L\n218#1:266,16\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C1576b0 implements W {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f88086f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final G f88089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88091e;

    public C1576b0() {
        this(0, 0, null, 7, null);
    }

    @Override // androidx.compose.animation.core.W
    public float b(long j10, float f10, float f11, float f12) {
        long jF = f(j10);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return f12;
        }
        return (e(jF, f10, f11, f12) - e(jF - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.W
    public long c(float f10, float f11, float f12) {
        return ((long) (this.f88088b + this.f88087a)) * 1000000;
    }

    @Override // androidx.compose.animation.core.W
    public float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    @Override // androidx.compose.animation.core.W
    public float e(long j10, float f10, float f11, float f12) {
        float f13 = this.f88087a == 0 ? 1.0f : f(j10) / this.f88090d;
        G g10 = this.f88089c;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        return VectorConvertersKt.k(f10, f11, g10.a(f13 <= 1.0f ? f13 : 1.0f));
    }

    public final long f(long j10) {
        return md.u.M(j10 - this.f88091e, 0L, this.f88090d);
    }

    public final int g() {
        return this.f88088b;
    }

    public final int h() {
        return this.f88087a;
    }

    public C1576b0(int i10, int i11, @NotNull G g10) {
        this.f88087a = i10;
        this.f88088b = i11;
        this.f88089c = g10;
        this.f88090d = ((long) i10) * 1000000;
        this.f88091e = ((long) i11) * 1000000;
    }

    @Override // androidx.compose.animation.core.W, androidx.compose.animation.core.InterfaceC1587h
    public R0 a(H0 h02) {
        return new R0(this);
    }

    public /* synthetic */ C1576b0(int i10, int i11, G g10, int i12, C4969v c4969v) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? P.d() : g10);
    }
}
