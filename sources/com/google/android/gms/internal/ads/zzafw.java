package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafw {
    private final Map zza = new LinkedHashMap();

    public final void zza(zzafv zzafvVar) {
        long[] jArr = zzafvVar.zze;
        if (jArr.length > 0) {
            Map map = this.zza;
            if (map.containsKey(Long.valueOf(jArr[0]))) {
                return;
            }
            map.put(Long.valueOf(jArr[0]), zzafvVar);
        }
    }

    public final zzafv zzb() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zzafv zzafvVar : this.zza.values()) {
            arrayList.add(zzafvVar.zzb);
            arrayList2.add(zzafvVar.zzc);
            arrayList3.add(zzafvVar.zzd);
            arrayList4.add(zzafvVar.zze);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i10 = (int) length;
        zzguk.zze(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            int length2 = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i11, length2);
            i11 += length2;
        }
        return new zzafv(iArr3, zzhbm.zza((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zzhbm.zza((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zzhbm.zza((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public final int zzc() {
        return this.zza.size();
    }
}
