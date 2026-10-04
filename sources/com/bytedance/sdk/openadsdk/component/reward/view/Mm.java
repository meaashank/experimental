package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class Mm extends com.bytedance.sdk.openadsdk.core.TFq.mZ {
    private final com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu ZRu;

    public Mm(com.bytedance.sdk.openadsdk.component.reward.ZRu.ZRu zRu) {
        super(zRu.Qg);
        this.ZRu = zRu;
        if (zRu.MO == null) {
            setFitsSystemWindows(true);
        }
    }

    public void ZRu(com.bytedance.sdk.openadsdk.component.reward.NOt.NOt nOt) {
        RFEndCardBackUpLayout rFEndCardBackUpLayoutFA;
        nOt.ZRu(this);
        if (this.ZRu.ZRu != 1 && (rFEndCardBackUpLayoutFA = nOt.FA()) != null) {
            addView(rFEndCardBackUpLayoutFA, new FrameLayout.LayoutParams(-1, -1));
        }
        ZRu(nOt.Vor(), this);
        ZRu(nOt.aT(), this);
    }

    private void ZRu(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
