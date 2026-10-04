package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes4.dex */
public final class zzczy implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzczy(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzczy zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzczy(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzcpd) this.zzb).zzb().zzk((Clock) this.zza.zzb(), ((zzddg) this.zzc).zza().zzg);
    }
}
