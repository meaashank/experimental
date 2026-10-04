package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvd implements Serializable, zzgvc {
    final zzgvc zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgvi zzd = new zzgvi();

    public zzgvd(zzgvc zzgvcVar) {
        this.zza = zzgvcVar;
    }

    public final String toString() {
        Object objA;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objA = androidx.compose.animation.core.E0.a(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objA = this.zza;
        }
        String string = objA.toString();
        return androidx.compose.animation.core.E0.a(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgvc
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
