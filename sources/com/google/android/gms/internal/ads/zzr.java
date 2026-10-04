package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzr zza(int i10) {
        zzguk.zzi(!this.zzb);
        this.zza.append(i10, true);
        return this;
    }

    public final zzr zzb(int... iArr) {
        for (int i10 : iArr) {
            zza(i10);
        }
        return this;
    }

    public final zzs zzc() {
        zzguk.zzi(!this.zzb);
        this.zzb = true;
        return new zzs(this.zza, null);
    }
}
