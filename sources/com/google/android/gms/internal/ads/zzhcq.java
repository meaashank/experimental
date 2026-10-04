package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public class zzhcq extends zzhcz {
    public static zzhcq zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzhcq ? (zzhcq) listenableFuture : new zzhcr(listenableFuture);
    }
}
