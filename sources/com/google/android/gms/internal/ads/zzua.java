package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzua {

    @e.f0
    public static final zzgxw zza;

    static {
        zza = Build.VERSION.SDK_INT < 32 ? zzgxw.zzl(12, 252, 6396, 4) : zzgxw.zzn(12, 252, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }

    public static int zza(zzql zzqlVar) {
        int iZzb = zzb(zzqlVar.zze());
        if (iZzb != 0) {
            return iZzb;
        }
        int iZzb2 = zzb(zzqlVar.zzd());
        if (iZzb2 != 0) {
            return iZzb2;
        }
        return 12;
    }

    private static int zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (zza.contains(num)) {
                return iIntValue;
            }
        }
        return 0;
    }
}
