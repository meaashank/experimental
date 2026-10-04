package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzcqm implements zzeih {
    final zziof zza;
    final zziof zzb;
    private final zzcpp zzc;
    private final zzcqm zzd = this;

    public zzcqm(zzcpp zzcppVar, Context context) {
        this.zzc = zzcppVar;
        zzejp zzejpVarZzc = zzejp.zzc(zzcppVar.zzaH);
        this.zza = zzejpVarZzc;
        this.zzb = zzejh.zza(zzcppVar.zzf, zzfoy.zza(), zzcpj.zza, zzcppVar.zzaG, zzejpVarZzc, zzcppVar.zzaI, zzcpg.zza, zzcppVar.zzG, zzcppVar.zzF);
    }

    @Override // com.google.android.gms.internal.ads.zzeih
    public final zzeil zza() {
        zzcpp zzcppVar = this.zzc;
        zziof zziofVar = zzcppVar.zzp;
        zzcod zzcodVarZzI = zzcppVar.zzI();
        return zzeim.zza(zzcok.zzd(zzcppVar.zzI()), zzfpe.zzc(), zzfoy.zzc(), zzinv.zzc(this.zzb), zzcpa.zzd(zzcodVarZzI), this, (zzeaj) zziofVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeih
    public final zzein zzb() {
        return new zzcqn(this.zzc, this.zzd, null);
    }
}
