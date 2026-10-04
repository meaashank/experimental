package androidx.compose.animation.core;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1574a0 implements W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88068e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f88069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f88070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f88071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C1615v0 f88072d;

    public C1574a0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // androidx.compose.animation.core.W
    public float b(long j10, float f10, float f11, float f12) {
        C1615v0 c1615v0 = this.f88072d;
        c1615v0.f88240a = f11;
        return C1594k0.i(c1615v0.i(f10, f12, j10 / 1000000));
    }

    @Override // androidx.compose.animation.core.W
    public long c(float f10, float f11, float f12) {
        C1615v0 c1615v0 = this.f88072d;
        double d10 = c1615v0.f88241b;
        float f13 = c1615v0.f88246g;
        float f14 = f10 - f11;
        float f15 = this.f88071c;
        return C1613u0.c((float) (d10 * d10), f13, f12 / f15, f14 / f15, 1.0f) * 1000000;
    }

    @Override // androidx.compose.animation.core.W
    public float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.W
    public float e(long j10, float f10, float f11, float f12) {
        C1615v0 c1615v0 = this.f88072d;
        c1615v0.f88240a = f11;
        return C1594k0.h(c1615v0.i(f10, f12, j10 / 1000000));
    }

    public final float f() {
        return this.f88069a;
    }

    public final float g() {
        return this.f88070b;
    }

    public C1574a0(float f10, float f11, float f12) {
        this.f88069a = f10;
        this.f88070b = f11;
        this.f88071c = f12;
        C1615v0 c1615v0 = new C1615v0(1.0f);
        c1615v0.f(f10);
        c1615v0.h(f11);
        this.f88072d = c1615v0;
    }

    @Override // androidx.compose.animation.core.W, androidx.compose.animation.core.InterfaceC1587h
    public R0 a(H0 h02) {
        return new R0(this);
    }

    public /* synthetic */ C1574a0(float f10, float f11, float f12, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
