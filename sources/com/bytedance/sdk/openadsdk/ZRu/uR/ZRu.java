package com.bytedance.sdk.openadsdk.ZRu.uR;

import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements PAGAppOpenAdLoadListener {
    private final PAGAppOpenAdLoadListener ZRu;

    public ZRu(PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
        this.ZRu = pAGAppOpenAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
    public void onError(final int i10, final String str) {
        if (this.ZRu == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.uR.ZRu.1
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
    public void onAdLoaded(final PAGAppOpenAd pAGAppOpenAd) {
        if (this.ZRu == null) {
            return;
        }
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.uR.ZRu.2
            @Override // java.lang.Runnable
            public void run() {
                if (ZRu.this.ZRu != null) {
                    ZRu.this.ZRu.onAdLoaded(pAGAppOpenAd);
                }
            }
        });
    }
}
