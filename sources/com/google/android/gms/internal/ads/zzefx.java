package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class zzefx implements zzinw {
    private final zziof zza;

    private zzefx(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzefx zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzefx(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegt zzb() {
        return new zzegt((Context) this.zza.zzb(), zzfoy.zzc());
    }
}
