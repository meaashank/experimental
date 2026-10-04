package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzevh implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzevh(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzevh zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzevh(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevf((Clock) this.zza.zzb(), ((zzddg) this.zzb).zza(), ((Long) this.zzc.zzb()).longValue());
    }
}
