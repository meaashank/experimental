package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgkn implements zzinw {
    private final zziof zza;

    private zzgkn(zzgkm zzgkmVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgkn zza(zzgkm zzgkmVar, zziof zziofVar) {
        return new zzgkn(zzgkmVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzggu zzgguVarZza = ((zzgkq) this.zza.zzb()).zza().zza();
        zzioe.zzb(zzgguVarZza);
        return zzgguVarZza;
    }
}
