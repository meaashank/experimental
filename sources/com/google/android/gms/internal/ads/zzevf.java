package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevf implements zzfdi {
    private final Clock zza;
    private final zzflw zzb;
    private final long zzc;

    public zzevf(Clock clock, zzflw zzflwVar, long j10) {
        this.zza = clock;
        this.zzb = zzflwVar;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzevg(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 4;
    }
}
