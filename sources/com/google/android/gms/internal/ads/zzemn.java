package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzemn implements zzinw {
    private final zziof zza;

    private zzemn(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzemn zza(zziof zziofVar) {
        return new zzemn(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemm(((zzcok) this.zza).zza());
    }
}
