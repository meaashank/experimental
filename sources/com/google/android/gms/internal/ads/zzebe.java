package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzebe implements zzinw {
    private final zziof zza;

    private zzebe(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzebe zza(zzeay zzeayVar, zziof zziofVar, zziof zziofVar2) {
        return new zzebe(zzeayVar, zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = zzeay.zzf((zzebi) this.zza.zzb(), zzfoy.zzc());
        zzioe.zzb(setZzf);
        return setZzf;
    }
}
