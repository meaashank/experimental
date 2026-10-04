package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdwt implements zzinw {
    private final zziof zza;

    private zzdwt(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdwt zza(zziof zziofVar) {
        return new zzdwt(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzddg) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : "rewarded";
    }
}
