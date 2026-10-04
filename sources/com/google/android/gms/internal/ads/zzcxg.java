package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxg implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzcxg(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzcxg zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcxg(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxf zzb() {
        return new zzcxf(((zzcxb) this.zza).zza(), (zzeaj) this.zzb.zzb(), ((zzczc) this.zzc).zza());
    }
}
