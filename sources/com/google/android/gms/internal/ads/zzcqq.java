package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcqq implements zzfkx {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    final zziof zzf;
    final zziof zzg;
    final zziof zzh;
    private final zzcpp zzi;

    public zzcqq(zzcpp zzcppVar, Context context, String str) {
        this.zzi = zzcppVar;
        zzinw zzinwVarZza = zzinx.zza(context);
        this.zza = zzinwVarZza;
        zziof zziofVar = zzcppVar.zzbz;
        zzfix zzfixVarZzc = zzfix.zzc(zzinwVarZza, zziofVar, zzcppVar.zzbA);
        this.zzb = zzfixVarZzc;
        zziof zziofVarZza = zzinv.zza(zzfki.zza(zziofVar));
        this.zzc = zziofVarZza;
        zziof zziofVarZza2 = zzinv.zza(zzflu.zza());
        this.zzd = zziofVarZza2;
        zziof zziofVarZza3 = zzinv.zza(zzfkr.zza(zzinwVarZza, zzcppVar.zza, zzcppVar.zzaf, zzfixVarZzc, zziofVarZza, zzfly.zza(), zziofVarZza2));
        this.zze = zziofVarZza3;
        this.zzf = zzinv.zza(zzflb.zza(zziofVarZza3, zziofVarZza, zziofVarZza2));
        zzinw zzinwVarZzc = zzinx.zzc(str);
        this.zzg = zzinwVarZzc;
        this.zzh = zzinv.zza(zzfkv.zza(zzinwVarZzc, zziofVarZza3, zzinwVarZza, zziofVarZza, zziofVarZza2, zzcppVar.zzi, zzcppVar.zzai, zzcppVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final zzfla zza() {
        return (zzfla) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final zzfku zzb() {
        return (zzfku) this.zzh.zzb();
    }
}
