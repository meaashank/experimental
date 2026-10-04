package Zb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.h;

/* JADX INFO: loaded from: classes7.dex */
public class f extends Zb.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f84462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f84463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RewardedAdLoadCallback f84464d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f84465e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FullScreenContentCallback f84466f = new c();

    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            f.this.f84463c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(f.this.f84466f);
            f.this.f84462b.c(rewardedAd);
            Mb.b bVar = f.this.f84455a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            f.this.f84463c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    public class b implements OnUserEarnedRewardListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            f.this.f84463c.onUserEarnedReward();
        }
    }

    public class c extends FullScreenContentCallback {
        public c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.f84463c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.f84463c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            f.this.f84463c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.f84463c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.f84463c.onAdOpened();
        }
    }

    public f(h hVar, e eVar) {
        this.f84463c = hVar;
        this.f84462b = eVar;
    }

    public RewardedAdLoadCallback e() {
        return this.f84464d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f84465e;
    }
}
