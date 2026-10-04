package com.prism.fads.pungle;

import T6.b;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.prism.fusionadsdkbase.AdRequest;
import com.prism.fusionadsdkbase.e;

/* JADX INFO: loaded from: classes.dex */
public class InterstitialAd implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f162220c = "765-InterstitialAd";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f162221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PAGInterstitialAd f162222b;

    public class a implements PAGInterstitialAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdRequest f162223a;

        /* JADX INFO: renamed from: com.prism.fads.pungle.InterstitialAd$a$a, reason: collision with other inner class name */
        public class C0664a implements PAGInterstitialAdInteractionListener {
            public C0664a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdClicked() {
                a.this.f162223a.f162362b.a();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdDismissed() {
                a.this.f162223a.f162362b.b();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
            public void onAdShowed() {
                a.this.f162223a.f162362b.d();
            }
        }

        public a(AdRequest adRequest) {
            this.f162223a = adRequest;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            pAGInterstitialAd.setAdInteractionListener(new C0664a());
            InterstitialAd interstitialAd = InterstitialAd.this;
            interstitialAd.f162222b = pAGInterstitialAd;
            this.f162223a.f162362b.f(interstitialAd);
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Ht
        public void onError(int i10, String str) {
            StringBuilder sb2 = new StringBuilder("pagInterstitial Load Error, code:");
            sb2.append(i10);
            sb2.append("; message: ");
            sb2.append(str);
            this.f162223a.f162362b.c(i10);
        }
    }

    @Override // com.prism.fusionadsdkbase.e
    public /* synthetic */ void destroy() {
    }

    @Override // com.prism.fusionadsdkbase.e
    public void load(Context context, AdRequest adRequest) {
        PAGInterstitialAd.loadAd(adRequest.f162361a, new PAGInterstitialRequest(), new a(adRequest));
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup, String str) {
        show(viewGroup);
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup) {
        PAGInterstitialAd pAGInterstitialAd = this.f162222b;
        if (pAGInterstitialAd != null) {
            pAGInterstitialAd.show((Activity) this.f162221a);
        }
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(Activity activity, b bVar) {
    }
}
