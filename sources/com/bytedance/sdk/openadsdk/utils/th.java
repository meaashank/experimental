package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class th {
    private static String ZRu;

    public static String NOt() {
        if (TextUtils.isEmpty(ZRu)) {
            ZRu = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return ZRu;
    }

    public static boolean ZRu() {
        return com.bytedance.sdk.component.utils.lp.uR() && com.bytedance.sdk.openadsdk.core.Vor.NOt().WMI() && com.bytedance.sdk.openadsdk.core.Vor.NOt().qF();
    }

    public static boolean mZ() {
        return false;
    }

    public static String ZRu(String str) {
        try {
            if (!ZRu()) {
                return str;
            }
            String strOm = com.bytedance.sdk.openadsdk.core.Vor.NOt().om();
            if (TextUtils.isEmpty(strOm)) {
                return str;
            }
            Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(strOm)));
            return Uri.parse(str).buildUpon().appendQueryParameter(NOt(), strOm).appendQueryParameter("aid", "5001121").toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
