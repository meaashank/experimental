package androidx.compose.foundation.lazy.staggeredgrid;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final int[] b(int i10, int i11, int i12) {
        int i13;
        int i14 = i10 - ((i11 - 1) * i12);
        int i15 = i14 / i11;
        int i16 = i14 % i11;
        int[] iArr = new int[i11];
        int i17 = 0;
        while (i17 < i11) {
            if (i15 < 0) {
                i13 = 0;
            } else {
                i13 = (i17 < i16 ? 1 : 0) + i15;
            }
            iArr[i17] = i13;
            i17++;
        }
        return iArr;
    }
}
