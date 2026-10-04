package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.collection.LruCacheKt;
import androidx.compose.foundation.layout.C1711w0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzash {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, t1.b.f239018p7, t1.b.f239076w7, 0, 0, 0};

    public static boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = new zzeu(8);
        int i10 = zzasg.zza(zzagiVar, zzeuVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        zzeuVar.zzh(0);
        int iZzB = zzeuVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb2.append("Unsupported form type: ");
        sb2.append(iZzB);
        zzeh.zze("WavHeaderReader", sb2.toString());
        return false;
    }

    public static zzasf zzb(zzagi zzagiVar) throws IOException {
        byte[] bArr;
        int i10;
        byte[] bArr2;
        int i11;
        zzeu zzeuVar = new zzeu(16);
        long j10 = zzd(1718449184, zzagiVar, zzeuVar).zzb;
        zzguk.zzi(j10 >= 16);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 16);
        zzeuVar.zzh(0);
        int iZzu = zzeuVar.zzu();
        int iZzu2 = zzeuVar.zzu();
        int iZzI = zzeuVar.zzI();
        int iZzI2 = zzeuVar.zzI();
        int iZzu3 = zzeuVar.zzu();
        int iZzu4 = zzeuVar.zzu();
        int i12 = ((int) j10) - 16;
        if (i12 > 0) {
            bArr = new byte[i12];
            zzagiVar.zzi(bArr, 0, i12);
            if (iZzu == 65534) {
                if (i12 == 24) {
                    zzeu zzeuVar2 = new zzeu(bArr);
                    zzeuVar2.zzu();
                    int iZzu5 = zzeuVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzu4).length() + String.valueOf(iZzu5).length() + 33 + 19);
                        C1711w0.a(sb2, "validBits ( ", iZzu5, ")  != bitsPerSample( ", iZzu4);
                        sb2.append(") are not supported");
                        throw zzat.zzc(sb2.toString());
                    }
                    int iZzI3 = zzeuVar2.zzI();
                    if (!zzft.zza(iZzI3, iZzu2)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzI3).length() + 57 + String.valueOf(iZzu2).length());
                        sb3.append("Channel mask ");
                        sb3.append(iZzI3);
                        sb3.append(" is invalid or does not match channel count ");
                        sb3.append(iZzu2);
                        throw zzat.zzc(sb3.toString());
                    }
                    int iZzu6 = zzeuVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzeuVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                    i11 = iZzI3;
                    bArr2 = bArr;
                    i10 = iZzu6;
                    zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
                    return new zzasf(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i11);
                }
                bArr2 = bArr;
                i10 = 65534;
            }
            i11 = 0;
            zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
            return new zzasf(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i11);
        }
        bArr = zzfm.zzb;
        i10 = iZzu;
        bArr2 = bArr;
        i11 = 0;
        zzagiVar.zzf((int) (zzagiVar.zzm() - zzagiVar.zzn()));
        return new zzasf(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2, i11);
    }

    public static Pair zzc(zzagi zzagiVar) throws IOException {
        zzagiVar.zzl();
        zzasg zzasgVarZzd = zzd(1684108385, zzagiVar, new zzeu(8));
        zzagiVar.zzf(8);
        return Pair.create(Long.valueOf(zzagiVar.zzn()), Long.valueOf(zzasgVarZzd.zzb));
    }

    private static zzasg zzd(int i10, zzagi zzagiVar, zzeu zzeuVar) throws IOException {
        zzasg zzasgVarZza = zzasg.zza(zzagiVar, zzeuVar);
        while (true) {
            int i11 = zzasgVarZza.zza;
            if (i11 == i10) {
                return zzasgVarZza;
            }
            B.a(new StringBuilder(String.valueOf(i11).length() + 28), "Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
            long j10 = zzasgVarZza.zzb;
            long j11 = 8 + j10;
            if ((1 & j10) != 0) {
                j11 = 9 + j10;
            }
            if (j11 > LruCacheKt.f86729a) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i11);
                throw zzat.zzc(sb2.toString());
            }
            zzagiVar.zzf((int) j11);
            zzasgVarZza = zzasg.zza(zzagiVar, zzeuVar);
        }
    }
}
