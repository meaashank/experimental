package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrj implements zzinw {
    private final zzdrc zza;

    private zzdrj(zzdrc zzdrcVar) {
        this.zza = zzdrcVar;
    }

    public static zzdrj zzc(zzdrc zzdrcVar) {
        return new zzdrj(zzdrcVar);
    }

    public static zzdqr zzd(zzdrc zzdrcVar) {
        zzdqr zzdqrVarZza = zzdrcVar.zza();
        zzioe.zzb(zzdqrVarZza);
        return zzdqrVarZza;
    }

    public final zzdqr zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
