package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzege implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzege(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.zza = zziofVar;
        this.zzb = zziofVar4;
        this.zzc = zziofVar5;
    }

    public static zzege zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        return new zzege(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegd zzb() {
        return new zzegd((ScheduledExecutorService) this.zza.zzb(), zzfoy.zzc(), zzfpe.zzc(), ((zzehd) this.zzb).zzb(), zzinv.zzc(this.zzc));
    }
}
