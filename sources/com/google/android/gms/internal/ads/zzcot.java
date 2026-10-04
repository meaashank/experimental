package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcot implements zzinw {
    private final zziof zza;

    private zzcot(zzcod zzcodVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcot zza(zzcod zzcodVar, zziof zziofVar) {
        return new zzcot(zzcodVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeov((zzdya) this.zza.zzb());
    }
}
