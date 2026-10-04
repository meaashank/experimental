package com.bytedance.sdk.component.adexpress.uR;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class Mm {
    public static boolean NOt(String str) {
        return com.bytedance.sdk.component.adexpress.uR.NOt() && ZRu(str);
    }

    public static boolean ZRu(String str) {
        return TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video");
    }
}
