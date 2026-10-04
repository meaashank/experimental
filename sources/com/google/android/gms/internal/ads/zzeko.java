package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeko implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeko(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeko zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzeko(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzekn zzb() {
        return new zzekn((zzekb) this.zza.zzb(), ((zzekg) this.zzb).zzb());
    }
}
