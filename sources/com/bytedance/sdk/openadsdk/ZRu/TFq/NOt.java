package com.bytedance.sdk.openadsdk.ZRu.TFq;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class NOt implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener ZRu;

    public NOt(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.ZRu = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
    public void onError(final int i10, final String str) {
        if (this.ZRu == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.TFq.NOt.1
            @Override // java.lang.Runnable
            public void run() {
                if (NOt.this.ZRu != null) {
                    NOt.this.ZRu.onError(i10, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.TFq.NOt.2
            @Override // java.lang.Runnable
            public void run() {
                if (NOt.this.ZRu != null) {
                    NOt.this.ZRu.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
