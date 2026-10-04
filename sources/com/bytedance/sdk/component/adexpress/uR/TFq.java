package com.bytedance.sdk.component.adexpress.uR;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    public static boolean ZRu(String str) {
        if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
            return TextUtils.equals(str, "embeded_ad") || TextUtils.equals(str, "banner_ad");
        }
        return false;
    }
}
