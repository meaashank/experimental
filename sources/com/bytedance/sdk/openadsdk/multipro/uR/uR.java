package com.bytedance.sdk.openadsdk.multipro.uR;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.NOt;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.WMI;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    private static String NOt(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static boolean ZRu() {
        return WMI.ZRu() == null;
    }

    public static void ZRu(String str, String str2, Boolean bool) {
        if (ZRu()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu.ZRu(NOt(str), str2, bool);
        } else {
            ZRu(NOt(str), str2, bool);
        }
    }

    public static String NOt(String str, String str2, String str3) {
        if (ZRu()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            return ZRu.NOt(NOt(str), str2, str3);
        }
        return ZRu.ZRu(WMI.ZRu(), NOt(str), str2, str3);
    }

    public static void ZRu(String str, String str2, Long l10) {
        if (ZRu()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu.ZRu(NOt(str), str2, l10);
        } else {
            ZRu(NOt(str), str2, l10);
        }
    }

    public static void ZRu(String str, String str2, String str3) {
        if (ZRu()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu.ZRu(NOt(str), str2, str3);
        } else {
            ZRu(NOt(str), str2, str3);
        }
    }

    public static void ZRu(String str, String str2, Integer num) {
        if (ZRu()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu.ZRu(NOt(str), str2, num);
        } else {
            ZRu(NOt(str), str2, num);
        }
    }

    public static int ZRu(String str, String str2, int i10) {
        if (ZRu()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            return ZRu.ZRu(NOt(str), str2, i10);
        }
        return ZRu.ZRu(WMI.ZRu(), NOt(str), str2, i10);
    }

    public static boolean ZRu(String str, String str2, boolean z10) {
        if (ZRu()) {
            return z10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            return ZRu.ZRu(NOt(str), str2, z10);
        }
        return ZRu.ZRu(WMI.ZRu(), NOt(str), str2, z10);
    }

    public static long ZRu(String str, String str2, long j10) {
        if (ZRu()) {
            return j10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            return ZRu.ZRu(NOt(str), str2, j10);
        }
        return ZRu.ZRu(WMI.ZRu(), NOt(str), str2, j10);
    }

    public static void ZRu(String str, String str2) {
        if (ZRu()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                ZRu.NOt(NOt(str), str2);
            } else {
                NOt.NOt(WMI.ZRu(), NOt(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void ZRu(String str) {
        if (ZRu()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
            ZRu.ZRu(NOt(str));
        } else {
            NOt.NOt(WMI.ZRu(), NOt(str));
        }
    }

    private static <T> void ZRu(String str, String str2, T t10) {
        String strZRu = ZRu.ZRu(str, str2);
        if (Vor.Mm(strZRu)) {
            NOt.mZ mZVarNOt = com.bytedance.sdk.component.NOt.ZRu(WMI.ZRu(), NOt(strZRu)).NOt();
            NOt.ZRu(mZVarNOt, str2, (Object) t10);
            mZVarNOt.apply();
        } else {
            SharedPreferences sharedPreferencesZRu = NOt.ZRu(WMI.ZRu(), NOt(strZRu));
            if (sharedPreferencesZRu == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesZRu.edit();
            NOt.ZRu(editorEdit, str2, t10);
            editorEdit.apply();
        }
    }
}
