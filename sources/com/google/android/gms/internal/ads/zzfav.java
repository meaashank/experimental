package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfav implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzfav(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzfav zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfav(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfat zzb() {
        return new zzfat(((zzcok) this.zza).zza(), (Intent) this.zzb.zzb());
    }
}
