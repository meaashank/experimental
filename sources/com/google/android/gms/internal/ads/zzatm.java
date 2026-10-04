package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzatm extends Thread {
    private final BlockingQueue zza;
    private final zzatl zzb;
    private final zzatc zzc;
    private volatile boolean zzd = false;
    private final zzatj zze;

    public zzatm(BlockingQueue blockingQueue, zzatl zzatlVar, zzatc zzatcVar, zzatj zzatjVar) {
        this.zza = blockingQueue;
        this.zzb = zzatlVar;
        this.zzc = zzatcVar;
        this.zze = zzatjVar;
    }

    private void zzb() throws InterruptedException {
        zzats zzatsVar = (zzats) this.zza.take();
        SystemClock.elapsedRealtime();
        zzatsVar.zze(3);
        try {
            try {
                zzatsVar.zzc("network-queue-take");
                zzatsVar.zzl();
                TrafficStats.setThreadStatsTag(zzatsVar.zzb());
                zzato zzatoVarZza = this.zzb.zza(zzatsVar);
                zzatsVar.zzc("network-http-complete");
                if (zzatoVarZza.zze && zzatsVar.zzq()) {
                    zzatsVar.zzd("not-modified");
                    zzatsVar.zzw();
                } else {
                    zzaty zzatyVarZzr = zzatsVar.zzr(zzatoVarZza);
                    zzatsVar.zzc("network-parse-complete");
                    zzatb zzatbVar = zzatyVarZzr.zzb;
                    if (zzatbVar != null) {
                        this.zzc.zzb(zzatsVar.zzi(), zzatbVar);
                        zzatsVar.zzc("network-cache-written");
                    }
                    zzatsVar.zzp();
                    this.zze.zza(zzatsVar, zzatyVarZzr, null);
                    zzatsVar.zzv(zzatyVarZzr);
                }
            } catch (zzaub e10) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzatsVar, e10);
                zzatsVar.zzw();
            } catch (Exception e11) {
                zzaue.zzd(e11, "Unhandled exception %s", e11.toString());
                zzaub zzaubVar = new zzaub(e11);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzatsVar, zzaubVar);
                zzatsVar.zzw();
            }
            zzatsVar.zze(4);
        } catch (Throwable th) {
            zzatsVar.zze(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaue.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
