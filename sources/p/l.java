package P;

import androidx.collection.C1550p;
import androidx.compose.animation.B;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f65515j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f65516k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final l f65517l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f65518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f65519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f65520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f65521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f65522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f65523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f65524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f65525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public l f65526i;

    public static final class a {
        public a() {
        }

        @NotNull
        public final l a() {
            return l.f65517l;
        }

        public a(C4969v c4969v) {
        }

        @dd.o
        public static /* synthetic */ void b() {
        }
    }

    static {
        P.a.f65487b.getClass();
        f65517l = m.e(0.0f, 0.0f, 0.0f, 0.0f, P.a.f65488c);
    }

    public /* synthetic */ l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, C4969v c4969v) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public static l l(l lVar, float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lVar.f65518a;
        }
        if ((i10 & 2) != 0) {
            f11 = lVar.f65519b;
        }
        if ((i10 & 4) != 0) {
            f12 = lVar.f65520c;
        }
        if ((i10 & 8) != 0) {
            f13 = lVar.f65521d;
        }
        if ((i10 & 16) != 0) {
            j10 = lVar.f65522e;
        }
        if ((i10 & 32) != 0) {
            j11 = lVar.f65523f;
        }
        if ((i10 & 64) != 0) {
            j12 = lVar.f65524g;
        }
        if ((i10 & 128) != 0) {
            j13 = lVar.f65525h;
        }
        long j14 = j13;
        lVar.getClass();
        long j15 = j12;
        long j16 = j11;
        long j17 = j10;
        float f14 = f12;
        return new l(f10, f11, f14, f13, j17, j16, j15, j14);
    }

    @NotNull
    public static final l w() {
        f65515j.getClass();
        return f65517l;
    }

    public final float b() {
        return this.f65518a;
    }

    public final float c() {
        return this.f65519b;
    }

    public final float d() {
        return this.f65520c;
    }

    public final float e() {
        return this.f65521d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f65518a, lVar.f65518a) == 0 && Float.compare(this.f65519b, lVar.f65519b) == 0 && Float.compare(this.f65520c, lVar.f65520c) == 0 && Float.compare(this.f65521d, lVar.f65521d) == 0 && P.a.j(this.f65522e, lVar.f65522e) && P.a.j(this.f65523f, lVar.f65523f) && P.a.j(this.f65524g, lVar.f65524g) && P.a.j(this.f65525h, lVar.f65525h);
    }

    public final long f() {
        return this.f65522e;
    }

    public final long g() {
        return this.f65523f;
    }

    public final long h() {
        return this.f65524g;
    }

    public int hashCode() {
        return C1550p.a(this.f65525h) + ((C1550p.a(this.f65524g) + ((C1550p.a(this.f65523f) + ((P.a.p(this.f65522e) + B.a(this.f65521d, B.a(this.f65520c, B.a(this.f65519b, Float.floatToIntBits(this.f65518a) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final long i() {
        return this.f65525h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(long r8) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P.l.j(long):boolean");
    }

    @NotNull
    public final l k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        return new l(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float m() {
        return this.f65521d;
    }

    public final long n() {
        return this.f65525h;
    }

    public final long o() {
        return this.f65524g;
    }

    public final float p() {
        return this.f65521d - this.f65519b;
    }

    public final float q() {
        return this.f65518a;
    }

    public final float r() {
        return this.f65520c;
    }

    public final float s() {
        return this.f65519b;
    }

    public final long t() {
        return this.f65522e;
    }

    @NotNull
    public String toString() {
        long j10 = this.f65522e;
        long j11 = this.f65523f;
        long j12 = this.f65524g;
        long j13 = this.f65525h;
        String str = c.a(this.f65518a, 1) + U6.j.f68738d + c.a(this.f65519b, 1) + U6.j.f68738d + c.a(this.f65520c, 1) + U6.j.f68738d + c.a(this.f65521d, 1);
        if (!P.a.j(j10, j11) || !P.a.j(j11, j12) || !P.a.j(j12, j13)) {
            StringBuilder sbA = androidx.activity.result.i.a("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) P.a.t(j10));
            sbA.append(", topRight=");
            sbA.append((Object) P.a.t(j11));
            sbA.append(", bottomRight=");
            sbA.append((Object) P.a.t(j12));
            sbA.append(", bottomLeft=");
            sbA.append((Object) P.a.t(j13));
            sbA.append(')');
            return sbA.toString();
        }
        if (P.a.m(j10) == P.a.o(j10)) {
            StringBuilder sbA2 = androidx.activity.result.i.a("RoundRect(rect=", str, ", radius=");
            sbA2.append(c.a(P.a.m(j10), 1));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = androidx.activity.result.i.a("RoundRect(rect=", str, ", x=");
        sbA3.append(c.a(P.a.m(j10), 1));
        sbA3.append(", y=");
        sbA3.append(c.a(P.a.o(j10), 1));
        sbA3.append(')');
        return sbA3.toString();
    }

    public final long u() {
        return this.f65523f;
    }

    public final float v() {
        return this.f65520c - this.f65518a;
    }

    public final float x(float f10, float f11, float f12, float f13) {
        float f14 = f11 + f12;
        return (f14 <= f13 || f14 == 0.0f) ? f10 : Math.min(f10, f13 / f14);
    }

    public final l y() {
        l lVar = this.f65526i;
        if (lVar != null) {
            return lVar;
        }
        float fX = x(x(x(x(1.0f, P.a.o(this.f65525h), P.a.o(this.f65522e), p()), P.a.m(this.f65522e), P.a.m(this.f65523f), v()), P.a.o(this.f65523f), P.a.o(this.f65524g), p()), P.a.m(this.f65524g), P.a.m(this.f65525h), v());
        l lVar2 = new l(this.f65518a * fX, this.f65519b * fX, this.f65520c * fX, this.f65521d * fX, b.a(P.a.m(this.f65522e) * fX, P.a.o(this.f65522e) * fX), b.a(P.a.m(this.f65523f) * fX, P.a.o(this.f65523f) * fX), b.a(P.a.m(this.f65524g) * fX, P.a.o(this.f65524g) * fX), b.a(P.a.m(this.f65525h) * fX, P.a.o(this.f65525h) * fX));
        this.f65526i = lVar2;
        return lVar2;
    }

    public l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f65518a = f10;
        this.f65519b = f11;
        this.f65520c = f12;
        this.f65521d = f13;
        this.f65522e = j10;
        this.f65523f = j11;
        this.f65524g = j12;
        this.f65525h = j13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, C4969v c4969v) {
        long j14;
        long j15;
        long j16;
        long j17;
        if ((i10 & 16) != 0) {
            P.a.f65487b.getClass();
            j14 = P.a.f65488c;
        } else {
            j14 = j10;
        }
        if ((i10 & 32) != 0) {
            P.a.f65487b.getClass();
            j15 = P.a.f65488c;
        } else {
            j15 = j11;
        }
        if ((i10 & 64) != 0) {
            P.a.f65487b.getClass();
            j16 = P.a.f65488c;
        } else {
            j16 = j12;
        }
        if ((i10 & 128) != 0) {
            P.a.f65487b.getClass();
            j17 = P.a.f65488c;
        } else {
            j17 = j13;
        }
        this(f10, f11, f12, f13, j14, j15, j16, j17);
    }
}
