package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes4.dex */
final class zzamb implements zzahk {
    private final SparseArray zza;
    private final SparseArray zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    public /* synthetic */ zzamb(SparseArray sparseArray, SparseArray sparseArray2, long j10, long j11, int i10, byte[] bArr) {
        this.zza = sparseArray;
        this.zzb = sparseArray2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        SparseArray sparseArray = this.zza;
        int i10 = this.zze;
        long[] jArr = (long[]) sparseArray.get(i10);
        SparseArray sparseArray2 = this.zzb;
        long[] jArr2 = (long[]) sparseArray2.get(i10);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i10);
            jArr2 = (long[]) sparseArray2.get(i10);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j10 < jArr[0]) {
            zzahl zzahlVar = new zzahl(0L, this.zzd);
            return new zzahi(zzahlVar, zzahlVar);
        }
        int iZzo = zzfm.zzo(jArr, j10, true, true);
        zzahl zzahlVar2 = new zzahl(jArr[iZzo], jArr2[iZzo]);
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}
