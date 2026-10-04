package k0;

import androidx.compose.animation.C1571b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4815f implements InterfaceC4814e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f214303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f214304b;

    public C4815f(float f10, float f11) {
        this.f214303a = f10;
        this.f214304b = f11;
    }

    public static C4815f H(C4815f c4815f, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c4815f.f214303a;
        }
        if ((i10 & 2) != 0) {
            f11 = c4815f.f214304b;
        }
        c4815f.getClass();
        return new C4815f(f10, f11);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ P.j A0(l lVar) {
        return C4813d.h(this, lVar);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long C(long j10) {
        return C4813d.e(this, j10);
    }

    public final float D() {
        return this.f214304b;
    }

    @NotNull
    public final C4815f E(float f10, float f11) {
        return new C4815f(f10, f11);
    }

    @Override // k0.InterfaceC4814e
    public long G(int i10) {
        return s(V(i10));
    }

    @Override // k0.InterfaceC4814e
    public long I(float f10) {
        return s(W(f10));
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ int I1(float f10) {
        return C4813d.b(this, f10);
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ float M1(long j10) {
        return C4813d.f(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float V(int i10) {
        return i10 / a();
    }

    @Override // k0.InterfaceC4814e
    public float W(float f10) {
        return f10 / a();
    }

    @Override // k0.InterfaceC4814e
    public /* synthetic */ long Z(long j10) {
        return C4813d.i(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float a() {
        return this.f214303a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4815f)) {
            return false;
        }
        C4815f c4815f = (C4815f) obj;
        return Float.compare(this.f214303a, c4815f.f214303a) == 0 && Float.compare(this.f214304b, c4815f.f214304b) == 0;
    }

    public final float g() {
        return this.f214303a;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f214304b) + (Float.floatToIntBits(this.f214303a) * 31);
    }

    @Override // k0.p
    public /* synthetic */ float k(long j10) {
        return o.a(this, j10);
    }

    @Override // k0.InterfaceC4814e
    public float l2(float f10) {
        return a() * f10;
    }

    @Override // k0.p
    public float m0() {
        return this.f214304b;
    }

    @Override // k0.InterfaceC4814e
    public int p2(long j10) {
        return Math.round(M1(j10));
    }

    @Override // k0.p
    public /* synthetic */ long s(float f10) {
        return o.b(this, f10);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f214303a);
        sb2.append(", fontScale=");
        return C1571b.a(sb2, this.f214304b, ')');
    }
}
