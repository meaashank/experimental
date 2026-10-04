package com.bytedance.sdk.openadsdk.component.mZ;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements com.bytedance.sdk.openadsdk.ZRu.mZ.NOt {
    private final PAGInterstitialAdInteractionListener ZRu;

    public ZRu(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.ZRu = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.mZ.NOt
    public void NOt() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ZRu;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.mZ.NOt
    public void ZRu() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ZRu;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.ZRu;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
