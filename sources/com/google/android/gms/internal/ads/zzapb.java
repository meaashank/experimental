package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzapb {
    @Nullable
    public static zzapc zza(@Nullable zzapc zzapcVar, @Nullable String[] strArr, Map map) {
        int length;
        int i10 = 0;
        if (zzapcVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzapc) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzapc zzapcVar2 = new zzapc();
                while (i10 < length2) {
                    zzapcVar2.zzr((zzapc) map.get(strArr[i10]));
                    i10++;
                }
                return zzapcVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzapcVar.zzr((zzapc) map.get(strArr[0]));
                return zzapcVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i10 < length) {
                    zzapcVar.zzr((zzapc) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return zzapcVar;
    }
}
