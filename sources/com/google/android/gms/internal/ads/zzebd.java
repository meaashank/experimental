package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebd implements zzinw {
    private final zziof zza;

    private zzebd(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzebd zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebd(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZze = zzeay.zze((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(setZze);
        return setZze;
    }
}
