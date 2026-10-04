package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.C1713x0;

/* JADX INFO: loaded from: classes4.dex */
final class zzalg implements zzalf {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzalg(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10;
        this.zzd = j12;
        this.zze = i10;
    }

    @Nullable
    public static zzalg zze(long j10, long j11, zzahe zzaheVar, zzeu zzeuVar) {
        int iZzs;
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.zzk(6);
        int iZzB = zzeuVar2.zzB();
        long j12 = zzaheVar.zzc;
        long j13 = iZzB;
        if (zzeuVar2.zzB() <= 0) {
            return null;
        }
        long jZzu = zzfm.zzu((((long) r4) * ((long) zzaheVar.zzg)) - 1, zzaheVar.zzd);
        int iZzt = zzeuVar2.zzt();
        int iZzt2 = zzeuVar2.zzt();
        int iZzt3 = zzeuVar2.zzt();
        zzeuVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i10 = 0;
        long j14 = j11 + ((long) zzaheVar.zzc);
        while (i10 < iZzt) {
            long j15 = j12;
            jArr[i10] = (((long) i10) * jZzu) / ((long) iZzt);
            jArr2[i10] = j14;
            if (iZzt3 == 1) {
                iZzs = zzeuVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzeuVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzeuVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzeuVar2.zzH();
            }
            j14 += ((long) iZzs) * ((long) iZzt2);
            i10++;
            zzeuVar2 = zzeuVar;
            iZzt = iZzt;
            j12 = j15;
        }
        long j16 = j11 + j12;
        long jMax = j16 + j13;
        if (j10 != -1 && j10 != jMax) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 27 + String.valueOf(jMax).length());
            C1713x0.a(sb2, "VBRI data size mismatch: ", j10, U6.j.f68738d);
            sb2.append(jMax);
            zzeh.zzc("VbriSeeker", sb2.toString());
        }
        if (jMax != j14) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j14).length() + String.valueOf(jMax).length() + 43 + 28);
            C1713x0.a(sb3, "VBRI bytes and ToC mismatch (using max): ", jMax, U6.j.f68738d);
            sb3.append(j14);
            sb3.append("\nSeeking will be inaccurate.");
            zzeh.zzc("VbriSeeker", sb3.toString());
            jMax = Math.max(jMax, j14);
        }
        return new zzalg(jArr, jArr2, jZzu, j16, jMax, zzaheVar.zzf);
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
        long[] jArr = this.zza;
        int iZzo = zzfm.zzo(jArr, j10, true, true);
        long j11 = jArr[iZzo];
        long[] jArr2 = this.zzb;
        zzahl zzahlVar = new zzahl(j11, jArr2[iZzo]);
        if (zzahlVar.zzb >= j10 || iZzo == jArr.length - 1) {
            return new zzahi(zzahlVar, zzahlVar);
        }
        int i10 = iZzo + 1;
        return new zzahi(zzahlVar, new zzahl(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzf(long j10) {
        return this.zza[zzfm.zzo(this.zzb, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public /* synthetic */ boolean zzj() {
        return C3373z.a(this);
    }
}
