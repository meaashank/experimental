package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzedr implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzedr(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzedr zza(zziof zziofVar, zziof zziofVar2) {
        return new zzedr(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzedk((zzecu) this.zza.zzb(), (zzdxx) this.zzb.zzb());
    }
}
