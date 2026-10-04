package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdqx implements zzinw {
    private final zziof zza;

    private zzdqx(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdqx zza(zziof zziofVar) {
        return new zzdqx(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdqw(((zzczc) this.zza).zza());
    }
}
