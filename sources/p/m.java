package P;

import n0.C5238e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    @NotNull
    public static final l a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jA = b.a(f14, f15);
        return new l(f10, f11, f12, f13, jA, jA, jA, jA);
    }

    @NotNull
    public static final l b(@NotNull j jVar, float f10, float f11) {
        return a(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d, f10, f11);
    }

    @NotNull
    public static final l c(@NotNull j jVar, long j10, long j11, long j12, long j13) {
        return new l(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d, j10, j11, j12, j13);
    }

    public static l d(j jVar, long j10, long j11, long j12, long j13, int i10, Object obj) {
        long j14;
        long j15;
        long j16;
        long j17;
        if ((i10 & 2) != 0) {
            a.f65487b.getClass();
            j14 = a.f65488c;
        } else {
            j14 = j10;
        }
        if ((i10 & 4) != 0) {
            a.f65487b.getClass();
            j15 = a.f65488c;
        } else {
            j15 = j11;
        }
        if ((i10 & 8) != 0) {
            a.f65487b.getClass();
            j16 = a.f65488c;
        } else {
            j16 = j12;
        }
        if ((i10 & 16) != 0) {
            a.f65487b.getClass();
            j17 = a.f65488c;
        } else {
            j17 = j13;
        }
        return c(jVar, j14, j15, j16, j17);
    }

    @NotNull
    public static final l e(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, a.m(j10), a.o(j10));
    }

    @NotNull
    public static final l f(@NotNull j jVar, long j10) {
        return b(jVar, a.m(j10), a.o(j10));
    }

    @NotNull
    public static final j g(@NotNull l lVar) {
        return new j(lVar.f65518a, lVar.f65519b, lVar.f65520c, lVar.f65521d);
    }

    public static final long h(@NotNull l lVar) {
        return h.a((lVar.v() / 2.0f) + lVar.f65518a, (lVar.p() / 2.0f) + lVar.f65519b);
    }

    public static final float i(@NotNull l lVar) {
        return Math.max(Math.abs(lVar.v()), Math.abs(lVar.p()));
    }

    public static final float j(@NotNull l lVar) {
        return Math.min(Math.abs(lVar.v()), Math.abs(lVar.p()));
    }

    @NotNull
    public static final j k(@NotNull l lVar) {
        float fMax = Math.max(a.m(lVar.f65525h), a.m(lVar.f65522e));
        float fMax2 = Math.max(a.o(lVar.f65522e), a.o(lVar.f65523f));
        return new j((fMax * 0.29289323f) + lVar.f65518a, (fMax2 * 0.29289323f) + lVar.f65519b, lVar.f65520c - (Math.max(a.m(lVar.f65523f), a.m(lVar.f65524g)) * 0.29289323f), lVar.f65521d - (Math.max(a.o(lVar.f65524g), a.o(lVar.f65525h)) * 0.29289323f));
    }

    public static final boolean l(@NotNull l lVar) {
        return lVar.v() == lVar.p() && m(lVar);
    }

    public static final boolean m(@NotNull l lVar) {
        return a.m(lVar.f65522e) == a.m(lVar.f65523f) && a.o(lVar.f65522e) == a.o(lVar.f65523f) && a.m(lVar.f65523f) == a.m(lVar.f65524g) && a.o(lVar.f65523f) == a.o(lVar.f65524g) && a.m(lVar.f65524g) == a.m(lVar.f65525h) && a.o(lVar.f65524g) == a.o(lVar.f65525h) && ((double) lVar.v()) <= ((double) a.m(lVar.f65522e)) * 2.0d && ((double) lVar.p()) <= ((double) a.o(lVar.f65522e)) * 2.0d;
    }

    public static final boolean n(@NotNull l lVar) {
        return lVar.f65518a >= lVar.f65520c || lVar.f65519b >= lVar.f65521d;
    }

    public static final boolean o(@NotNull l lVar) {
        float f10 = lVar.f65518a;
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            return false;
        }
        float f11 = lVar.f65519b;
        if (Float.isInfinite(f11) || Float.isNaN(f11)) {
            return false;
        }
        float f12 = lVar.f65520c;
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            return false;
        }
        float f13 = lVar.f65521d;
        return (Float.isInfinite(f13) || Float.isNaN(f13)) ? false : true;
    }

    public static final boolean p(@NotNull l lVar) {
        if (a.m(lVar.f65522e) != 0.0f && a.o(lVar.f65522e) != 0.0f) {
            return false;
        }
        if (a.m(lVar.f65523f) != 0.0f && a.o(lVar.f65523f) != 0.0f) {
            return false;
        }
        if (a.m(lVar.f65525h) == 0.0f || a.o(lVar.f65525h) == 0.0f) {
            return a.m(lVar.f65524g) == 0.0f || a.o(lVar.f65524g) == 0.0f;
        }
        return false;
    }

    public static final boolean q(@NotNull l lVar) {
        return a.m(lVar.f65522e) == a.o(lVar.f65522e) && a.m(lVar.f65522e) == a.m(lVar.f65523f) && a.m(lVar.f65522e) == a.o(lVar.f65523f) && a.m(lVar.f65522e) == a.m(lVar.f65524g) && a.m(lVar.f65522e) == a.o(lVar.f65524g) && a.m(lVar.f65522e) == a.m(lVar.f65525h) && a.m(lVar.f65522e) == a.o(lVar.f65525h);
    }

    @NotNull
    public static final l r(@NotNull l lVar, @NotNull l lVar2, float f10) {
        return new l(C5238e.j(lVar.f65518a, lVar2.f65518a, f10), C5238e.j(lVar.f65519b, lVar2.f65519b, f10), C5238e.j(lVar.f65520c, lVar2.f65520c, f10), C5238e.j(lVar.f65521d, lVar2.f65521d, f10), b.c(lVar.f65522e, lVar2.f65522e, f10), b.c(lVar.f65523f, lVar2.f65523f, f10), b.c(lVar.f65524g, lVar2.f65524g, f10), b.c(lVar.f65525h, lVar2.f65525h, f10));
    }

    @NotNull
    public static final l s(@NotNull l lVar, long j10) {
        return new l(lVar.f65518a + g.p(j10), lVar.f65519b + g.r(j10), lVar.f65520c + g.p(j10), lVar.f65521d + g.r(j10), lVar.f65522e, lVar.f65523f, lVar.f65524g, lVar.f65525h);
    }
}
