package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaci {
    public static final zzacc zza = new zzacc(2, -9223372036854775807L, null);
    public static final zzacc zzb = new zzacc(3, -9223372036854775807L, null);
    private final zzaco zzc = C3272b.a(zzfm.zzg("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzacb.zza);

    @Nullable
    private zzacd zzd;

    @Nullable
    private IOException zze;

    public zzaci(String str) {
    }

    public static zzacc zza(boolean z10, long j10) {
        return new zzacc(z10 ? 1 : 0, j10, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzace zzaceVar, zzaca zzacaVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzacd(this, looperMyLooper, zzaceVar, zzacaVar, i10, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzacd zzacdVar = this.zzd;
        zzacdVar.getClass();
        zzacdVar.zzc(false);
    }

    public final void zzg(@Nullable zzacf zzacfVar) {
        zzacd zzacdVar = this.zzd;
        if (zzacdVar != null) {
            zzacdVar.zzc(true);
        }
        zzaco zzacoVar = this.zzc;
        zzacoVar.execute(new zzacg(zzacfVar));
        zzacoVar.zza();
    }

    public final void zzh(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzacd zzacdVar = this.zzd;
        if (zzacdVar != null) {
            zzacdVar.zza(i10);
        }
    }

    public final /* synthetic */ zzaco zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzacd zzj() {
        return this.zzd;
    }

    public final /* synthetic */ void zzk(zzacd zzacdVar) {
        this.zzd = zzacdVar;
    }

    public final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}
