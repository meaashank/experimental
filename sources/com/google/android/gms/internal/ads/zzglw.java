package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzglw implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzglw(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzglw zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzglw(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzglt((Context) this.zza.zzb(), (ExecutorService) this.zzb.zzb(), (zzggk) this.zzc.zzb());
    }
}
