package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1601o extends AbstractC1603p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88165g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f88166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f88167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f88168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f88169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88170f = 4;

    public C1601o(float f10, float f11, float f12, float f13) {
        this.f88166b = f10;
        this.f88167c = f11;
        this.f88168d = f12;
        this.f88169e = f13;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public float a(int i10) {
        if (i10 == 0) {
            return this.f88166b;
        }
        if (i10 == 1) {
            return this.f88167c;
        }
        if (i10 == 2) {
            return this.f88168d;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f88169e;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public int b() {
        return this.f88170f;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void d() {
        this.f88166b = 0.0f;
        this.f88167c = 0.0f;
        this.f88168d = 0.0f;
        this.f88169e = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f88166b = f10;
            return;
        }
        if (i10 == 1) {
            this.f88167c = f10;
        } else if (i10 == 2) {
            this.f88168d = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f88169e = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1601o)) {
            return false;
        }
        C1601o c1601o = (C1601o) obj;
        return c1601o.f88166b == this.f88166b && c1601o.f88167c == this.f88167c && c1601o.f88168d == this.f88168d && c1601o.f88169e == this.f88169e;
    }

    public final float f() {
        return this.f88166b;
    }

    public final float g() {
        return this.f88167c;
    }

    public final float h() {
        return this.f88168d;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f88169e) + androidx.compose.animation.B.a(this.f88168d, androidx.compose.animation.B.a(this.f88167c, Float.floatToIntBits(this.f88166b) * 31, 31), 31);
    }

    public final float i() {
        return this.f88169e;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C1601o c() {
        return new C1601o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final void k(float f10) {
        this.f88166b = f10;
    }

    public final void l(float f10) {
        this.f88167c = f10;
    }

    public final void m(float f10) {
        this.f88168d = f10;
    }

    public final void n(float f10) {
        this.f88169e = f10;
    }

    @NotNull
    public String toString() {
        return "AnimationVector4D: v1 = " + this.f88166b + ", v2 = " + this.f88167c + ", v3 = " + this.f88168d + ", v4 = " + this.f88169e;
    }
}
