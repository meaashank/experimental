package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"HandlerLeak"})
final class zzacd extends Handler implements Runnable {
    final /* synthetic */ zzaci zza;
    private final zzace zzb;
    private final long zzc;

    @Nullable
    private zzaca zzd;

    @Nullable
    private IOException zze;
    private int zzf;

    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzacd(zzaci zzaciVar, Looper looper, zzace zzaceVar, zzaca zzacaVar, int i10, long j10) {
        super(looper);
        Objects.requireNonNull(zzaciVar);
        this.zza = zzaciVar;
        this.zzb = zzaceVar;
        this.zzd = zzacaVar;
        this.zzc = j10;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.zzc;
        zzaca zzacaVar = this.zzd;
        zzacaVar.getClass();
        zzacaVar.zzC(this.zzb, jElapsedRealtime, j10, this.zzf);
        this.zze = null;
        zzaci zzaciVar = this.zza;
        zzacd zzacdVarZzj = zzaciVar.zzj();
        zzacdVarZzj.getClass();
        zzaciVar.zzi().execute(zzacdVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            zzd();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        zzaci zzaciVar = this.zza;
        zzaciVar.zzk(null);
        long j10 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - j10;
        zzaca zzacaVar = this.zzd;
        zzacaVar.getClass();
        if (this.zzh) {
            zzacaVar.zzA(this.zzb, jElapsedRealtime, j11, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                zzacaVar.zzB(this.zzb, jElapsedRealtime, j11);
                return;
            } catch (RuntimeException e10) {
                zzeh.zzf("LoadTask", "Unexpected exception handling load completed", e10);
                this.zza.zzl(new zzach(e10));
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i12 = this.zzf + 1;
        this.zzf = i12;
        zzacc zzaccVarZzz = zzacaVar.zzz(this.zzb, jElapsedRealtime, j11, iOException, i12);
        if (zzaccVarZzz.zzb() == 3) {
            zzaciVar.zzl(this.zze);
        } else if (zzaccVarZzz.zzb() != 2) {
            if (zzaccVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzaccVarZzz.zzc() != -9223372036854775807L ? zzaccVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z10) {
                zzace zzaceVar = this.zzb;
                String simpleName = zzaceVar.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    zzaceVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.zzi) {
                return;
            }
            zzeh.zzf("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new zzach(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.zzi) {
                return;
            }
            zzeh.zzf("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new zzach(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.zzi) {
                zzeh.zzf("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }

    public final void zza(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzb(long j10) {
        zzaci zzaciVar = this.zza;
        zzguk.zzi(zzaciVar.zzj() == null);
        zzaciVar.zzk(this);
        if (j10 > 0) {
            sendEmptyMessageDelayed(1, j10);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z10) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzaca zzacaVar = this.zzd;
            zzacaVar.getClass();
            zzacaVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
