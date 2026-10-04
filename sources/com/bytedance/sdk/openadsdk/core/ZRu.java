package com.bytedance.sdk.openadsdk.core;

import android.util.Base64;
import kotlin.text.X;

/* JADX INFO: loaded from: classes3.dex */
public final class ZRu {
    private static final String ZRu = mZ();
    private static final String NOt = WMI.uR().mZ();

    public static String NOt() {
        return new String(Base64.decode(NOt, 0)).substring(2);
    }

    public static String ZRu() {
        return new String(Base64.decode(ZRu, 0)).substring(2);
    }

    private static String mZ() {
        char[] cArr = {203, X.f218316r, 168, X.f218314p, 207, 148, 149, 178, 205, X.f218316r, 149, 166, 134, 178, 184, X.f218314p, 206, X.f218313o, 187, 178, 150, 185, X.f218309k, 166};
        char[] cArr2 = new char[24];
        for (int i10 = 23; i10 >= 0; i10--) {
            cArr2[23 - i10] = (char) (cArr[i10] ^ 255);
        }
        return new String(cArr2);
    }
}
