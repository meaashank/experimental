package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzehn implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzehn(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar3;
    }

    public static zzehn zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzehn(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehm zzb() {
        return new zzehm(((zziod) this.zza).zzd(), zzfoy.zzc(), ((zzdgu) this.zzb).zzb());
    }
}
