package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgfr implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzgfr(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzgfr zza(zziof zziofVar, zziof zziofVar2) {
        return new zzgfr(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgfq((Executor) this.zza.zzb(), (zzgdq) this.zzb.zzb());
    }
}
