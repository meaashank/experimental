package com.google.ads.mediation.mintegral;

import android.content.Context;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface MintegralNewInterstitialAdWrapper {
    void createAd(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void load();

    void playVideoMute(int i10);

    void setInterstitialVideoListener(@NotNull NewInterstitialWithCodeListener newInterstitialWithCodeListener);

    void show();
}
