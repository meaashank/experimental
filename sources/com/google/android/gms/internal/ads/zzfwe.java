package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfwe implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfwf zzb;

    public zzfwe(zzfwf zzfwfVar, float f10) {
        this.zza = f10;
        Objects.requireNonNull(zzfwfVar);
        this.zzb = zzfwfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
