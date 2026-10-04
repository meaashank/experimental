package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwc implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzcwc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzcwc zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcwc(zziofVar, zziofVar2, zziofVar3);
    }

    public static zzdgq zzd(ScheduledExecutorService scheduledExecutorService, Clock clock, zzeaj zzeajVar) {
        return new zzdgq(scheduledExecutorService, clock, zzeajVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdgq zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb(), (zzeaj) this.zzc.zzb());
    }
}
