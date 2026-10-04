package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpq implements zzinw {
    private final zziof zza;

    private zzdpq(zzdpn zzdpnVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdpq zzc(zzdpn zzdpnVar, zziof zziofVar) {
        return new zzdpq(zzdpnVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdqw zzb() {
        zzdqv zzdqvVar = (zzdqv) this.zza.zzb();
        zzioe.zzb(zzdqvVar);
        return zzdqvVar;
    }
}
