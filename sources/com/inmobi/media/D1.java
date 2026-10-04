package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nBannerUnifiedAdManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannerUnifiedAdManager.kt\ncom/inmobi/ads/controllers/BannerUnifiedAdManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n1#2:422\n*E\n"})
public final class D1 extends AbstractC3713rc {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final String f151837o = "InMobi";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f151838p = "D1";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private C3800y1 f151839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private C3800y1 f151840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private C3800y1 f151841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private C3800y1 f151842t;

    private final boolean I() {
        C3800y1 c3800y1 = this.f151841s;
        Byte bValueOf = c3800y1 != null ? Byte.valueOf(c3800y1.Q()) : null;
        N4 n4P = p();
        if (n4P != null) {
            String TAG = this.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P).c(TAG, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final int A() {
        AdConfig adConfigJ;
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "defaultRefreshInterval ", this));
        }
        E0 e0J = j();
        if (e0J == null || (adConfigJ = e0J.j()) == null) {
            return -1;
        }
        return adConfigJ.getDefaultRefreshInterval();
    }

    public final boolean B() {
        String TAG = this.f151838p;
        kotlin.jvm.internal.G.o(TAG, "TAG");
        kotlin.jvm.internal.G.g(this.f151841s, this.f151839q);
        String TAG2 = this.f151838p;
        kotlin.jvm.internal.G.o(TAG2, "TAG");
        kotlin.jvm.internal.G.g(this.f151842t, this.f151839q);
        String TAG3 = this.f151838p;
        kotlin.jvm.internal.G.o(TAG3, "TAG");
        kotlin.jvm.internal.G.g(this.f151841s, this.f151840r);
        String TAG4 = this.f151838p;
        kotlin.jvm.internal.G.o(TAG4, "TAG");
        kotlin.jvm.internal.G.g(this.f151842t, this.f151840r);
        String TAG5 = this.f151838p;
        kotlin.jvm.internal.G.o(TAG5, "TAG");
        C3800y1 c3800y1 = this.f151839q;
        if (c3800y1 != null) {
            c3800y1.D0();
        }
        C3800y1 c3800y12 = this.f151839q;
        if (c3800y12 != null) {
            c3800y12.Q();
        }
        Objects.toString(this.f151839q);
        String TAG6 = this.f151838p;
        kotlin.jvm.internal.G.o(TAG6, "TAG");
        C3800y1 c3800y13 = this.f151840r;
        if (c3800y13 != null) {
            c3800y13.D0();
        }
        C3800y1 c3800y14 = this.f151840r;
        if (c3800y14 != null) {
            c3800y14.Q();
        }
        Objects.toString(this.f151840r);
        C3800y1 c3800y15 = this.f151841s;
        if (c3800y15 != null) {
            return c3800y15.D0();
        }
        return false;
    }

    public final boolean C() {
        C3561h c3561hM;
        C3800y1 c3800y1 = this.f151841s;
        if (c3800y1 == null || (c3561hM = c3800y1.m()) == null) {
            return false;
        }
        return kotlin.jvm.internal.G.g(c3561hM.p(), "audio");
    }

    public boolean D() {
        return (this.f151839q == null || this.f151840r == null) ? false : true;
    }

    public final void E() {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).a(str, C1.a(str, "TAG", "pause ", this));
        }
        C3800y1 c3800y1 = this.f151841s;
        if (c3800y1 != null) {
            c3800y1.E0();
        }
    }

    public final void F() {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "registerLifeCycleCallbacks ", this));
        }
        C3800y1 c3800y1 = this.f151839q;
        if (c3800y1 != null) {
            c3800y1.G0();
        }
        C3800y1 c3800y12 = this.f151840r;
        if (c3800y12 != null) {
            c3800y12.G0();
        }
    }

    public final void G() throws IllegalStateException {
        C3800y1 c3800y1;
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).a(str, C1.a(str, "TAG", "render ", this));
        }
        C3800y1 c3800y12 = this.f151842t;
        if (c3800y12 == null) {
            throw new IllegalStateException(AbstractC3713rc.f153325m);
        }
        if (a(this.f151837o, c3800y12.I().toString())) {
            if (v() && (c3800y1 = this.f151842t) != null) {
                c3800y1.e((byte) 1);
            }
            a((byte) 8);
            c3800y12.j0();
        }
    }

    public final void H() {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).a(str, C1.a(str, "TAG", "resume ", this));
        }
        C3800y1 c3800y1 = this.f151841s;
        if (c3800y1 != null) {
            c3800y1.F0();
        }
    }

    public final void J() {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "swapAdUnits ", this));
        }
        C3800y1 c3800y1 = this.f151841s;
        if (c3800y1 == null) {
            this.f151841s = this.f151839q;
            this.f151842t = this.f151840r;
        } else if (c3800y1.equals(this.f151839q)) {
            this.f151841s = this.f151840r;
            this.f151842t = this.f151839q;
        } else if (c3800y1.equals(this.f151840r)) {
            this.f151841s = this.f151839q;
            this.f151842t = this.f151840r;
        }
    }

    public final void K() {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "unregisterLifeCycleCallbacks ", this));
        }
        C3800y1 c3800y1 = this.f151839q;
        if (c3800y1 != null) {
            c3800y1.I0();
        }
        C3800y1 c3800y12 = this.f151840r;
        if (c3800y12 != null) {
            c3800y12.I0();
        }
    }

    public final void a(@NotNull Context context, @NotNull I9 pubSettings, @NotNull String adSize, @NotNull String logType) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(pubSettings, "pubSettings");
        kotlin.jvm.internal.G.p(adSize, "adSize");
        kotlin.jvm.internal.G.p(logType, "logType");
        kotlin.jvm.internal.G.o(this.f151838p, "TAG");
        J jA = new H("banner").d(context instanceof Activity ? "activity" : "others").a(pubSettings.f152050a).c(pubSettings.f152051b).a(pubSettings.f152052c).a(adSize).a(pubSettings.f152053d).e(pubSettings.f152054e).b(pubSettings.f152055f).a();
        String str = pubSettings.f152054e;
        if (str != null) {
            N4 n4P = p();
            if (n4P != null) {
                ((O4) n4P).a();
            }
            EnumC3568h6 enumC3568h6 = C3558ga.f152942a;
            a(C3558ga.a(logType, str, false));
        }
        C3800y1 c3800y1 = this.f151839q;
        if (c3800y1 == null || this.f151840r == null) {
            this.f151839q = new C3800y1(context, jA, this);
            C3800y1 c3800y12 = new C3800y1(context, jA, this);
            this.f151840r = c3800y12;
            this.f151842t = this.f151839q;
            this.f151841s = c3800y12;
        } else {
            c3800y1.a(context, jA, this);
            C3800y1 c3800y13 = this.f151840r;
            if (c3800y13 != null) {
                c3800y13.a(context, jA, this);
            }
        }
        N4 n4P2 = p();
        if (n4P2 != null) {
            C3800y1 c3800y14 = this.f151839q;
            if (c3800y14 != null) {
                c3800y14.a(n4P2);
            }
            C3800y1 c3800y15 = this.f151840r;
            if (c3800y15 != null) {
                c3800y15.a(n4P2);
            }
            N4 n4P3 = p();
            if (n4P3 != null) {
                String TAG = this.f151838p;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n4P3).a(TAG, "adding mBannerAdUnit1 to reference tracker");
            }
            EnumC3568h6 enumC3568h62 = C3558ga.f152942a;
            C3800y1 c3800y16 = this.f151839q;
            kotlin.jvm.internal.G.m(c3800y16);
            C3558ga.a(c3800y16, p());
            N4 n4P4 = p();
            if (n4P4 != null) {
                String TAG2 = this.f151838p;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                ((O4) n4P4).a(TAG2, "adding mBannerAdUnit2 to reference tracker");
            }
            C3800y1 c3800y17 = this.f151840r;
            kotlin.jvm.internal.G.m(c3800y17);
            C3558ga.a(c3800y17, p());
        }
        WatermarkData watermarkDataT = t();
        if (watermarkDataT != null) {
            C3800y1 c3800y18 = this.f151839q;
            if (c3800y18 != null) {
                c3800y18.a(watermarkDataT);
            }
            C3800y1 c3800y19 = this.f151840r;
            if (c3800y19 != null) {
                c3800y19.a(watermarkDataT);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3713rc, com.inmobi.media.AbstractC3715s0
    public void b(@NotNull final AdMetaInfo info) {
        kotlin.jvm.internal.G.p(info, "info");
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "onAdFetchSuccess ", this));
        }
        d(info);
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C3800y1 c3800y1 = this.f151842t;
        if ((c3800y1 != null ? c3800y1.m() : null) == null) {
            N4 n4P2 = p();
            if (n4P2 != null) {
                String TAG = this.f151838p;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n4P2).b(TAG, "backgroundAdUnit ad object is null");
            }
            a((E0) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        N4 n4P3 = p();
        if (n4P3 != null) {
            String TAG2 = this.f151838p;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            ((O4) n4P3).a(TAG2, "Ad fetch successful, calling loadAd()");
        }
        super.b(info);
        s().post(new Runnable() { // from class: F5.l
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.D1.a(this.f34516a, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3713rc, com.inmobi.media.AbstractC3715s0
    public void c(@NotNull final AdMetaInfo info) {
        kotlin.jvm.internal.G.p(info, "info");
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "onAdLoadSucceeded ", this));
        }
        super.c(info);
        a((byte) 0);
        N4 n4P2 = p();
        if (n4P2 != null) {
            String TAG = this.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P2).a(TAG, "Ad load successful, providing callback");
        }
        s().post(new Runnable() { // from class: F5.j
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.D1.b(this.f34500a, info);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3713rc
    @Nullable
    public E0 j() {
        return I() ? this.f151841s : this.f151842t;
    }

    public final boolean x() {
        C3800y1 c3800y1;
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "canProceedForSuccess ", this));
        }
        if (this.f151841s != null && (c3800y1 = this.f151842t) != null) {
            c3800y1.Q();
        }
        return true;
    }

    public final boolean y() {
        C3800y1 c3800y1;
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "canScheduleRefresh ", this));
        }
        C3800y1 c3800y12 = this.f151842t;
        if (c3800y12 == null) {
            return false;
        }
        Byte bValueOf = Byte.valueOf(c3800y12.Q());
        if (bValueOf.byteValue() != 4 && bValueOf.byteValue() != 1 && bValueOf.byteValue() != 2 && ((c3800y1 = this.f151841s) == null || c3800y1.Q() != 7)) {
            return true;
        }
        N4 n4P2 = p();
        if (n4P2 != null) {
            String TAG = this.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P2).a(TAG, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void z() {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).a(str, C1.a(str, "TAG", "clear ", this));
        }
        K();
        C3800y1 c3800y1 = this.f151839q;
        if (c3800y1 != null) {
            c3800y1.g();
        }
        this.f151839q = null;
        C3800y1 c3800y12 = this.f151840r;
        if (c3800y12 != null) {
            c3800y12.g();
        }
        this.f151840r = null;
        a((N4) null);
        this.f151841s = null;
        this.f151842t = null;
        a((Boolean) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(D1 this$0, AdMetaInfo info) {
        kotlin.L0 l02;
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(info, "$info");
        N4 n4P = this$0.p();
        if (n4P != null) {
            String TAG = this$0.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P).a(TAG, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdLoadSucceeded(info);
            l02 = kotlin.L0.f217464a;
        } else {
            l02 = null;
        }
        if (l02 == null) {
            this$0.b((short) 2184);
        }
    }

    @Override // com.inmobi.media.AbstractC3713rc, com.inmobi.media.AbstractC3715s0
    public void b() {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "onAdDismissed ", this));
        }
        a((byte) 0);
        N4 n4P2 = p();
        if (n4P2 != null) {
            String TAG = this.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P2).d(TAG, "AdManager state - CREATED");
        }
        super.b();
    }

    private final void b(RelativeLayout relativeLayout) {
        J jI;
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).a(str, C1.a(str, "TAG", "displayInternal ", this));
        }
        C3800y1 c3800y1 = this.f151841s;
        if (c3800y1 == null) {
            return;
        }
        r rVarK = c3800y1.k();
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = rVarK instanceof GestureDetectorOnGestureListenerC3809ya ? (GestureDetectorOnGestureListenerC3809ya) rVarK : null;
        if (gestureDetectorOnGestureListenerC3809ya == null) {
            return;
        }
        Rc viewableAd = gestureDetectorOnGestureListenerC3809ya.getViewableAd();
        C3800y1 c3800y12 = this.f151841s;
        if (c3800y12 != null && (jI = c3800y12.I()) != null && jI.p()) {
            gestureDetectorOnGestureListenerC3809ya.e();
        }
        View viewD = viewableAd.d();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC3809ya.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            relativeLayout.addView(viewD, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewD, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D1 this$0, AdMetaInfo info) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(info, "$info");
        N4 n4P = this$0.p();
        if (n4P != null) {
            String TAG = this$0.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P).a(TAG, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacksL = this$0.l();
        if (publisherCallbacksL != null) {
            publisherCallbacksL.onAdFetchSuccessful(info);
            return;
        }
        N4 n4P2 = this$0.p();
        if (n4P2 != null) {
            String TAG2 = this$0.f151838p;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            ((O4) n4P2).b(TAG2, "callback null");
        }
    }

    @Override // com.inmobi.media.AbstractC3715s0
    @e.e0
    public void a(int i10, final int i11, @Nullable GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya) {
        ViewParent parent;
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "onShowNextPodAd ", this));
        }
        super.a(i10, i11, gestureDetectorOnGestureListenerC3809ya);
        N4 n4P2 = p();
        if (n4P2 != null) {
            String TAG = this.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P2).a(TAG, "on Show next pod ad index: " + i10);
        }
        if (gestureDetectorOnGestureListenerC3809ya != null) {
            try {
                parent = gestureDetectorOnGestureListenerC3809ya.getParent();
            } catch (Exception unused) {
                C3800y1 c3800y1 = this.f151841s;
                if (c3800y1 != null) {
                    c3800y1.f(i11);
                }
                C3800y1 c3800y12 = this.f151841s;
                if (c3800y12 != null) {
                    c3800y12.b(i11, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C3800y1 c3800y13 = this.f151841s;
            if (c3800y13 != null) {
                c3800y13.b(i11, true);
            }
            b(inMobiBanner);
            s().post(new Runnable() { // from class: F5.k
                @Override // java.lang.Runnable
                public final void run() {
                    com.inmobi.media.D1.a(this.f34507a, i11);
                }
            });
            return;
        }
        C3800y1 c3800y14 = this.f151841s;
        if (c3800y14 != null) {
            c3800y14.f(i11);
        }
        C3800y1 c3800y15 = this.f151841s;
        if (c3800y15 != null) {
            c3800y15.b(i11, false);
        }
    }

    public final void b(short s10) {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "submitAdLoadFailed ", this));
        }
        E0 e0J = j();
        if (e0J != null) {
            e0J.b(s10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(D1 this$0, int i10) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        C3800y1 c3800y1 = this$0.f151841s;
        if (c3800y1 != null) {
            c3800y1.a(i10, false);
        }
    }

    @e.e0
    public final void a(@NotNull PublisherCallbacks callbacks, @NotNull String adSize, boolean z10) {
        C3800y1 c3800y1;
        kotlin.jvm.internal.G.p(callbacks, "callbacks");
        kotlin.jvm.internal.G.p(adSize, "adSize");
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "load 1 ", this));
        }
        if (kotlin.jvm.internal.G.g(u(), Boolean.FALSE)) {
            b(this.f151842t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3800y1 c3800y12 = this.f151842t;
            if (c3800y12 != null) {
                c3800y12.a((short) 2006);
            }
            AbstractC3666o6.a((byte) 1, this.f151837o, "Cannot call load() API after calling load(byte[])");
            N4 n4P2 = p();
            if (n4P2 != null) {
                String TAG = this.f151838p;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n4P2).b(TAG, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        a(Boolean.TRUE);
        if (l() == null) {
            b(callbacks);
        }
        C3800y1 c3800y13 = this.f151842t;
        if (c3800y13 == null || !a(this.f151837o, String.valueOf(c3800y13.I()), callbacks) || (c3800y1 = this.f151842t) == null || !c3800y1.e(o())) {
            return;
        }
        N4 n4P3 = p();
        if (n4P3 != null) {
            String TAG2 = this.f151838p;
            kotlin.jvm.internal.G.o(TAG2, "TAG");
            ((O4) n4P3).d(TAG2, "AdManager state - LOADING");
        }
        a((byte) 1);
        d(null);
        C3800y1 c3800y14 = this.f151842t;
        kotlin.jvm.internal.G.m(c3800y14);
        c3800y14.e(adSize);
        C3800y1 c3800y15 = this.f151842t;
        kotlin.jvm.internal.G.m(c3800y15);
        c3800y15.d(z10);
    }

    @Override // com.inmobi.media.AbstractC3713rc
    public void a(@Nullable byte[] bArr, @NotNull PublisherCallbacks callbacks) {
        C3800y1 c3800y1;
        kotlin.jvm.internal.G.p(callbacks, "callbacks");
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).a(str, C1.a(str, "TAG", "load 2 ", this));
        }
        if (kotlin.jvm.internal.G.g(u(), Boolean.TRUE)) {
            AbstractC3666o6.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            N4 n4P2 = p();
            if (n4P2 != null) {
                String TAG = this.f151838p;
                kotlin.jvm.internal.G.o(TAG, "TAG");
                ((O4) n4P2).b(TAG, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        a(Boolean.FALSE);
        a((byte) 1);
        b(callbacks);
        if (this.f151842t != null) {
            C3800y1 c3800y12 = this.f151841s;
            if ((c3800y12 == null || !c3800y12.Y()) && (c3800y1 = this.f151842t) != null && c3800y1.e((byte) 1)) {
                N4 n4P3 = p();
                if (n4P3 != null) {
                    String TAG2 = this.f151838p;
                    kotlin.jvm.internal.G.o(TAG2, "TAG");
                    ((O4) n4P3).a(TAG2, "timer started - load banner");
                }
                C3800y1 c3800y13 = this.f151842t;
                if (c3800y13 != null) {
                    c3800y13.e0();
                }
                C3800y1 c3800y14 = this.f151842t;
                if (c3800y14 != null) {
                    c3800y14.a(bArr);
                }
            }
        }
    }

    public final void a(@NotNull RelativeLayout banner) {
        J jI;
        kotlin.jvm.internal.G.p(banner, "banner");
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).a(str, C1.a(str, "TAG", "displayAd ", this));
        }
        C3800y1 c3800y1 = this.f151841s;
        r rVarK = c3800y1 != null ? c3800y1.k() : null;
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya = rVarK instanceof GestureDetectorOnGestureListenerC3809ya ? (GestureDetectorOnGestureListenerC3809ya) rVarK : null;
        if (gestureDetectorOnGestureListenerC3809ya == null) {
            return;
        }
        Rc viewableAd = gestureDetectorOnGestureListenerC3809ya.getViewableAd();
        C3800y1 c3800y12 = this.f151841s;
        if (c3800y12 != null && (jI = c3800y12.I()) != null && jI.p()) {
            gestureDetectorOnGestureListenerC3809ya.e();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3809ya.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewD = viewableAd.d();
        viewableAd.a(new HashMap());
        C3800y1 c3800y13 = this.f151842t;
        if (c3800y13 != null) {
            c3800y13.E0();
        }
        if (viewGroup == null) {
            banner.addView(viewD, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewD, layoutParams);
        }
        C3800y1 c3800y14 = this.f151842t;
        if (c3800y14 != null) {
            c3800y14.g();
        }
    }

    @Override // com.inmobi.media.AbstractC3713rc
    public void a(@NotNull WatermarkData watermarkData) {
        kotlin.jvm.internal.G.p(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3800y1 c3800y1 = this.f151839q;
        if (c3800y1 != null) {
            c3800y1.a(watermarkData);
        }
        C3800y1 c3800y12 = this.f151840r;
        if (c3800y12 != null) {
            c3800y12.a(watermarkData);
        }
    }

    public final int a(int i10, int i11) {
        AdConfig adConfigJ;
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "getRefreshInterval ", this));
        }
        C3800y1 c3800y1 = this.f151842t;
        return (c3800y1 == null || (adConfigJ = c3800y1.j()) == null) ? i11 : i10 < adConfigJ.getMinimumRefreshInterval() ? adConfigJ.getMinimumRefreshInterval() : i10;
    }

    public final boolean a(long j10) {
        N4 n4P = p();
        if (n4P != null) {
            String str = this.f151838p;
            ((O4) n4P).c(str, C1.a(str, "TAG", "checkForRefreshRate ", this));
        }
        C3800y1 c3800y1 = this.f151842t;
        if (c3800y1 == null) {
            return false;
        }
        AdConfig adConfigJ = c3800y1.j();
        kotlin.jvm.internal.G.m(adConfigJ);
        int minimumRefreshInterval = adConfigJ.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        N4 n4P2 = p();
        if (n4P2 != null) {
            String TAG = this.f151838p;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            ((O4) n4P2).b(TAG, "Early refresh request");
        }
        b(this.f151842t, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String TAG2 = this.f151838p;
        kotlin.jvm.internal.G.o(TAG2, "TAG");
        StringBuilder sb2 = new StringBuilder("Ad cannot be refreshed before ");
        sb2.append(minimumRefreshInterval);
        sb2.append(" seconds (AdPlacement Id = ");
        C3800y1 c3800y12 = this.f151842t;
        sb2.append(c3800y12 != null ? c3800y12.I() : null);
        sb2.append(')');
        AbstractC3666o6.a((byte) 1, TAG2, sb2.toString());
        N4 n4P3 = p();
        if (n4P3 != null) {
            String TAG3 = this.f151838p;
            kotlin.jvm.internal.G.o(TAG3, "TAG");
            StringBuilder sb3 = new StringBuilder("Ad cannot be refreshed before ");
            sb3.append(minimumRefreshInterval);
            sb3.append(" seconds (AdPlacement Id = ");
            C3800y1 c3800y13 = this.f151842t;
            sb3.append(c3800y13 != null ? c3800y13.I() : null);
            sb3.append(')');
            ((O4) n4P3).b(TAG3, sb3.toString());
        }
        return false;
    }
}
