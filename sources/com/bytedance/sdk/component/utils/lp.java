package com.bytedance.sdk.component.utils;

import C4.q;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C2564b;

/* JADX INFO: loaded from: classes2.dex */
public class lp {
    private static int NOt = 4;
    private static boolean ZRu = false;
    private static com.bytedance.sdk.component.ZRu mZ = null;
    private static String uR = "";

    public static void NOt() {
        ZRu = true;
        ZRu(3);
    }

    public static void ZRu(String str) {
        uR = str;
    }

    public static void mZ() {
        ZRu = false;
        ZRu(7);
    }

    public static boolean uR() {
        return ZRu;
    }

    public static void ZRu(int i10) {
        NOt = i10;
    }

    public static void NOt(String str) {
        if (ZRu) {
            ZRu("Logger", str);
        }
    }

    public static boolean ZRu() {
        return NOt <= 3;
    }

    public static String mZ(String str) {
        return TextUtils.isEmpty(uR) ? str : ZRu(C2564b.a(new StringBuilder("["), uR, "]-[", str, "]"));
    }

    public static void ZRu(String str, String str2) {
        if (mZ != null) {
            mZ(str);
        }
        if (ZRu && str2 != null && NOt <= 6) {
            Log.e(mZ(str), str2);
        }
    }

    public static String NOt(String str, String str2) {
        return TextUtils.isEmpty(uR) ? str : ZRu(androidx.concurrent.futures.a.a(str2, "]-[", str));
    }

    public static void ZRu(String str, String str2, String str3, Throwable th) {
        if (ZRu) {
            ZRu(NOt(str, str2), str3, th);
        }
    }

    public static void ZRu(String str, String str2, Throwable th) {
        if (mZ != null) {
            mZ(str);
        }
        if (ZRu) {
            if (!(str2 == null && th == null) && NOt <= 6) {
                Log.e(mZ(str), str2, th);
            }
        }
    }

    public static void ZRu(String str, Object... objArr) {
        if (mZ != null) {
            mZ(str);
            ZRu(objArr);
        }
        if (ZRu && objArr != null && NOt <= 6) {
            Log.e(mZ(str), ZRu(objArr));
        }
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
