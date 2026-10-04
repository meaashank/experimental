package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3527e7 extends AbstractC3513d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdEventListener f152850a;

    public C3527e7(NativeAdEventListener adEventListener) {
        kotlin.jvm.internal.G.p(adEventListener, "adEventListener");
        this.f152850a = adEventListener;
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(info, "info");
        this.f152850a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void b(Object obj, AdMetaInfo info) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(info, "info");
        this.f152850a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        this.f152850a.onAdImpression(ad2);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(status, "status");
        this.f152850a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.AbstractC3728t
    public final void a(Object obj, String data) {
        InMobiNative ad2 = (InMobiNative) obj;
        kotlin.jvm.internal.G.p(ad2, "ad");
        kotlin.jvm.internal.G.p(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", NativeAdEventListener.class, InMobiNative.class, String.class);
            kotlin.jvm.internal.G.o(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f152850a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
