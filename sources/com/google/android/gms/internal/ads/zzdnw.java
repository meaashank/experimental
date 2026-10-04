package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnw implements zzinw {
    private final zziof zza;

    private zzdnw(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdnw zza(zziof zziofVar) {
        return new zzdnw(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdlo((zzdop) this.zza.zzb(), zzcgj.zzh));
        zzioe.zzb(setSingleton);
        return setSingleton;
    }
}
