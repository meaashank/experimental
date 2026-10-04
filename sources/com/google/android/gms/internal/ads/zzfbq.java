package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbq implements zzfdi {
    private final zzhdi zza;
    private final zzebm zzb;

    public zzfbq(zzhdi zzhdiVar, zzebm zzebmVar) {
        this.zza = zzhdiVar;
        this.zzb = zzebmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzfbr zzc() {
        return new zzfbr(this.zzb.zzb());
    }
}
