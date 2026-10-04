package Sb;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAd f68158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f68159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.b f68160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdListener f68161d = new a();

    public class a extends AdListener {
        public a() {
        }

        public void a() {
            c.this.f68159b.onAdLeftApplication();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            c.this.f68159b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            c.this.f68159b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            c.this.f68159b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            c.this.f68159b.onAdLoaded();
            Mb.b bVar = c.this.f68160c;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            c.this.f68159b.onAdOpened();
        }
    }

    public c(InterstitialAd interstitialAd, g gVar) {
        this.f68158a = interstitialAd;
        this.f68159b = gVar;
    }

    public AdListener c() {
        return this.f68161d;
    }

    public void d(Mb.b bVar) {
        this.f68160c = bVar;
    }
}
