package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzfpl {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfpm zzd;

    public zzfpl(zzfpm zzfpmVar, Runnable runnable, long j10) {
        Objects.requireNonNull(zzfpmVar);
        this.zzd = zzfpmVar;
        this.zza = runnable;
        this.zzb = j10;
    }
}
