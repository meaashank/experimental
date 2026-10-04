package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcpz implements zzfht {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    private final Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final String zzi;
    private final zzcpp zzj;

    public zzcpz(zzcpp zzcppVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcppVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        zzinw zzinwVarZza = zzinx.zza(context);
        this.zza = zzinwVarZza;
        zzinw zzinwVarZza2 = zzinx.zza(zzrVar);
        this.zzb = zzinwVarZza2;
        zziof zziofVarZza = zzinv.zza(zzeub.zza(zzcppVar.zzp));
        this.zzc = zziofVarZza;
        zziof zziofVarZza2 = zzinv.zza(zzeug.zza());
        this.zzd = zziofVarZza2;
        zziof zziofVarZza3 = zzinv.zza(zzdix.zza());
        this.zze = zziofVarZza3;
        this.zzf = zzinv.zza(zzfhr.zza(zzinwVarZza, zzcppVar.zza, zzinwVarZza2, zzcppVar.zzaf, zziofVarZza, zziofVarZza2, zzfly.zza(), zziofVarZza3));
    }

    @Override // com.google.android.gms.internal.ads.zzfht
    public final zzete zza() {
        zzfhq zzfhqVar = (zzfhq) this.zzf.zzb();
        zzeua zzeuaVar = (zzeua) this.zzc.zzb();
        zzcpp zzcppVar = this.zzj;
        zziof zziofVar = zzcppVar.zzp;
        return new zzete(this.zzg, this.zzh, this.zzi, zzfhqVar, zzeuaVar, zzcpa.zzd(zzcppVar.zzI()), (zzeaj) zziofVar.zzb());
    }
}
