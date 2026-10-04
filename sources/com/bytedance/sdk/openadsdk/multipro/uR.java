package com.bytedance.sdk.openadsdk.multipro;

import android.support.v4.media.e;
import com.bytedance.sdk.openadsdk.core.WMI;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    public static String ZRu = "com.bytedance.openadsdk";
    public static String NOt = e.a(new StringBuilder("content://"), ZRu, ".TTMultiProvider");

    static {
        ZRu();
    }

    public static void ZRu() {
        if (WMI.ZRu() != null) {
            ZRu = WMI.ZRu().getPackageName();
            NOt = e.a(new StringBuilder("content://"), ZRu, ".TTMultiProvider");
        }
    }
}
