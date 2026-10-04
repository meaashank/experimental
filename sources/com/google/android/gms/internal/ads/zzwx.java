package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzwx implements zzzi {
    private final zzzi zza;
    private final zzgxm zzb;

    public zzwx(zzzi zzziVar, List list) {
        this.zza = zzziVar;
        this.zzb = zzgxm.zzq(list);
    }

    public final zzgxm zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzme zzmeVar) {
        return this.zza.zzd(zzmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzf(long j10) {
        this.zza.zzf(j10);
    }
}
