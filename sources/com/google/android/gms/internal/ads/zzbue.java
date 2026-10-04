package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbue implements zzcgs {
    final /* synthetic */ zzbug zza;

    public zzbue(zzbug zzbugVar) {
        Objects.requireNonNull(zzbugVar);
        this.zza = zzbugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
