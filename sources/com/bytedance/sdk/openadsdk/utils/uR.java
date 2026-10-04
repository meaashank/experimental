package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    public static String ZRu(String str) {
        if (!com.bytedance.sdk.component.utils.lp.uR() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.Mm mm = new com.bytedance.sdk.openadsdk.core.model.Mm(com.bytedance.sdk.openadsdk.core.Vor.NOt().sAl());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = mm.NOt().iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append("&");
                    sb2.append(mm.ZRu());
                } else {
                    sb2.append("?");
                    sb2.append(mm.ZRu());
                }
            }
        }
        return sb2.toString();
    }
}
