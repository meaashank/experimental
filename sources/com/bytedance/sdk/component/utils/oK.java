package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import p8.C5397a;

/* JADX INFO: loaded from: classes2.dex */
public class oK {
    public static boolean FA(Context context) {
        if (context == null) {
            return false;
        }
        int iMZ = mZ(context);
        return iMZ == 2 || iMZ == 3 || iMZ == 4 || iMZ == 5 || iMZ == 6;
    }

    public static boolean Ht(Context context) {
        return mZ(context) == 6;
    }

    public static String Mm(Context context) {
        int iMZ = mZ(context);
        return iMZ != 2 ? iMZ != 3 ? iMZ != 4 ? iMZ != 5 ? iMZ != 6 ? "mobile" : "5g" : "4g" : C5397a.f226370e : "3g" : "2g";
    }

    public static int NOt(Context context) {
        int iMZ = mZ(context);
        if (iMZ == 1) {
            return 0;
        }
        if (iMZ == 4) {
            return 1;
        }
        if (iMZ == 5) {
            return 4;
        }
        if (iMZ != 6) {
            return iMZ;
        }
        return 6;
    }

    public static boolean TFq(Context context) {
        return mZ(context) == 5;
    }

    public static boolean ZRu(Context context) {
        return mZ(context) != 0;
    }

    public static int mZ(Context context) {
        return xY.ZRu(context, 60000L);
    }

    public static boolean uR(Context context) {
        return mZ(context) == 4;
    }

    public static boolean ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(R3.a.f67725c) || str.startsWith(R3.a.f67726d);
    }
}
