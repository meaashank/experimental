package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlm implements zzinw {
    private final zziof zza;

    private zzdlm(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdlm zza(zziof zziofVar) {
        return new zzdlm(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdll(((zzioi) this.zza).zzb());
    }
}
