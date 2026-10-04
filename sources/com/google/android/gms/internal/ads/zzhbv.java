package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzhbv extends zzhbx {
    public zzhbv(ListenableFuture listenableFuture, zzhcg zzhcgVar) {
        super(listenableFuture, zzhcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzhcg zzhcgVar = (zzhcg) obj;
        ListenableFuture listenableFutureZza = zzhcgVar.zza(obj2);
        zzguk.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhcgVar);
        return listenableFutureZza;
    }
}
