package com.inmobi.media;

import android.os.Build;
import kotlin.text.C5011c;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qd {
    public static long a(String str) {
        String[] strArr = (String[]) new Regex("\\:").r(str, 0).toArray(new String[0]);
        byte[] bArr = new byte[6];
        for (int i10 = 0; i10 < 6; i10++) {
            try {
                String str2 = strArr[i10];
                C5011c.a(16);
                bArr[i10] = (byte) Integer.parseInt(str2, 16);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return ((((long) bArr[0]) & 255) << 40) | ((((long) bArr[3]) & 255) << 16) | (((long) bArr[5]) & 255) | ((((long) bArr[4]) & 255) << 8) | ((((long) bArr[2]) & 255) << 24) | ((((long) bArr[1]) & 255) << 32);
    }

    public static final boolean a() {
        if (!C3657nb.q()) {
            return false;
        }
        String[] strArr = {"android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION"};
        boolean zA = AbstractC3822z9.a(C3657nb.d(), "android.permission.ACCESS_FINE_LOCATION");
        boolean z10 = true;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!AbstractC3822z9.a(C3657nb.d(), strArr[i10])) {
                z10 = false;
            }
        }
        return z10 && (Build.VERSION.SDK_INT < 29 || zA);
    }
}
