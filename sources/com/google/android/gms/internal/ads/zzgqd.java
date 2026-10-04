package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgqd implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzgqd(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzgqd zza(zziof zziofVar, zziof zziofVar2) {
        return new zzgqd(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgqc((zzgqt) this.zza.zzb(), ((zzioi) this.zzb).zzb());
    }
}
