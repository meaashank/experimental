package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdms extends zzdjn {
    private boolean zzb;

    public zzdms(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdmr.zza);
    }

    public final void zzb() {
        zzs(zzdmn.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdmo.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdmq.zza);
                this.zzb = true;
            }
            zzs(zzdmp.zza);
        } catch (Throwable th) {
            throw th;
        }
    }
}
