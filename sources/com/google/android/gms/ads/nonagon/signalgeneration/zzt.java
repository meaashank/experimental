package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt implements zzinw {
    private final zziof zza;

    private zzt(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzt zza(zziof zziofVar) {
        return new zzt(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzq((zzeao) this.zza.zzb());
    }
}
