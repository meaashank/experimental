package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zzm implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzm(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzm zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzm(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzj(((zzcok) this.zza).zza(), (zzeao) this.zzb.zzb(), zzfoy.zzc());
    }
}
