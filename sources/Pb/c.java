package Pb;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.g;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterstitialAd f65693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f65694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mb.b f65695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdListener f65696d = new a();

    public class a extends AdListener {
        public a() {
        }

        public void a(int i10) {
            c.this.f65694b.onAdFailedToLoad(i10, "SCAR ad failed to load");
        }

        public void b() {
            c.this.f65694b.onAdLeftApplication();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            c.this.f65694b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            c.this.f65694b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            c.this.f65694b.onAdLoaded();
            Mb.b bVar = c.this.f65695c;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            c.this.f65694b.onAdOpened();
        }
    }

    public c(InterstitialAd interstitialAd, g gVar) {
        this.f65693a = interstitialAd;
        this.f65694b = gVar;
    }

    public AdListener c() {
        return this.f65696d;
    }

    public void d(Mb.b bVar) {
        this.f65695c = bVar;
    }
}
