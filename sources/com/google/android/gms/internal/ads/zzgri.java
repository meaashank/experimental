package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgri implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzgri(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzgri zza(zziof zziofVar, zziof zziofVar2) {
        return new zzgri(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgrh((zzgdq) this.zza.zzb(), (zzggk) this.zzb.zzb());
    }
}
