package com.google.ads.mediation.mintegral;

import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface MintegralSplashAdWrapper {
    void createAd(@NotNull String str, @NotNull String str2);

    void onDestroy();

    void preLoad();

    void preLoadByToken(@NotNull String str);

    void setExtraInfo(@NotNull JSONObject jSONObject);

    void setSplashLoadListener(@NotNull MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener);

    void setSplashShowListener(@NotNull MBSplashShowListener mBSplashShowListener);

    void show(@NotNull ViewGroup viewGroup);

    void show(@NotNull ViewGroup viewGroup, @NotNull String str);
}
