package com.prism.fusionadsdk.internal.config;

import android.support.v4.media.e;

/* JADX INFO: loaded from: classes6.dex */
public class AdPlaceItems {
    public String adNetworkName;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f162308id;
    public String type;

    public boolean isBanner() {
        return this.type.trim().equalsIgnoreCase("banner");
    }

    public boolean isNative() {
        return this.type.trim().equalsIgnoreCase("advance_native");
    }

    public boolean isNativeFakeInterstitial() {
        return this.type.trim().equalsIgnoreCase("native_fake_interstitial");
    }

    public boolean isNativeInterstitial() {
        return this.type.trim().equalsIgnoreCase("nativeIntersititials");
    }

    public boolean isOriginalInterstitialAd() {
        return this.type.trim().equalsIgnoreCase("interstitial");
    }

    public boolean isRewardedInterstitial() {
        return this.type.trim().equalsIgnoreCase("rewardedIntersititials");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{adNetworkName:");
        sb2.append(this.adNetworkName);
        sb2.append(",type:");
        sb2.append(this.type);
        sb2.append(",id:");
        return e.a(sb2, this.f162308id, ",");
    }
}
