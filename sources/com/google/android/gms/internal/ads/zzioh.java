package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzioh {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzioh(int i10, int i11, zziog zziogVar) {
        this.zza = zzint.zza(i10);
        this.zzb = zzint.zza(i11);
    }

    public final zzioh zza(zziof zziofVar) {
        this.zza.add(zziofVar);
        return this;
    }

    public final zzioh zzb(zziof zziofVar) {
        this.zzb.add(zziofVar);
        return this;
    }

    public final zzioi zzc() {
        return new zzioi(this.zza, this.zzb, null);
    }
}
