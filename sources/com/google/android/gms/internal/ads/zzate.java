package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzate extends Thread {
    private static final boolean zza = zzaue.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzatc zzd;
    private volatile boolean zze = false;
    private final zzauf zzf;
    private final zzatj zzg;

    public zzate(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzatc zzatcVar, zzatj zzatjVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzatcVar;
        this.zzg = zzatjVar;
        this.zzf = new zzauf(this, blockingQueue2, zzatjVar);
    }

    private void zzc() throws InterruptedException {
        zzats zzatsVar = (zzats) this.zzb.take();
        zzatsVar.zzc("cache-queue-take");
        zzatsVar.zze(1);
        try {
            zzatsVar.zzl();
            zzatc zzatcVar = this.zzd;
            zzatb zzatbVarZza = zzatcVar.zza(zzatsVar.zzi());
            if (zzatbVarZza == null) {
                zzatsVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzatsVar)) {
                    this.zzc.put(zzatsVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzatbVarZza.zza(jCurrentTimeMillis)) {
                    zzatsVar.zzc("cache-hit-expired");
                    zzatsVar.zzj(zzatbVarZza);
                    if (!this.zzf.zzc(zzatsVar)) {
                        this.zzc.put(zzatsVar);
                    }
                } else {
                    zzatsVar.zzc("cache-hit");
                    zzaty zzatyVarZzr = zzatsVar.zzr(new zzato(zzatbVarZza.zza, zzatbVarZza.zzg));
                    zzatsVar.zzc("cache-hit-parsed");
                    if (!zzatyVarZzr.zzc()) {
                        zzatsVar.zzc("cache-parsing-failed");
                        zzatcVar.zzd(zzatsVar.zzi(), true);
                        zzatsVar.zzj(null);
                        if (!this.zzf.zzc(zzatsVar)) {
                            this.zzc.put(zzatsVar);
                        }
                    } else if (zzatbVarZza.zzf < jCurrentTimeMillis) {
                        zzatsVar.zzc("cache-hit-refresh-needed");
                        zzatsVar.zzj(zzatbVarZza);
                        zzatyVarZzr.zzd = true;
                        if (this.zzf.zzc(zzatsVar)) {
                            this.zzg.zza(zzatsVar, zzatyVarZzr, null);
                        } else {
                            this.zzg.zza(zzatsVar, zzatyVarZzr, new zzatd(this, zzatsVar));
                        }
                    } else {
                        this.zzg.zza(zzatsVar, zzatyVarZzr, null);
                    }
                }
            }
            zzatsVar.zze(2);
        } catch (Throwable th) {
            zzatsVar.zze(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzaue.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaue.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    public final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
