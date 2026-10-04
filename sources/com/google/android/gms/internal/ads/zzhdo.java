package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzhdo extends zzhdk implements zzhdj, AutoCloseable {
    final ScheduledExecutorService zza;

    public zzhdo(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhbu, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        Q0.h.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzhdh schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhdx zzhdxVarZze = zzhdx.zze(runnable, null);
        return new zzhdm(zzhdxVarZze, scheduledExecutorService.schedule(zzhdxVarZze, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzhdh schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzhdx zzhdxVar = new zzhdx(callable);
        return new zzhdm(zzhdxVar, this.zza.schedule(zzhdxVar, j10, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzhdh scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzhdn zzhdnVar = new zzhdn(runnable);
        return new zzhdm(zzhdnVar, this.zza.scheduleAtFixedRate(zzhdnVar, j10, j11, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhdj, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzhdh scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzhdn zzhdnVar = new zzhdn(runnable);
        return new zzhdm(zzhdnVar, this.zza.scheduleWithFixedDelay(zzhdnVar, j10, j11, timeUnit));
    }
}
