package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbe {
    private int[] zza;
    private int zzb = 0;

    public zzhbe(int i10) {
        this.zza = new int[i10];
    }

    public final zzhbe zza(int i10) {
        int i11 = this.zzb;
        int i12 = i11 + 1;
        int[] iArr = this.zza;
        int length = iArr.length;
        if (i12 > length) {
            int i13 = length + (length >> 1) + 1;
            if (i13 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i13 = iHighestOneBit + iHighestOneBit;
            }
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(iArr, i13);
        }
        int[] iArr2 = this.zza;
        int i14 = this.zzb;
        iArr2[i14] = i10;
        this.zzb = i14 + 1;
        return this;
    }

    public final zzhbf zzb() {
        int i10 = this.zzb;
        return i10 == 0 ? zzhbf.zza : new zzhbf(this.zza, 0, i10, null);
    }
}
