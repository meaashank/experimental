package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdkw implements zzinw {
    private final zziof zza;

    private zzdkw(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdkw zzc(zziof zziofVar) {
        return new zzdkw(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdkv zzb() {
        return new zzdkv(((zzioi) this.zza).zzb());
    }
}
