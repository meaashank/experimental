package com.bytedance.sdk.component.Ht.ZRu.Mm;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private static volatile Handler NOt = null;
    private static volatile HandlerThread ZRu = null;
    private static int mZ = 3000;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        ZRu = handlerThread;
        handlerThread.start();
    }

    public static int NOt() {
        if (mZ <= 0) {
            mZ = 3000;
        }
        return mZ;
    }

    public static Handler ZRu() {
        if (ZRu == null || !ZRu.isAlive()) {
            synchronized (ZRu.class) {
                try {
                    if (ZRu == null || !ZRu.isAlive()) {
                        HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                        ZRu = handlerThread;
                        handlerThread.start();
                        NOt = new Handler(ZRu.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (NOt == null) {
            synchronized (ZRu.class) {
                try {
                    if (NOt == null) {
                        NOt = new Handler(ZRu.getLooper());
                    }
                } finally {
                }
            }
        }
        return NOt;
    }
}
