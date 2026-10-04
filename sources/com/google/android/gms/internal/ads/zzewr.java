package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewr implements zzinw {
    private final zziof zza;

    private zzewr(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzewr zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzewr(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewp zzb() {
        return new zzewp(zzfoy.zzc(), (zzcfv) this.zza.zzb());
    }
}
