package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import e.f0;
import e.g0;
import kotlinx.coroutines.N;

/* JADX INFO: loaded from: classes4.dex */
final class zznh {

    @f0
    protected long zza;
    final /* synthetic */ zznb zzb;

    @f0
    private long zzc;
    private final zzav zzd;

    public zznh(zznb zznbVar) {
        this.zzb = zznbVar;
        this.zzd = new zznk(this, zznbVar.zzu);
        long jElapsedRealtime = zznbVar.zzb().elapsedRealtime();
        this.zzc = jElapsedRealtime;
        this.zza = jElapsedRealtime;
    }

    @f0
    @g0
    public final long zza(long j10) {
        long j11 = j10 - this.zza;
        this.zza = j10;
        return j11;
    }

    @g0
    public final void zzb(long j10) {
        this.zzd.zza();
    }

    @g0
    public final void zzc(long j10) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j10;
        this.zza = j10;
    }

    public static /* synthetic */ void zza(zznh zznhVar) {
        zznhVar.zzb.zzt();
        zznhVar.zza(false, false, zznhVar.zzb.zzb().elapsedRealtime());
        zznhVar.zzb.zzc().zza(zznhVar.zzb.zzb().elapsedRealtime());
    }

    public final void zza() {
        this.zzd.zza();
        if (this.zzb.zze().zza(zzbh.zzdb)) {
            this.zzc = this.zzb.zzb().elapsedRealtime();
        } else {
            this.zzc = 0L;
        }
        this.zza = this.zzc;
    }

    @g0
    public final boolean zza(boolean z10, boolean z11, long j10) {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long jZza = j10 - this.zzc;
        if (!z10 && jZza < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jZza));
            return false;
        }
        if (!z11) {
            jZza = zza(j10);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(jZza));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jZza);
        zzos.zza(this.zzb.zzn().zza(!this.zzb.zze().zzw()), bundle, true);
        if (!z11) {
            this.zzb.zzm().zzc(N.f218775c, "_e", bundle);
        }
        this.zzc = j10;
        this.zzd.zza();
        this.zzd.zza(zzbh.zzbc.zza(null).longValue());
        return true;
    }
}
