package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzhbo extends zzhbq {
    public zzhbo(ListenableFuture listenableFuture, Class cls, zzhcg zzhcgVar) {
        super(listenableFuture, cls, zzhcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    public final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzhcg zzhcgVar = (zzhcg) obj;
        ListenableFuture listenableFutureZza = zzhcgVar.zza(th);
        zzguk.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhcgVar);
        return listenableFutureZza;
    }
}
