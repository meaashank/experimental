package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcyu implements zzhcv {
    final /* synthetic */ zzhcv zza;
    final /* synthetic */ zzcza zzb;

    public zzcyu(zzcza zzczaVar, zzhcv zzhcvVar) {
        this.zza = zzhcvVar;
        Objects.requireNonNull(zzczaVar);
        this.zzb = zzczaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zza.zza(th);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcyt) obj).zza, this.zza);
    }
}
