package androidx.compose.ui.node;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.node.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,512:1\n42#2,7:513\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n*L\n464#1:513,7\n*E\n"})
public final class C2216u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f103097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103098b;

    public C2216u(int i10) {
        this.f103097a = new int[i10];
    }

    public final boolean a(int i10, int i11) {
        int[] iArr = this.f103097a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        return i12 < i13 || (i12 == i13 && iArr[i10 + 1] <= iArr[i11 + 1]);
    }

    public final int b(int i10) {
        return this.f103097a[i10];
    }

    public final int c() {
        return this.f103098b;
    }

    public final boolean d() {
        return this.f103098b != 0;
    }

    public final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                k(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        k(i14, i11);
        return i14;
    }

    public final int f() {
        int[] iArr = this.f103097a;
        int i10 = this.f103098b - 1;
        this.f103098b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f103098b;
        int i14 = i13 + 3;
        int[] iArr = this.f103097a;
        if (i14 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f103097a = iArrCopyOf;
        }
        int[] iArr2 = this.f103097a;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f103098b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f103098b;
        int i15 = i14 + 4;
        int[] iArr = this.f103097a;
        if (i15 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.G.o(iArrCopyOf, "copyOf(this, newSize)");
            this.f103097a = iArrCopyOf;
        }
        int[] iArr2 = this.f103097a;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f103098b = i15;
    }

    public final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int iE = e(i10, i11, i12);
            i(i10, iE - i12, i12);
            i(iE + i12, i11, i12);
        }
    }

    public final void j() {
        int i10 = this.f103098b;
        if (!(i10 % 3 == 0)) {
            W.a.g("Array size not a multiple of 3");
            throw null;
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }

    public final void k(int i10, int i11) {
        int[] iArr = this.f103097a;
        Z.i(iArr, i10, i11);
        Z.i(iArr, i10 + 1, i11 + 1);
        Z.i(iArr, i10 + 2, i11 + 2);
    }
}
