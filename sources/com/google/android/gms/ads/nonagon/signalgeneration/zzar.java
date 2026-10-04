package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzhcv;

/* JADX INFO: loaded from: classes3.dex */
final class zzar implements zzhcv {
    final /* synthetic */ zzdml zza;

    public zzar(zzdml zzdmlVar) {
        this.zza = zzdmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        this.zza.zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        this.zza.zza((zzbc) obj);
    }
}
