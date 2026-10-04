package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdfc implements zzinw {
    private final zziof zza;

    private zzdfc(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdfc zza(zziof zziofVar) {
        return new zzdfc(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdfb(((zzioi) this.zza).zzb());
    }
}
