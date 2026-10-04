package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcel implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcel(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcel zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzcel(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcek zzb() {
        return new zzcek((Clock) this.zza.zzb(), (zzcei) this.zzb.zzb());
    }
}
