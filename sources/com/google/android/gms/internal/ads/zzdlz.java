package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdlz implements zzinw {
    private final zziof zza;

    private zzdlz(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdlz zza(zziof zziofVar) {
        return new zzdlz(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdly(((zzioi) this.zza).zzb());
    }
}
