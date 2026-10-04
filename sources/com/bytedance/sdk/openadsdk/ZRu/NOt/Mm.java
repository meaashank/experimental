package com.bytedance.sdk.openadsdk.ZRu.NOt;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class Mm implements Ht {
    private final PAGNativeAdInteractionListener ZRu;

    public Mm(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.ZRu = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.NOt.Ht
    public boolean NOt() {
        return this.ZRu != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.Mm.1
            @Override // java.lang.Runnable
            public void run() {
                if (Mm.this.ZRu != null) {
                    Mm.this.ZRu.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.NOt.Ht
    public void ZRu(PAGNativeAd pAGNativeAd) {
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.Mm.2
            @Override // java.lang.Runnable
            public void run() {
                if (Mm.this.ZRu != null) {
                    Mm.this.ZRu.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ZRu.NOt.Ht
    public void ZRu() {
        WD.ZRu(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ZRu.NOt.Mm.3
            @Override // java.lang.Runnable
            public void run() {
                if (Mm.this.ZRu != null) {
                    Mm.this.ZRu.onAdDismissed();
                }
            }
        });
    }
}
