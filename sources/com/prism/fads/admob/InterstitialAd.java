package com.prism.fads.admob;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.ump.FormError;
import com.prism.fads.admob.a;
import com.prism.fusionadsdkbase.AdRequest;
import com.prism.fusionadsdkbase.e;

/* JADX INFO: loaded from: classes5.dex */
public class InterstitialAd implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f162197c = "765-InterstitialAd";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.ads.interstitial.InterstitialAd f162198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f162199b;

    public class a implements a.InterfaceC0663a {
        public a() {
        }

        @Override // com.prism.fads.admob.a.InterfaceC0663a
        public void a(FormError formError) {
            if (formError != null) {
                StringBuilder sb2 = new StringBuilder("consentGatheringComplete exception. errorCode=");
                sb2.append(formError.getErrorCode());
                sb2.append(";message=");
                sb2.append(formError.getMessage());
            }
        }
    }

    public class b extends InterstitialAdLoadCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdRequest f162201a;

        public class a extends FullScreenContentCallback {
            public a() {
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdClicked() {
                super.onAdClicked();
                b.this.f162201a.f162362b.a();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                super.onAdDismissedFullScreenContent();
                b.this.f162201a.f162362b.b();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
                super.onAdFailedToShowFullScreenContent(adError);
                new StringBuilder("InterstitialAd load onError=").append(adError.getMessage());
                b.this.f162201a.f162362b.c(adError.getCode());
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                super.onAdImpression();
                b.this.f162201a.f162362b.d();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                super.onAdShowedFullScreenContent();
                b.this.f162201a.f162362b.g();
            }
        }

        public b(AdRequest adRequest) {
            this.f162201a = adRequest;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(@NonNull com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
            super.onAdLoaded(interstitialAd);
            interstitialAd.setFullScreenContentCallback(new a());
            InterstitialAd interstitialAd2 = InterstitialAd.this;
            interstitialAd2.f162198a = interstitialAd;
            this.f162201a.f162362b.f(interstitialAd2);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            StringBuilder sb2 = new StringBuilder("ad onAdFailedToLoad: ");
            sb2.append(loadAdError.getMessage());
            sb2.append(": code=");
            sb2.append(loadAdError.getCode());
            this.f162201a.f162362b.c(loadAdError.getCode());
        }
    }

    public void c(Context context, AdRequest adRequest) {
        Activity activity = (Activity) context;
        if (adRequest == null || adRequest.f162361a == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        com.google.android.gms.ads.AdRequest adRequestBuild = new AdRequest.Builder().build();
        new StringBuilder(">").append(adRequest.f162361a);
        com.google.android.gms.ads.interstitial.InterstitialAd.load(context, adRequest.f162361a, adRequestBuild, new b(adRequest));
    }

    @Override // com.prism.fusionadsdkbase.e
    public /* synthetic */ void destroy() {
    }

    @Override // com.prism.fusionadsdkbase.e
    public void load(Context context, com.prism.fusionadsdkbase.AdRequest adRequest) {
        if (com.prism.fads.admob.a.f(context).d()) {
            c(context, adRequest);
        } else {
            try {
                com.prism.fads.admob.a.f(context).e((Activity) context, new a());
            } catch (Exception unused) {
            }
            c(context, adRequest);
        }
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup, String str) {
        show(viewGroup);
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup) {
        com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.f162198a;
        if (interstitialAd != null) {
            interstitialAd.show((Activity) this.f162199b);
        }
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(Activity activity, T6.b bVar) {
    }
}
