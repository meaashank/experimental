package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgu implements zzinw {
    private final zziof zza;

    private zzdgu(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdgu zzc(zziof zziofVar) {
        return new zzdgu(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdgt zzb() {
        return new zzdgt(((zzioi) this.zza).zzb());
    }
}
