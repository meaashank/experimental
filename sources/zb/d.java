package Zb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class d extends Zb.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f84456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f84457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterstitialAdLoadCallback f84458d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f84459e = new b();

    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            d.this.f84457c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(d.this.f84459e);
            d.this.f84456b.c(interstitialAd);
            Mb.b bVar = d.this.f84455a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f84457c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f84457c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            d.this.f84457c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            d.this.f84457c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f84457c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            d.this.f84457c.onAdOpened();
        }
    }

    public d(g gVar, c cVar) {
        this.f84457c = gVar;
        this.f84456b = cVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f84458d;
    }
}
