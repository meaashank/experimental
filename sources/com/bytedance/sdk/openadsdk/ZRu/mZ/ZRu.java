package com.bytedance.sdk.openadsdk.ZRu.mZ;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener ZRu;

    public ZRu(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.ZRu = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
    public void onError(final int i10, final String str) {
        if (this.ZRu == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.mZ.ZRu.1
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZRu != null) {
                    ZRu.this.ZRu.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.mZ.ZRu.2
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZRu != null) {
                    ZRu.this.ZRu.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
