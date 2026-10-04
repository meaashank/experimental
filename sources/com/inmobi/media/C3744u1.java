package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3744u1 extends AbstractC3730t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f153412a;

    public C3744u1(BannerAdEventListener adEventListener) {
        kotlin.jvm.internal.G.p(adEventListener, "adEventListener");
        this.f153412a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, Map params) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(params, "params");
        this.f153412a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void b(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(info, "info");
        this.f153412a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(info, "info");
        this.f153412a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        this.f153412a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(status, "status");
        this.f153412a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, String data) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            kotlin.jvm.internal.G.o(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f153412a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
