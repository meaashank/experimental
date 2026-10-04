package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgb implements zzinw {
    private final zziof zza;

    private zzdgb(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdgb zza(zziof zziofVar) {
        return new zzdgb(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdga(((zzioi) this.zza).zzb());
    }
}
