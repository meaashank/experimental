package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfev implements zzfdi {
    final zzhdi zza;

    public zzfev(zzbhu zzbhuVar, zzhdi zzhdiVar, Context context) {
        this.zza = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.zzc(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzfeu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfew(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 45;
    }
}
