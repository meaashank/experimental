package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1713x0;
import s0.C5559a;

/* JADX INFO: loaded from: classes4.dex */
final class zzali implements zzalf {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;

    @Nullable
    private final long[] zzg;

    private zzali(long j10, int i10, long j11, int i11, long j12, @Nullable long[] jArr) {
        this.zza = j10;
        this.zzb = i10;
        this.zzc = j11;
        this.zzd = i11;
        this.zze = j12;
        this.zzg = jArr;
        this.zzf = j12 != -1 ? j10 + j12 : -1L;
    }

    @Nullable
    public static zzali zze(zzalh zzalhVar, long j10, long j11) {
        long jZzb = zzalhVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        long jMin = zzalhVar.zzc;
        if (jMin != -1 && j11 != -1 && j10 + jMin != j11) {
            long j12 = j11 - j10;
            int length = String.valueOf(j12).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMin).length() + length + 53 + 23);
            C1713x0.a(sb2, "Data size mismatch between stream (", j12, ") and Xing frame (");
            sb2.append(jMin);
            sb2.append("), using smaller value.");
            zzeh.zzb("XingSeeker", sb2.toString());
            jMin = Math.min(jMin, j12);
        }
        zzahe zzaheVar = zzalhVar.zza;
        long[] jArr = zzalhVar.zzg;
        return new zzali(j10, zzaheVar.zzc, jZzb, zzaheVar.zzf, jMin, jArr);
    }

    private final long zzi(int i10) {
        return (this.zzc * ((long) i10)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j10) {
        if (!zzb()) {
            zzahl zzahlVar = new zzahl(0L, this.zza + ((long) this.zzb));
            return new zzahi(zzahlVar, zzahlVar);
        }
        long j11 = this.zzc;
        String str = zzfm.zza;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / j11;
        double dA = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                dA = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.zzg;
                jArr.getClass();
                double d11 = jArr[i10];
                dA = C5559a.a(i10 == 99 ? 256.0d : jArr[i10 + 1], d11, d10 - ((double) i10), d11);
            }
        }
        long j12 = this.zze;
        zzahl zzahlVar2 = new zzahl(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((dA / 256.0d) * j12), j12 - 1)));
        return new zzahi(zzahlVar2, zzahlVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzf(long j10) {
        if (!zzb()) {
            return 0L;
        }
        long j11 = j10 - this.zza;
        if (j11 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        double d10 = (j11 * 256.0d) / this.zze;
        int iZzo = zzfm.zzo(jArr, (long) d10, true, true);
        long jZzi = zzi(iZzo);
        long j12 = jArr[iZzo];
        int i10 = iZzo + 1;
        long jZzi2 = zzi(i10);
        return Math.round((j12 == (iZzo == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jZzi2 - jZzi)) + jZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final int zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}
