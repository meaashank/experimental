package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzgbm implements zzgbl {
    private zzgbm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zza(int i10) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzgbn(null)));
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zzb(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zzc(int i10) {
        return zzb(1, new zzgbn(null), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgbl
    public final ExecutorService zzd(ThreadFactory threadFactory, int i10) {
        return zzb(1, threadFactory, 1);
    }

    public /* synthetic */ zzgbm(byte[] bArr) {
    }
}
