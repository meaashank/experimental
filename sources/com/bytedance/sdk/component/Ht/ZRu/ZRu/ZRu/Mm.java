package com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu;

import android.support.v4.media.e;
import com.bytedance.sdk.component.Ht.ZRu.FA;

/* JADX INFO: loaded from: classes2.dex */
public class Mm {
    public static String ZRu = "com.bytedance.openadsdk";
    public static String NOt = e.a(new StringBuilder("content://"), ZRu, ".TTMultiProvider");

    static {
        ZRu();
    }

    public static void ZRu() {
        if (FA.Mm().Ht() != null) {
            ZRu = FA.Mm().Ht().getPackageName();
            NOt = e.a(new StringBuilder("content://"), ZRu, ".TTMultiProvider");
        }
    }
}
