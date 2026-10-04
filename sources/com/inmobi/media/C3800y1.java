package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3800y1;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3800y1 extends E0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f153538M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final String f153539N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f153540O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f153541P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C3814z1 f153542Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3800y1(@NotNull Context context, @NotNull J placement, @Nullable AbstractC3715s0 abstractC3715s0) {
        super(context, placement, abstractC3715s0);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(placement, "placement");
        this.f153538M = "y1";
        this.f153539N = "InMobi";
        this.f153542Q = new C3814z1();
        placement.l();
        a(context, placement, abstractC3715s0);
    }

    public static final void c(C3800y1 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        N4 n42 = this$0.f151879j;
        if (n42 != null) {
            String TAG = this$0.f153538M;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n42).a(TAG, "start loading html ad");
        }
        this$0.s0();
    }

    public static final void e(C3800y1 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        try {
            if (this$0.Q() != 6) {
                if (this$0.Q() == 7) {
                    this$0.f153541P++;
                    return;
                }
                return;
            }
            this$0.f153541P++;
            this$0.d((byte) 7);
            N4 n42 = this$0.f151879j;
            if (n42 != null) {
                String TAG = this$0.f153538M;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n42).d(TAG, "AdUnit " + this$0 + " state - ACTIVE");
            }
            N4 n43 = this$0.f151879j;
            if (n43 != null) {
                ((O4) n43).c(this$0.f153539N, "Successfully displayed banner ad for placement Id : " + this$0.I());
            }
            AbstractC3715s0 abstractC3715s0R = this$0.r();
            if (abstractC3715s0R != null) {
                this$0.d(abstractC3715s0R);
            }
        } catch (Exception e10) {
            N4 n44 = this$0.f151879j;
            if (n44 != null) {
                String str = this$0.f153538M;
                ((O4) n44).b(str, jd.a(e10, O5.a(str, "TAG", "BannerAdUnit.onAdScreenDisplayed threw unexpected error: ")));
            }
        }
    }

    public static final void f(C3800y1 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        try {
            if (this$0.Q() == 4) {
                this$0.d((byte) 6);
                N4 n42 = this$0.f151879j;
                if (n42 != null) {
                    String TAG = this$0.f153538M;
                    kotlin.jvm.internal.G.o(TAG, "TAG");
                    ((O4) n42).d(TAG, "AdUnit " + this$0 + " state - RENDERED");
                }
            }
        } catch (Exception e10) {
            N4 n43 = this$0.f151879j;
            if (n43 != null) {
                String str = this$0.f153538M;
                ((O4) n43).b(str, jd.a(e10, O5.a(str, "TAG", "BannerAdUnit.onRenderViewVisible threw unexpected error: ")));
            }
        }
    }

    public static final void g(C3800y1 this$0) {
        LinkedList<C3561h> linkedListF;
        kotlin.jvm.internal.G.p(this$0, "this$0");
        if (this$0.b0()) {
            this$0.a(System.currentTimeMillis());
            C3604k0 c3604k0Y = this$0.y();
            if (c3604k0Y != null && (linkedListF = c3604k0Y.f()) != null) {
                int i10 = 0;
                for (Object obj : linkedListF) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        kotlin.collections.I.b0();
                        throw null;
                    }
                    this$0.B().add(Integer.valueOf(i10));
                    i10 = i11;
                }
            }
        }
        this$0.s0();
    }

    public boolean C0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "canProceedToLoad ", this));
        }
        if (f0()) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                String TAG = this.f153538M;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n43).b(TAG, "Some of the dependency libraries for Banner not found");
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        if (1 == Q() || 2 == Q()) {
            AbstractC3666o6.a((byte) 1, this.f153539N, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            N4 n44 = this.f151879j;
            if (n44 != null) {
                String TAG2 = this.f153538M;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                ((O4) n44).b(TAG2, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            }
            if (1 == Q()) {
                a((short) 2008);
            } else {
                a((short) 2011);
            }
            return false;
        }
        if (7 == Q()) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
            N4 n45 = this.f151879j;
            if (n45 != null) {
                String str2 = this.f153538M;
                StringBuilder sbA = O5.a(str2, "TAG", AbstractC3713rc.f153322j);
                sbA.append(I().l());
                ((O4) n45).b(str2, sbA.toString());
            }
            return false;
        }
        N4 n46 = this.f151879j;
        if (n46 != null) {
            ((O4) n46).c(this.f153539N, "Fetching a Banner ad for placement id: " + I());
        }
        e0();
        return true;
    }

    public final boolean D0() {
        return Q() == 7;
    }

    public final void E0() {
        Rc viewableAd;
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "onPause ", this));
        }
        byte bQ = Q();
        if (bQ == 4 || bQ == 6 || bQ == 7) {
            r rVarK = k();
            Context contextT = t();
            if (rVarK == null || contextT == null || (viewableAd = rVarK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 1);
        }
    }

    public final void F0() {
        Rc viewableAd;
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "onResume ", this));
        }
        byte bQ = Q();
        if (bQ == 4 || bQ == 6 || bQ == 7) {
            r rVarK = k();
            Context contextT = t();
            if (rVarK == null || contextT == null || (viewableAd = rVarK.getViewableAd()) == null) {
                return;
            }
            viewableAd.a(contextT, (byte) 0);
        }
    }

    public final void G0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        if (contextT != null) {
            C3657nb.a(contextT, this);
        }
    }

    public final void H0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String TAG = this.f153538M;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n42).a(TAG, "renderAdPostInternetCheck");
        }
        try {
            if (o0()) {
                return;
            }
            G0 g0S = s();
            g0S.getClass();
            g0S.f151963g = SystemClock.elapsedRealtime();
            d0();
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Runnable() { // from class: F5.m3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3800y1.g(this.f34532a);
                    }
                });
            }
        } catch (IllegalStateException e10) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                String TAG2 = this.f153538M;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                ((O4) n43).a(TAG2, "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    public final void I0() {
        Application application;
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        Context contextT = t();
        Activity activity = contextT instanceof Activity ? (Activity) contextT : null;
        if (activity == null || (application = activity.getApplication()) == null) {
            return;
        }
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // com.inmobi.media.E0
    public final byte J() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.E0
    public void c0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "load ", this));
        }
        if (C0()) {
            super.c0();
        }
    }

    public final void d(boolean z10) {
        N4 n42;
        N4 n43 = this.f151879j;
        if (n43 != null) {
            String str = this.f153538M;
            ((O4) n43).a(str, AbstractC3758v1.a(str, "TAG", "load ", this));
        }
        if (z10 && (n42 = this.f151879j) != null) {
            ((O4) n42).c(this.f153539N, "Initiating Banner refresh for placement id: " + I());
        }
        this.f153540O = z10;
        c0();
    }

    @Override // com.inmobi.media.E0
    public boolean f0() {
        N4 n42 = this.f151879j;
        if (n42 == null) {
            return false;
        }
        String str = this.f153538M;
        ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "missingPrerequisitesForAd ", this));
        return false;
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.Aa
    public void i(@NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onRenderViewVisible ", this));
        }
        super.i(renderView);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new Runnable() { // from class: F5.o3
                @Override // java.lang.Runnable
                public final void run() {
                    C3800y1.f(this.f34548a);
                }
            });
        }
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void j0() {
        if (p0()) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                String TAG = this.f153538M;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n42).a(TAG, "renderAd without internet check");
            }
            H0();
            return;
        }
        N4 n43 = this.f151879j;
        if (n43 != null) {
            String TAG2 = this.f153538M;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            ((O4) n43).a(TAG2, "renderAd");
        }
        a(new C3772w1(this), new C3786x1(this));
    }

    @Override // com.inmobi.media.E0
    public final void l(GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya) {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "handleRenderViewSignaledAdReady ", this));
        }
        super.l(gestureDetectorOnGestureListenerC3809ya);
        if (b0() && this.f151876g.indexOf(gestureDetectorOnGestureListenerC3809ya) > 0 && Q() == 6) {
            b((byte) 1);
            GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya2 = (GestureDetectorOnGestureListenerC3809ya) this.f151876g.get(A());
            if (gestureDetectorOnGestureListenerC3809ya2 != null) {
                gestureDetectorOnGestureListenerC3809ya2.a(true);
                return;
            }
            return;
        }
        if (Q() != 2) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                String str2 = this.f153538M;
                StringBuilder sbA = O5.a(str2, "TAG", "AdUnit is not in available state, ignoring the ad ready signal - ");
                sbA.append((int) Q());
                ((O4) n43).a(str2, sbA.toString());
                return;
            }
            return;
        }
        b((byte) 1);
        d((byte) 4);
        N4 n44 = this.f151879j;
        if (n44 != null) {
            String TAG = this.f153538M;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n44).d(TAG, "AdUnit " + this + " state - READY");
        }
        G0 g0S = s();
        g0S.getClass();
        g0S.f151965i = SystemClock.elapsedRealtime();
        u0();
        z0();
        N4 n45 = this.f151879j;
        if (n45 != null) {
            ((O4) n45).c(this.f153539N, "Successfully loaded Banner ad markup in the WebView for placement id: " + I());
        }
        AbstractC3715s0 abstractC3715s0R = r();
        if (abstractC3715s0R != null) {
            f(abstractC3715s0R);
        } else {
            N4 n46 = this.f151879j;
            if (n46 != null) {
                String TAG2 = this.f153538M;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                ((O4) n46).b(TAG2, "AdUnit listener is null");
            }
        }
        i();
    }

    @Override // com.inmobi.media.E0
    public final HashMap o() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "adSpecificRequestParams getter ", this));
        }
        HashMap map = new HashMap();
        map.put("u-rt", this.f153540O ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        map.put("mk-ad-slot", I().a());
        return map;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        kotlin.jvm.internal.G.p(activity, "activity");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onActivityCreated ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onActivityDestroyed ", this));
        }
        Context contextT = t();
        if (kotlin.jvm.internal.G.g(contextT, activity)) {
            kotlin.jvm.internal.G.n(contextT, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) contextT).getApplication().unregisterActivityLifecycleCallbacks(this);
            g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onActivityPaused ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onActivityResumed ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        kotlin.jvm.internal.G.p(activity, "activity");
        kotlin.jvm.internal.G.p(outState, "outState");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onActivitySaveInstanceState ", this));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onActivityStarted ", this));
        }
        if (kotlin.jvm.internal.G.g(t(), activity)) {
            F0();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onActivityStopped ", this));
        }
        if (kotlin.jvm.internal.G.g(t(), activity)) {
            E0();
        }
    }

    @Override // com.inmobi.media.E0
    @NotNull
    public String q() {
        return "banner";
    }

    @Override // com.inmobi.media.E0
    @Nullable
    public GestureDetectorOnGestureListenerC3809ya w() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "htmlAdContainer getter ", this));
        }
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809yaW = super.w();
        if (I().p() && gestureDetectorOnGestureListenerC3809yaW != null) {
            gestureDetectorOnGestureListenerC3809yaW.e();
        }
        return gestureDetectorOnGestureListenerC3809yaW;
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void a(boolean z10, @NotNull InMobiAdRequestStatus status) {
        AbstractC3715s0 abstractC3715s0R;
        kotlin.jvm.internal.G.p(status, "status");
        super.a(z10, status);
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).c(str, AbstractC3758v1.a(str, "TAG", "onDidParseAfterFetch ", this));
        }
        N4 n43 = this.f151879j;
        if (n43 != null) {
            ((O4) n43).c(this.f153539N, "Banner ad fetch successful for placement id: " + I());
        }
        if (Q() != 2 || (abstractC3715s0R = r()) == null) {
            return;
        }
        e(abstractC3715s0R);
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    public void b() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "closeAll ", this));
        }
    }

    @Override // com.inmobi.media.E0
    public final void b(GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya, short s10) {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "handleRenderViewSignaledAdFailed ", this));
        }
        super.b(gestureDetectorOnGestureListenerC3809ya, s10);
        if (b0()) {
            int iIndexOf = this.f151876g.indexOf(gestureDetectorOnGestureListenerC3809ya);
            E0.a(this, iIndexOf, false, 2, null);
            if (iIndexOf > 0 && Q() == 6) {
                b((byte) 1);
                GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya2 = (GestureDetectorOnGestureListenerC3809ya) this.f151876g.get(A());
                if (gestureDetectorOnGestureListenerC3809ya2 != null) {
                    gestureDetectorOnGestureListenerC3809ya2.a(false);
                }
            }
        }
        if (Q() == 2) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).c(this.f153539N, "Failed to load the Banner markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.E0
    public void g() {
        this.f153542Q.f153666a = false;
        super.g();
    }

    @Override // com.inmobi.media.Aa
    public synchronized void d(@NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        try {
            kotlin.jvm.internal.G.p(renderView, "renderView");
            N4 n42 = this.f151879j;
            if (n42 != null) {
                String str = this.f153538M;
                ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "onAdScreenDismissed ", this));
            }
            super.d(renderView);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Runnable() { // from class: F5.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3800y1.d(this.f34524a);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final void a(C3800y1 this$0, GestureDetectorOnGestureListenerC3809ya renderView, int i10) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(renderView, "$renderView");
        int iIndexOf = this$0.f151876g.indexOf(renderView);
        try {
            AbstractC3715s0 abstractC3715s0R = this$0.r();
            N4 n42 = this$0.f151879j;
            if (n42 != null) {
                String TAG = this$0.f153538M;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n42).c(TAG, "callback onShowNextPodAd");
            }
            if (abstractC3715s0R != null) {
                abstractC3715s0R.a(i10, iIndexOf, renderView);
            }
        } catch (Exception unused) {
            this$0.b(iIndexOf, false);
            this$0.f(iIndexOf);
        }
    }

    public static final void d(C3800y1 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        try {
            if (this$0.Q() == 7) {
                int i10 = this$0.f153541P - 1;
                this$0.f153541P = i10;
                if (i10 == 0) {
                    this$0.d((byte) 6);
                    AbstractC3715s0 abstractC3715s0R = this$0.r();
                    if (abstractC3715s0R != null) {
                        abstractC3715s0R.b();
                    }
                }
            }
        } catch (Exception e10) {
            N4 n42 = this$0.f151879j;
            if (n42 != null) {
                String str = this$0.f153538M;
                ((O4) n42).b(str, jd.a(e10, O5.a(str, "TAG", "BannerAdUnit.onAdScreenDismissed threw unexpected error: ")));
            }
        }
    }

    @Override // com.inmobi.media.Aa
    public synchronized void e(@NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        try {
            kotlin.jvm.internal.G.p(renderView, "renderView");
            N4 n42 = this.f151879j;
            if (n42 != null) {
                String str = this.f153538M;
                ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "onAdScreenDisplayed ", this));
            }
            super.e(renderView);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Runnable() { // from class: F5.n3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3800y1.e(this.f34537a);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    @e.g0
    public void a(int i10, @NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str = this.f153538M;
            ((O4) n42).a(str, AbstractC3758v1.a(str, "TAG", "loadPodAd ", this));
        }
        if (B().contains(Integer.valueOf(i10)) && i10 > this.f151876g.indexOf(renderView)) {
            g(i10);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Runnable() { // from class: F5.q3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3800y1.c(this.f34565a);
                    }
                });
                return;
            }
            return;
        }
        N4 n43 = this.f151879j;
        if (n43 != null) {
            String TAG = this.f153538M;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n43).a(TAG, "No more ads present in pod adSet or current adSet is not pod adSet");
        }
        ArrayList arrayList = this.f151876g;
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = (GestureDetectorOnGestureListenerC3809ya) arrayList.get(arrayList.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3809ya != null) {
            gestureDetectorOnGestureListenerC3809ya.a(false);
        }
    }

    public final void e(@Nullable String str) {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String str2 = this.f153538M;
            ((O4) n42).c(str2, AbstractC3758v1.a(str2, "TAG", "setAdSize ", this));
        }
        J jI = I();
        kotlin.jvm.internal.G.m(str);
        jI.a(str);
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    @e.g0
    public void a(final int i10, @NotNull final GestureDetectorOnGestureListenerC3809ya renderView, @Nullable Context context) {
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya;
        kotlin.jvm.internal.G.p(renderView, "renderView");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String TAG = this.f153538M;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n42).a(TAG, "showPodAdAtIndex " + this + " index - " + i10);
        }
        if (!b0()) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                String TAG2 = this.f153538M;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                ((O4) n43).b(TAG2, "Cannot show an pod ad as isPod is not set.");
            }
            ArrayList arrayList = this.f151876g;
            GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya2 = (GestureDetectorOnGestureListenerC3809ya) arrayList.get(arrayList.indexOf(renderView));
            if (gestureDetectorOnGestureListenerC3809ya2 != null) {
                gestureDetectorOnGestureListenerC3809ya2.b(false);
                return;
            }
            return;
        }
        N4 n44 = this.f151879j;
        if (n44 != null) {
            String str = this.f153538M;
            ((O4) n44).c(str, AbstractC3758v1.a(str, "TAG", "isInValidShowPodIndex ", this));
        }
        if (B().contains(Integer.valueOf(i10)) && i10 > this.f151876g.indexOf(renderView) && this.f151876g.get(i10) != null && ((gestureDetectorOnGestureListenerC3809ya = (GestureDetectorOnGestureListenerC3809ya) this.f151876g.get(i10)) == null || gestureDetectorOnGestureListenerC3809ya.f153635p0)) {
            super.a(i10, renderView, context);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Runnable() { // from class: F5.p3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3800y1.a(this.f34556a, renderView, i10);
                    }
                });
                return;
            }
            return;
        }
        N4 n45 = this.f151879j;
        if (n45 != null) {
            String TAG3 = this.f153538M;
            kotlin.jvm.internal.G.o(TAG3, "TAG");
            ((O4) n45).b(TAG3, "Cannot show an pod ad with invalid index passed");
        }
        ArrayList arrayList2 = this.f151876g;
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya3 = (GestureDetectorOnGestureListenerC3809ya) arrayList2.get(arrayList2.indexOf(renderView));
        if (gestureDetectorOnGestureListenerC3809ya3 != null) {
            gestureDetectorOnGestureListenerC3809ya3.b(false);
        }
    }

    @Override // com.inmobi.media.Aa
    public void a(@NotNull EnumC3675p1 audioStatusInternal) {
        kotlin.jvm.internal.G.p(audioStatusInternal, "audioStatusInternal");
        AbstractC3715s0 abstractC3715s0R = r();
        if (abstractC3715s0R != null) {
            abstractC3715s0R.a(audioStatusInternal);
        }
        C3814z1 c3814z1 = this.f153542Q;
        c3814z1.getClass();
        if (!c3814z1.f153666a && audioStatusInternal == EnumC3675p1.f153254e) {
            c3814z1.f153666a = true;
            J4 j42 = J4.f152122c;
            j42.f151896a = System.currentTimeMillis();
            j42.f151897b++;
        }
    }

    @Override // com.inmobi.media.Aa
    public void a(boolean z10) {
        J4 j42 = J4.f152122c;
        Context contextD = C3657nb.d();
        if (contextD == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = K5.f152164b;
        K5 k5A = J5.a(contextD, "banner_audio_pref_file");
        int i10 = k5A.f152165a.getInt("user_mute_count", 0);
        k5A.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1);
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.Aa
    public void a(@NotNull GestureDetectorOnGestureListenerC3809ya renderView, boolean z10) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        super.a(renderView, z10);
        byte bQ = Q();
        if (bQ != 4 && bQ != 6) {
            if (bQ == 7) {
                renderView.a(z10, Q() == 7 ? z10 ? (short) 2224 : (short) 2223 : (short) 2227);
                return;
            }
            return;
        }
        byte bQ2 = Q();
        if (bQ2 == 4) {
            s = z10 ? (short) 2220 : (short) 2219;
        } else if (bQ2 == 6) {
            s = z10 ? (short) 2222 : (short) 2221;
        }
        m0();
        renderView.a(z10, s);
    }
}
