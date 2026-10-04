package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class zzegx implements zzhcv {
    final /* synthetic */ Context zza;

    public zzegx(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        if (((Boolean) zzbkz.zzh.zze()).booleanValue() && (th instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbir.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbkz.zzj.zze()).booleanValue()) {
            zzbir.zze(this.zza);
        }
    }
}
