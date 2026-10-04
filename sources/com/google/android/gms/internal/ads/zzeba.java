package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeba implements zzinw {
    private final zziof zza;

    private zzeba(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzeba zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzeba(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzb = zzeay.zzb((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(setZzb);
        return setZzb;
    }
}
