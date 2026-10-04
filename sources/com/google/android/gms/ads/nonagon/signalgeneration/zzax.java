package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zzax implements zzinw {
    private final zziof zza;

    private zzax(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzax zza(zziof zziofVar, zziof zziofVar2) {
        return new zzax(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlo((zzr) this.zza.zzb(), zzfoy.zzc());
    }
}
