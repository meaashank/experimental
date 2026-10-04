package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcnz implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcnz(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcnz zza(zziof zziofVar, zziof zziofVar2) {
        return new zzcnz(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcny((zzcnl) this.zza.zzb(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
