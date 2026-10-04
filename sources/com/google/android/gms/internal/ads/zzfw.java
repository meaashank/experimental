package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfw {
    public final String zza;

    private zzfw(int i10, int i11, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzfw zza(zzeu zzeuVar) {
        String str;
        zzeuVar.zzk(2);
        int iZzs = zzeuVar.zzs();
        int i10 = iZzs >> 1;
        int i11 = iZzs & 1;
        int iZzs2 = zzeuVar.zzs() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iZzs2 | (i11 << 5);
        String str2 = IconCache.EMPTY_CLASS_NAME;
        String str3 = i10 < 10 ? ".0" : IconCache.EMPTY_CLASS_NAME;
        int length = str3.length() + 4;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i12).length();
        if (i12 < 10) {
            str2 = ".0";
        }
        StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.utils.a.a(str2, length + length2, length3));
        sb2.append(str);
        sb2.append(str3);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i12);
        return new zzfw(i10, i12, sb2.toString());
    }
}
