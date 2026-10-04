package androidx.compose.foundation.text.input.internal;

import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,416:1\n1#2:417\n390#3,21:418\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n298#1:418,21\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class Q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f93788c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f93789a = new int[30];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f93790b;

    public final long a(int i10, boolean z10) {
        int i11;
        int iMax;
        int[] iArr = this.f93789a;
        int i12 = this.f93790b;
        if (i12 < 0) {
            i11 = i10;
            iMax = i11;
        } else if (z10) {
            i11 = i10;
            int iMax2 = i11;
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i13 * 3;
                int i15 = iArr[i14];
                int i16 = iArr[i14 + 1];
                int i17 = iArr[i14 + 2];
                long jD = d(i11, i15, i16, i17, z10);
                long jD2 = d(iMax2, i15, i16, i17, z10);
                int iMin = Math.min(androidx.compose.ui.text.Z.n(jD), (int) (jD2 >> 32));
                iMax2 = Math.max((int) (jD & ZipKt.f225990j), (int) (jD2 & ZipKt.f225990j));
                i13++;
                i11 = iMin;
            }
            iMax = iMax2;
        } else {
            i11 = i10;
            int i18 = i12 - 1;
            iMax = i11;
            while (-1 < i18) {
                int i19 = i18 * 3;
                int i20 = iArr[i19];
                int i21 = iArr[i19 + 1];
                int i22 = iArr[i19 + 2];
                long jD3 = d(i11, i20, i21, i22, z10);
                long jD4 = d(iMax, i20, i21, i22, z10);
                int iMin2 = Math.min(androidx.compose.ui.text.Z.n(jD3), (int) (jD4 >> 32));
                iMax = Math.max((int) (jD3 & ZipKt.f225990j), (int) (jD4 & ZipKt.f225990j));
                i18--;
                i11 = iMin2;
            }
        }
        return androidx.compose.ui.text.a0.b(i11, iMax);
    }

    public final long b(int i10) {
        return a(i10, false);
    }

    public final long c(int i10) {
        return a(i10, true);
    }

    public final long d(int i10, int i11, int i12, int i13, boolean z10) {
        int i14 = z10 ? i12 : i13;
        if (z10) {
            i12 = i13;
        }
        if (i10 < i11) {
            return androidx.compose.ui.text.a0.b(i10, i10);
        }
        if (i10 == i11) {
            return i14 == 0 ? androidx.compose.ui.text.a0.b(i11, i12 + i11) : androidx.compose.ui.text.a0.b(i11, i11);
        }
        if (i10 < i11 + i14) {
            return i12 == 0 ? androidx.compose.ui.text.a0.b(i11, i11) : androidx.compose.ui.text.a0.b(i11, i12 + i11);
        }
        int i15 = (i10 - i14) + i12;
        return androidx.compose.ui.text.a0.b(i15, i15);
    }

    public final void e(int i10, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Expected newLen to be ≥ 0, was ", i12).toString());
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(iMin, i11) - iMin;
        if (iMax >= 2 || iMax != i12) {
            int i13 = this.f93790b + 1;
            int[] iArr = this.f93789a;
            if (i13 > iArr.length / 3) {
                this.f93789a = R0.d(this.f93789a, Math.max(i13 * 2, (iArr.length / 3) * 2));
            }
            R0.k(this.f93789a, this.f93790b, iMin, iMax, i12);
            this.f93790b = i13;
        }
    }
}
