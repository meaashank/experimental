package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhbg {
    private long[] zza;
    private int zzb = 0;

    public zzhbg(int i10) {
        this.zza = new long[i10];
    }

    public final zzhbg zza(long j10) {
        int i10 = this.zzb;
        int i11 = i10 + 1;
        long[] jArr = this.zza;
        int length = jArr.length;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(jArr, i12);
        }
        long[] jArr2 = this.zza;
        int i13 = this.zzb;
        jArr2[i13] = j10;
        this.zzb = i13 + 1;
        return this;
    }

    public final zzhbh zzb() {
        int i10 = this.zzb;
        return i10 == 0 ? zzhbh.zza : new zzhbh(this.zza, 0, i10, null);
    }
}
