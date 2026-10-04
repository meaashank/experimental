package Pb;

import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.h;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RewardedAd f65700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f65701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.b f65702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RewardedAdLoadCallback f65703d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RewardedAdCallback f65704e = new b();

    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        public void a(int i10) {
            e.this.f65701b.onAdFailedToLoad(i10, "SCAR ad failed to show");
        }

        public void b() {
            e.this.f65701b.onAdLoaded();
            Mb.b bVar = e.this.f65702c;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    public class b extends RewardedAdCallback {
        public b() {
        }

        public void a() {
            e.this.f65701b.onAdClosed();
        }

        public void b(int i10) {
            e.this.f65701b.onAdFailedToShow(i10, "SCAR ad failed to show");
        }

        public void c() {
            e.this.f65701b.onAdOpened();
        }

        public void d(RewardItem rewardItem) {
            e.this.f65701b.onUserEarnedReward();
        }
    }

    public e(RewardedAd rewardedAd, h hVar) {
        this.f65700a = rewardedAd;
        this.f65701b = hVar;
    }

    public RewardedAdCallback c() {
        return this.f65704e;
    }

    public RewardedAdLoadCallback d() {
        return this.f65703d;
    }

    public void e(Mb.b bVar) {
        this.f65702c = bVar;
    }
}
