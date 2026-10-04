package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class zzhmd {
    final long[] zza;
    final long[] zzb;
    final long[] zzc;

    public zzhmd(long[] jArr, long[] jArr2, long[] jArr3) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = jArr3;
    }

    public void zza(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void zzb(zzhmd zzhmdVar, int i10) {
        zzhmc.zza(this.zza, zzhmdVar.zza, i10);
        zzhmc.zza(this.zzb, zzhmdVar.zzb, i10);
        zzhmc.zza(this.zzc, zzhmdVar.zzc, i10);
    }

    public zzhmd() {
        this(new long[10], new long[10], new long[10]);
    }

    public zzhmd(zzhmd zzhmdVar) {
        this.zza = Arrays.copyOf(zzhmdVar.zza, 10);
        this.zzb = Arrays.copyOf(zzhmdVar.zzb, 10);
        this.zzc = Arrays.copyOf(zzhmdVar.zzc, 10);
    }
}
