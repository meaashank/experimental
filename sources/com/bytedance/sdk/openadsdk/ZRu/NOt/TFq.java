package com.bytedance.sdk.openadsdk.ZRu.NOt;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener ZRu;

    public TFq(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.ZRu = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
    public void onError(final int i10, final String str) {
        if (this.ZRu == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.TFq.1
            @Override // java.lang.Runnable
            public void run() {
                TFq.this.ZRu.onError(i10, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.TFq.2
            @Override // java.lang.Runnable
            public void run() {
                TFq.this.ZRu.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
