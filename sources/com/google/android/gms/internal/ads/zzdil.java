package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdil implements zzinw {
    private final zziof zza;

    private zzdil(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdil zza(zziof zziofVar) {
        return new zzdil(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdik(((zzioi) this.zza).zzb());
    }
}
