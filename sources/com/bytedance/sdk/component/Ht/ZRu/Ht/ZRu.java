package com.bytedance.sdk.component.Ht.ZRu.Ht;

import com.bytedance.sdk.component.Ht.ZRu.FA;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private static volatile NOt ZRu;

    public static NOt ZRu() {
        if (ZRu == null) {
            synchronized (NOt.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new mZ(FA.Mm().Ht(), new Ht(FA.Mm().Ht()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }
}
