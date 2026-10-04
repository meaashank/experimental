package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3625l7;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3625l7 extends E0 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f153105P = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public WeakReference f153106M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f153107N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f153108O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3625l7(Context context, J placement, AbstractC3715s0 abstractC3715s0) {
        super(context, placement, abstractC3715s0);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(placement, "placement");
        placement.l();
        a(context, placement, abstractC3715s0);
    }

    public final void C0() {
        try {
            super.g();
        } catch (Exception e10) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).b("l7", jd.a(e10, O5.a("l7", "TAG", "SDK encountered unexpected error in destroying native ad unit; ")));
            }
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void D0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).a("l7", "renderAdPostInternetCheck");
        }
        k0();
        try {
            if (o0()) {
                N4 n43 = this.f151879j;
                if (n43 != null) {
                    ((O4) n43).b("l7", "render ad is blocked");
                    return;
                }
                return;
            }
            G0 g0S = s();
            g0S.getClass();
            g0S.f151963g = SystemClock.elapsedRealtime();
            d0();
        } catch (IllegalStateException e10) {
            N4 n44 = this.f151879j;
            if (n44 != null) {
                ((O4) n44).a("l7", "Exception while loading ad.", e10);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2134);
        }
    }

    @Override // com.inmobi.media.E0
    public final byte J() {
        return (byte) 0;
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    public final void a(int i10, GestureDetectorOnGestureListenerC3809ya renderView) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    public final void b() {
    }

    @Override // com.inmobi.media.E0
    public final void c0() {
        if (Z()) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).b("l7", "Ad unit is already destroyed! Returning ...");
                return;
            }
            return;
        }
        AbstractC3715s0 abstractC3715s0R = r();
        if (f0()) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).b("l7", "Some of the dependency libraries for InMobiNative not found");
            }
            if (abstractC3715s0R != null) {
                abstractC3715s0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return;
            }
            return;
        }
        if (1 == Q() || 2 == Q()) {
            N4 n44 = this.f151879j;
            if (n44 != null) {
                ((O4) n44).b("l7", "An ad load is already in progress");
                return;
            }
            return;
        }
        N4 n45 = this.f151879j;
        if (n45 != null) {
            StringBuilder sbA = O5.a("l7", "TAG", "Fetching a Native ad for placement id: ");
            sbA.append(I());
            ((O4) n45).a("l7", sbA.toString());
        }
        if (4 == Q()) {
            if (!W()) {
                N4 n46 = this.f151879j;
                if (n46 != null) {
                    ((O4) n46).a("l7", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                if (abstractC3715s0R != null) {
                    Context contextT = t();
                    N4 n47 = this.f151879j;
                    if (n47 != null) {
                        ((O4) n47).c("l7", "setContainerContext");
                    }
                    r rVarK = k();
                    if (rVarK instanceof C3499c7) {
                        ((C3499c7) rVarK).a(contextT);
                    }
                    N4 n48 = this.f151879j;
                    if (n48 != null) {
                        ((O4) n48).a("l7", "callback - onFetchSuccess");
                    }
                    N4 n49 = this.f151879j;
                    if (n49 != null) {
                        ((O4) n49).a("l7", "callback - onLoadSuccess");
                    }
                    e(abstractC3715s0R);
                    f(abstractC3715s0R);
                    return;
                }
                return;
            }
            N4 n410 = this.f151879j;
            if (n410 != null) {
                ((O4) n410).b("l7", "ad is expired - destroy");
            }
            C0();
        }
        e0();
        super.c0();
    }

    @Override // com.inmobi.media.E0
    public final void j0() {
        if (p0()) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).a("l7", "renderAd without internet check");
            }
            D0();
            return;
        }
        N4 n43 = this.f151879j;
        if (n43 != null) {
            ((O4) n43).a("l7", "renderAd");
        }
        a(new C3597j7(this), new C3611k7(this));
    }

    @Override // com.inmobi.media.E0
    public final HashMap o() {
        HashMap map = new HashMap();
        map.put("a-parentViewWidth", String.valueOf(AbstractC3760v3.d().f153495a));
        map.put("a-productVersion", "NS-1.0.0-20160411");
        map.put("trackerType", "url_ping");
        return map;
    }

    @Override // com.inmobi.media.E0
    public final String q() {
        return "native";
    }

    @Override // com.inmobi.media.E0
    public final void r0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "signalSuccess");
        }
        C3742u c3742uV = v();
        int iHashCode = hashCode();
        O7 o72 = new O7(this);
        c3742uV.getClass();
        C3742u.a(iHashCode, o72);
    }

    @Override // com.inmobi.media.E0
    public final void a(Context context) {
        kotlin.jvm.internal.G.p(context, "context");
        super.a(context);
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "setContainerContext");
        }
        r rVarK = k();
        if (rVarK instanceof C3499c7) {
            ((C3499c7) rVarK).a(context);
        }
    }

    @Override // com.inmobi.media.E0
    public final void b(AbstractC3715s0 abstractC3715s0) {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "handleAdScreenDisplayed");
        }
        if (Q() == 4) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).d("l7", "AdUnit " + this + " state change - RENDERED");
            }
            d((byte) 6);
        } else if (Q() == 6) {
            this.f153108O++;
        }
        N4 n44 = this.f151879j;
        if (n44 != null) {
            ((O4) n44).a("InMobi", "Successfully displayed fullscreen for placement id: " + I());
        }
        if (this.f153108O == 0) {
            if (abstractC3715s0 != null) {
                N4 n45 = this.f151879j;
                if (n45 != null) {
                    ((O4) n45).a("l7", "callback - onAdDisplayed");
                }
                d(abstractC3715s0);
                return;
            }
            N4 n46 = this.f151879j;
            if (n46 != null) {
                ((O4) n46).b("l7", "listener is null. cannot give AdDisplayed callback");
            }
        }
    }

    public final View a(View view, ViewGroup parent, int i10) {
        View view2;
        kotlin.jvm.internal.G.p(parent, "parent");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "getAdView");
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!Z3.f152641a.a()) {
                C0();
                N4 n43 = this.f151879j;
                if (n43 != null) {
                    ((O4) n43).b("l7", "dropping because of GDPR");
                }
                return null;
            }
            if (W()) {
                N4 n44 = this.f151879j;
                if (n44 != null) {
                    ((O4) n44).a("l7", "Ad has expired.");
                }
                C0();
                return null;
            }
            if (Q() != 4 && Q() != 6) {
                N4 n45 = this.f151879j;
                if (n45 != null) {
                    ((O4) n45).b("l7", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                }
                AbstractC3666o6.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling getPrimaryView().");
                N4 n46 = this.f151879j;
                if (n46 != null) {
                    ((O4) n46).b("l7", "Ad Load is not complete");
                }
                WeakReference weakReference = this.f153106M;
                if (weakReference == null || (view2 = (View) weakReference.get()) == null) {
                    return null;
                }
                View view3 = new View(C3657nb.d());
                view3.setLayoutParams(view2.getLayoutParams());
                return view3;
            }
            C3499c7 c3499c7G = G();
            if (c3499c7G != null) {
                boolean z10 = this.f153107N;
                N4 n47 = c3499c7G.f152781j;
                if (n47 != null) {
                    String TAG = c3499c7G.f152784m;
                    kotlin.jvm.internal.G.o(TAG, "TAG");
                    ((O4) n47).c(TAG, "showOnLockScreen - " + z10);
                }
                c3499c7G.f152755D = z10;
                c3499c7G.f152753B = i10;
                final Rc viewableAd = c3499c7G.getViewableAd();
                viewA = viewableAd != null ? viewableAd.a(view, parent, true) : null;
                this.f153106M = new WeakReference(viewA);
                Handler handlerD = D();
                if (handlerD != null) {
                    handlerD.post(new Runnable() { // from class: F5.H1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3625l7.a(this.f34322a, viewableAd);
                        }
                    });
                }
            }
            return viewA;
        }
        N4 n48 = this.f151879j;
        if (n48 != null) {
            ((O4) n48).b("l7", "getPrimaryView called on background thread");
        }
        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (short) 2150);
        return null;
    }

    public static final void a(C3625l7 this$0, Rc rc2) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        N4 n42 = this$0.f151879j;
        if (n42 != null) {
            ((O4) n42).a("l7", "start tracking for impression");
        }
        if (rc2 != null) {
            rc2.a((HashMap) null);
        }
    }

    @Override // com.inmobi.media.E0
    public final void a(C3604k0 adSet) {
        kotlin.jvm.internal.G.p(adSet, "adSet");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "handleAdFetchSuccessful");
        }
        if (Q() == 1) {
            e(adSet);
        }
        if (!"html".equals(E()) && !"htmlUrl".equals(E()) && !"unknown".equals(E())) {
            super.a(adSet);
            return;
        }
        a(I(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (short) 57);
        N4 n43 = this.f151879j;
        if (n43 != null) {
            ((O4) n43).b("l7", "invalid markup. fetch failed");
        }
    }

    @Override // com.inmobi.media.E0
    public final void a(AbstractC3715s0 abstractC3715s0) {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "handleAdScreenDismissed");
        }
        if (Q() == 6) {
            int i10 = this.f153108O;
            if (i10 > 0) {
                this.f153108O = i10 - 1;
            } else {
                N4 n43 = this.f151879j;
                if (n43 != null) {
                    ((O4) n43).d("l7", "AdUnit " + this + " state - READY");
                }
                d((byte) 4);
            }
        }
        N4 n44 = this.f151879j;
        if (n44 != null) {
            ((O4) n44).a("InMobi", "Successfully dismissed fullscreen for placement id: " + I());
        }
        if (this.f153108O == 0 && Q() == 4) {
            if (abstractC3715s0 != null) {
                N4 n45 = this.f151879j;
                if (n45 != null) {
                    ((O4) n45).a("l7", "callback - onAdDismissed");
                }
                abstractC3715s0.b();
            } else {
                N4 n46 = this.f151879j;
                if (n46 != null) {
                    ((O4) n46).b("l7", "Listener was garbage collected. Unable to give callback");
                }
            }
            N4 n47 = this.f151879j;
            if (n47 != null) {
                ((O4) n47).a();
            }
        }
    }

    @Override // com.inmobi.media.E0
    public final void a(J placement, boolean z10) {
        kotlin.jvm.internal.G.p(placement, "placement");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "handleAssetAvailabilityChanged");
        }
        super.a(placement, z10);
        if (!z10) {
            if (kotlin.jvm.internal.G.g(I(), placement)) {
                if (2 == Q() || 4 == Q()) {
                    d((byte) 0);
                    N4 n43 = this.f151879j;
                    if (n43 != null) {
                        ((O4) n43).d("l7", "AdUnit " + this + " state - CREATED");
                    }
                    AbstractC3715s0 abstractC3715s0R = r();
                    if (abstractC3715s0R != null) {
                        abstractC3715s0R.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.G.g(I(), placement) || 2 != Q() || r() == null || t() == null) {
            return;
        }
        if (a0()) {
            c(true);
            f();
        } else {
            r0();
        }
    }

    @Override // com.inmobi.media.E0
    public final void a(boolean z10, InMobiAdRequestStatus status) {
        kotlin.jvm.internal.G.p(status, "status");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "onDidParseAfterFetch");
        }
        super.a(z10, status);
        if (Q() == 2) {
            AbstractC3715s0 abstractC3715s0R = r();
            if (abstractC3715s0R != null) {
                N4 n43 = this.f151879j;
                if (n43 != null) {
                    ((O4) n43).a("l7", "callback - onFetchSuccess");
                }
                e(abstractC3715s0R);
                return;
            }
            return;
        }
        N4 n44 = this.f151879j;
        if (n44 != null) {
            ((O4) n44).b("l7", "invalid state - ignore parse callback");
        }
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.Nc
    public final void a(C3561h ad2, boolean z10, short s10) {
        kotlin.jvm.internal.G.p(ad2, "ad");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("l7", "onVastProcessCompleted");
        }
        if (!z10) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).b("l7", android.support.v4.media.c.a("VAST processing failed - ", s10));
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
            return;
        }
        try {
            try {
                super.a(ad2, z10, s10);
            } catch (IllegalStateException e10) {
                N4 n44 = this.f151879j;
                if (n44 != null) {
                    ((O4) n44).b("l7", "Exception while onVastProcessCompleted : " + e10.getMessage());
                }
            }
            C3561h c3561hM = m();
            if (c3561hM == null) {
                N4 n45 = this.f151879j;
                if (n45 != null) {
                    ((O4) n45).b("l7", "current ad is null. failing");
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
                return;
            }
            if (T() == 0) {
                if (!c3561hM.G()) {
                    N4 n46 = this.f151879j;
                    if (n46 != null) {
                        ((O4) n46).c("l7", "start OMID session for HTML ad");
                    }
                    a(true, (GestureDetectorOnGestureListenerC3809ya) null);
                }
            } else {
                N4 n47 = this.f151879j;
                if (n47 != null) {
                    ((O4) n47).c("l7", "start OMID session for current AD");
                }
                a(c3561hM);
            }
            if (c3561hM.G()) {
                b(true);
                N4 n48 = this.f151879j;
                if (n48 != null) {
                    ((O4) n48).c("l7", "handleInterActive");
                }
                V();
            }
        } catch (Exception e11) {
            N4 n49 = this.f151879j;
            if (n49 != null) {
                ((O4) n49).a("l7", "Exception while loading ad.", e11);
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 13);
        }
    }
}
