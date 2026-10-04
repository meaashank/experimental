package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzapu implements zzanu {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzapu(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzapk zzapkVar = (zzapk) list.get(i10);
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            jArr[i11] = zzapkVar.zzb;
            jArr[i11 + 1] = zzapkVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final long zzb(int i10) {
        zzguk.zza(i10 >= 0);
        long[] jArr = this.zzc;
        zzguk.zza(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzanu
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                zzapk zzapkVar = (zzapk) list.get(i10);
                zzcy zzcyVar = zzapkVar.zza;
                if (zzcyVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzapkVar);
                } else {
                    arrayList.add(zzcyVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, zzapt.zza);
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zzcx zzcxVarZza = ((zzapk) arrayList2.get(i12)).zza.zza();
            zzcxVarZza.zzf((-1) - i12, 1);
            arrayList.add(zzcxVarZza.zzr());
        }
        return arrayList;
    }
}
