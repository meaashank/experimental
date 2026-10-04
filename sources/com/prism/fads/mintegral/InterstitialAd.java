package com.prism.fads.mintegral;

import E6.c;
import T6.b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.prism.fusionadsdkbase.AdRequest;
import com.prism.fusionadsdkbase.e;

/* JADX INFO: loaded from: classes.dex */
public class InterstitialAd implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f162213f = "765-InterstitialAd";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f162214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T6.a f162215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MBNewInterstitialHandler f162216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f162217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f162218e;

    public class a implements NewInterstitialListener {
        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClicked(MBridgeIds mBridgeIds) {
            new StringBuilder("onAdClicked:").append(mBridgeIds);
            T6.a aVar = InterstitialAd.this.f162215b;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            new StringBuilder("onAdClose:").append(mBridgeIds);
            InterstitialAd.this.i();
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            new StringBuilder("onAdCloseWithNIReward:").append(mBridgeIds);
            InterstitialAd.this.i();
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onAdShow(MBridgeIds mBridgeIds) {
            new StringBuilder("onAdShow:").append(mBridgeIds);
            T6.a aVar = InterstitialAd.this.f162215b;
            if (aVar != null) {
                aVar.g();
                InterstitialAd.this.f162215b.d();
            }
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onEndcardShow(MBridgeIds mBridgeIds) {
            new StringBuilder("onEndcardShow:").append(mBridgeIds);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
            new StringBuilder("onLoadCampaignSuccess:").append(mBridgeIds);
            InterstitialAd.this.k("onLoadCampaignSuccess", true);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
            StringBuilder sb2 = new StringBuilder("onResourceLoadFail:");
            sb2.append(str);
            sb2.append("; ids=");
            sb2.append(mBridgeIds);
            InterstitialAd interstitialAd = InterstitialAd.this;
            if (interstitialAd.f162217d) {
                return;
            }
            interstitialAd.j(com.prism.fusionadsdkbase.a.f162366c, str);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
            new StringBuilder("onResourceLoadSuccess:").append(mBridgeIds);
            InterstitialAd.this.k("onResourceLoadSuccess", false);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onShowFail(MBridgeIds mBridgeIds, String str) {
            StringBuilder sb2 = new StringBuilder("onShowFail:");
            sb2.append(str);
            sb2.append("; ids=");
            sb2.append(mBridgeIds);
            InterstitialAd.this.j(com.prism.fusionadsdkbase.a.f162367d, str);
        }

        @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
        public void onVideoComplete(MBridgeIds mBridgeIds) {
            new StringBuilder("onVideoComplete:").append(mBridgeIds);
        }

        public a() {
        }
    }

    public static Activity g(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static boolean h(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    @Override // com.prism.fusionadsdkbase.e
    public /* synthetic */ void destroy() {
    }

    public final void i() {
        if (this.f162218e) {
            return;
        }
        this.f162218e = true;
        this.f162216c = null;
        T6.a aVar = this.f162215b;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void j(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("mintegral interstitial failed, code=");
        sb2.append(i10);
        sb2.append("; message=");
        sb2.append(str);
        T6.a aVar = this.f162215b;
        if (aVar != null) {
            aVar.c(i10);
        }
    }

    public final void k(String str, boolean z10) {
        MBNewInterstitialHandler mBNewInterstitialHandler;
        if (this.f162217d) {
            return;
        }
        if (z10 && ((mBNewInterstitialHandler = this.f162216c) == null || !mBNewInterstitialHandler.isReady())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(", mintegral interstitial not ready yet");
            return;
        }
        this.f162217d = true;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(", mintegral interstitial loaded");
        T6.a aVar = this.f162215b;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // com.prism.fusionadsdkbase.e
    public void load(Context context, AdRequest adRequest) {
        this.f162214a = context;
        this.f162215b = adRequest == null ? null : adRequest.f162362b;
        this.f162217d = false;
        this.f162218e = false;
        if (context == null || adRequest == null) {
            j(com.prism.fusionadsdkbase.a.f162364a, "context or adRequest is null");
            return;
        }
        c cVarH = c.h(c.k(adRequest.f162361a), MintegralAdsInitializer.getSdkConfig());
        if (!cVarH.e()) {
            j(com.prism.fusionadsdkbase.a.f162364a, "placementId or unitId is empty, adid=" + adRequest.f162361a);
            return;
        }
        if (!MintegralAdsInitializer.ensureInitialized(context, cVarH)) {
            j(com.prism.fusionadsdkbase.a.f162368e, "mintegral sdk is not initialized");
            return;
        }
        try {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            MBNewInterstitialHandler mBNewInterstitialHandler = new MBNewInterstitialHandler(context, cVarH.f28390c, cVarH.f28391d);
            this.f162216c = mBNewInterstitialHandler;
            mBNewInterstitialHandler.setInterstitialVideoListener(new a());
            StringBuilder sb2 = new StringBuilder("load mintegral interstitial, placementId=");
            sb2.append(cVarH.f28390c);
            sb2.append("; unitId=");
            sb2.append(cVarH.f28391d);
            this.f162216c.load();
        } catch (Throwable th) {
            j(com.prism.fusionadsdkbase.a.f162367d, "load mintegral interstitial exception:" + th.getMessage());
            th.getMessage();
        }
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup, String str) {
        show(viewGroup);
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(ViewGroup viewGroup) {
        Activity activityG = viewGroup != null ? g(viewGroup.getContext()) : null;
        if (activityG == null) {
            activityG = g(this.f162214a);
        }
        show(activityG, (b) null);
    }

    @Override // com.prism.fusionadsdkbase.e
    public void show(Activity activity, b bVar) {
        if (activity == null) {
            activity = g(this.f162214a);
        }
        if (h(activity)) {
            j(com.prism.fusionadsdkbase.a.f162364a, "activity is unavailable");
            return;
        }
        MBNewInterstitialHandler mBNewInterstitialHandler = this.f162216c;
        if (mBNewInterstitialHandler != null && mBNewInterstitialHandler.isReady()) {
            try {
                this.f162216c.show(activity);
                return;
            } catch (Throwable th) {
                j(com.prism.fusionadsdkbase.a.f162367d, "show mintegral interstitial exception:" + th.getMessage());
                th.getMessage();
                return;
            }
        }
        j(com.prism.fusionadsdkbase.a.f162369f, "mintegral interstitial is not ready");
    }
}
