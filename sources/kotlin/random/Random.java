package kotlin.random;

import Xc.n;
import androidx.activity.C1477d;
import androidx.collection.C1545m0;
import androidx.collection.M0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.C;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.3")
@V({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public abstract class Random {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Default f218007a = new Default(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Random f218008b = n.f79086a.b();

    public static final class Default extends Random implements Serializable {

        public static final class Serialized implements Serializable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final Serialized f218009a = new Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f218007a;
            }
        }

        public /* synthetic */ Default(C4969v c4969v) {
            this();
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return Serialized.f218009a;
        }

        @Override // kotlin.random.Random
        public int e(int i10) {
            return Random.f218008b.e(i10);
        }

        @Override // kotlin.random.Random
        public boolean g() {
            return Random.f218008b.g();
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] h(int i10) {
            return Random.f218008b.h(i10);
        }

        @Override // kotlin.random.Random
        @C
        @NotNull
        public byte[] i(@NotNull byte[] array) {
            G.p(array, "array");
            return Random.f218008b.i(array);
        }

        @Override // kotlin.random.Random
        @NotNull
        public byte[] j(@NotNull byte[] array, int i10, int i11) {
            G.p(array, "array");
            return Random.f218008b.j(array, i10, i11);
        }

        @Override // kotlin.random.Random
        public double l() {
            return Random.f218008b.l();
        }

        @Override // kotlin.random.Random
        public double m(double d10) {
            return Random.f218008b.m(d10);
        }

        @Override // kotlin.random.Random
        public double n(double d10, double d11) {
            return Random.f218008b.n(d10, d11);
        }

        @Override // kotlin.random.Random
        public float o() {
            return Random.f218008b.o();
        }

        @Override // kotlin.random.Random
        public int p() {
            return Random.f218008b.p();
        }

        @Override // kotlin.random.Random
        public int q(int i10) {
            return Random.f218008b.q(i10);
        }

        @Override // kotlin.random.Random
        public int r(int i10, int i11) {
            return Random.f218008b.r(i10, i11);
        }

        @Override // kotlin.random.Random
        public long s() {
            return Random.f218008b.s();
        }

        @Override // kotlin.random.Random
        public long t(long j10) {
            return Random.f218008b.t(j10);
        }

        @Override // kotlin.random.Random
        public long u(long j10, long j11) {
            return Random.f218008b.u(j10, j11);
        }

        private Default() {
        }
    }

    public static /* synthetic */ byte[] k(Random random, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return random.j(bArr, i10, i11);
    }

    public abstract int e(int i10);

    public boolean g() {
        return e(1) != 0;
    }

    @NotNull
    public byte[] h(int i10) {
        return i(new byte[i10]);
    }

    @C
    @NotNull
    public byte[] i(@NotNull byte[] array) {
        G.p(array, "array");
        return j(array, 0, array.length);
    }

    @C
    @NotNull
    public byte[] j(@NotNull byte[] array, int i10, int i11) {
        G.p(array, "array");
        if (i10 < 0 || i10 > array.length || i11 < 0 || i11 > array.length) {
            throw new IllegalArgumentException(C1477d.a(C1545m0.a("fromIndex (", i10, ") or toIndex (", i11, ") are out of range: 0.."), array.length, '.').toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(M0.a("fromIndex (", i10, ") must be not greater than toIndex (", i11, ").").toString());
        }
        int i12 = (i11 - i10) / 4;
        for (int i13 = 0; i13 < i12; i13++) {
            int iP = p();
            array[i10] = (byte) iP;
            array[i10 + 1] = (byte) (iP >>> 8);
            array[i10 + 2] = (byte) (iP >>> 16);
            array[i10 + 3] = (byte) (iP >>> 24);
            i10 += 4;
        }
        int i14 = i11 - i10;
        int iE = e(i14 * 8);
        for (int i15 = 0; i15 < i14; i15++) {
            array[i10 + i15] = (byte) (iE >>> (i15 * 8));
        }
        return array;
    }

    public double l() {
        return c.d(e(26), e(27));
    }

    public double m(double d10) {
        return n(0.0d, d10);
    }

    public double n(double d10, double d11) {
        double dL;
        d.d(d10, d11);
        double d12 = d11 - d10;
        if (!Double.isInfinite(d12) || Math.abs(d10) > Double.MAX_VALUE || Math.abs(d11) > Double.MAX_VALUE) {
            dL = d10 + (l() * d12);
        } else {
            double d13 = 2;
            double dL2 = ((d11 / d13) - (d10 / d13)) * l();
            dL = d10 + dL2 + dL2;
        }
        return dL >= d11 ? Math.nextAfter(d11, Double.NEGATIVE_INFINITY) : dL;
    }

    public float o() {
        return e(24) / 1.6777216E7f;
    }

    public int p() {
        return e(32);
    }

    public int q(int i10) {
        return r(0, i10);
    }

    public int r(int i10, int i11) {
        int iP;
        int i12;
        int iE;
        d.e(i10, i11);
        int i13 = i11 - i10;
        if (i13 > 0 || i13 == Integer.MIN_VALUE) {
            if (((-i13) & i13) == i13) {
                iE = e(d.g(i13));
            } else {
                do {
                    iP = p() >>> 1;
                    i12 = iP % i13;
                } while ((i13 - 1) + (iP - i12) < 0);
                iE = i12;
            }
            return i10 + iE;
        }
        while (true) {
            int iP2 = p();
            if (i10 <= iP2 && iP2 < i11) {
                return iP2;
            }
        }
    }

    public long s() {
        return (((long) p()) << 32) + ((long) p());
    }

    public long t(long j10) {
        return u(0L, j10);
    }

    public long u(long j10, long j11) {
        long jS;
        long j12;
        long jE;
        int iP;
        d.f(j10, j11);
        long j13 = j11 - j10;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i10 = (int) j13;
                int i11 = (int) (j13 >>> 32);
                if (i10 != 0) {
                    iP = e(d.g(i10));
                } else if (i11 == 1) {
                    iP = p();
                } else {
                    jE = (((long) e(d.g(i11))) << 32) + (ZipKt.f225990j & ((long) p()));
                }
                jE = ((long) iP) & ZipKt.f225990j;
            } else {
                do {
                    jS = s() >>> 1;
                    j12 = jS % j13;
                } while ((j13 - 1) + (jS - j12) < 0);
                jE = j12;
            }
            return j10 + jE;
        }
        while (true) {
            long jS2 = s();
            if (j10 <= jS2 && jS2 < j11) {
                return jS2;
            }
        }
    }
}
