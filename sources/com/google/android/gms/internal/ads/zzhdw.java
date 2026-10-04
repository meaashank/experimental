package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class zzhdw extends zzhdf {
    final /* synthetic */ zzhdx zza;
    private final Callable zzb;

    public zzhdw(zzhdx zzhdxVar, Callable callable) {
        Objects.requireNonNull(zzhdxVar);
        this.zza = zzhdxVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhdf
    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
