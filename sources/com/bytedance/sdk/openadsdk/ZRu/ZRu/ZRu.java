package com.bytedance.sdk.openadsdk.ZRu.ZRu;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener ZRu;

    public ZRu(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.ZRu = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
    public void onError(final int i10, final String str) {
        if (this.ZRu == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.ZRu.ZRu.1
            @Override // java.lang.Runnable
            public void run() {
                ZRu.this.ZRu.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.ZRu.ZRu.2
            @Override // java.lang.Runnable
            public void run() {
                ZRu.this.ZRu.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
