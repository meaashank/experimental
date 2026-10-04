package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnq implements zzinw {
    private final zziof zza;

    private zzdnq(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdnq zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdnq(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdlo((zzdce) this.zza.zzb(), zzcgj.zzh));
        zzioe.zzb(setSingleton);
        return setSingleton;
    }
}
