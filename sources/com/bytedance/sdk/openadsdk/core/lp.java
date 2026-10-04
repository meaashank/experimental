package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import e.W;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class lp {
    private static String NOt;
    private static String ZRu;
    private static String mZ;
    private static boolean uR;

    private static void Ht(Context context) {
        Context contextUR = uR(context);
        if (contextUR == null) {
            return;
        }
        ZRu = mZ.ZRu(contextUR).NOt("did", (String) null);
    }

    public static String NOt(Context context) {
        if (NOt == null && !uR) {
            synchronized (lp.class) {
                try {
                    if (!uR) {
                        TFq(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return NOt;
    }

    @SuppressLint({"HardwareIds"})
    @W(anyOf = {"android.permission.ACCESS_WIFI_STATE"})
    private static void TFq(Context context) {
        Context contextUR;
        if (uR || (contextUR = uR(context)) == null) {
            return;
        }
        NOt = String.valueOf(Build.TIME);
        mZ = mZ.ZRu(contextUR).NOt("uuid", (String) null);
        uR = true;
    }

    public static String ZRu(Context context) {
        if (!TextUtils.isEmpty(ZRu)) {
            return ZRu;
        }
        Ht(context);
        return ZRu;
    }

    public static String mZ(Context context) {
        if (TextUtils.isEmpty(mZ) && !uR) {
            synchronized (lp.class) {
                try {
                    if (!uR) {
                        TFq(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mZ;
    }

    private static Context uR(Context context) {
        return context == null ? WMI.ZRu() : context;
    }

    public static void ZRu(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(ZRu)) {
            mZ.ZRu(context).ZRu("did", str);
            ZRu = str;
        }
        if (TextUtils.isEmpty(ZRu)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.Vor.mZ.NOt(ZRu);
        ZH.ZRu(ZRu);
    }

    public static String ZRu() {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = LocaleList.getDefault().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
