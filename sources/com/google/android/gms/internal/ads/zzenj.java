package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenj implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzenj(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzenj zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzenj(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeni zzb() {
        return new zzeni((Context) this.zza.zzb(), (zzcvr) this.zzb.zzb());
    }
}
