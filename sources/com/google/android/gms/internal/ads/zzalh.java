package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.prism.gaia.helper.utils.l;

/* JADX INFO: loaded from: classes4.dex */
final class zzalh {
    public final zzahe zza;
    public final long zzb;
    public final long zzc;

    @Nullable
    public final zzald zzd;
    public final int zze;
    public final int zzf;

    @Nullable
    public final long[] zzg;

    private zzalh(zzahe zzaheVar, long j10, long j11, @Nullable long[] jArr, @Nullable zzald zzaldVar, int i10, int i11) {
        this.zza = new zzahe(zzaheVar);
        this.zzb = j10;
        this.zzc = j11;
        this.zzg = jArr;
        this.zzd = zzaldVar;
        this.zze = i10;
        this.zzf = i11;
    }

    public static zzalh zza(zzahe zzaheVar, zzeu zzeuVar) {
        long[] jArr;
        int i10;
        int i11;
        int iZzB = zzeuVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzeuVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzeuVar.zzz() : -1L;
        zzald zzaldVarZzb = null;
        if ((iZzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = zzeuVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzB & 8) != 0) {
            zzeuVar.zzk(4);
        }
        if (zzeuVar.zzd() >= 24) {
            zzeuVar.zzk(11);
            zzaldVarZzb = zzald.zzb(Float.intBitsToFloat(zzeuVar.zzB()), zzeuVar.zzt(), zzeuVar.zzt());
            zzeuVar.zzk(2);
            int iZzx = zzeuVar.zzx();
            i11 = iZzx & l.b.f165167a;
            i10 = iZzx >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new zzalh(zzaheVar, iZzH, jZzz, jArr, zzaldVarZzb, i10, i11);
    }

    public final long zzb() {
        long j10 = this.zzb;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        return zzfm.zzu((j10 * ((long) r4.zzg)) - 1, this.zza.zzd);
    }
}
