package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdde implements zzinw {
    private final zziof zza;

    private zzdde(zzdcz zzdczVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdde zzc(zzdcz zzdczVar, zziof zziofVar) {
        return new zzdde(zzdczVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strZzp = ((zzdab) this.zza.zzb()).zzp();
        zzioe.zzb(strZzp);
        return strZzp;
    }
}
