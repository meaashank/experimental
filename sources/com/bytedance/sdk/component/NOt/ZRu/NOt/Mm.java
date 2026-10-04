package com.bytedance.sdk.component.NOt.ZRu.NOt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class Mm extends uR {
    final transient int[] FA;
    final transient byte[][] Mm;

    public Mm(ZRu zRu, int i10) {
        super(null);
        Vor.ZRu(zRu.NOt, 0L, i10);
        TFq tFq = zRu.ZRu;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = tFq.mZ;
            int i15 = tFq.NOt;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            tFq = tFq.Ht;
        }
        this.Mm = new byte[i13][];
        this.FA = new int[i13 * 2];
        TFq tFq2 = zRu.ZRu;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.Mm;
            bArr[i16] = tFq2.ZRu;
            int i17 = tFq2.mZ;
            int i18 = tFq2.NOt;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.FA;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            tFq2.uR = true;
            i16++;
            tFq2 = tFq2.Ht;
        }
    }

    private uR TFq() {
        return new uR(uR());
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public String NOt() {
        return TFq().NOt();
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public String ZRu() {
        return TFq().ZRu();
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uR) {
            uR uRVar = (uR) obj;
            if (uRVar.mZ() == mZ() && ZRu(0, uRVar, 0, mZ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public int hashCode() {
        int i10 = this.TFq;
        if (i10 != 0) {
            return i10;
        }
        int length = this.Mm.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.Mm[i11];
            int[] iArr = this.FA;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.TFq = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public int mZ() {
        return this.FA[this.Mm.length - 1];
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public String toString() {
        return TFq().toString();
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public byte[] uR() {
        int[] iArr = this.FA;
        byte[][] bArr = this.Mm;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.FA;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.Mm[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    private int NOt(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.FA, 0, this.Mm.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public uR ZRu(int i10, int i11) {
        return TFq().ZRu(i10, i11);
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public byte ZRu(int i10) {
        Vor.ZRu(this.FA[this.Mm.length - 1], i10, 1L);
        int iNOt = NOt(i10);
        int i11 = iNOt == 0 ? 0 : this.FA[iNOt - 1];
        int[] iArr = this.FA;
        byte[][] bArr = this.Mm;
        return bArr[iNOt][(i10 - i11) + iArr[bArr.length + iNOt]];
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public boolean ZRu(int i10, uR uRVar, int i11, int i12) {
        if (i10 < 0 || i10 > mZ() - i12) {
            return false;
        }
        int iNOt = NOt(i10);
        while (i12 > 0) {
            int i13 = iNOt == 0 ? 0 : this.FA[iNOt - 1];
            int iMin = Math.min(i12, ((this.FA[iNOt] - i13) + i13) - i10);
            int[] iArr = this.FA;
            byte[][] bArr = this.Mm;
            if (!uRVar.ZRu(i11, bArr[iNOt], (i10 - i13) + iArr[bArr.length + iNOt], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iNOt++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.NOt.uR
    public boolean ZRu(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > mZ() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iNOt = NOt(i10);
        while (i12 > 0) {
            int i13 = iNOt == 0 ? 0 : this.FA[iNOt - 1];
            int iMin = Math.min(i12, ((this.FA[iNOt] - i13) + i13) - i10);
            int[] iArr = this.FA;
            byte[][] bArr2 = this.Mm;
            if (!Vor.ZRu(bArr2[iNOt], (i10 - i13) + iArr[bArr2.length + iNOt], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iNOt++;
        }
        return true;
    }
}
