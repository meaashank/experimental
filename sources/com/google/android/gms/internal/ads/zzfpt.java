package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfpt {
    public static final zzfpz zza(ListenableFuture listenableFuture, Object obj, zzfqa zzfqaVar) {
        return new zzfpz(zzfqaVar, obj, null, zzfqa.zza, Collections.EMPTY_LIST, listenableFuture, null);
    }

    public static final zzfpz zzb(Callable callable, Object obj, zzfqa zzfqaVar) {
        return zzc(callable, zzfqaVar.zze(), obj, zzfqaVar);
    }

    public static final zzfpz zzc(Callable callable, zzhdi zzhdiVar, Object obj, zzfqa zzfqaVar) {
        return new zzfpz(zzfqaVar, obj, null, zzfqa.zza, Collections.EMPTY_LIST, zzhdiVar.zzc(callable), null);
    }

    public static final zzfpz zzd(final zzfpo zzfpoVar, zzhdi zzhdiVar, Object obj, zzfqa zzfqaVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfps
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfpoVar.zza();
                return null;
            }
        }, zzhdiVar, obj, zzfqaVar);
    }
}
