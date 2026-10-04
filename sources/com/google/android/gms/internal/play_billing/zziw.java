package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
abstract class zziw {
    final Unsafe zza;

    public zziw(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j10);

    public abstract float zzb(Object obj, long j10);

    public abstract void zzc(Object obj, long j10, boolean z10);

    public abstract void zzd(Object obj, long j10, double d10);

    public abstract void zze(Object obj, long j10, float f10);

    public abstract boolean zzf(Object obj, long j10);
}
