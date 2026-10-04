package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfqa {
    private static final ListenableFuture zza = zzhcy.zza(null);
    private final zzhdi zzb;
    private final ScheduledExecutorService zzc;
    private final zzfqb zzd;

    public zzfqa(zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, zzfqb zzfqbVar) {
        this.zzb = zzhdiVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfqbVar;
    }

    public final zzfpz zza(Object obj, ListenableFuture listenableFuture) {
        return new zzfpz(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, null);
    }

    public final zzfpr zzb(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfpr(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzhdi zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfqb zzg() {
        return this.zzd;
    }
}
