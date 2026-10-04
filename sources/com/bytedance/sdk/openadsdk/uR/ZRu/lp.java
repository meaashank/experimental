package com.bytedance.sdk.openadsdk.uR.ZRu;

import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.xY;

/* JADX INFO: loaded from: classes3.dex */
class lp implements com.bytedance.sdk.openadsdk.edo.mZ.NOt {
    public static final lp ZRu = new lp();

    private lp() {
    }

    @Override // com.bytedance.sdk.openadsdk.edo.mZ.NOt
    public void ZRu(com.bytedance.sdk.openadsdk.edo.NOt nOt) {
        ZRu(nOt, false);
    }

    @Override // com.bytedance.sdk.openadsdk.edo.mZ.NOt
    public void ZRu(final com.bytedance.sdk.openadsdk.edo.NOt nOt, final boolean z10) {
        ZRu(new com.bytedance.sdk.component.FA.FA("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.uR.ZRu.lp.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.edo.ZRu.mZ logStats = nOt.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu zRu = new com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.ZRu(xY.ZRu(), logStats.ZRu());
                    zRu.mZ((byte) 0);
                    zRu.NOt(z10 ? (byte) 2 : (byte) 3);
                    zRu.ZRu((byte) 1);
                    if (com.bytedance.sdk.component.Ht.ZRu.NOt.NOt()) {
                        uR.ZRu(WMI.ZRu(), com.bytedance.sdk.openadsdk.multipro.NOt.mZ());
                    }
                    com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu(zRu);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void ZRu(com.bytedance.sdk.component.FA.FA fa2) {
        if (fa2 == null) {
            return;
        }
        if (!WD.Ht()) {
            WD.NOt(fa2, 5);
        } else {
            fa2.run();
        }
    }
}
