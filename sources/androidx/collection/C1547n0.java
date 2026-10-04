package androidx.collection;

import java.util.Arrays;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,958:1\n546#1:959\n68#2:960\n250#2,6:963\n68#2:969\n68#2:970\n68#2:971\n68#2:978\n68#2:979\n13614#3,2:961\n1687#3,6:972\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n683#1:959\n744#1:960\n763#1:963,6\n774#1:969\n778#1:970\n822#1:971\n838#1:978\n854#1:979\n754#1:961,2\n824#1:972,6\n*E\n"})
public final class C1547n0 extends AbstractC1559u {
    public C1547n0() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(C1547n0 c1547n0, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c1547n0.f86997b;
        }
        c1547n0.v0(i10);
    }

    public final void W(@e.D(from = 0) int i10, float f10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f86997b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86997b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        d0(i11 + 1);
        float[] fArr = this.f86996a;
        int i12 = this.f86997b;
        if (i10 != i12) {
            C4875q.y0(fArr, fArr, i10 + 1, i10, i12);
        }
        fArr[i10] = f10;
        this.f86997b++;
    }

    public final boolean X(float f10) {
        d0(this.f86997b + 1);
        float[] fArr = this.f86996a;
        int i10 = this.f86997b;
        fArr[i10] = f10;
        this.f86997b = i10 + 1;
        return true;
    }

    public final boolean Y(@e.D(from = 0) int i10, @NotNull AbstractC1559u elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        if (i10 < 0 || i10 > this.f86997b) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86997b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (elements.B()) {
            return false;
        }
        d0(this.f86997b + elements.f86997b);
        float[] fArr = this.f86996a;
        int i11 = this.f86997b;
        if (i10 != i11) {
            C4875q.y0(fArr, fArr, elements.f86997b + i10, i10, i11);
        }
        C4875q.y0(elements.f86996a, fArr, i10, 0, elements.f86997b);
        this.f86997b += elements.f86997b;
        return true;
    }

    public final boolean Z(@e.D(from = 0) int i10, @NotNull float[] elements) {
        int i11;
        kotlin.jvm.internal.G.p(elements, "elements");
        if (i10 < 0 || i10 > (i11 = this.f86997b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86997b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        d0(i11 + elements.length);
        float[] fArr = this.f86996a;
        int i12 = this.f86997b;
        if (i10 != i12) {
            C4875q.y0(fArr, fArr, elements.length + i10, i10, i12);
        }
        C4875q.H0(elements, fArr, i10, 0, 0, 12, null);
        this.f86997b += elements.length;
        return true;
    }

    public final boolean a0(@NotNull AbstractC1559u elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return Y(this.f86997b, elements);
    }

    public final boolean b0(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        return Z(this.f86997b, elements);
    }

    public final void c0() {
        this.f86997b = 0;
    }

    public final void d0(int i10) {
        float[] fArr = this.f86996a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i10, (fArr.length * 3) / 2));
            kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(this, newSize)");
            this.f86996a = fArrCopyOf;
        }
    }

    public final int e0() {
        return this.f86996a.length;
    }

    public final void f0(float f10) {
        l0(f10);
    }

    public final void g0(@NotNull AbstractC1559u elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        float[] fArr = elements.f86996a;
        int i10 = elements.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            l0(fArr[i11]);
        }
    }

    public final void h0(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        for (float f10 : elements) {
            l0(f10);
        }
    }

    public final void i0(float f10) {
        X(f10);
    }

    public final void j0(@NotNull AbstractC1559u elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Y(this.f86997b, elements);
    }

    public final void k0(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Z(this.f86997b, elements);
    }

    public final boolean l0(float f10) {
        int iY = y(f10);
        if (iY < 0) {
            return false;
        }
        o0(iY);
        return true;
    }

    public final boolean m0(@NotNull AbstractC1559u elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86997b;
        int i11 = elements.f86997b - 1;
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
        return i10 != this.f86997b;
    }

    public final boolean n0(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86997b;
        for (float f10 : elements) {
            l0(f10);
        }
        return i10 != this.f86997b;
    }

    public final float o0(@e.D(from = 0) int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f86997b)) {
            StringBuilder sbA = android.support.v4.media.a.a("Index ", i10, " must be in 0..");
            sbA.append(this.f86997b - 1);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f86996a;
        float f10 = fArr[i10];
        if (i10 != i11 - 1) {
            C4875q.y0(fArr, fArr, i10, i10 + 1, i11);
        }
        this.f86997b--;
        return f10;
    }

    public final void p0(@e.D(from = 0) int i10, @e.D(from = 0) int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f86997b) || i11 < 0 || i11 > i12) {
            StringBuilder sbA = C1545m0.a("Start (", i10, ") and end (", i11, ") must be in 0..");
            sbA.append(this.f86997b);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            if (i11 < i12) {
                float[] fArr = this.f86996a;
                C4875q.y0(fArr, fArr, i10, i11, i12);
            }
            this.f86997b -= i11 - i10;
        }
    }

    public final boolean q0(@NotNull AbstractC1559u elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86997b;
        float[] fArr = this.f86996a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!elements.c(fArr[i11])) {
                o0(i11);
            }
        }
        return i10 != this.f86997b;
    }

    public final boolean r0(@NotNull float[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86997b;
        float[] fArr = this.f86996a;
        int i11 = i10 - 1;
        while (true) {
            int i12 = 0;
            int i13 = -1;
            if (-1 >= i11) {
                break;
            }
            float f10 = fArr[i11];
            int length = elements.length;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                if (elements[i12] == f10) {
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
        return i10 != this.f86997b;
    }

    public final float s0(@e.D(from = 0) int i10, float f10) {
        if (i10 < 0 || i10 >= this.f86997b) {
            StringBuilder sbA = android.support.v4.media.a.a("set index ", i10, " must be between 0 .. ");
            sbA.append(this.f86997b - 1);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        float[] fArr = this.f86996a;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public final void t0() {
        int i10 = this.f86997b;
        if (i10 == 0) {
            return;
        }
        C4875q.N3(this.f86996a, 0, i10);
    }

    public final void u0() {
        int i10 = this.f86997b;
        if (i10 == 0) {
            return;
        }
        kotlin.collections.B.Ru(this.f86996a, 0, i10);
    }

    public final void v0(int i10) {
        int iMax = Math.max(i10, this.f86997b);
        float[] fArr = this.f86996a;
        if (fArr.length > iMax) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, iMax);
            kotlin.jvm.internal.G.o(fArrCopyOf, "copyOf(this, newSize)");
            this.f86996a = fArrCopyOf;
        }
    }

    public C1547n0(int i10) {
        super(i10);
    }

    public C1547n0(int i10, int i11, C4969v c4969v) {
        super((i11 & 1) != 0 ? 16 : i10);
    }
}
