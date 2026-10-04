package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebh implements zzinw {
    private final zziof zza;

    private zzebh(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzebh zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebh(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzi = zzeay.zzi((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(setZzi);
        return setZzi;
    }
}
