package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebf implements zzinw {
    private final zziof zza;

    private zzebf(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzebf zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebf(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzg = zzeay.zzg((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(setZzg);
        return setZzg;
    }
}
