package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpn implements zzinw {
    private final zziof zza;

    private zzfpn(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzfpn zza(zziof zziofVar, zziof zziofVar2) {
        return new zzfpn(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfpm((ScheduledExecutorService) this.zza.zzb(), zzfoy.zzc());
    }
}
