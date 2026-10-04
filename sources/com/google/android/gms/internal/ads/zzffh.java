package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffh implements zzfdi {
    final zzhdi zza;
    final List zzb;

    public zzffh(zzbiq zzbiqVar, zzhdi zzhdiVar, List list) {
        this.zza = zzhdiVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzffg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzffi(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 48;
    }
}
