package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzchg implements Runnable {
    final /* synthetic */ zzchj zza;

    public zzchg(zzchj zzchjVar) {
        Objects.requireNonNull(zzchjVar);
        this.zza = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zza;
        if (zzchjVar.zzt() != null) {
            if (!zzchjVar.zzu()) {
                zzchjVar.zzt().zzk();
                zzchjVar.zzv(true);
            }
            zzchjVar.zzt().zzc();
        }
    }
}
