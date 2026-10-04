package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvb implements zzcgs {
    final /* synthetic */ zzbug zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcgo zzc;
    final /* synthetic */ zzbve zzd;

    public zzbvb(zzbve zzbveVar, zzbug zzbugVar, Object obj, zzcgo zzcgoVar) {
        this.zza = zzbugVar;
        this.zzb = obj;
        this.zzc = zzcgoVar;
        Objects.requireNonNull(zzbveVar);
        this.zzd = zzbveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcgo zzcgoVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbun) obj, obj2, zzcgoVar);
    }
}
