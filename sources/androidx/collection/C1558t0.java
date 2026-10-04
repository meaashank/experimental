package androidx.collection;

import java.util.Arrays;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,958:1\n546#1:959\n68#2:960\n250#2,6:963\n68#2:969\n68#2:970\n68#2:971\n68#2:978\n68#2:979\n13600#3,2:961\n1663#3,6:972\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n683#1:959\n744#1:960\n763#1:963,6\n774#1:969\n778#1:970\n822#1:971\n838#1:978\n854#1:979\n754#1:961,2\n824#1:972,6\n*E\n"})
public final class C1558t0 extends I {
    public C1558t0() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(C1558t0 c1558t0, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c1558t0.f86709b;
        }
        c1558t0.v0(i10);
    }

    public final void W(@e.D(from = 0) int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f86709b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86709b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        d0(i12 + 1);
        int[] iArr = this.f86708a;
        int i13 = this.f86709b;
        if (i10 != i13) {
            C4875q.z0(iArr, iArr, i10 + 1, i10, i13);
        }
        iArr[i10] = i11;
        this.f86709b++;
    }

    public final boolean X(int i10) {
        d0(this.f86709b + 1);
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        iArr[i11] = i10;
        this.f86709b = i11 + 1;
        return true;
    }

    public final boolean Y(@e.D(from = 0) int i10, @NotNull I elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        if (i10 < 0 || i10 > this.f86709b) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86709b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (elements.B()) {
            return false;
        }
        d0(this.f86709b + elements.f86709b);
        int[] iArr = this.f86708a;
        int i11 = this.f86709b;
        if (i10 != i11) {
            C4875q.z0(iArr, iArr, elements.f86709b + i10, i10, i11);
        }
        C4875q.z0(elements.f86708a, iArr, i10, 0, elements.f86709b);
        this.f86709b += elements.f86709b;
        return true;
    }

    public final boolean Z(@e.D(from = 0) int i10, @NotNull int[] elements) {
        int i11;
        kotlin.jvm.internal.G.p(elements, "elements");
        if (i10 < 0 || i10 > (i11 = this.f86709b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86709b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        d0(i11 + elements.length);
        int[] iArr = this.f86708a;
        int i12 = this.f86709b;
        if (i10 != i12) {
            C4875q.z0(iArr, iArr, elements.length + i10, i10, i12);
        }
        C4875q.I0(elements, iArr, i10, 0, 0, 12, null);
        this.f86709b += elements.length;
        return true;
    }

    public final boolean a0(@NotNull I elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return Y(this.f86709b, elements);
    }

    public final boolean b0(@NotNull int[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return Z(this.f86709b, elements);
    }

    public final void c0() {
        this.f86709b = 0;
    }

    public final void d0(int i10) {
        int[] iArr = this.f86708a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86708a = iArrCopyOf;
        }
    }

    public final int e0() {
        return this.f86708a.length;
    }

    public final void f0(int i10) {
        l0(i10);
    }

    public final void g0(@NotNull I elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int[] iArr = elements.f86708a;
        int i10 = elements.f86709b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(iArr[i11]);
        }
    }

    public final void h0(@NotNull int[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        for (int i10 : elements) {
            l0(i10);
        }
    }

    public final void i0(int i10) {
        X(i10);
    }

    public final void j0(@NotNull I elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Y(this.f86709b, elements);
    }

    public final void k0(@NotNull int[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Z(this.f86709b, elements);
    }

    public final boolean l0(int i10) {
        int iY = y(i10);
        if (iY < 0) {
            return false;
        }
        o0(iY);
        return true;
    }

    public final boolean m0(@NotNull I elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86709b;
        int i11 = elements.f86709b - 1;
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
        return i10 != this.f86709b;
    }

    public final boolean n0(@NotNull int[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86709b;
        for (int i11 : elements) {
            l0(i11);
        }
        return i10 != this.f86709b;
    }

    public final int o0(@e.D(from = 0) int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f86709b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86709b - 1);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        int[] iArr = this.f86708a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            C4875q.z0(iArr, iArr, i10, i10 + 1, i11);
        }
        this.f86709b--;
        return i12;
    }

    public final void p0(@e.D(from = 0) int i10, @e.D(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f86709b) || i11 < 0 || i11 > i12) {
            StringBuilder sbA = C1545m0.a("Start (", i10, ") and end (", i11, ") must be in 0..");
            sbA.append(this.f86709b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            if (i11 < i12) {
                int[] iArr = this.f86708a;
                C4875q.z0(iArr, iArr, i10, i11, i12);
            }
            this.f86709b -= i11 - i10;
        }
    }

    public final boolean q0(@NotNull I elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86709b;
        int[] iArr = this.f86708a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.c(iArr[i11])) {
                o0(i11);
            }
        }
        return i10 != this.f86709b;
    }

    public final boolean r0(@NotNull int[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86709b;
        int[] iArr = this.f86708a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            int i14 = iArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == i14) {
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
        return i10 != this.f86709b;
    }

    public final int s0(@e.D(from = 0) int i10, int i11) {
        if (i10 < 0 || i10 >= this.f86709b) {
            StringBuilder sbA = android.support.v4.media.a.a("set index ", i10, " must be between 0 .. ");
            sbA.append(this.f86709b - 1);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        int[] iArr = this.f86708a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public final void t0() {
        int i10 = this.f86709b;
        if (i10 == 0) {
            return;
        }
        C4875q.P3(this.f86708a, 0, i10);
    }

    public final void u0() {
        int i10 = this.f86709b;
        if (i10 == 0) {
            return;
        }
        kotlin.collections.B.Tu(this.f86708a, 0, i10);
    }

    public final void v0(int i10) {
        int iMax = Math.max(i10, this.f86709b);
        int[] iArr = this.f86708a;
        if (iArr.length > iMax) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f86708a = iArrCopyOf;
        }
    }

    public C1558t0(int i10) {
        super(i10);
    }

    public C1558t0(int i10, int i11, C4969v c4969v) {
        super((i11 & 1) != 0 ? 16 : i10);
    }
}
