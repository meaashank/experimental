package com.bytedance.sdk.openadsdk.edo.NOt;

import com.bytedance.sdk.component.FA.mZ;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.edo.NOt;
import com.bytedance.sdk.openadsdk.edo.ZRu.uR;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements mZ {
    @Override // com.bytedance.sdk.component.FA.mZ
    public void ZRu(final com.bytedance.sdk.component.FA.NOt.ZRu zRu) {
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu();
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu("stats_sdk_thread_num", false, new NOt() { // from class: com.bytedance.sdk.openadsdk.edo.NOt.ZRu.1
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                com.bytedance.sdk.component.FA.NOt.ZRu zRu2;
                if (!WMI.uR().Jem() || (zRu2 = zRu) == null || zRu2.ZRu() == null) {
                    return null;
                }
                return uR.NOt().ZRu("stats_sdk_thread_num").NOt(zRu.ZRu().toString());
            }
        });
    }
}
