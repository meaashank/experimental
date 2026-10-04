package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevq implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzevq(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar3;
    }

    public static zzevq zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzevq(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevo((ListenableFuture) this.zza.zzb(), zzfoy.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
