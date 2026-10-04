package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcqk implements zzfjj {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    final zziof zzg;
    private final zzcpp zzh;

    public zzcqk(zzcpp zzcppVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcppVar;
        zzinw zzinwVarZza = zzinx.zza(context);
        this.zza = zzinwVarZza;
        zzinw zzinwVarZza2 = zzinx.zza(zzrVar);
        this.zzb = zzinwVarZza2;
        zzinw zzinwVarZza3 = zzinx.zza(str);
        this.zzc = zzinwVarZza3;
        zziof zziofVar = zzcppVar.zzp;
        zziof zziofVarZza = zzinv.zza(zzeub.zza(zziofVar));
        this.zzd = zziofVarZza;
        zziof zziofVarZza2 = zzinv.zza(zzfki.zza(zzcppVar.zzbz));
        this.zze = zziofVarZza2;
        zziof zziofVarZza3 = zzinv.zza(zzfjh.zza(zzinwVarZza, zzcppVar.zza, zzcppVar.zzaf, zziofVarZza, zziofVarZza2, zzfly.zza()));
        this.zzf = zziofVarZza3;
        this.zzg = zzinv.zza(zzeuj.zza(zzinwVarZza, zzinwVarZza2, zzinwVarZza3, zziofVarZza3, zziofVarZza, zziofVarZza2, zzcppVar.zzi, zzcppVar.zzai, zziofVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final zzeui zza() {
        return (zzeui) this.zzg.zzb();
    }
}
