package com.google.ads.mediation.mintegral;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface MintegralBidNewInterstitialAdWrapper {
    void createAd(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void loadFromBid(@NotNull String str);

    void playVideoMute(int i10);

    void setExtraInfo(@NotNull JSONObject jSONObject);

    void setInterstitialVideoListener(@NotNull NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void showFromBid();
}
