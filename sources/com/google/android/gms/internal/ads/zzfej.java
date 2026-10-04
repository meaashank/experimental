package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfej implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzfej(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
        this.zzc = zziofVar5;
        this.zzd = zziofVar6;
        this.zze = zziofVar7;
    }

    public static zzfej zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7) {
        return new zzfej(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfeh zzb() {
        return new zzfeh(zzcse.zza(), ((zzcok) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb(), zzfoy.zzc(), ((zzffp) this.zzc).zzb().intValue(), ((zzffq) this.zzd).zzb().booleanValue(), ((zzffr) this.zze).zzb().booleanValue());
    }
}
