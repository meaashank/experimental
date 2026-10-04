package com.google.android.gms.internal.ads;

import k0.C4812c;

/* JADX INFO: loaded from: classes4.dex */
public final class zzarx {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzeu zzeuVar, int i10, int i11) {
        zzeuVar.zzh(i10);
        if (zzeuVar.zzd() < 5) {
            return -9223372036854775807L;
        }
        int iZzB = zzeuVar.zzB();
        if ((8388608 & iZzB) != 0 || ((iZzB >> 8) & C4812c.f214302r) != i11 || (iZzB & 32) == 0 || zzeuVar.zzs() < 7 || zzeuVar.zzd() < 7 || (zzeuVar.zzs() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzeuVar.zzm(bArr, 0, 6);
        long j10 = bArr[0];
        long j11 = bArr[1];
        long j12 = bArr[2];
        long j13 = bArr[3] & 255;
        return ((j10 & 255) << 25) | ((j11 & 255) << 17) | ((j12 & 255) << 9) | (j13 + j13) | ((((long) bArr[4]) & 255) >> 7);
    }
}
