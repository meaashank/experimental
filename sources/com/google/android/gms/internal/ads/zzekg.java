package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzekg implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzekg(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzekg zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzekg(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzekf zzb() {
        return new zzekf(((zzejy) this.zza).zzb(), ((zzcoe) this.zzb).zzb());
    }
}
