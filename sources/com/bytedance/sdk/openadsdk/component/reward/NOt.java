package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.oK;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.WD;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends com.bytedance.sdk.component.FA.FA {
    private final List<? extends com.bytedance.sdk.component.FA.FA> ZRu;

    public NOt(String str, List<? extends com.bytedance.sdk.component.FA.FA> list) {
        super(str);
        this.ZRu = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.FA.FA> list;
        if (oK.mZ(WMI.ZRu()) != 0 && (list = this.ZRu) != null) {
            Iterator<? extends com.bytedance.sdk.component.FA.FA> it = list.iterator();
            while (it.hasNext()) {
                WD.ZRu(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.Mm.ZRu().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
