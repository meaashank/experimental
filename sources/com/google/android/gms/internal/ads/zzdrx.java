package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdrx implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdrx(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdrx zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdrx(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdrw(((zzdps) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
