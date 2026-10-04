package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgdx implements zzinw {
    private final zziof zza;

    private zzgdx(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzgdx zza(zziof zziofVar) {
        return new zzgdx(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzhdi zzhdiVarZzb = zzhdp.zzb((ExecutorService) this.zza.zzb());
        zzioe.zzb(zzhdiVarZzb);
        return zzhdiVarZzb;
    }
}
