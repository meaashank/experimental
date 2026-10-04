package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class zzhbw extends zzhbx {
    public zzhbw(ListenableFuture listenableFuture, zzgub zzgubVar) {
        super(listenableFuture, zzgubVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbx
    public final /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        return ((zzgub) obj).apply(obj2);
    }
}
