package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zzns {
    private final zzs zza;
    private final SparseArray zzb;

    public zzns(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i10 = 0; i10 < zzsVar.zzb(); i10++) {
            int iZzc = zzsVar.zzc(i10);
            zznr zznrVar = (zznr) sparseArray.get(iZzc);
            zznrVar.getClass();
            sparseArray2.append(iZzc, zznrVar);
        }
        this.zzb = sparseArray2;
    }

    public final zznr zza(int i10) {
        zznr zznrVar = (zznr) this.zzb.get(i10);
        zznrVar.getClass();
        return zznrVar;
    }

    public final boolean zzb(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
