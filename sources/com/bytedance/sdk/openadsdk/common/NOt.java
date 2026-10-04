package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.prism.gaia.server.accounts.b;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private static String ZRu;

    public static String Ht() {
        return com.bytedance.sdk.component.utils.oK.Mm(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
    }

    public static String Mm() {
        try {
            if (!TextUtils.isEmpty(ZRu)) {
                return ZRu;
            }
            String strZRu = com.bytedance.sdk.openadsdk.core.Vor.ZRu("sdk_app_sha1", 259200000L);
            ZRu = strZRu;
            if (ZRu(strZRu)) {
                return ZRu;
            }
            String strZRu2 = com.bytedance.sdk.component.utils.mZ.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
            ZRu = strZRu2;
            if (!ZRu(strZRu2)) {
                return "";
            }
            String upperCase = ZRu.toUpperCase();
            ZRu = upperCase;
            com.bytedance.sdk.openadsdk.core.Vor.ZRu("sdk_app_sha1", upperCase);
            return ZRu;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String NOt() {
        return "1371";
    }

    public static String TFq() {
        return com.bytedance.sdk.openadsdk.core.Vor.NOt().Ht();
    }

    public static String ZRu() {
        return "open_news";
    }

    public static String mZ() {
        return BuildConfig.VERSION_NAME;
    }

    public static String uR() {
        return Yx.Mm();
    }

    public static String ZRu(Context context) {
        return com.bytedance.sdk.openadsdk.core.lp.ZRu(context);
    }

    private static boolean ZRu(String str) {
        String[] strArrSplit;
        if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(b.f166434b0)) != null && strArrSplit.length >= 20) {
            for (String str2 : strArrSplit) {
                if (!"00".equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
