package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfxp implements Runnable {
    final /* synthetic */ zzfxu zza;

    public zzfxp(zzfxu zzfxuVar) {
        Objects.requireNonNull(zzfxuVar);
        this.zza = zzfxuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
