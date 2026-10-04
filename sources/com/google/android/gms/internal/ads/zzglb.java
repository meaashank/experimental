package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzglb implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;

    private zzglb(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
    }

    public static zzglb zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzglb(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zziof zziofVar = this.zzd;
        zziof zziofVar2 = this.zzc;
        zziof zziofVar3 = this.zzb;
        zzinq zzinqVarZzc = zzinv.zzc(this.zza);
        zzinq zzinqVarZzc2 = zzinv.zzc(zziofVar3);
        zzinq zzinqVarZzc3 = zzinv.zzc(zziofVar2);
        zzgei zzgeiVar = (zzgei) zziofVar.zzb();
        return new zzgla(zzinqVarZzc, zzinqVarZzc2, zzinqVarZzc3, zzgeiVar.zzk().zza(), zzgeiVar.zzk().zzd());
    }
}
