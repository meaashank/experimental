package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements com.bytedance.sdk.openadsdk.ZRu.uR.NOt {
    private final AtomicBoolean NOt = new AtomicBoolean(false);
    private final PAGAppOpenAdInteractionListener ZRu;

    public TFq(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.ZRu = pAGAppOpenAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.uR.NOt
    public void NOt() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ZRu;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.uR.NOt
    public void ZRu() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ZRu;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.uR.NOt
    public void mZ() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener;
        if (this.NOt.getAndSet(true) || (pAGAppOpenAdInteractionListener = this.ZRu) == null) {
            return;
        }
        pAGAppOpenAdInteractionListener.onAdDismissed();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener = this.ZRu;
        if (pAGAppOpenAdInteractionListener != null) {
            pAGAppOpenAdInteractionListener.onAdClicked();
        }
    }
}
