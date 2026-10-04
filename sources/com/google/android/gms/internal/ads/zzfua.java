package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfua {
    private final zzftp zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private volatile ScheduledFuture zzc;
    private final zzfvd zzd;

    public zzfua(final zzftp zzftpVar, ScheduledExecutorService scheduledExecutorService, long j10, final zzfvd zzfvdVar) {
        this.zzd = zzfvdVar;
        this.zza = zzftpVar;
        if (j10 > 0) {
            this.zzc = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(zzftpVar, zzfvdVar);
                }
            }, j10, TimeUnit.MILLISECONDS);
        }
    }

    public final void zza() {
        if (this.zzb.compareAndSet(false, true)) {
            if (this.zzc != null) {
                this.zzc.cancel(false);
            }
            this.zza.zzc(this.zzd, false);
        }
    }

    public final /* synthetic */ void zzb(zzftp zzftpVar, zzfvd zzfvdVar) {
        if (this.zzb.compareAndSet(false, true)) {
            zzftpVar.zzc(zzfvdVar, true);
        }
    }
}
