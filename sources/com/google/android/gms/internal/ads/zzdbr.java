package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdbr implements zzinw {
    private final zziof zza;

    private zzdbr(zzday zzdayVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdbr zza(zzday zzdayVar, zziof zziofVar) {
        return new zzdbr(zzdayVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdcn) this.zza.zzb(), zzcgj.zzh);
    }
}
