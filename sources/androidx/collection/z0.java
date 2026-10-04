package androidx.collection;

import java.util.Arrays;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,958:1\n546#1:959\n68#2:960\n250#2,6:963\n68#2:969\n68#2:970\n68#2:971\n68#2:978\n68#2:979\n13607#3,2:961\n1675#3,6:972\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n683#1:959\n744#1:960\n763#1:963,6\n774#1:969\n778#1:970\n822#1:971\n838#1:978\n854#1:979\n754#1:961,2\n824#1:972,6\n*E\n"})
public final class z0 extends W {
    public z0() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(z0 z0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = z0Var.f86908b;
        }
        z0Var.v0(i10);
    }

    public final void W(@e.D(from = 0) int i10, long j10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f86908b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86908b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        d0(i11 + 1);
        long[] jArr = this.f86907a;
        int i12 = this.f86908b;
        if (i10 != i12) {
            C4875q.A0(jArr, jArr, i10 + 1, i10, i12);
        }
        jArr[i10] = j10;
        this.f86908b++;
    }

    public final boolean X(long j10) {
        d0(this.f86908b + 1);
        long[] jArr = this.f86907a;
        int i10 = this.f86908b;
        jArr[i10] = j10;
        this.f86908b = i10 + 1;
        return true;
    }

    public final boolean Y(@e.D(from = 0) int i10, @NotNull W elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        if (i10 < 0 || i10 > this.f86908b) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86908b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (elements.B()) {
            return false;
        }
        d0(this.f86908b + elements.f86908b);
        long[] jArr = this.f86907a;
        int i11 = this.f86908b;
        if (i10 != i11) {
            C4875q.A0(jArr, jArr, elements.f86908b + i10, i10, i11);
        }
        C4875q.A0(elements.f86907a, jArr, i10, 0, elements.f86908b);
        this.f86908b += elements.f86908b;
        return true;
    }

    public final boolean Z(@e.D(from = 0) int i10, @NotNull long[] elements) {
        int i11;
        kotlin.jvm.internal.G.p(elements, "elements");
        if (i10 < 0 || i10 > (i11 = this.f86908b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86908b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        d0(i11 + elements.length);
        long[] jArr = this.f86907a;
        int i12 = this.f86908b;
        if (i10 != i12) {
            C4875q.A0(jArr, jArr, elements.length + i10, i10, i12);
        }
        C4875q.J0(elements, jArr, i10, 0, 0, 12, null);
        this.f86908b += elements.length;
        return true;
    }

    public final boolean a0(@NotNull W elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return Y(this.f86908b, elements);
    }

    public final boolean b0(@NotNull long[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return Z(this.f86908b, elements);
    }

    public final void c0() {
        this.f86908b = 0;
    }

    public final void d0(int i10) {
        long[] jArr = this.f86907a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f86907a = jArrCopyOf;
        }
    }

    public final int e0() {
        return this.f86907a.length;
    }

    public final void f0(long j10) {
        l0(j10);
    }

    public final void g0(@NotNull W elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        long[] jArr = elements.f86907a;
        int i10 = elements.f86908b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(jArr[i11]);
        }
    }

    public final void h0(@NotNull long[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        for (long j10 : elements) {
            l0(j10);
        }
    }

    public final void i0(long j10) {
        X(j10);
    }

    public final void j0(@NotNull W elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Y(this.f86908b, elements);
    }

    public final void k0(@NotNull long[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Z(this.f86908b, elements);
    }

    public final boolean l0(long j10) {
        int iY = y(j10);
        if (iY < 0) {
            return false;
        }
        o0(iY);
        return true;
    }

    public final boolean m0(@NotNull W elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86908b;
        int i11 = elements.f86908b - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                l0(elements.s(i12));
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return i10 != this.f86908b;
    }

    public final boolean n0(@NotNull long[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86908b;
        for (long j10 : elements) {
            l0(j10);
        }
        return i10 != this.f86908b;
    }

    public final long o0(@e.D(from = 0) int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f86908b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86908b - 1);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        long[] jArr = this.f86907a;
        long j10 = jArr[i10];
        if (i10 != i11 - 1) {
            C4875q.A0(jArr, jArr, i10, i10 + 1, i11);
        }
        this.f86908b--;
        return j10;
    }

    public final void p0(@e.D(from = 0) int i10, @e.D(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f86908b) || i11 < 0 || i11 > i12) {
            StringBuilder sbA = C1545m0.a("Start (", i10, ") and end (", i11, ") must be in 0..");
            sbA.append(this.f86908b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            if (i11 < i12) {
                long[] jArr = this.f86907a;
                C4875q.A0(jArr, jArr, i10, i11, i12);
            }
            this.f86908b -= i11 - i10;
        }
    }

    public final boolean q0(@NotNull W elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86908b;
        long[] jArr = this.f86907a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.c(jArr[i11])) {
                o0(i11);
            }
        }
        return i10 != this.f86908b;
    }

    public final boolean r0(@NotNull long[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86908b;
        long[] jArr = this.f86907a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            long j10 = jArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == j10) {
                    i13 = i12;
                    break;
                }
                i12++;
            }
            if (i13 < 0) {
                o0(i11);
            }
            i11--;
        }
        return i10 != this.f86908b;
    }

    public final long s0(@e.D(from = 0) int i10, long j10) {
        if (i10 < 0 || i10 >= this.f86908b) {
            StringBuilder sbA = android.support.v4.media.a.a("set index ", i10, " must be between 0 .. ");
            sbA.append(this.f86908b - 1);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        long[] jArr = this.f86907a;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public final void t0() {
        int i10 = this.f86908b;
        if (i10 == 0) {
            return;
        }
        C4875q.R3(this.f86907a, 0, i10);
    }

    public final void u0() {
        int i10 = this.f86908b;
        if (i10 == 0) {
            return;
        }
        kotlin.collections.B.Vu(this.f86907a, 0, i10);
    }

    public final void v0(int i10) {
        int iMax = Math.max(i10, this.f86908b);
        long[] jArr = this.f86907a;
        if (jArr.length > iMax) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            kotlin.jvm.internal.G.o(jArrCopyOf, "copyOf(this, newSize)");
            this.f86907a = jArrCopyOf;
        }
    }

    public z0(int i10) {
        super(i10);
    }

    public z0(int i10, int i11, C4969v c4969v) {
        super((i11 & 1) != 0 ? 16 : i10);
    }
}
