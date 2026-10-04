package com.google.android.gms.internal.ads;

import androidx.collection.LruCacheKt;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbgp {
    public static void zza(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzb(i10, zze(strArr, 0, length), zzc(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzb(i10, jZze, zzc(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            long jZza = zzbgm.zza(strArr[i12 - 1]);
            long jZza2 = zzbgm.zza(strArr[i12 + 5]);
            String strZzc = zzc(strArr, i12, 6);
            jZze = (((jZza2 + LruCacheKt.f86729a) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + LruCacheKt.f86729a) % 1073807359) * zzd(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzb(i10, jZze, strZzc, length2, priorityQueue);
            i12++;
        }
    }

    @e.f0
    public static void zzb(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzbgo zzbgoVar = new zzbgo(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzbgo) priorityQueue.peek()).zzc <= zzbgoVar.zzc && ((zzbgo) priorityQueue.peek()).zza <= zzbgoVar.zza)) && !priorityQueue.contains(zzbgoVar)) {
            priorityQueue.add(zzbgoVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    @e.f0
    public static String zzc(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i12 - 1;
            if (i10 >= i14) {
                sb2.append(strArr[i14]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    @e.f0
    public static long zzd(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return (i10 & 1) == 0 ? zzd(j11, i11) % 1073807359 : ((zzd(j11, i11) % 1073807359) * j10) % 1073807359;
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long jZza = (((long) zzbgm.zza(strArr[0])) + LruCacheKt.f86729a) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jZza = (((((long) zzbgm.zza(strArr[i12])) + LruCacheKt.f86729a) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
