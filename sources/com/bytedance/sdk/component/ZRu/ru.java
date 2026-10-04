package com.bytedance.sdk.component.ZRu;

import B0.C0922f;
import android.support.v4.media.d;
import android.text.TextUtils;
import androidx.compose.runtime.changelist.j;

/* JADX INFO: loaded from: classes2.dex */
class ru {
    private static boolean ZRu;

    public static String ZRu(Throwable th) {
        return d.a(new StringBuilder("{\"code\":"), th instanceof qF ? ((qF) th).ZRu : 0, "}");
    }

    public static String ZRu(String str) {
        String strA;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (ZRu) {
            strA = C0922f.a(str, 1, 1);
        } else {
            strA = "";
        }
        String strConcat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!strA.isEmpty()) {
            return strConcat + "," + strA + "}";
        }
        return j.a(strConcat, "}");
    }

    public static String ZRu() {
        return "";
    }

    public static void ZRu(boolean z10) {
        ZRu = z10;
    }
}
