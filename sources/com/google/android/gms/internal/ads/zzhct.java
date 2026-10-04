package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public class zzhct extends zzhcu {
    private final ListenableFuture zza;

    public zzhct(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhcu, com.google.android.gms.internal.ads.zzhcs
    public final /* synthetic */ Future zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcs, com.google.android.gms.internal.ads.zzgxd
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcu
    public final ListenableFuture zzc() {
        return this.zza;
    }
}
