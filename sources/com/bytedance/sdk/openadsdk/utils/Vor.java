package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class Vor {
    private static String NOt(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.uR.uR.NOt(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void ZRu(String str) {
        ZRu("any_door_id", str);
    }

    public static String ZRu() {
        return NOt("any_door_id", null);
    }

    private static void ZRu(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.uR.uR.ZRu((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
