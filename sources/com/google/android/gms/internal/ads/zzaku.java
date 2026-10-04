package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzaku {
    private final zzeu zza = new zzeu(8);
    private int zzb;

    private final long zzb(zzagi zzagiVar) throws IOException {
        int i10;
        zzeu zzeuVar = this.zza;
        int i11 = 0;
        zzagiVar.zzi(zzeuVar.zzi(), 0, 1);
        int i12 = zzeuVar.zzi()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzagiVar.zzi(zzeuVar.zzi(), 1, i14);
        while (i11 < i14) {
            i11++;
            i15 = (zzeuVar.zzi()[i11] & 255) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzagi zzagiVar) throws IOException {
        long jZzo = zzagiVar.zzo();
        long j10 = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j10 = jZzo;
        }
        zzeu zzeuVar = this.zza;
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        this.zzb = 4;
        for (long jZzz = zzeuVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzeuVar.zzi()[0] & 255))) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzagiVar.zzi(zzeuVar.zzi(), 0, 1);
        }
        long jZzb = zzb(zzagiVar);
        long j11 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j12 = j11 + jZzb;
            if (jZzo == -1 || j12 < jZzo) {
                while (true) {
                    long j13 = this.zzb;
                    if (j13 < j12) {
                        if (zzb(zzagiVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzagiVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i12 = (int) jZzb2;
                            zzagiVar.zzk(i12);
                            this.zzb += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
