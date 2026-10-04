package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzchc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzchj zzc;

    public zzchc(zzchj zzchjVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzchjVar);
        this.zzc = zzchjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchj zzchjVar = this.zzc;
        if (zzchjVar.zzt() != null) {
            zzchjVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
