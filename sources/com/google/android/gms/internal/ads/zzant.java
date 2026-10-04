package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzant {
    public static void zza(zzanu zzanuVar, zzany zzanyVar, zzdu zzduVar) {
        for (int i10 = 0; i10 < zzanuVar.zza(); i10++) {
            long jZzb = zzanuVar.zzb(i10);
            List listZzc = zzanuVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i10 == zzanuVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzanuVar.zzb(i10 + 1) - zzanuVar.zzb(i10);
                if (jZzb2 > 0) {
                    zzduVar.zza(new zzanr(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
