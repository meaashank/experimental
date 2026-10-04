package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzevm implements zzhcg {
    static final /* synthetic */ zzevm zza = new zzevm();

    private /* synthetic */ zzevm() {
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzhcy.zza(new zzevp(Integer.toString(17))) : zzhcy.zza(new zzevp(null));
    }
}
