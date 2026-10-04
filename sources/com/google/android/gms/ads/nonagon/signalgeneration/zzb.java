package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzcpa;
import com.google.android.gms.internal.ads.zzcrt;
import com.google.android.gms.internal.ads.zzeyp;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzb(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar4;
    }

    public static zzb zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzb(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zza(((zzcok) this.zza).zza(), zzcrt.zza(), zzeyp.zzc(), ((zzcpa) this.zzb).zza());
    }
}
