package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzzn implements zzzg {
    private final zzzg zza;
    private final long zzb;

    public zzzn(zzzg zzzgVar, long j10) {
        this.zza = zzzgVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final boolean zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final void zzb() throws IOException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzc(zzma zzmaVar, zziy zziyVar, int i10) {
        int iZzc = this.zza.zzc(zzmaVar, zziyVar, i10);
        if (iZzc != -4) {
            return iZzc;
        }
        zziyVar.zzd += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzg
    public final int zzd(long j10) {
        return this.zza.zzd(j10 - this.zzb);
    }

    public final zzzg zze() {
        return this.zza;
    }
}
