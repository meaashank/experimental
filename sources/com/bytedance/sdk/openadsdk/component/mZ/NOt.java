package com.bytedance.sdk.openadsdk.component.mZ;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class NOt implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener ZRu;

    public NOt(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.ZRu = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.ZRu != null) {
            WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.mZ.NOt.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = NOt.this.ZRu;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
    public void onError(final int i10, final String str) {
        if (this.ZRu != null) {
            WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.mZ.NOt.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = NOt.this.ZRu;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}
