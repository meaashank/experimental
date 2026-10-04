package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfuo {
    private final Object zza;
    private final long zzb;
    private final Clock zzc;
    private final long zzd;
    private final double zze;
    private final int zzf;

    public zzfuo(Object obj, Clock clock, double d10, int i10) {
        if (clock == null) {
            throw new IllegalArgumentException("Clock cannot be null.");
        }
        this.zza = obj;
        this.zzc = clock;
        this.zzb = clock.currentTimeMillis();
        this.zzd = Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaf)).longValue() * 1000, 10000L), com.prism.gaia.client.stub.n.f164455m);
        this.zze = d10;
        this.zzf = i10;
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzc.currentTimeMillis() >= this.zzb + this.zzd;
    }

    public final long zzc() {
        return this.zzd - (this.zzc.currentTimeMillis() - this.zzb);
    }

    public final long zzd() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
