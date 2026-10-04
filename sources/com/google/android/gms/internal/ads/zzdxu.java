package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxu {
    private final zzeaj zza;

    public zzdxu(zzeaj zzeajVar) {
        this.zza = zzeajVar;
    }

    public final boolean zza(zzgbw zzgbwVar) {
        if (zzgbwVar.zzj()) {
            zzeai zzeaiVarZza = this.zza.zza();
            zzeaiVarZza.zzc("action", "aq_ad_closed");
            zzeaiVarZza.zzc("gqi", zzgbwVar.zza());
            zzeaiVarZza.zzc("aq_ad_duration", String.valueOf(zzgbwVar.zzb()));
            zzeaiVarZza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbwVar.zzc()));
            zzeaiVarZza.zzc("aq_time_away", String.valueOf(zzgbwVar.zzg()));
            return zzeaiVarZza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzeai zzeaiVarZza2 = this.zza.zza();
        zzeaiVarZza2.zzc("action", "aq_ad_kill");
        zzeaiVarZza2.zzc("gqi", zzgbwVar.zza());
        zzeaiVarZza2.zzc("aq_ad_duration", String.valueOf(zzgbwVar.zzb()));
        zzeaiVarZza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbwVar.zzc()));
        zzeaiVarZza2.zzc("aq_time_away", String.valueOf(zzgbwVar.zzg()));
        zzeaiVarZza2.zzc("aq_is_os_kill", String.valueOf(zzgbwVar.zze()));
        return zzeaiVarZza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
