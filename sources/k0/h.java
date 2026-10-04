package k0;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import l0.InterfaceC5130a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAndroidDensity.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDensity.android.kt\nandroidx/compose/ui/unit/DensityWithConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
public final class h implements InterfaceC4814e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f214305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f214306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC5130a f214307c;

    public h(float f10, float f11, @NotNull InterfaceC5130a interfaceC5130a) {
        this.f214305a = f10;
        this.f214306b = f11;
        this.f214307c = interfaceC5130a;
    }

    public static h K(h hVar, float f10, float f11, InterfaceC5130a interfaceC5130a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = hVar.f214305a;
        }
        if ((i10 & 2) != 0) {
            f11 = hVar.f214306b;
        }
        if ((i10 & 4) != 0) {
            interfaceC5130a = hVar.f214307c;
        }
        hVar.getClass();
        return new h(f10, f11, interfaceC5130a);
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
        return this.f214306b;
    }

    public final InterfaceC5130a E() {
        return this.f214307c;
    }

    @Override // k0.InterfaceC4814e
    public long G(int i10) {
        return s(V(i10));
    }

    @NotNull
    public final h H(float f10, float f11, @NotNull InterfaceC5130a interfaceC5130a) {
        return new h(f10, f11, interfaceC5130a);
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
        return this.f214305a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f214305a, hVar.f214305a) == 0 && Float.compare(this.f214306b, hVar.f214306b) == 0 && G.g(this.f214307c, hVar.f214307c);
    }

    public final float g() {
        return this.f214305a;
    }

    public int hashCode() {
        return this.f214307c.hashCode() + androidx.compose.animation.B.a(this.f214306b, Float.floatToIntBits(this.f214305a) * 31, 31);
    }

    @Override // k0.p
    public float k(long j10) {
        long jM = B.m(j10);
        D.f214274b.getClass();
        if (D.g(jM, D.f214276d)) {
            return this.f214307c.b(B.n(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // k0.InterfaceC4814e
    public float l2(float f10) {
        return a() * f10;
    }

    @Override // k0.p
    public float m0() {
        return this.f214306b;
    }

    @Override // k0.InterfaceC4814e
    public int p2(long j10) {
        return Math.round(M1(j10));
    }

    @Override // k0.p
    public long s(float f10) {
        return C.v(4294967296L, this.f214307c.a(f10));
    }

    @NotNull
    public String toString() {
        return "DensityWithConverter(density=" + this.f214305a + ", fontScale=" + this.f214306b + ", converter=" + this.f214307c + ')';
    }
}
