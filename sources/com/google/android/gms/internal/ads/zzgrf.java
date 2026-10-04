package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgrf {
    private final zzggk zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private long zzc = -1;
    private long zzd = -1;
    private Throwable zze = null;
    private final int zzf;

    public zzgrf(int i10, zzgdq zzgdqVar, zzggk zzggkVar) {
        this.zzf = i10;
        this.zza = zzggkVar;
    }

    public final void zza() {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzc = SystemClock.uptimeMillis();
    }

    public final void zzb(Throwable th) {
        if (this.zzb.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zze = th;
    }

    public final void zzc() {
        AtomicBoolean atomicBoolean = this.zzb;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.zzd = SystemClock.uptimeMillis();
        this.zza.zzb(this.zzf - 1, atomicBoolean.get() ? this.zzd - this.zzc : -1L, this.zze, null);
    }
}
