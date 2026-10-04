package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
abstract class zziig {
    final Unsafe zza;

    public zziig(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract boolean zza(Object obj, long j10);

    public abstract void zzb(Object obj, long j10, boolean z10);

    public abstract float zzc(Object obj, long j10);

    public abstract void zzd(Object obj, long j10, float f10);

    public abstract double zze(Object obj, long j10);

    public abstract void zzf(Object obj, long j10, double d10);
}
