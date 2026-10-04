package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class Mm implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener ZRu;

    public Mm(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.ZRu = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.ZRu != null) {
            WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Mm.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = Mm.this.ZRu;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
    public void onError(final int i10, final String str) {
        if (this.ZRu != null) {
            WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Mm.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = Mm.this.ZRu;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i10, str);
                    }
                }
            });
        }
    }
}
