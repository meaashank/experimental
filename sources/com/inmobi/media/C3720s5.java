package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.s5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3720s5 extends AbstractC3706r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f153341a;

    public C3720s5(InterstitialAdEventListener adEventListener) {
        kotlin.jvm.internal.G.p(adEventListener, "adEventListener");
        this.f153341a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, Map params) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(params, "params");
        this.f153341a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void b(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(info, "info");
        this.f153341a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(info, "info");
        this.f153341a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        this.f153341a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(status, "status");
        this.f153341a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, String data) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            kotlin.jvm.internal.G.o(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f153341a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
