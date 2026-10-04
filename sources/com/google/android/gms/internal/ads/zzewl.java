package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzewl implements zzfdi {
    private final zzhdi zza;
    private final zzflw zzb;
    private final zzcga zzc;

    public zzewl(zzhdi zzhdiVar, zzflw zzflwVar, zzcga zzcgaVar) {
        this.zza = zzhdiVar;
        this.zzb = zzflwVar;
        this.zzc = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 9;
    }

    public final /* synthetic */ zzewm zzc() {
        return new zzewm(this.zzb.zzk, this.zzc.zzl());
    }
}
