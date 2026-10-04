package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbuh implements zzcgs {
    final /* synthetic */ zzbug zza;

    public zzbuh(zzbul zzbulVar, zzbug zzbugVar) {
        this.zza = zzbugVar;
        Objects.requireNonNull(zzbulVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbth) obj).zzl());
    }
}
