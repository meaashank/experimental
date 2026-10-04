package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1597m extends AbstractC1603p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88153e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f88154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f88155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88156d = 2;

    public C1597m(float f10, float f11) {
        this.f88154b = f10;
        this.f88155c = f11;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public float a(int i10) {
        if (i10 == 0) {
            return this.f88154b;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f88155c;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public int b() {
        return this.f88156d;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void d() {
        this.f88154b = 0.0f;
        this.f88155c = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f88154b = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f88155c = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C1597m)) {
            return false;
        }
        C1597m c1597m = (C1597m) obj;
        return c1597m.f88154b == this.f88154b && c1597m.f88155c == this.f88155c;
    }

    public final float f() {
        return this.f88154b;
    }

    public final float g() {
        return this.f88155c;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1597m c() {
        return new C1597m(0.0f, 0.0f);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f88155c) + (Float.floatToIntBits(this.f88154b) * 31);
    }

    public final void i(float f10) {
        this.f88154b = f10;
    }

    public final void j(float f10) {
        this.f88155c = f10;
    }

    @NotNull
    public String toString() {
        return "AnimationVector2D: v1 = " + this.f88154b + ", v2 = " + this.f88155c;
    }
}
