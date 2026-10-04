package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzche implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzchj zzc;

    public zzche(zzchj zzchjVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        Objects.requireNonNull(zzchjVar);
        this.zzc = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zzc;
        if (zzchjVar.zzt() != null) {
            zzchjVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
