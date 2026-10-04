package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfty {
    private final long zza;
    private final long zzb;
    private final Clock zzf;
    private final zzfuf zzg;
    private long zzh;
    private long zzd = 5;
    private long zze = 0;
    private final Random zzi = new Random();
    private long zzc = 0;

    public zzfty(long j10, double d10, long j11, double d11, Clock clock, zzfuf zzfufVar) {
        this.zza = j10;
        this.zzb = j11;
        this.zzg = zzfufVar;
        this.zzf = clock;
        zza();
    }

    public final synchronized void zza() {
        this.zzh = this.zza;
        this.zzc = 0L;
        this.zze = 0L;
    }

    public final synchronized long zzb() {
        double d10;
        double d11;
        long j10;
        d10 = this.zzh;
        d11 = 0.2d * d10;
        j10 = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.zzi.nextDouble() * ((j10 - r0) + 1)));
    }

    public final synchronized void zzc() {
        long jZzb = zzb();
        Clock clock = this.zzf;
        this.zze = clock.currentTimeMillis() + jZzb;
        double d10 = this.zzh;
        long j10 = this.zzb;
        this.zzh = Math.min((long) (d10 + d10), j10);
        this.zzc++;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzM)).booleanValue()) {
            this.zzg.zzt(clock.currentTimeMillis(), this.zzc, this.zzh, this.zzd, j10);
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf.currentTimeMillis() < this.zze;
    }

    public final synchronized boolean zze() {
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzN)).intValue() < 0) {
            return false;
        }
        if (this.zzc > Math.max(this.zzd, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(r0)).intValue())) {
            if (this.zzh >= this.zzb) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void zzf(int i10) {
        Preconditions.checkArgument(i10 > 0);
        this.zzd = i10;
    }
}
