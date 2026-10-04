package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzhbp extends zzhbq {
    public zzhbp(ListenableFuture listenableFuture, Class cls, zzgub zzgubVar) {
        super(listenableFuture, cls, zzgubVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    public final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    public final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzgub) obj).apply(th);
    }
}
