package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeng implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeng(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeng zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzeng(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzenf((Context) this.zza.zzb(), (zzcvr) this.zzb.zzb(), zzfoy.zzc());
    }
}
