package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
final class zzcei {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcei(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcer zzcerVar) {
        this.zza = zzgVar;
    }

    public final void zza(int i10, long j10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbj)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zza;
        if (j10 - zzgVar.zzF() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbk)).booleanValue()) {
            zzgVar.zzE(i10);
            zzgVar.zzG(j10);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j10);
        }
    }
}
