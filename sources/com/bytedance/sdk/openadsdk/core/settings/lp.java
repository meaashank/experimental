package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lp {
    private static final AtomicInteger ZRu = new AtomicInteger(1);

    public static boolean ZRu() {
        return ZRu.get() == 1;
    }

    public static void ZRu(int i10) {
        boolean z10 = true;
        if (i10 == 1 || i10 == 2) {
            try {
                AtomicInteger atomicInteger = ZRu;
                if (atomicInteger.get() != i10) {
                    try {
                        atomicInteger.set(i10);
                    } catch (Throwable th) {
                        th = th;
                        com.bytedance.sdk.component.utils.lp.ZRu("SdkSwitch", th.getMessage());
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
            }
            if (z10) {
                Log.e("SdkSwitch", "switch status changed: " + ZRu());
                if (ZRu()) {
                    com.bytedance.sdk.openadsdk.uR.ZRu.uR.NOt();
                } else {
                    com.bytedance.sdk.openadsdk.uR.ZRu.uR.mZ();
                }
            }
        }
    }
}
