package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C3464a0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3464a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdConfig.AdQualityConfig f152662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N4 f152663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f152664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f152665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f152666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f152667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AdQualityControl f152668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Vc f152669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AdQualityResult f152670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f152671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONObject f152672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f152673l;

    public C3464a0(AdConfig.AdQualityConfig adQualityConfig, N4 n42) {
        kotlin.jvm.internal.G.p(adQualityConfig, "adQualityConfig");
        this.f152662a = adQualityConfig;
        this.f152663b = n42;
        this.f152664c = new AtomicBoolean(false);
        this.f152665d = new AtomicBoolean(false);
        this.f152666e = new AtomicBoolean(false);
        this.f152667f = new CopyOnWriteArrayList();
        this.f152669h = Vc.f152530a;
        this.f152671j = "";
        this.f152672k = new JSONObject();
        this.f152673l = new AtomicBoolean(false);
    }

    public final boolean a() {
        if (this.f152664c.get()) {
            a("ad quality session is already in progress. skipping...");
            return false;
        }
        if (!this.f152662a.getEnabled()) {
            a("config kill switch - false. ad quality will skip");
            return false;
        }
        if (this.f152668g == null) {
            a("setup not done. skipping");
            return false;
        }
        Vc vc2 = this.f152669h;
        if (vc2 != Vc.f152530a && vc2 != Vc.f152531b) {
            return true;
        }
        a("ad view is not visible. skipping");
        return false;
    }

    public final void a(AdQualityResult adQualityResult, boolean z10) {
        if (adQualityResult.getBeaconUrl().length() == 0) {
            a("beacon is empty");
            return;
        }
        Z9 z92 = new Z9(adQualityResult);
        U u10 = new U(this, z10);
        V shouldProcess = V.f152496a;
        kotlin.jvm.internal.G.p(shouldProcess, "shouldProcess");
        ScheduledExecutorService scheduledExecutorService = P.f152360a;
        P.a(0L, new C3505d(shouldProcess, z92, u10));
    }

    public final void a(final View view, final long j10, final boolean z10, final C3670oa c3670oa) {
        a("isCapture started - " + this.f152673l.get() + ", isReporting - " + z10);
        if (this.f152673l.get() && !z10) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            view.post(new Runnable() { // from class: F5.L0
                @Override // java.lang.Runnable
                public final void run() {
                    C3464a0.a(this.f34347a, view, j10, z10, c3670oa);
                }
            });
        }
    }

    public static final void a(C3464a0 this$0, View adView, long j10, boolean z10, C3670oa c3670oa) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(adView, "$adView");
        Log.i("AdQualityManager", "starting capture - draw");
        C3601jb c3601jb = new C3601jb(adView, this$0.f152662a);
        if (!z10) {
            this$0.f152667f.add(c3601jb);
        }
        Y y10 = new Y(this$0, c3601jb, z10, c3670oa);
        Z z11 = new Z(this$0);
        ScheduledExecutorService scheduledExecutorService = P.f152360a;
        P.a(j10, new C3505d(z11, c3601jb, y10));
        this$0.f152673l.set(!z10);
    }

    public final void a(final Activity activity, final long j10, final boolean z10, final C3670oa c3670oa) {
        a("isCapture started - " + this.f152673l.get() + ", isReporting - " + z10);
        if (this.f152673l.get() && !z10) {
            a((Exception) null, "Screenshot process already in progress... skipping...");
        } else {
            activity.getWindow().getDecorView().post(new Runnable() { // from class: F5.K0
                @Override // java.lang.Runnable
                public final void run() {
                    C3464a0.a(this.f34340a, activity, j10, z10, c3670oa);
                }
            });
        }
    }

    public static final void a(C3464a0 this$0, Activity activity, long j10, boolean z10, C3670oa c3670oa) {
        kotlin.jvm.internal.G.p(this$0, "this$0");
        kotlin.jvm.internal.G.p(activity, "$activity");
        this$0.a("activity is visible");
        Window window = activity.getWindow();
        kotlin.jvm.internal.G.o(window, "getWindow(...)");
        C9 c92 = new C9(window, this$0.f152662a);
        if (!z10) {
            this$0.f152667f.add(c92);
        }
        Y y10 = new Y(this$0, c92, z10, c3670oa);
        Z z11 = new Z(this$0);
        ScheduledExecutorService scheduledExecutorService = P.f152360a;
        P.a(j10, new C3505d(z11, c92, y10));
        this$0.f152673l.set(!z10);
    }

    public final void a(String str, byte[] bArr, boolean z10) {
        Context contextD = C3657nb.d();
        if (contextD != null) {
            C3824zb c3824zb = new C3824zb(contextD.getFilesDir().getAbsolutePath() + "/adQuality/screenshots", bArr);
            if (!z10) {
                this.f152667f.add(c3824zb);
            }
            W w10 = new W(this, z10, c3824zb, str);
            X shouldProcess = X.f152578a;
            kotlin.jvm.internal.G.p(shouldProcess, "shouldProcess");
            ScheduledExecutorService scheduledExecutorService = P.f152360a;
            P.a(0L, new C3505d(shouldProcess, c3824zb, w10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3464a0.a(boolean):void");
    }

    public final void a(String str) {
        N4 n42 = this.f152663b;
        if (n42 != null) {
            ((O4) n42).a("AdQualityManager", str);
        }
    }

    public final void a(Exception exc, String str) {
        kotlin.L0 l02;
        if (exc != null) {
            N4 n42 = this.f152663b;
            if (n42 != null) {
                ((O4) n42).a("AdQualityManager", str, exc);
                l02 = kotlin.L0.f217464a;
            } else {
                l02 = null;
            }
            if (l02 != null) {
                return;
            }
        }
        N4 n43 = this.f152663b;
        if (n43 != null) {
            ((O4) n43).b("AdQualityManager", T.a("Error with null exception : ", str));
        }
    }
}
