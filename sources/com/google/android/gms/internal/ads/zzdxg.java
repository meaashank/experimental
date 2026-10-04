package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdxg {
    private final Context zza;
    private final zzbbd zzb;
    private final zzbkn zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbif zzf;
    private final zzdgq zzg;
    private final zzelp zzh;
    private final zzfma zzi;
    private final zzeaj zzj;
    private final zzcnl zzk;

    public zzdxg(zzcmc zzcmcVar, Context context, zzbbd zzbbdVar, zzbkn zzbknVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbif zzbifVar, zzdgq zzdgqVar, zzelp zzelpVar, zzfma zzfmaVar, zzeaj zzeajVar, zzcnl zzcnlVar) {
        this.zza = context;
        this.zzb = zzbbdVar;
        this.zzc = zzbknVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbifVar;
        this.zzg = zzdgqVar;
        this.zzh = zzelpVar;
        this.zzi = zzfmaVar;
        this.zzj = zzeajVar;
        this.zzk = zzcnlVar;
    }

    public final zzclm zza(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfld zzfldVar, zzflg zzflgVar) throws zzcmb {
        zzcnw zzcnwVarZza = zzcnw.zza(zzrVar);
        String str = zzrVar.zza;
        zzdwv zzdwvVar = new zzdwv(this);
        zzbbd zzbbdVar = this.zzb;
        zzelp zzelpVar = this.zzh;
        zzclm zzclmVarZza = zzcmc.zza(this.zza, zzcnwVarZza, str, false, false, zzbbdVar, this.zzc, this.zzd, null, zzdwvVar, this.zze, this.zzf, zzfldVar, zzflgVar, zzelpVar, this.zzi, this.zzj);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpQ)).booleanValue()) {
            this.zzk.zza(zzclmVarZza.zzD());
        }
        return zzclmVarZza;
    }

    public final /* synthetic */ zzdgq zzb() {
        return this.zzg;
    }
}
