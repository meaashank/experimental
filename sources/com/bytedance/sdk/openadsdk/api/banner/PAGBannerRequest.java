package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes3.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize ZRu;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.ZRu = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.ZRu;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.ZRu = pAGBannerSize;
    }
}
