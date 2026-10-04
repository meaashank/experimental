package com.google.android.gms.internal.ads;

import androidx.compose.material.C1846b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawr {
    public final ArrayList zza = new ArrayList();
    public int zzb = 0;

    public zzawr(int i10) {
    }

    public final int zza(long j10) throws zzawp {
        long j11;
        int[] iArr = {2001100545, 2130723407, 140753313, -149863858, -2003236720, 202391198, 23353437, 1141616124, 84353895};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iA = C1846b.a((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 84353895;
        long[] jArr = {269441500, 1994078854, 158128940, -158130045, -1992289935, 556430036, 8936987, 2147469841, 438792350};
        long j12 = jArr[0];
        long j13 = jArr[1];
        long j14 = jArr[2];
        long j15 = jArr[3];
        long j16 = jArr[4];
        long j17 = jArr[5];
        long j18 = jArr[6];
        long j19 = jArr[7];
        long j20 = (((((~j12) & j13) | j14) + ((j12 & j15) | j16)) - j17) + j18;
        long j21 = j19 % 438792350;
        if (j10 >= 0) {
            j11 = ((long) (this.zzb + (iA ^ i18))) - j10;
        } else {
            j11 = (j20 ^ j21) + (-j10);
        }
        if (j11 < 0 || j11 >= this.zzb) {
            throw new zzawp();
        }
        return (int) j11;
    }

    public final void zzb(zzaxa zzaxaVar) throws zzawq {
        int[] iArr = {524133589, 740889625, 408955079, 621796408, 24562149, 1207357565, 297783268, 1066077375, 937558955};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iA = C1846b.a((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = this.zzb;
        if (i18 >= ((i17 % 937558955) ^ iA)) {
            throw new zzawq();
        }
        ArrayList arrayList = this.zza;
        if (i18 == arrayList.size()) {
            arrayList.add(zzaxaVar);
        } else {
            arrayList.set(this.zzb, zzaxaVar);
        }
        this.zzb++;
    }

    public final zzaxa zzc() throws zzawp {
        int[] iArr = {91119157, 1459677288, 586253619, -183145911, -1567288443, 919325394, 146725508, 787086305, 459541652};
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int iA = C1846b.a((i11 & (~i10)) | i12, (i10 & i13) | i14, i15, i16);
        int i18 = i17 % 459541652;
        int i19 = this.zzb;
        if (i19 <= 0) {
            throw new zzawp();
        }
        int i20 = i18 ^ iA;
        ArrayList arrayList = this.zza;
        zzaxa zzaxaVar = (zzaxa) arrayList.get(i19 + i20);
        arrayList.set(this.zzb + i20, null);
        this.zzb += i20;
        return zzaxaVar;
    }

    public final zzaxa zzd(long j10) throws zzawp {
        return (zzaxa) this.zza.get(zza(j10));
    }

    public final void zze(long j10, zzaxa zzaxaVar) throws zzawp {
        this.zza.set(zza(j10), zzaxaVar);
    }
}
