package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeav implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeav(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeav zza(zziof zziofVar, zziof zziofVar2) {
        return new zzeav(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeau((String) this.zza.zzb(), (zzeao) this.zzb.zzb());
    }
}
