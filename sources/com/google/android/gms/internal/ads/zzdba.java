package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdba implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzdba(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzdba zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdba(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzdig) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
