package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdgi extends zzdjn {
    private boolean zzb;

    @e.f0
    public zzdgi(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzdgh.zza);
        this.zzb = true;
    }
}
