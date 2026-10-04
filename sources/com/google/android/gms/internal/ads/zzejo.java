package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejo {
    private final zzcbo zza;

    public zzejo(zzcbo zzcboVar) {
        this.zza = zzcboVar;
    }

    public final void zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziM)).booleanValue()) {
            zzcgm.zzb(listenableFutureZza, "persistFlags");
        } else {
            zzcgm.zza(listenableFutureZza, "persistFlags", zzcgj.zzh);
        }
    }
}
