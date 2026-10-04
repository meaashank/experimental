package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoa implements zzagk {
    private final zzagk zzb;
    private final zzanx zzc;
    private final SparseArray zzd = new SparseArray();
    private boolean zze;

    public zzaoa(zzagk zzagkVar, zzanx zzanxVar) {
        this.zzb = zzagkVar;
        this.zzc = zzanxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final zzaht zzs(int i10, int i11) {
        if (i11 != 3 && i11 != 5) {
            this.zze = true;
        }
        if (i11 != 3) {
            return this.zzb.zzs(i10, i11);
        }
        SparseArray sparseArray = this.zzd;
        zzaoc zzaocVar = (zzaoc) sparseArray.get(i10);
        if (zzaocVar != null) {
            return zzaocVar;
        }
        zzaoc zzaocVar2 = new zzaoc(this.zzb.zzs(i10, 3), this.zzc);
        sparseArray.put(i10, zzaocVar2);
        return zzaocVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzv() {
        this.zzb.zzv();
        if (!this.zze) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzd;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((zzaoc) sparseArray.valueAt(i10)).zzf(true);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzw(zzahk zzahkVar) {
        this.zzb.zzw(zzahkVar);
    }
}
