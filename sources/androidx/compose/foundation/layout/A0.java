package androidx.compose.foundation.layout;

import androidx.compose.animation.C1635o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class A0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f90173e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f90174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f90175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public B f90176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public P f90177d;

    public A0() {
        this(0.0f, false, null, null, 15, null);
    }

    public static A0 f(A0 a02, float f10, boolean z10, B b10, P p10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = a02.f90174a;
        }
        if ((i10 & 2) != 0) {
            z10 = a02.f90175b;
        }
        if ((i10 & 4) != 0) {
            b10 = a02.f90176c;
        }
        if ((i10 & 8) != 0) {
            p10 = a02.f90177d;
        }
        a02.getClass();
        return new A0(f10, z10, b10, p10);
    }

    public final float a() {
        return this.f90174a;
    }

    public final boolean b() {
        return this.f90175b;
    }

    @Nullable
    public final B c() {
        return this.f90176c;
    }

    @Nullable
    public final P d() {
        return this.f90177d;
    }

    @NotNull
    public final A0 e(float f10, boolean z10, @Nullable B b10, @Nullable P p10) {
        return new A0(f10, z10, b10, p10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return Float.compare(this.f90174a, a02.f90174a) == 0 && this.f90175b == a02.f90175b && kotlin.jvm.internal.G.g(this.f90176c, a02.f90176c) && kotlin.jvm.internal.G.g(this.f90177d, a02.f90177d);
    }

    @Nullable
    public final B g() {
        return this.f90176c;
    }

    public final boolean h() {
        return this.f90175b;
    }

    public int hashCode() {
        int iA = (C1635o.a(this.f90175b) + (Float.floatToIntBits(this.f90174a) * 31)) * 31;
        B b10 = this.f90176c;
        int iHashCode = (iA + (b10 == null ? 0 : b10.hashCode())) * 31;
        P p10 = this.f90177d;
        return iHashCode + (p10 != null ? Float.floatToIntBits(p10.f90607a) : 0);
    }

    @Nullable
    public final P i() {
        return this.f90177d;
    }

    public final float j() {
        return this.f90174a;
    }

    public final void k(@Nullable B b10) {
        this.f90176c = b10;
    }

    public final void l(boolean z10) {
        this.f90175b = z10;
    }

    public final void m(@Nullable P p10) {
        this.f90177d = p10;
    }

    public final void n(float f10) {
        this.f90174a = f10;
    }

    @NotNull
    public String toString() {
        return "RowColumnParentData(weight=" + this.f90174a + ", fill=" + this.f90175b + ", crossAxisAlignment=" + this.f90176c + ", flowLayoutData=" + this.f90177d + ')';
    }

    public A0(float f10, boolean z10, @Nullable B b10, @Nullable P p10) {
        this.f90174a = f10;
        this.f90175b = z10;
        this.f90176c = b10;
        this.f90177d = p10;
    }

    public /* synthetic */ A0(float f10, boolean z10, B b10, P p10, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : b10, (i10 & 8) != 0 ? null : p10);
    }
}
