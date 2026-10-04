package com.prism.fads.admob;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.prism.fusionadsdkbase.AdRequest;
import com.prism.fusionadsdkbase.e;
import com.prism.fusionadsdkbase.g;

/* JADX INFO: loaded from: classes5.dex */
public class LjRewardInterstitialAd implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f162204b = "765-LjRewardInterstitialAd";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedInterstitialAd f162205a = null;

    public class a implements OnUserEarnedRewardListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T6.b f162206a;

        public a(T6.b bVar) {
            this.f162206a = bVar;
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            this.f162206a.a(new g(rewardItem.getType(), rewardItem.getAmount()));
        }
    }

    public class b extends RewardedInterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdRequest f162208a;

        public b(AdRequest adRequest) {
            this.f162208a = adRequest;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
            LjRewardInterstitialAd ljRewardInterstitialAd = LjRewardInterstitialAd.this;
            ljRewardInterstitialAd.f162205a = rewardedInterstitialAd;
            this.f162208a.f162362b.f(ljRewardInterstitialAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            new StringBuilder("onAdFailedToLoad: ").append(loadAdError.getMessage());
            LjRewardInterstitialAd.this.f162205a = null;
            this.f162208a.f162362b.c(loadAdError.getCode());
        }
    }

    @Override // com.prism.fusionadsdkbase.e
    public /* synthetic */ void destroy() {
    }

    @Override // com.prism.fusionadsdkbase.e
    public void load(Context context, AdRequest adRequest) {
        RewardedInterstitialAd.load(context, adRequest.f162361a, new AdRequest.Builder().build(), new b(adRequest));
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup) {
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup, String str) {
        show(viewGroup);
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(Activity activity, T6.b bVar) {
        RewardedInterstitialAd rewardedInterstitialAd = this.f162205a;
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.show(activity, new a(bVar));
        }
    }
}
