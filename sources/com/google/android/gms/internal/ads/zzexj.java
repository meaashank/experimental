package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzexj implements zzfdi {
    private final zzflw zza;

    public zzexj(zzflw zzflwVar) {
        this.zza = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zza(new zzexk(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 58;
    }
}
