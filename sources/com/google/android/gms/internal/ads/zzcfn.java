package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcfn {
    public final ListenableFuture zza(Context context, int i10) {
        zzcgo zzcgoVar = new zzcgo();
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            zzcgj.zza.execute(new zzcfm(this, context, zzcgoVar));
        }
        return zzcgoVar;
    }
}
