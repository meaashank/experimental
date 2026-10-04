package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrh implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdrh(zzdrc zzdrcVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdrh zzc(zzdrc zzdrcVar, zziof zziofVar, zziof zziofVar2) {
        return new zzdrh(zzdrcVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzceo zzb() {
        return new zzceo(((zzcok) this.zza).zza(), ((zzddg) this.zzb).zza().zzg);
    }
}
