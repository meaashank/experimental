package kotlin.random;

import U6.j;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import md.l;
import md.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public final class d {
    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final Random a(int i10) {
        return new XorWowRandom(i10, i10 >> 31);
    }

    @InterfaceC4887e0(version = "1.3")
    @NotNull
    public static final Random b(long j10) {
        return new XorWowRandom((int) j10, (int) (j10 >> 32));
    }

    @NotNull
    public static final String c(@NotNull Object from, @NotNull Object until) {
        G.p(from, "from");
        G.p(until, "until");
        return "Random range is empty: [" + from + j.f68738d + until + ").";
    }

    public static final void d(double d10, double d11) {
        if (d11 <= d10) {
            throw new IllegalArgumentException(c(Double.valueOf(d10), Double.valueOf(d11)).toString());
        }
    }

    public static final void e(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(c(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void f(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(c(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int g(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    @InterfaceC4887e0(version = "1.3")
    public static final int h(@NotNull Random random, @NotNull l range) {
        G.p(random, "<this>");
        G.p(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        int i10 = range.f221140b;
        if (i10 < Integer.MAX_VALUE) {
            return random.r(range.f221139a, i10 + 1);
        }
        int i11 = range.f221139a;
        return i11 > Integer.MIN_VALUE ? random.r(i11 - 1, i10) + 1 : random.p();
    }

    @InterfaceC4887e0(version = "1.3")
    public static final long i(@NotNull Random random, @NotNull o range) {
        G.p(random, "<this>");
        G.p(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        long j10 = range.f221150b;
        if (j10 < Long.MAX_VALUE) {
            return random.u(range.f221149a, j10 + 1);
        }
        long j11 = range.f221149a;
        return j11 > Long.MIN_VALUE ? random.u(j11 - 1, j10) + 1 : random.s();
    }

    public static final int j(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
