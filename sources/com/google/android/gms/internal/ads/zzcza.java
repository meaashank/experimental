package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcza {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcza(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public final void zza(zzhcv zzhcvVar) {
        zzhcy.zzr(this.zzc, new zzcyu(this, zzhcvVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ ListenableFuture zzc(zzhcv zzhcvVar, ListenableFuture listenableFuture, zzcyl zzcylVar) {
        if (zzcylVar != null) {
            zzhcvVar.zzb(zzcylVar);
        }
        return zzhcy.zzi(listenableFuture, ((Long) zzblv.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, final zzhcv zzhcvVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhcvVar.zza(new zzefb(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureZza = zzhcy.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzcyw
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    zzhcvVar.zza((Throwable) obj);
                    return zzhcy.zza(null);
                }
            };
            Executor executor = this.zza;
            listenableFutureZza = zzhcy.zzj(zzhcy.zzh(listenableFutureZza, Throwable.class, zzhcgVar, executor), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzcyx
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzc(zzhcvVar, listenableFuture, (zzcyl) obj);
                }
            }, executor);
        }
        zzhcy.zzr(listenableFutureZza, new zzcyv(this, zzhcvVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
