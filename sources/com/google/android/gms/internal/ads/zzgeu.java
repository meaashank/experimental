package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgeu implements zzghm {
    final zziof zza;
    final zziof zzb;
    final zziof zzc;
    final zziof zzd;
    final zziof zze;
    private final zzgeo zzf;
    private final zzgeu zzg = this;

    public zzgeu(zzgeo zzgeoVar) {
        this.zzf = zzgeoVar;
        zziof zziofVarZza = zzinv.zza(zzghp.zza());
        this.zza = zziofVarZza;
        zziof zziofVarZza2 = zzinv.zza(zzgiz.zza(zzgeoVar.zza, zzgeoVar.zzc, zzgeoVar.zzG, zziofVarZza, zzgeoVar.zzJ, zzgeoVar.zzu, zzgeoVar.zzj, zzgjc.zza()));
        this.zzb = zziofVarZza2;
        zziof zziofVarZza3 = zzinv.zza(zzghu.zza());
        this.zzc = zziofVarZza3;
        zzget zzgetVar = new zzget(this);
        this.zzd = zzgetVar;
        this.zze = zzinv.zza(zzghn.zza(zzgeoVar.zzc, zziofVarZza2, zzgeoVar.zzG, zzgeoVar.zzF, zziofVarZza3, zzgetVar, zzgeoVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzghm
    public final zzggu zza() {
        return (zzggu) this.zze.zzb();
    }

    public final /* synthetic */ zzgeo zzb() {
        return this.zzf;
    }

    public final /* synthetic */ zzgeu zzc() {
        return this.zzg;
    }
}
