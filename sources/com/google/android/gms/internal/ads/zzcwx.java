package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwx implements zzinw {
    private final zziof zza;

    private zzcwx(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzcwx zza(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcwx(zzcwkVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdlo((zzcya) this.zza.zzb(), zzcgj.zzh));
        zzioe.zzb(setSingleton);
        return setSingleton;
    }
}
