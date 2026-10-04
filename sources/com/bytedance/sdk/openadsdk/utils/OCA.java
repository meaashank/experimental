package com.bytedance.sdk.openadsdk.utils;

import C4.q;
import android.support.v4.media.i;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class OCA {
    private static boolean ZRu = false;

    public static void NOt() {
        ZRu = false;
    }

    public static void ZRu() {
        ZRu = true;
    }

    private static String mZ(String str, String str2) {
        return TextUtils.isEmpty("PangleSDK-6405") ? str : ZRu(androidx.concurrent.futures.a.a(str2, "]-[", str));
    }

    public static void NOt(String str, String str2, Object... objArr) {
        NOt(mZ(str, str2), objArr);
    }

    public static void ZRu(String str, String str2, Object... objArr) {
        ZRu(mZ(str, str2), objArr);
    }

    public static void NOt(String str, String str2) {
        if (ZRu && str2 != null) {
            Log.e(ZRu(str), str2);
        }
    }

    public static void ZRu(String str, String str2) {
        if (ZRu && str2 != null) {
            Log.d(ZRu(str), str2);
        }
    }

    public static void NOt(String str, Object... objArr) {
        if (ZRu && objArr != null) {
            Log.e(ZRu(str), ZRu(objArr));
        }
    }

    public static void ZRu(String str, Object... objArr) {
        if (ZRu && objArr != null) {
            Log.d(ZRu(str), ZRu(objArr));
        }
    }

    private static String ZRu(String str) {
        return TextUtils.isEmpty("PangleSDK-6405") ? str : ZRu(i.a("[PangleSDK-6405]-[", str, "]"));
    }

    private static String ZRu(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(q.f17581a);
            }
            return sb2.toString();
        }
        return "";
    }
}
