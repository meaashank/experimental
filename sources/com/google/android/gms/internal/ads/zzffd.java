package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffd implements zzfdi {
    public zzffd(zzcfk zzcfkVar, zzhdi zzhdiVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        final ListenableFuture listenableFutureZza = zzhcy.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgU)).booleanValue()) {
            listenableFutureZza = zzhcy.zza(null);
        }
        final ListenableFuture listenableFutureZza2 = zzhcy.zza(null);
        return zzhcy.zzo(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzffc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzffe((String) listenableFutureZza.get(), (String) listenableFutureZza2.get());
            }
        }, zzcgj.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 47;
    }
}
