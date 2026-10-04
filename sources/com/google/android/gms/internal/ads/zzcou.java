package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcou implements zzinw {
    private final zziof zza;

    private zzcou(zzcod zzcodVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcou zza(zzcod zzcodVar, zziof zziofVar) {
        return new zzcou(zzcodVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeqv((zzdya) this.zza.zzb());
    }
}
