package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwr implements zzinw {
    private final zziof zza;

    private zzcwr(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcwr zza(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcwr(zzcwkVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo(((zzcxg) this.zza).zzb(), zzcgj.zza);
    }
}
