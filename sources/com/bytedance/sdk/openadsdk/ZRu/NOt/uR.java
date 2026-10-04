package com.bytedance.sdk.openadsdk.ZRu.NOt;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.qF;

/* JADX INFO: loaded from: classes3.dex */
public class uR implements PAGNativeAdData {
    private final ZRu ZRu;

    public uR(ZRu zRu) {
        this.ZRu = zRu;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.ZH();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.aT();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.Ht();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.TFq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.mZ();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return qF.TFq(this.ZRu.ZRu) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.Mm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        ZRu zRu = this.ZRu;
        if (zRu != null) {
            return zRu.uR();
        }
        return null;
    }
}
