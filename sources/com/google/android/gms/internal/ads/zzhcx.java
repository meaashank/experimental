package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcx {
    private final boolean zza;
    private final zzgxm zzb;

    public /* synthetic */ zzhcx(boolean z10, zzgxm zzgxmVar, byte[] bArr) {
        this.zza = z10;
        this.zzb = zzgxmVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzhcm(this.zzb, this.zza, executor, callable);
    }
}
