package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1595l extends AbstractC1603p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f88147d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f88148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88149c = 1;

    public C1595l(float f10) {
        this.f88148b = f10;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public float a(int i10) {
        if (i10 == 0) {
            return this.f88148b;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public int b() {
        return this.f88149c;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void d() {
        this.f88148b = 0.0f;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f88148b = f10;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof C1595l) && ((C1595l) obj).f88148b == this.f88148b;
    }

    public final float f() {
        return this.f88148b;
    }

    @Override // androidx.compose.animation.core.AbstractC1603p
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1595l c() {
        return new C1595l(0.0f);
    }

    public final void h(float f10) {
        this.f88148b = f10;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f88148b);
    }

    @NotNull
    public String toString() {
        return "AnimationVector1D: value = " + this.f88148b;
    }
}
