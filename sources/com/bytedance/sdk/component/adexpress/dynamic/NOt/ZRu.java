package com.bytedance.sdk.component.adexpress.dynamic.NOt;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.uR.Mm;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public static int ZRu(Mm mm) {
        if (mm == null) {
            return 0;
        }
        String strHo = mm.Ho();
        String strRu = mm.ru();
        if (TextUtils.isEmpty(strRu) || TextUtils.isEmpty(strHo) || !strRu.equals("creative")) {
            return 0;
        }
        if (strHo.equals("shake")) {
            return 2;
        }
        if (strHo.equals("twist")) {
            return 3;
        }
        return strHo.equals("slide") ? 1 : 0;
    }
}
