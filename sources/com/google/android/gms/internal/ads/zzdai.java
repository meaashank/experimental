package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdai implements zzinw {
    private final zziof zza;

    private zzdai(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzdai zza(zziof zziofVar, zziof zziofVar2) {
        return new zzdai(zziofVar, zziofVar2);
    }

    public static zzdlo zzc(zzcun zzcunVar, Executor executor) {
        return new zzdlo(zzcunVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc((zzcun) this.zza.zzb(), zzfoy.zzc());
    }
}
