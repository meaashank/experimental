package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhdp {
    public static Executor zza() {
        return zzhcn.INSTANCE;
    }

    public static zzhdi zzb(ExecutorService executorService) {
        return executorService instanceof zzhdi ? (zzhdi) executorService : executorService instanceof ScheduledExecutorService ? new zzhdo((ScheduledExecutorService) executorService) : new zzhdk(executorService);
    }

    public static zzhdj zzc(ScheduledExecutorService scheduledExecutorService) {
        return new zzhdo(scheduledExecutorService);
    }

    public static Executor zzd(final Executor executor, final zzhbr zzhbrVar) {
        executor.getClass();
        return executor == zzhcn.INSTANCE ? executor : new Executor() { // from class: com.google.android.gms.internal.ads.zzhdl
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzhdp.zzf(executor, zzhbrVar, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzf(Executor executor, zzhbr zzhbrVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e10) {
            zzhbrVar.zzb(e10);
        }
    }
}
