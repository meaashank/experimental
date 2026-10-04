package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final class zztz {
    public static boolean zza(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || !(i10 == 26 || i10 == 27)) {
            return i11 >= 33 && i10 == 30;
        }
        return true;
    }
}
