package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebb implements zzinw {
    private final zziof zza;

    private zzebb(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzebb zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebb(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzc = zzeay.zzc((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(setZzc);
        return setZzc;
    }
}
