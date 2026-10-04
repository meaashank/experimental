package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfbu implements zzfdi {
    private final zzfdi zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzfbu(zzfdi zzfdiVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfdiVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdj)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j10 = this.zzb;
        if (j10 > 0) {
            listenableFutureZza = zzhcy.zzi(listenableFutureZza, j10, timeUnit, this.zzc);
        }
        return zzhcy.zzh(listenableFutureZza, Throwable.class, new zzhcg() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcgj.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return this.zza.zzb();
    }

    public final /* synthetic */ ListenableFuture zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdh)).booleanValue()) {
            zzfdi zzfdiVar = this.zza;
            zzcfv zzcfvVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            int iZzb = zzfdiVar.zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb2.append("OptionalSignalTimeout:");
            sb2.append(iZzb);
            zzcfvVarZzh.zzh(th, sb2.toString());
        }
        return zzhcy.zza(null);
    }
}
