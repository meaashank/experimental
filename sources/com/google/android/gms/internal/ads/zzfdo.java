package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfdo implements zzfdi {
    private final Context zza;
    private final zzhdi zzb;

    public zzfdo(Context context, zzhdi zzhdiVar) {
        this.zza = context;
        this.zzb = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return ((Boolean) zzbkz.zzb.zze()).booleanValue() ? this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfdn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzhcy.zza(new zzfdp(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzfdp zzc() {
        Context context = this.zza;
        return new zzfdp(zzbir.zzc(context), zzbir.zzd(context));
    }
}
