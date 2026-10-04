package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpr {
    final /* synthetic */ zzfqa zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfpr(zzfqa zzfqaVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfqaVar);
        this.zza = zzfqaVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfpz zza(Callable callable) {
        List list = this.zzc;
        zzhcx zzhcxVarZzp = zzhcy.zzp(list);
        ListenableFuture listenableFutureZza = zzhcxVarZzp.zza(zzfpq.zza, zzcgj.zzh);
        zzfqa zzfqaVar = this.zza;
        return new zzfpz(zzfqaVar, this.zzb, null, listenableFutureZza, list, zzhcxVarZzp.zza(callable, zzfqaVar.zze()), null);
    }
}
