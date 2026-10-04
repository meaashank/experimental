package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1599n extends AbstractC1603p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f88157f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f88158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f88159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f88160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f88161e = 3;

    public C1599n(float f10, float f11, float f12) {
        this.f88158b = f10;
        this.f88159c = f11;
        this.f88160d = f12;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public float a(int i10) {
        if (i10 == 0) {
            return this.f88158b;
        }
        if (i10 == 1) {
            return this.f88159c;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f88160d;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public int b() {
        return this.f88161e;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void d() {
        this.f88158b = 0.0f;
        this.f88159c = 0.0f;
        this.f88160d = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f88158b = f10;
        } else if (i10 == 1) {
            this.f88159c = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f88160d = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1599n)) {
            return false;
        }
        C1599n c1599n = (C1599n) obj;
        return c1599n.f88158b == this.f88158b && c1599n.f88159c == this.f88159c && c1599n.f88160d == this.f88160d;
    }

    public final float f() {
        return this.f88158b;
    }

    public final float g() {
        return this.f88159c;
    }

    public final float h() {
        return this.f88160d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f88160d) + androidx.compose.animation.B.a(this.f88159c, Float.floatToIntBits(this.f88158b) * 31, 31);
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1599n c() {
        return new C1599n(0.0f, 0.0f, 0.0f);
    }

    public final void j(float f10) {
        this.f88158b = f10;
    }

    public final void k(float f10) {
        this.f88159c = f10;
    }

    public final void l(float f10) {
        this.f88160d = f10;
    }

    @NotNull
    public String toString() {
        return "AnimationVector3D: v1 = " + this.f88158b + ", v2 = " + this.f88159c + ", v3 = " + this.f88160d;
    }
}
