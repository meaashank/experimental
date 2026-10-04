package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebc implements zzinw {
    private final zzeay zza;
    private final zziof zzb;

    private zzebc(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zzeayVar;
        this.zzb = zziofVar;
    }

    public static zzebc zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebc(zzeayVar, zziofVar, zziofVar2);
    }

    public static Set zzc(zzeay zzeayVar, zzebi zzebiVar, Executor executor) {
        Set setZzd = zzeay.zzd(zzebiVar, executor);
        zzioe.zzb(setZzd);
        return setZzd;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzebi) this.zzb.zzb(), zzfoy.zzc());
    }
}
