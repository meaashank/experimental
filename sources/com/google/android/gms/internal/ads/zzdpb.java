package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdpb implements zzinw {
    private final zziof zza;

    private zzdpb(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdpb zza(zziof zziofVar) {
        return new zzdpb(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdoy) this.zza).zza().zzd() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        zzioe.zzb(setSingleton);
        return setSingleton;
    }
}
