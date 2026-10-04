package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwz implements zzinw {
    private final zziof zza;

    private zzcwz(zzcwk zzcwkVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzcwz zza(zzcwk zzcwkVar, zziof zziofVar, zziof zziofVar2) {
        return new zzcwz(zzcwkVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzcyh) this.zza.zzb(), zzfoy.zzc());
    }
}
