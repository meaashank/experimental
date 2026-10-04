package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcxw implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcxw(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcxw zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzcxw(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxv zzb() {
        return new zzcxv(((zzcxb) this.zza).zza(), (Executor) this.zzb.zzb());
    }
}
