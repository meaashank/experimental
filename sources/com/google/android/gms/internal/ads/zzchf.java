package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzchf implements Runnable {
    final /* synthetic */ zzchj zza;

    public zzchf(zzchj zzchjVar) {
        Objects.requireNonNull(zzchjVar);
        this.zza = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zza;
        if (zzchjVar.zzt() != null) {
            zzchjVar.zzt().zzd();
            zzchjVar.zzt().zzh();
        }
    }
}
