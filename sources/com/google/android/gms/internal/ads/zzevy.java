package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevy implements zzinw {
    private final zziof zza;

    private zzevy(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzevy zza(zziof zziofVar) {
        return new zzevy(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevx((Set) this.zza.zzb());
    }
}
