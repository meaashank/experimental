package com.google.android.gms.ads.nonagon.devicetier;

import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zza implements zzinw {
    private final zziof zza;

    private zza(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zza zza(zziof zziofVar) {
        return new zza(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DeviceTierManager(((zzcok) this.zza).zza());
    }
}
