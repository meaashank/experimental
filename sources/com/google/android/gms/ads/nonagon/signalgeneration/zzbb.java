package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzege;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbb implements zzinw {
    private final zziof zza;

    private zzbb(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzbb zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzbb(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzba zzb() {
        return new zzba(zzfoy.zzc(), ((zzege) this.zza).zzb());
    }
}
