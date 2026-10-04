package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgkp implements zzinw {
    private final zziof zza;

    private zzgkp(zzgko zzgkoVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgkp zza(zzgko zzgkoVar, zziof zziofVar) {
        return new zzgkp(zzgkoVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzggu zzgguVarZza = ((zzgks) this.zza.zzb()).zza().zza();
        zzioe.zzb(zzgguVarZza);
        return zzgguVarZza;
    }
}
