package com.google.ads.mediation.mintegral;

import android.content.Context;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface MintegralRewardedAdWrapper {
    void createAd(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void load();

    void playVideoMute(int i10);

    void setRewardVideoListener(@NotNull RewardVideoWithCodeListener rewardVideoWithCodeListener);

    void show();
}
