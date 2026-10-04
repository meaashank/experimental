package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zziie extends zziig {
    public zziie(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final boolean zza(Object obj, long j10) {
        return zziih.zza ? zziih.zzp(obj, j10) : zziih.zzq(obj, j10);
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final void zzb(Object obj, long j10, boolean z10) {
        if (zziih.zza) {
            zziih.zzr(obj, j10, z10);
        } else {
            zziih.zzs(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final float zzc(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final void zzd(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final double zze(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zziig
    public final void zzf(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
