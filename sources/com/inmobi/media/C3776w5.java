package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.inmobi.media.C3776w5;
import ed.InterfaceC4376a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3776w5 extends E0 {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f153499M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f153500N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Jb f153501O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public InterfaceC4376a f153502P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3776w5(@NotNull Context context, @NotNull J adPlacement, @Nullable AbstractC3715s0 abstractC3715s0) {
        super(context, adPlacement, abstractC3715s0);
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(adPlacement, "adPlacement");
        this.f153501O = new Jb();
        adPlacement.l();
        a(context, adPlacement, abstractC3715s0);
        c("activity");
    }

    public static final void c(C3776w5 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.a(this$0.r());
    }

    public static final void d(C3776w5 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.b(this$0.r());
    }

    public static final /* synthetic */ String e() {
        return "w5";
    }

    public final boolean C0() {
        if (f0()) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).a("w5", "Some of the dependency libraries for Interstitial not found");
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES), true, (short) 2007);
            return false;
        }
        AbstractC3715s0 abstractC3715s0R = r();
        if (abstractC3715s0R == null) {
            return false;
        }
        byte bQ = Q();
        if (bQ == 1) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).b("InMobiInterstitial", AbstractC3713rc.f153326n + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2008);
        } else if (bQ == 7 || bQ == 6) {
            N4 n44 = this.f151879j;
            if (n44 != null) {
                ((O4) n44).b("InMobiInterstitial", AbstractC3713rc.f153322j + I());
            }
            a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 2010);
        } else {
            if (bQ != 2) {
                if (4 == Q()) {
                    if (!W()) {
                        N4 n45 = this.f151879j;
                        if (n45 != null) {
                            ((O4) n45).a("w5", "An ad is ready with the ad unit. Signaling ad load success ...");
                        }
                        AbstractC3715s0 abstractC3715s0R2 = r();
                        if (abstractC3715s0R2 == null) {
                            N4 n46 = this.f151879j;
                            if (n46 != null) {
                                ((O4) n46).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                            }
                        } else {
                            e(abstractC3715s0R2);
                            f(abstractC3715s0R2);
                        }
                        return false;
                    }
                    g();
                }
                e0();
                return true;
            }
            if ("html".equals(E()) || "htmlUrl".equals(E())) {
                N4 n47 = this.f151879j;
                if (n47 != null) {
                    ((O4) n47).b("InMobiInterstitial", AbstractC3713rc.f153326n + I());
                }
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD), false, (short) 2011);
            } else {
                e(abstractC3715s0R);
            }
        }
        return false;
    }

    public final boolean D0() {
        N4 n42;
        C3561h c3561hM = m();
        if (c3561hM == null) {
            return false;
        }
        AdConfig adConfigJ = j();
        kotlin.jvm.internal.G.m(adConfigJ);
        boolean zA = c3561hM.a(adConfigJ.getCacheConfig(q()).getTimeToLive());
        if (zA && (n42 = this.f151879j) != null) {
            ((O4) n42).b("w5", "Top ad has expired, failing show of ad.");
        }
        return !zA;
    }

    public final void E0() {
        r rVarK = k();
        if (rVarK == null) {
            return;
        }
        this.f153500N = true;
        rVarK.e();
    }

    @Override // com.inmobi.media.E0
    @Nullable
    public Integer F() {
        AdConfig adConfigJ = j();
        if (adConfigJ != null) {
            return Integer.valueOf(adConfigJ.getMinimumRefreshInterval());
        }
        return null;
    }

    @NotNull
    public final Jb F0() {
        return this.f153501O;
    }

    public final boolean G0() {
        return Q() == 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r1.equals("html") != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H0() {
        /*
            r5 = this;
            java.lang.String r0 = "Cannot handle markupType: "
            com.inmobi.media.N4 r1 = r5.f151879j
            java.lang.String r2 = "w5"
            if (r1 == 0) goto Lf
            com.inmobi.media.O4 r1 = (com.inmobi.media.O4) r1
            java.lang.String r3 = "renderAdPostInternetCheck"
            r1.a(r2, r3)
        Lf:
            r5.k0()
            boolean r1 = r5.o0()     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 == 0) goto L1a
            goto L91
        L1a:
            com.inmobi.media.G0 r1 = r5.s()     // Catch: java.lang.IllegalStateException -> L4b
            r1.getClass()     // Catch: java.lang.IllegalStateException -> L4b
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L4b
            r1.f151963g = r3     // Catch: java.lang.IllegalStateException -> L4b
            r5.d0()     // Catch: java.lang.IllegalStateException -> L4b
            java.lang.String r1 = r5.E()     // Catch: java.lang.IllegalStateException -> L4b
            int r3 = r1.hashCode()     // Catch: java.lang.IllegalStateException -> L4b
            r4 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r3 == r4) goto L64
            r4 = 3213227(0x3107ab, float:4.50269E-39)
            if (r3 == r4) goto L4d
            r4 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r3 == r4) goto L42
            goto L6c
        L42:
            java.lang.String r3 = "htmlUrl"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 != 0) goto L55
            goto L6c
        L4b:
            r0 = move-exception
            goto L92
        L4d:
            java.lang.String r3 = "html"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 == 0) goto L6c
        L55:
            android.os.Handler r0 = r5.D()     // Catch: java.lang.IllegalStateException -> L4b
            if (r0 == 0) goto L91
            F5.W2 r1 = new F5.W2     // Catch: java.lang.IllegalStateException -> L4b
            r1.<init>()     // Catch: java.lang.IllegalStateException -> L4b
            r0.post(r1)     // Catch: java.lang.IllegalStateException -> L4b
            return
        L64:
            java.lang.String r3 = "inmobiJson"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 != 0) goto L86
        L6c:
            com.inmobi.media.N4 r1 = r5.f151879j     // Catch: java.lang.IllegalStateException -> L4b
            if (r1 == 0) goto L91
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L4b
            r3.<init>(r0)     // Catch: java.lang.IllegalStateException -> L4b
            java.lang.String r0 = r5.E()     // Catch: java.lang.IllegalStateException -> L4b
            r3.append(r0)     // Catch: java.lang.IllegalStateException -> L4b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.IllegalStateException -> L4b
            com.inmobi.media.O4 r1 = (com.inmobi.media.O4) r1     // Catch: java.lang.IllegalStateException -> L4b
            r1.a(r2, r0)     // Catch: java.lang.IllegalStateException -> L4b
            return
        L86:
            com.inmobi.media.N4 r0 = r5.f151879j     // Catch: java.lang.IllegalStateException -> L4b
            if (r0 == 0) goto L91
            java.lang.String r1 = "Waiting for Vast Processing"
            com.inmobi.media.O4 r0 = (com.inmobi.media.O4) r0     // Catch: java.lang.IllegalStateException -> L4b
            r0.a(r2, r1)     // Catch: java.lang.IllegalStateException -> L4b
        L91:
            return
        L92:
            com.inmobi.media.N4 r1 = r5.f151879j
            if (r1 == 0) goto L9d
            com.inmobi.media.O4 r1 = (com.inmobi.media.O4) r1
            java.lang.String r3 = "Exception while loading ad."
            r1.a(r2, r3, r0)
        L9d:
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            r1 = 1
            r2 = 2134(0x856, float:2.99E-42)
            r5.b(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3776w5.H0():void");
    }

    public boolean I0() {
        return 2 == Q();
    }

    @Override // com.inmobi.media.E0
    public final byte J() {
        return (byte) 1;
    }

    public final void J0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String strE = E0.e();
            kotlin.jvm.internal.G.o(strE, "<get-TAG>(...)");
            ((O4) n42).c(strE, "submitAdNotReady " + this);
        }
        Jb jb2 = this.f153501O;
        G0 g0S = s();
        C3561h c3561hA = this.f151859A ? a(this.f151893x) : m();
        String strP = c3561hA != null ? c3561hA.p() : null;
        C3604k0 c3604k0Y = y();
        Boolean boolO = c3604k0Y != null ? c3604k0Y.o() : null;
        String strE2 = E();
        byte bQ = Q();
        new G(g0S, strP, boolO, strE2, bQ);
        jb2.getClass();
        HashMap map = new HashMap();
        long j10 = g0S.f151959c;
        ScheduledExecutorService scheduledExecutorService = Cc.f151826a;
        map.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        map.put("errorCode", Short.valueOf(bQ == 0 ? (short) 2204 : bQ == 1 ? (short) 2205 : bQ == 2 ? (short) 2206 : bQ == 3 ? (short) 2207 : bQ == 6 ? (short) 2208 : bQ == 7 ? (short) 2209 : (short) 2210));
        if (strE2 != null) {
            map.put("markupType", strE2);
        }
        if (strP != null) {
            map.put("creativeType", "\"" + strP + '\"');
        }
        if (boolO != null) {
            map.put("isRewarded", boolO);
        }
        String strA = g0S.a();
        if (strA.length() > 0) {
            map.put("metadataBlob", strA);
        }
        map.put("adType", g0S.f151957a.q());
        map.put("networkType", C3635m3.q());
        map.put("plId", Long.valueOf(g0S.f151957a.I().l()));
        map.put("isAdLoaded", Boolean.valueOf(jb2.f152133a));
        String strM = g0S.f151957a.I().m();
        if (strM != null) {
            map.put("plType", strM);
        }
        Lb lb2 = Lb.f152196a;
        Lb.b("AdNotReady", map, Qb.f152402a);
    }

    public final void K0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).a("InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + I());
        }
        i();
        r0();
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    public void a(int i10, @NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
    }

    public final short b(Context context) {
        try {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).a("w5", ">>> Starting InMobiAdActivity to display interstitial ad ...");
            }
            r rVarK = k();
            if (rVarK == null) {
                return (short) 2155;
            }
            if ("unknown".equals(rVarK.getMarkupType())) {
                return (short) 2156;
            }
            SparseArray sparseArray = InMobiAdActivity.f151717j;
            int iHashCode = rVarK.hashCode();
            sparseArray.put(iHashCode, rVarK);
            Intent intent = new Intent(context, (Class<?>) InMobiAdActivity.class);
            N4 n43 = this.f151879j;
            if (n43 != null) {
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.G.o(string, "toString(...)");
                HashMap map = B4.f151768a;
                String key = string.toString();
                kotlin.jvm.internal.G.p(key, "key");
                map.put(key, new WeakReference(n43));
                intent.putExtra("loggerCacheKey", string);
            }
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", iHashCode);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
            String strE = E();
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", kotlin.jvm.internal.G.g(strE, "html") ? 200 : kotlin.jvm.internal.G.g(strE, "htmlUrl") ? 202 : 201);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
            if (context == null) {
                return (short) 2157;
            }
            if (b0()) {
                if (C() == -1) {
                    a(System.currentTimeMillis());
                }
                if (z() > 0) {
                    intent.setFlags(603979776);
                }
            }
            C3657nb.f153207a.a(context, intent);
            return (short) 0;
        } catch (Exception e10) {
            N4 n44 = this.f151879j;
            if (n44 != null) {
                ((O4) n44).b("InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            }
            C3511d5 c3511d5 = C3511d5.f152815a;
            C3511d5.f152817c.a(K4.a(e10, NotificationCompat.CATEGORY_EVENT));
            return (short) 2154;
        }
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void c0() {
        if (C0()) {
            super.c0();
        }
    }

    @Override // com.inmobi.media.E0
    public void g() {
        super.g();
        this.f153502P = null;
    }

    public final void h(@Nullable AbstractC3715s0 abstractC3715s0) {
        short sB = b(t());
        if (abstractC3715s0 == null) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).b("InMobiInterstitial", "Listener was garbage collected.Unable to give callback");
                return;
            }
            return;
        }
        if (sB != 0) {
            a(true, sB);
        } else {
            abstractC3715s0.e();
        }
    }

    public final void i(AbstractC3715s0 abstractC3715s0) {
        if (abstractC3715s0 == null) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).b("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
            a(true, (short) 2151);
            return;
        }
        InterfaceC4376a interfaceC4376a = this.f153502P;
        if (interfaceC4376a != null) {
            interfaceC4376a.invoke();
            return;
        }
        if (!G0()) {
            AbstractC3666o6.a((byte) 2, "InMobiInterstitial", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).b("w5", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            AbstractC3666o6.a((byte) 1, "w5", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(true, (short) 2152);
            return;
        }
        g(abstractC3715s0);
        d((byte) 6);
        if (!"html".equals(E()) && !"htmlUrl".equals(E())) {
            C3742u c3742uV = v();
            int iHashCode = hashCode();
            C3679p5 c3679p5 = new C3679p5(this, abstractC3715s0);
            c3742uV.getClass();
            C3742u.a(iHashCode, c3679p5);
            return;
        }
        if (!W()) {
            h(abstractC3715s0);
            return;
        }
        b(abstractC3715s0, (short) 2153);
        r rVarK = k();
        if (rVarK != null) {
            rVarK.b();
        }
    }

    @e.e0
    public final void j(@Nullable final AbstractC3715s0 abstractC3715s0) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            i(abstractC3715s0);
        } else {
            int i10 = T3.f152448a;
            ((ExecutorC3763v6) T3.f152451d.getValue()).f153451a.post(new Runnable() { // from class: F5.U2
                @Override // java.lang.Runnable
                public final void run() {
                    C3776w5.a(this.f34403a, abstractC3715s0);
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
                ((O4) n42).a("w5", "renderAd without internet check");
            }
            H0();
            return;
        }
        N4 n43 = this.f151879j;
        if (n43 != null) {
            ((O4) n43).a("w5", "renderAd");
        }
        a(new C3748u5(this), new C3762v5(this));
    }

    @Override // com.inmobi.media.E0
    public void k0() {
        super.k0();
        this.f153499M = 0;
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void l(@Nullable GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya) {
        super.l(gestureDetectorOnGestureListenerC3809ya);
        if (!b0()) {
            if (Q() == 2) {
                b((byte) 1);
                K0();
                return;
            }
            return;
        }
        int iIndexOf = this.f151876g.indexOf(gestureDetectorOnGestureListenerC3809ya);
        if (iIndexOf < A()) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                StringBuilder sbA = android.support.v4.media.a.a("Ignoring loaded ad with index ", iIndexOf, " as current rendering index is ");
                sbA.append(A());
                ((O4) n42).a("w5", sbA.toString());
                return;
            }
            return;
        }
        B().add(Integer.valueOf(iIndexOf));
        for (int i10 = 0; i10 < iIndexOf; i10++) {
            if (this.f151876g.get(i10) != null) {
                return;
            }
        }
        if (Q() == 2) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).a("w5", android.support.v4.media.c.a("Providing success based on index ", iIndexOf));
            }
            b((byte) 1);
            h(iIndexOf);
            K0();
        }
    }

    @Override // com.inmobi.media.E0
    @NotNull
    public String q() {
        return "int";
    }

    @Override // com.inmobi.media.E0
    public void q0() {
        AbstractC3715s0 abstractC3715s0R = r();
        if (abstractC3715s0R != null) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).a("w5", "callback - onFetchSuccess");
            }
            e(abstractC3715s0R);
            return;
        }
        b((short) 2188);
        N4 n43 = this.f151879j;
        if (n43 != null) {
            ((O4) n43).b("w5", "listener is null");
        }
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void r0() {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).d("w5", "AdUnit " + this + " state - READY");
        }
        d((byte) 4);
        G0 g0S = s();
        g0S.getClass();
        g0S.f151965i = SystemClock.elapsedRealtime();
        u0();
        z0();
        this.f153501O.f152133a = true;
        AbstractC3715s0 abstractC3715s0R = r();
        if (abstractC3715s0R == null || !abstractC3715s0R.a()) {
            return;
        }
        N4 n43 = this.f151879j;
        if (n43 != null) {
            ((O4) n43).a("w5", "signaling Success");
        }
        f(abstractC3715s0R);
    }

    @Override // com.inmobi.media.E0
    @Nullable
    public GestureDetectorOnGestureListenerC3809ya w() {
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809yaW = super.w();
        if (this.f153500N && gestureDetectorOnGestureListenerC3809yaW != null) {
            gestureDetectorOnGestureListenerC3809yaW.e();
        }
        return gestureDetectorOnGestureListenerC3809yaW;
    }

    public static final void e(C3776w5 this$0) {
        LinkedList<C3561h> linkedListF;
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.s0();
        if (this$0.b0()) {
            C3604k0 c3604k0Y = this$0.y();
            int size = (c3604k0Y == null || (linkedListF = c3604k0Y.f()) == null) ? 0 : linkedListF.size();
            for (int i10 = 1; i10 < size; i10++) {
                this$0.g(this$0.z() + 1);
                this$0.s0();
            }
        }
    }

    @Override // com.inmobi.media.E0
    public void c(@NotNull String monetizationContext) {
        kotlin.jvm.internal.G.p(monetizationContext, "monetizationContext");
        super.c("activity");
    }

    @Override // com.inmobi.media.Aa
    public synchronized void d(@NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        super.d(renderView);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new Runnable() { // from class: F5.T2
                @Override // java.lang.Runnable
                public final void run() {
                    C3776w5.c(this.f34398a);
                }
            });
        }
    }

    public final void a(@NotNull Jb jb2) {
        kotlin.jvm.internal.G.p(jb2, "<set-?>");
        this.f153501O = jb2;
    }

    @Override // com.inmobi.media.E0
    public void a(@Nullable byte[] bArr) {
        if (C0()) {
            super.a(bArr);
        }
    }

    public static final void a(C3776w5 this$0, AbstractC3715s0 abstractC3715s0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.i(abstractC3715s0);
    }

    @Override // com.inmobi.media.Aa
    public synchronized void e(@NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        super.e(renderView);
        Handler handlerD = D();
        if (handlerD != null) {
            handlerD.post(new Runnable() { // from class: F5.V2
                @Override // java.lang.Runnable
                public final void run() {
                    C3776w5.d(this.f34408a);
                }
            });
        }
    }

    public static final void a(final C3776w5 this$0, GestureDetectorOnGestureListenerC3809ya renderView, Context context) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(renderView, "$renderView");
        final int iIndexOf = this$0.f151876g.indexOf(renderView);
        ArrayList list = this$0.f151876g;
        kotlin.jvm.internal.G.p(list, "list");
        if (iIndexOf < 0 || iIndexOf >= list.size()) {
            return;
        }
        short sB = this$0.b(context);
        if (sB != 0) {
            this$0.f(iIndexOf);
        }
        this$0.b(iIndexOf, sB == 0);
        Handler handlerD = this$0.D();
        if (handlerD != null) {
            handlerD.post(new Runnable() { // from class: F5.Q2
                @Override // java.lang.Runnable
                public final void run() {
                    C3776w5.a(this.f34383a, iIndexOf);
                }
            });
        }
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    @e.g0
    public void a(@NotNull GestureDetectorOnGestureListenerC3809ya renderView, @Nullable Context context) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            String strE = E0.e();
            kotlin.jvm.internal.G.o(strE, "<get-TAG>(...)");
            ((O4) n42).c(strE, "closeCurrentPodAd " + this);
        }
        if (b0()) {
            Integer numHigher = B().higher(Integer.valueOf(this.f151876g.indexOf(renderView)));
            if (numHigher != null) {
                a(numHigher.intValue(), renderView, context);
            } else {
                b();
            }
        }
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void a(@Nullable AbstractC3715s0 abstractC3715s0) {
        N4 n42 = this.f151879j;
        if (n42 != null) {
            StringBuilder sbA = O5.a("w5", "TAG", "handleAdScreenDismissed ");
            sbA.append((int) Q());
            ((O4) n42).c("w5", sbA.toString());
        }
        if (Q() == 7) {
            int i10 = this.f153499M - 1;
            this.f153499M = i10;
            if (i10 == 1) {
                d((byte) 6);
                N4 n43 = this.f151879j;
                if (n43 != null) {
                    ((O4) n43).d("w5", "AdUnit " + this + " state - RENDERED");
                    return;
                }
                return;
            }
            return;
        }
        if (Q() == 6) {
            this.f153499M--;
            N4 n44 = this.f151879j;
            if (n44 != null) {
                ((O4) n44).a("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + I());
            }
            if (abstractC3715s0 != null) {
                abstractC3715s0.b();
                return;
            }
            N4 n45 = this.f151879j;
            if (n45 != null) {
                ((O4) n45).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void b(@Nullable GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya, short s10) {
        super.b(gestureDetectorOnGestureListenerC3809ya, s10);
        if (b0()) {
            int iIndexOf = this.f151876g.indexOf(gestureDetectorOnGestureListenerC3809ya);
            boolean z10 = false;
            E0.a(this, iIndexOf, false, 2, null);
            int size = this.f151876g.size();
            boolean z11 = true;
            boolean z12 = true;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z10 = z11;
                    i10 = -1;
                    break;
                }
                if (i10 != iIndexOf && this.f151876g.get(i10) != null) {
                    if (B().contains(Integer.valueOf(i10))) {
                        break;
                    }
                    z11 = false;
                    z12 = false;
                }
                i10++;
            }
            if (i10 != -1) {
                if (z12 && Q() == 2) {
                    b((byte) 1);
                    h(i10);
                    N4 n42 = this.f151879j;
                    if (n42 != null) {
                        StringBuilder sbA = O5.a("w5", "TAG", "Providing success based on currIndex ");
                        sbA.append(A());
                        sbA.append(" as ");
                        sbA.append(iIndexOf);
                        sbA.append(" failed");
                        ((O4) n42).a("w5", sbA.toString());
                    }
                    K0();
                    return;
                }
                return;
            }
            if (z10 && Q() == 2) {
                N4 n43 = this.f151879j;
                if (n43 != null) {
                    ((O4) n43).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
                }
                b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
                return;
            }
            return;
        }
        if (Q() == 2) {
            N4 n44 = this.f151879j;
            if (n44 != null) {
                ((O4) n44).a("InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + I());
            }
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
        }
    }

    @Override // com.inmobi.media.E0
    public void a(boolean z10, @NotNull InMobiAdRequestStatus status) {
        String strM;
        kotlin.jvm.internal.G.p(status, "status");
        N4 n42 = this.f151879j;
        if (n42 != null) {
            ((O4) n42).c("w5", "onDidParseAfterFetch - parsingResult - " + z10);
        }
        super.a(z10, status);
        if (Q() == 2) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).a("InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + I());
            }
            if (kotlin.jvm.internal.G.g(E(), "inmobiJson") && (strM = I().m()) != null) {
                EnumC3568h6 enumC3568h6 = C3558ga.f152942a;
                N4 n44 = this.f151879j;
                TelemetryConfig.LoggingConfig loggingConfig = C3558ga.f152945d.getLoggingConfig();
                if (n44 != null) {
                    EnumC3568h6 logLevel = C3558ga.a("intNative", strM, loggingConfig);
                    double dB = C3558ga.b("intNative", strM, loggingConfig);
                    M4 m42 = new M4(logLevel, dB);
                    Objects.toString(m42);
                    C3530ea c3530ea = ((O4) n44).f152335a;
                    if (c3530ea != null) {
                        Objects.toString(m42);
                        Objects.toString(c3530ea.f152879i);
                        if (!c3530ea.f152879i.get()) {
                            C3596j6 c3596j6 = c3530ea.f152875e;
                            c3596j6.getClass();
                            kotlin.jvm.internal.G.p(logLevel, "logLevel");
                            c3596j6.f153050a = logLevel;
                            c3530ea.f152876f.f153012a = dB;
                        }
                    }
                }
            }
            q0();
        }
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void b(@Nullable AbstractC3715s0 abstractC3715s0) {
        if (Q() == 6) {
            int i10 = this.f153499M + 1;
            this.f153499M = i10;
            if (i10 == 1) {
                N4 n42 = this.f151879j;
                if (n42 != null) {
                    ((O4) n42).a("InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + I());
                }
                if (abstractC3715s0 != null) {
                    b((byte) 4);
                    d(abstractC3715s0);
                    return;
                }
                return;
            }
            d((byte) 7);
            return;
        }
        if (Q() == 7) {
            this.f153499M++;
        }
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.Nc
    @e.e0
    public void a(@NotNull C3561h ad2, boolean z10, short s10) {
        kotlin.jvm.internal.G.p(ad2, "ad");
        if (!z10) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, s10);
            return;
        }
        try {
            super.a(ad2, z10, s10);
        } catch (IllegalStateException e10) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                StringBuilder sbA = O5.a("w5", "TAG", "Exception while onVastProcessCompleted : ");
                sbA.append(e10.getMessage());
                ((O4) n42).b("w5", sbA.toString());
            }
        }
        C3561h c3561hM = m();
        if (c3561hM == null) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 55);
        } else if (c3561hM.G()) {
            b(true);
            V();
        } else {
            a(c3561hM);
        }
    }

    public final void b(@Nullable AbstractC3715s0 abstractC3715s0, short s10) {
        a(true, s10);
        d((byte) 0);
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    @e.g0
    public void b() {
        if (b0()) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).a("w5", "Closing the ad as closeAll is called");
            }
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Runnable() { // from class: F5.R2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3776w5.b(this.f34386a);
                    }
                });
            }
        }
    }

    public static final void b(C3776w5 this$0) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        N4 n42 = this$0.f151879j;
        if (n42 != null) {
            ((O4) n42).a("E0", "clearAdPods " + this$0);
        }
        if (this$0.f151859A) {
            this$0.h();
            this$0.f151876g.clear();
            this$0.f151892w = 0;
            this$0.f151893x = 0;
            this$0.f151895z.clear();
        }
        N4 n43 = this$0.f151879j;
        if (n43 != null) {
            ((O4) n43).c("InMobiInterstitial", "Interstitial ad dismissed for placement id: " + this$0.I());
        }
        if (this$0.r() != null) {
            AbstractC3715s0 abstractC3715s0R = this$0.r();
            if (abstractC3715s0R != null) {
                abstractC3715s0R.b();
                return;
            }
            return;
        }
        N4 n44 = this$0.f151879j;
        if (n44 != null) {
            ((O4) n44).c("InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    @Override // com.inmobi.media.E0
    @e.e0
    public void a(@NotNull J placement, boolean z10) {
        kotlin.jvm.internal.G.p(placement, "placement");
        super.a(placement, z10);
        if (!z10) {
            if (kotlin.jvm.internal.G.g(I(), placement)) {
                if (2 == Q() || 4 == Q()) {
                    d((byte) 0);
                    N4 n42 = this.f151879j;
                    if (n42 != null) {
                        ((O4) n42).d("w5", "AdUnit " + this + " state - CREATED");
                    }
                    b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (short) 0);
                    return;
                }
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.G.g(I(), placement) && 2 == Q()) {
            N4 n43 = this.f151879j;
            if (n43 != null) {
                ((O4) n43).a("w5", "Asset are ready now");
            }
            if (a0()) {
                c(true);
                f();
            } else {
                r0();
            }
        }
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    @e.g0
    public void a(int i10, @NotNull final GestureDetectorOnGestureListenerC3809ya renderView, @Nullable final Context context) {
        GestureDetectorOnGestureListenerC3809ya gestureDetectorOnGestureListenerC3809ya;
        kotlin.jvm.internal.G.p(renderView, "renderView");
        if (!b0()) {
            N4 n42 = this.f151879j;
            if (n42 != null) {
                ((O4) n42).a("w5", "Cannot show an pod ad as isPod is not set.");
                return;
            }
            return;
        }
        if (B().contains(Integer.valueOf(i10)) && i10 > this.f151876g.indexOf(renderView) && i10 < this.f151876g.size() && this.f151876g.get(i10) != null && ((gestureDetectorOnGestureListenerC3809ya = (GestureDetectorOnGestureListenerC3809ya) this.f151876g.get(i10)) == null || gestureDetectorOnGestureListenerC3809ya.f153635p0)) {
            if (context == null) {
                context = t();
            }
            super.a(i10, renderView, context);
            Handler handlerD = D();
            if (handlerD != null) {
                handlerD.post(new Runnable() { // from class: F5.S2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3776w5.a(this.f34391a, renderView, context);
                    }
                });
                return;
            }
            return;
        }
        N4 n43 = this.f151879j;
        if (n43 != null) {
            ((O4) n43).a("w5", "Cannot show an pod ad with invalid index passed");
        }
        b(this.f151876g.indexOf(renderView), false);
    }

    public static final void a(C3776w5 this$0, int i10) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        this$0.a(i10, false);
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.K
    @e.g0
    public boolean a(@NotNull GestureDetectorOnGestureListenerC3809ya renderView) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        if (b0()) {
            if (B().higher(Integer.valueOf(this.f151876g.indexOf(renderView))) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.InterfaceC3504cc
    public void a(byte b10) {
        if (b10 == 1) {
            if (b0()) {
                if (Q() == 2) {
                    if (B().isEmpty()) {
                        N4 n42 = this.f151879j;
                        if (n42 != null) {
                            ((O4) n42).b("w5", "RenderView time out, none of the ad provided success");
                        }
                        h();
                        b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (short) 2139);
                        return;
                    }
                    b((byte) 1);
                    N4 n43 = this.f151879j;
                    if (n43 != null) {
                        StringBuilder sbA = O5.a("w5", "TAG", "RenderView time out, providing success based on ");
                        sbA.append(B().first());
                        ((O4) n43).a("w5", sbA.toString());
                    }
                    Integer numFirst = B().first();
                    kotlin.jvm.internal.G.o(numFirst, "first(...)");
                    h(numFirst.intValue());
                    K0();
                    int size = this.f151876g.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!B().contains(Integer.valueOf(i10))) {
                            E0.a(this, i10, false, 2, null);
                        }
                    }
                    return;
                }
                h();
                return;
            }
            super.a(b10);
            return;
        }
        super.a(b10);
    }

    @Override // com.inmobi.media.E0, com.inmobi.media.Aa
    public void a(@NotNull GestureDetectorOnGestureListenerC3809ya renderView, boolean z10) {
        kotlin.jvm.internal.G.p(renderView, "renderView");
        super.a(renderView, z10);
        byte bQ = Q();
        if (bQ == 4) {
            this.f153502P = new C3734t5(this, z10 ? (short) 2220 : (short) 2219);
            return;
        }
        if (bQ != 6) {
            if (bQ == 7) {
                short s10 = z10 ? (short) 2224 : (short) 2223;
                AbstractC3666o6.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
                N4 n42 = this.f151879j;
                if (n42 != null) {
                    ((O4) n42).b("w5", "RenderProcess of the WebView has crashed. Please create another adUnit");
                }
                renderView.a(z10, s10);
                Activity fullScreenActivity = renderView.getFullScreenActivity();
                if (fullScreenActivity != null) {
                    N4 n43 = renderView.f153620i;
                    if (n43 != null) {
                        String TAG = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
                        kotlin.jvm.internal.G.o(TAG, "TAG");
                        ((O4) n43).c(TAG, "fullScreenActivity is not null and finishing");
                    }
                    fullScreenActivity.finish();
                }
                a(r());
                return;
            }
            return;
        }
        short s11 = z10 ? (short) 2222 : (short) 2221;
        AbstractC3666o6.a((byte) 2, "InMobiInterstitial", "RenderProcess of the WebView has crashed. Please create another adUnit");
        N4 n44 = this.f151879j;
        if (n44 != null) {
            ((O4) n44).b("w5", "RenderProcess of the WebView has crashed. Please create another adUnit");
        }
        Activity fullScreenActivity2 = renderView.getFullScreenActivity();
        if (fullScreenActivity2 != null) {
            N4 n45 = renderView.f153620i;
            if (n45 != null) {
                String TAG2 = GestureDetectorOnGestureListenerC3809ya.f153566Q0;
                kotlin.jvm.internal.G.o(TAG2, "TAG");
                ((O4) n45).c(TAG2, "fullScreenActivity is not null and finishing");
            }
            fullScreenActivity2.finish();
        }
        if (this.f153499M == 0) {
            a(true, s11);
        } else {
            renderView.a(z10, s11);
            a(r());
        }
    }
}
