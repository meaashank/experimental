package Vb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class d extends Vb.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f76419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f76420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterstitialAdLoadCallback f76421d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FullScreenContentCallback f76422e = new b();

    public class a extends InterstitialAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            d.this.f76420c.onAdLoaded();
            interstitialAd.setFullScreenContentCallback(d.this.f76422e);
            d.this.f76419b.c(interstitialAd);
            Mb.b bVar = d.this.f76418a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f76420c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    public class b extends FullScreenContentCallback {
        public b() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            d.this.f76420c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            d.this.f76420c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f76420c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            d.this.f76420c.onAdOpened();
        }
    }

    public d(g gVar, c cVar) {
        this.f76420c = gVar;
        this.f76419b = cVar;
    }

    public InterstitialAdLoadCallback e() {
        return this.f76421d;
    }
}
