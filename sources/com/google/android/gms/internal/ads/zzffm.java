package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzffm implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzffm(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
    }

    public static zzffm zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzffm(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzffk zzb() {
        return new zzffk(zzcsc.zza(), (ScheduledExecutorService) this.zza.zzb(), ((zzcok) this.zzb).zza());
    }
}
