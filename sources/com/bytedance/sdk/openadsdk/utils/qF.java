package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class qF {
    public static void ZRu(com.bytedance.sdk.component.Vor.uR uRVar, String str) {
        HashMap map = new HashMap();
        map.put("Referer", TTAdConstant.REQUEST_HEAD_REFERER);
        uRVar.ZRu(str, map);
    }
}
