package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class H7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f152028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3499c7 f152029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N4 f152030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final N7 f152032e;

    public H7(Context context, AdConfig adConfig, C3499c7 mNativeAdContainer, C3820z7 dataModel, N4 n42) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(adConfig, "adConfig");
        kotlin.jvm.internal.G.p(mNativeAdContainer, "mNativeAdContainer");
        kotlin.jvm.internal.G.p(dataModel, "dataModel");
        this.f152029b = mNativeAdContainer;
        this.f152030c = n42;
        this.f152031d = "H7";
        N7 n72 = new N7(context, adConfig, mNativeAdContainer, dataModel, new G7(this), new F7(this), this, n42);
        this.f152032e = n72;
        N8 n82 = n72.f152316m;
        int i10 = mNativeAdContainer.f152753B;
        n82.getClass();
        N8.f152323f = i10;
    }

    public final T7 a(View view, ViewGroup parent, boolean z10, GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya) {
        T7 t7A;
        N4 n42;
        kotlin.jvm.internal.G.p(parent, "parent");
        View viewFindViewWithTag = view != null ? view.findViewWithTag("InMobiAdView") : null;
        T7 t72 = viewFindViewWithTag instanceof T7 ? (T7) viewFindViewWithTag : null;
        if (z10) {
            t7A = this.f152032e.a(t72, parent, gestureDetectorOnGestureListenerC3809ya);
        } else {
            N7 n72 = this.f152032e;
            n72.getClass();
            n72.f152318o = gestureDetectorOnGestureListenerC3809ya;
            T7 t7A2 = n72.a(t72, parent);
            if (!n72.f152317n) {
                C3708r7 c3708r7 = n72.f152306c.f153676f;
                if (t7A2 != null && c3708r7 != null) {
                    n72.b((ViewGroup) t7A2, c3708r7);
                }
            }
            t7A = t7A2;
        }
        if (t72 == null && (n42 = this.f152030c) != null) {
            String TAG = this.f152031d;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n42).b(TAG, "InMobiNative.getPrimaryView called with Non Native View.");
        }
        if (t7A != null) {
            t7A.setNativeStrandAd(this.f152029b);
        }
        if (t7A == null) {
            return t7A;
        }
        t7A.setTag("InMobiAdView");
        return t7A;
    }
}
