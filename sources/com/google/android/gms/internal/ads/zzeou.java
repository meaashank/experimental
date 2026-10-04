package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeou implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeou(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeou zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzeou(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeot zzb() {
        return new zzeot((Context) this.zza.zzb(), (zzdoe) this.zzb.zzb());
    }
}
