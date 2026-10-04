package kotlin.time;

import kotlin.jvm.internal.V;
import kotlin.time.C5041h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class z {
    public static final long a(long j10, long j11, long j12) {
        if (!C5041h.R(j11) || (j10 ^ j12) >= 0) {
            return j10;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    public static final long b(long j10) {
        if (j10 < 0) {
            C5041h.f218418b.getClass();
            return C5041h.f218421e;
        }
        C5041h.f218418b.getClass();
        return C5041h.f218420d;
    }

    public static final boolean c(long j10) {
        return ((j10 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long d(long j10, @NotNull DurationUnit unit, long j11) {
        kotlin.jvm.internal.G.p(unit, "unit");
        long jG0 = C5041h.g0(j11, unit);
        if (((j10 - 1) | 1) == Long.MAX_VALUE) {
            a(j10, j11, jG0);
            return j10;
        }
        if (((jG0 - 1) | 1) == Long.MAX_VALUE) {
            return e(j10, unit, j11);
        }
        long j12 = j10 + jG0;
        return ((j10 ^ j12) & (jG0 ^ j12)) < 0 ? j10 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j12;
    }

    public static final long e(long j10, DurationUnit durationUnit, long j11) {
        long jP = C5041h.p(j11, 2);
        long jG0 = C5041h.g0(jP, durationUnit);
        return (1 | (jG0 - 1)) == Long.MAX_VALUE ? jG0 : d(d(j10, durationUnit, jP), durationUnit, C5041h.V(j11, jP));
    }

    public static final long f(long j10, long j11, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        return (1 | (j11 - 1)) == Long.MAX_VALUE ? C5041h.l0(b(j11)) : g(j10, j11, unit);
    }

    public static final long g(long j10, long j11, DurationUnit durationUnit) {
        long j12 = j10 - j11;
        if (((j12 ^ j10) & (~(j12 ^ j11))) >= 0) {
            return j.P(j12, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return C5041h.l0(b(j12));
        }
        long jB = l.b(1L, durationUnit2, durationUnit);
        long j13 = (j10 / jB) - (j11 / jB);
        long j14 = (j10 % jB) - (j11 % jB);
        C5041h.a aVar = C5041h.f218418b;
        return C5041h.W(j.P(j13, durationUnit2), j.P(j14, durationUnit));
    }

    public static final long h(long j10, long j11, @NotNull DurationUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        if (((j11 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j10 - 1)) == Long.MAX_VALUE ? b(j10) : g(j10, j11, unit);
        }
        if (j10 != j11) {
            return C5041h.l0(b(j11));
        }
        C5041h.f218418b.getClass();
        return C5041h.f218419c;
    }
}
