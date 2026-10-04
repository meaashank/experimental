package com.google.android.gms.internal.playcore_hsdp;

import android.support.v4.media.i;

/* JADX INFO: loaded from: classes4.dex */
final class zzi implements zzg {
    private final zzk zza = new zzk();
    private volatile zzg zzb;
    private Object zzc;

    public zzi(zzg zzgVar) {
        this.zzb = zzgVar;
    }

    public final String toString() {
        Object objA = this.zzb;
        if (objA == null) {
            objA = i.a("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return i.a("Suppliers.memoize(", objA.toString(), ")");
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public final Object zza() {
        if (this.zzb != null) {
            synchronized (this.zza) {
                try {
                    if (this.zzb != null) {
                        Object objZza = this.zzb.zza();
                        this.zzc = objZza;
                        this.zzb = null;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
