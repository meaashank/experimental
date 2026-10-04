package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzglc implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;

    private zzglc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
    }

    public static zzglc zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6) {
        return new zzglc(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgpx zzgpxVar = (zzgpx) this.zza.zzb();
        zzgni zzgniVar = (zzgni) this.zzb.zzb();
        zzgnz zzgnzVar = (zzgnz) this.zzc.zzb();
        zzgrh zzgrhVar = (zzgrh) this.zzd.zzb();
        zzgfo zzgfoVar = (zzgfo) this.zze.zzb();
        zzgei zzgeiVar = (zzgei) this.zzf.zzb();
        return new zzgls(zzgpxVar, zzgniVar, zzgnzVar, zzgrhVar, zzgfoVar, zzgeiVar.zzk().zze(), zzgeiVar.zzk().zzg(), zzgeiVar.zzk().zzh());
    }
}
