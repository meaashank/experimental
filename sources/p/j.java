package P;

import androidx.compose.animation.B;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65509f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f65511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f65512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f65513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f65514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f65508e = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final j f65510g = new j(0.0f, 0.0f, 0.0f, 0.0f);

    public static final class a {
        public a() {
        }

        @NotNull
        public final j a() {
            return j.f65510g;
        }

        public a(C4969v c4969v) {
        }

        @T1
        public static /* synthetic */ void b() {
        }
    }

    public j(float f10, float f11, float f12, float f13) {
        this.f65511a = f10;
        this.f65512b = f11;
        this.f65513c = f12;
        this.f65514d = f13;
    }

    public static j h(j jVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = jVar.f65511a;
        }
        if ((i10 & 2) != 0) {
            f11 = jVar.f65512b;
        }
        if ((i10 & 4) != 0) {
            f12 = jVar.f65513c;
        }
        if ((i10 & 8) != 0) {
            f13 = jVar.f65514d;
        }
        jVar.getClass();
        return new j(f10, f11, f12, f13);
    }

    public final float B() {
        return this.f65512b;
    }

    public final long D() {
        return h.a((G() / 2.0f) + this.f65511a, this.f65512b);
    }

    public final long E() {
        return h.a(this.f65511a, this.f65512b);
    }

    public final long F() {
        return h.a(this.f65513c, this.f65512b);
    }

    public final float G() {
        return this.f65513c - this.f65511a;
    }

    @T1
    @NotNull
    public final j I(float f10) {
        return new j(this.f65511a - f10, this.f65512b - f10, this.f65513c + f10, this.f65514d + f10);
    }

    @T1
    @NotNull
    public final j J(float f10, float f11, float f12, float f13) {
        return new j(Math.max(this.f65511a, f10), Math.max(this.f65512b, f11), Math.min(this.f65513c, f12), Math.min(this.f65514d, f13));
    }

    @T1
    @NotNull
    public final j K(@NotNull j jVar) {
        return new j(Math.max(this.f65511a, jVar.f65511a), Math.max(this.f65512b, jVar.f65512b), Math.min(this.f65513c, jVar.f65513c), Math.min(this.f65514d, jVar.f65514d));
    }

    public final boolean L() {
        return this.f65511a >= this.f65513c || this.f65512b >= this.f65514d;
    }

    public final boolean N() {
        float f10 = this.f65511a;
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            return false;
        }
        float f11 = this.f65512b;
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            return false;
        }
        float f12 = this.f65513c;
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            return false;
        }
        float f13 = this.f65514d;
        return (Float.isInfinite(f13) || Float.isNaN(f13)) ? false : true;
    }

    public final boolean P() {
        return this.f65511a >= Float.POSITIVE_INFINITY || this.f65512b >= Float.POSITIVE_INFINITY || this.f65513c >= Float.POSITIVE_INFINITY || this.f65514d >= Float.POSITIVE_INFINITY;
    }

    public final boolean R(@NotNull j jVar) {
        return this.f65513c > jVar.f65511a && jVar.f65513c > this.f65511a && this.f65514d > jVar.f65512b && jVar.f65514d > this.f65512b;
    }

    @T1
    @NotNull
    public final j S(float f10, float f11) {
        return new j(this.f65511a + f10, this.f65512b + f11, this.f65513c + f10, this.f65514d + f11);
    }

    @T1
    @NotNull
    public final j T(long j10) {
        return new j(g.p(j10) + this.f65511a, g.r(j10) + this.f65512b, g.p(j10) + this.f65513c, g.r(j10) + this.f65514d);
    }

    public final float b() {
        return this.f65511a;
    }

    public final float c() {
        return this.f65512b;
    }

    public final float d() {
        return this.f65513c;
    }

    public final float e() {
        return this.f65514d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f65511a, jVar.f65511a) == 0 && Float.compare(this.f65512b, jVar.f65512b) == 0 && Float.compare(this.f65513c, jVar.f65513c) == 0 && Float.compare(this.f65514d, jVar.f65514d) == 0;
    }

    public final boolean f(long j10) {
        return g.p(j10) >= this.f65511a && g.p(j10) < this.f65513c && g.r(j10) >= this.f65512b && g.r(j10) < this.f65514d;
    }

    @NotNull
    public final j g(float f10, float f11, float f12, float f13) {
        return new j(f10, f11, f12, f13);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f65514d) + B.a(this.f65513c, B.a(this.f65512b, Float.floatToIntBits(this.f65511a) * 31, 31), 31);
    }

    @T1
    @NotNull
    public final j i(float f10) {
        return I(-f10);
    }

    public final float j() {
        return this.f65514d;
    }

    public final long l() {
        return h.a((G() / 2.0f) + this.f65511a, this.f65514d);
    }

    public final long m() {
        return h.a(this.f65511a, this.f65514d);
    }

    public final long n() {
        return h.a(this.f65513c, this.f65514d);
    }

    public final long o() {
        return h.a((G() / 2.0f) + this.f65511a, (r() / 2.0f) + this.f65512b);
    }

    public final long p() {
        return h.a(this.f65511a, (r() / 2.0f) + this.f65512b);
    }

    public final long q() {
        return h.a(this.f65513c, (r() / 2.0f) + this.f65512b);
    }

    public final float r() {
        return this.f65514d - this.f65512b;
    }

    public final float t() {
        return this.f65511a;
    }

    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.f65511a, 1) + U6.j.f68738d + c.a(this.f65512b, 1) + U6.j.f68738d + c.a(this.f65513c, 1) + U6.j.f68738d + c.a(this.f65514d, 1) + ')';
    }

    public final float v() {
        return Math.max(Math.abs(G()), Math.abs(r()));
    }

    public final float w() {
        return Math.min(Math.abs(G()), Math.abs(r()));
    }

    public final float x() {
        return this.f65513c;
    }

    public final long z() {
        return o.a(G(), r());
    }

    @T1
    public static /* synthetic */ void A() {
    }

    @T1
    public static /* synthetic */ void C() {
    }

    @T1
    public static /* synthetic */ void H() {
    }

    @T1
    public static /* synthetic */ void M() {
    }

    @T1
    public static /* synthetic */ void O() {
    }

    @T1
    public static /* synthetic */ void Q() {
    }

    @T1
    public static /* synthetic */ void k() {
    }

    @T1
    public static /* synthetic */ void s() {
    }

    @T1
    public static /* synthetic */ void u() {
    }

    @T1
    public static /* synthetic */ void y() {
    }
}
