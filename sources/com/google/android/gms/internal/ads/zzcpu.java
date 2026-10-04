package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcpu implements zzfgf {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    private final zzcpp zzg;

    public zzcpu(zzcpp zzcppVar, Context context, String str) {
        this.zzg = zzcppVar;
        zzinw zzinwVarZza = zzinx.zza(context);
        this.zza = zzinwVarZza;
        zzinw zzinwVarZza2 = zzinx.zza(str);
        this.zzb = zzinwVarZza2;
        zziof zziofVar = zzcppVar.zzbz;
        zzfiw zzfiwVarZzc = zzfiw.zzc(zzinwVarZza, zziofVar, zzcppVar.zzbA);
        this.zzc = zzfiwVarZzc;
        zziof zziofVarZza = zzinv.zza(zzfhd.zza(zziofVar));
        this.zzd = zziofVarZza;
        zziof zziofVar2 = zzcppVar.zza;
        zziof zziofVar3 = zzcppVar.zzaf;
        zzfly zzflyVarZza = zzfly.zza();
        zziof zziofVar4 = zzcppVar.zzi;
        zziof zziofVarZza2 = zzinv.zza(zzfhf.zza(zzinwVarZza, zziofVar2, zziofVar3, zzfiwVarZzc, zziofVarZza, zzflyVarZza, zziofVar4));
        this.zze = zziofVarZza2;
        this.zzf = zzinv.zza(zzfhl.zza(zziofVar3, zzinwVarZza, zzinwVarZza2, zziofVarZza2, zziofVarZza, zziofVar4, zzcppVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final zzfhk zza() {
        return (zzfhk) this.zzf.zzb();
    }
}
