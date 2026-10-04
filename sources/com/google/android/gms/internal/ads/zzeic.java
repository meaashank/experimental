package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeic implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeic(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
    }

    public static zzeic zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzeic(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeib zzb() {
        return new zzeib(zzfoy.zzc(), ((zzehh) this.zza).zzb(), zzinv.zzc(this.zzb));
    }
}
