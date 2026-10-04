package com.google.android.gms.internal.ads;

import androidx.core.app.C2392o;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
public final class zzty implements zzto {
    public zzty(zztx zztxVar) {
    }

    public static int zza(int i10, int i11, int i12) {
        return zzhbj.zza(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    public static final int zzb(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = 250000;
        if (i12 == 0) {
            int iZza = zza(250000, i14, i13);
            int iZza2 = zza(750000, i14, i13);
            String str = zzfm.zza;
            return Math.max(iZza, Math.min(i10 * 4, iZza2));
        }
        if (i12 == 1) {
            return zzhbj.zza((((long) zzc(i11)) * 50000000) / 1000000);
        }
        if (i11 == 5) {
            i16 = C2392o.a.f111076f;
        } else if (i11 == 8) {
            i16 = 1000000;
            i11 = 8;
        }
        return zzhbj.zza((((long) i16) * ((long) (i15 != -1 ? zzhaz.zzb(i15, 8, RoundingMode.CEILING) : zzc(i11)))) / 1000000);
    }

    private static int zzc(int i10) {
        int iZzf = zzagl.zzf(i10);
        zzguk.zzi(iZzf != -2147483647);
        return iZzf;
    }
}
