package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdiq implements zzinw {
    private final zziof zza;

    private zzdiq(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdiq zza(zziof zziofVar) {
        return new zzdiq(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdip(((zzioi) this.zza).zzb());
    }
}
