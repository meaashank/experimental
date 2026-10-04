package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class Mm {
    private static volatile Handler ZRu;

    public static Handler NOt() {
        if (ZRu == null) {
            synchronized (Mm.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public static Handler ZRu() {
        return com.bytedance.sdk.component.FA.ZRu.ZRu.ZRu().NOt();
    }
}
