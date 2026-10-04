package Sb;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.h;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedAd f68165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f68166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.b f68167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RewardedAdLoadCallback f68168d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RewardedAdCallback f68169e = new b();

    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        public void a(LoadAdError loadAdError) {
            e.this.f68166b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        public void b() {
            e.this.f68166b.onAdLoaded();
            Mb.b bVar = e.this.f68167c;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    public class b extends RewardedAdCallback {
        public b() {
        }

        public void a() {
            e.this.f68166b.onAdClosed();
        }

        public void b(AdError adError) {
            e.this.f68166b.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        public void c() {
            e.this.f68166b.onAdOpened();
        }

        public void d(RewardItem rewardItem) {
            e.this.f68166b.onUserEarnedReward();
        }
    }

    public e(RewardedAd rewardedAd, h hVar) {
        this.f68165a = rewardedAd;
        this.f68166b = hVar;
    }

    public RewardedAdCallback c() {
        return this.f68169e;
    }

    public RewardedAdLoadCallback d() {
        return this.f68168d;
    }

    public void e(Mb.b bVar) {
        this.f68167c = bVar;
    }
}
