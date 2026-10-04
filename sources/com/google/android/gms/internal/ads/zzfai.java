package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfai implements zzfdi {
    private final Context zza;
    private final zzhdi zzb;

    public zzfai(zzhdi zzhdiVar, Context context) {
        this.zzb = zzhdiVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfah
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 57;
    }

    public final /* synthetic */ zzfaj zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzfaj(com.google.android.gms.ads.internal.util.zzs.zzu(this.zza));
    }
}
