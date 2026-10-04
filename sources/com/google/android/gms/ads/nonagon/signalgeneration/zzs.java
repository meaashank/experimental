package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zzs implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzs(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzs zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzs(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzr((zzeae) this.zza.zzb(), (zzq) this.zzb.zzb(), (String) this.zzc.zzb());
    }
}
