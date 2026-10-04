package com.bytedance.sdk.openadsdk.edo;

import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.openadsdk.core.xY;
import com.bytedance.sdk.openadsdk.edo.ZRu.TFq;
import com.bytedance.sdk.openadsdk.uR.ZRu.Ht;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public static void ZRu() {
        if (WD.TFq()) {
            WD.ZRu(new FA("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.edo.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    ZRu.mZ();
                }
            });
        } else {
            mZ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZ() {
        com.bytedance.sdk.openadsdk.uR.ZRu.ZRu.NOt();
        TFq.uR();
        Ht.ZRu();
        xY.ZRu();
    }
}
