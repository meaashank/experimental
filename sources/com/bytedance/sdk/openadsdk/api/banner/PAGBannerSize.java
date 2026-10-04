package com.bytedance.sdk.openadsdk.api.banner;

import com.android.launcher3.LauncherAnimUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class PAGBannerSize {
    private final int NOt;
    private final int ZRu;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(LauncherAnimUtils.ALL_APPS_TRANSITION_MS, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.ZRu = i10;
        this.NOt = i11;
    }

    public int getHeight() {
        return this.NOt;
    }

    public int getWidth() {
        return this.ZRu;
    }
}
