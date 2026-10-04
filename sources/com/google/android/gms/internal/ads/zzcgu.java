package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcgu implements zzhcv {
    final /* synthetic */ zzcgs zza;
    final /* synthetic */ zzcgq zzb;

    public zzcgu(zzcgv zzcgvVar, zzcgs zzcgsVar, zzcgq zzcgqVar) {
        this.zza = zzcgsVar;
        this.zzb = zzcgqVar;
        Objects.requireNonNull(zzcgvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
