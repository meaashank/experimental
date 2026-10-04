package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
final class zzaky implements zzalf {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaky(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzfm.zzt(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzaky zze(long j10, zzakc zzakcVar, long j11) {
        int[] iArr = zzakcVar.zzd;
        int length = iArr.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (zzakcVar.zzb + iArr[i12]);
            j12 += (long) (zzakcVar.zzc + zzakcVar.zze[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzaky(jArr, jArr2, j11);
    }

    private static Pair zzi(long j10, long[] jArr, long[] jArr2) {
        int iZzo = zzfm.zzo(jArr, j10, true, true);
        long j11 = jArr[iZzo];
        long j12 = jArr2[iZzo];
        int i10 = iZzo + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
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
        String str = zzfm.zza;
        Pair pairZzi = zzi(zzfm.zzs(Math.max(0L, Math.min(j10, this.zzc))), this.zzb, this.zza);
        zzahl zzahlVar = new zzahl(zzfm.zzt(((Long) pairZzi.first).longValue()), ((Long) pairZzi.second).longValue());
        return new zzahi(zzahlVar, zzahlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzf(long j10) {
        return zzfm.zzt(((Long) zzi(j10, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzg() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final int zzh() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}
