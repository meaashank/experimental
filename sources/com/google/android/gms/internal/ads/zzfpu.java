package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfpu implements zzhcv {
    final /* synthetic */ zzfpp zza;
    final /* synthetic */ zzfpz zzb;

    public zzfpu(zzfpz zzfpzVar, zzfpp zzfppVar) {
        this.zza = zzfppVar;
        Objects.requireNonNull(zzfpzVar);
        this.zzb = zzfpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
