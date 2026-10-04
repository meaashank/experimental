package com.google.android.gms.internal.playcore_hsdp;

import android.support.v4.media.i;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class zzh implements Serializable, zzg {
    final zzg zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzk zzd = new zzk();

    public zzh(zzg zzgVar) {
        this.zza = zzgVar;
    }

    public final String toString() {
        return i.a("Suppliers.memoize(", (this.zzb ? i.a("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
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
