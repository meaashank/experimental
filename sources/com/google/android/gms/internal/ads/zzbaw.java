package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbaw implements Runnable {
    final /* synthetic */ zzbax zza;

    public zzbaw(zzbax zzbaxVar) {
        Objects.requireNonNull(zzbaxVar);
        this.zza = zzbaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzbax zzbaxVar = this.zza;
        if (zzbaxVar.zzb != null) {
            return;
        }
        synchronized (zzbax.zzd) {
            if (zzbaxVar.zzb != null) {
                return;
            }
            boolean z10 = false;
            try {
                zBooleanValue = ((Boolean) zzbjg.zzdz.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzbax.zza = zzgae.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                    z10 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z10 = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z10);
            zzbax.zzd.open();
        }
    }
}
