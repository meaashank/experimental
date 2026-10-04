package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdac implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdac(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdac zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdac(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdab((Clock) this.zza.zzb(), (zzcfp) this.zzb.zzb());
    }
}
