package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzzy extends zzaaa {
    public zzzy(zzbg zzbgVar, int[] iArr, int i10, zzabu zzabuVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, zzdp zzdpVar) {
        super(zzbgVar, iArr, 0);
        zzgxm.zzq(list);
    }

    public static /* synthetic */ zzgxm zzd(zzabd[] zzabdVarArr) {
        int i10;
        int i11;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                break;
            }
            zzabd zzabdVar = zzabdVarArr[i13];
            if (zzabdVar == null || zzabdVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = zzgxm.zzd;
                zzgxj zzgxjVar = new zzgxj();
                zzgxjVar.zzf(new zzzw(0L, 0L));
                arrayList.add(zzgxjVar);
            }
            i13++;
        }
        long[][] jArr2 = new long[2][];
        for (int i15 = 0; i15 < 2; i15++) {
            zzabd zzabdVar2 = zzabdVarArr[i15];
            if (zzabdVar2 == null) {
                jArr2[i15] = new long[0];
            } else {
                int[] iArr = zzabdVar2.zzb;
                jArr2[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j10 = zzabdVar2.zza.zza(iArr[i16]).zzj;
                    long[] jArr3 = jArr2[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i16] = j10;
                }
                Arrays.sort(jArr2[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr5 = jArr2[i17];
            jArr4[i17] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgyh zzgyhVarZza = zzgzb.zzc(zzgzg.zzb()).zzb(2).zza();
        int i18 = 0;
        while (i18 < 2) {
            int length = jArr2[i18].length;
            if (length <= i10) {
                i11 = i12;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr6 = jArr2[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = i12;
                    long[][] jArr7 = jArr2;
                    long j11 = jArr6[i19];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i19] = dLog;
                    i19++;
                    i12 = i20;
                    jArr2 = jArr7;
                }
                i11 = i12;
                jArr = jArr2;
                int i21 = length - 1;
                double d10 = dArr[i21] - dArr[i11];
                int i22 = i11;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22++;
                    zzgyhVarZza.zze(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i18));
                    i10 = i10;
                }
            }
            i18++;
            i12 = i11;
            jArr2 = jArr;
            i10 = i10;
        }
        int i23 = i12;
        long[][] jArr8 = jArr2;
        zzgxm zzgxmVarZzq = zzgxm.zzq(zzgyhVarZza.zzt());
        for (int i24 = i23; i24 < zzgxmVarZzq.size(); i24++) {
            int iIntValue = ((Integer) zzgxmVarZzq.get(i24)).intValue();
            int i25 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i25;
            jArr4[iIntValue] = jArr8[iIntValue][i25];
            zzi(arrayList, jArr4);
        }
        for (int i26 = i23; i26 < 2; i26++) {
            if (arrayList.get(i26) != null) {
                long j12 = jArr4[i26];
                jArr4[i26] = j12 + j12;
            }
        }
        zzi(arrayList, jArr4);
        zzgxj zzgxjVar2 = new zzgxj();
        while (i23 < arrayList.size()) {
            zzgxj zzgxjVar3 = (zzgxj) arrayList.get(i23);
            zzgxjVar2.zzf(zzgxjVar3 == null ? zzgxm.zzi() : zzgxjVar3.zzi());
            i23++;
        }
        return zzgxjVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgxj zzgxjVar = (zzgxj) list.get(i11);
            if (zzgxjVar != null) {
                zzgxjVar.zzf(new zzzw(j10, jArr[i11]));
            }
        }
    }
}
