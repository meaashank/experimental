package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.inmobi.media.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3761v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f153442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f153443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dd f153444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f153445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f153446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RunnableC3747u4 f153447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f153448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC3719s4 f153449h;

    public C3761v4(AdConfig.ViewabilityConfig viewabilityConfig, dd visibilityTracker, InterfaceC3719s4 listener) {
        kotlin.jvm.internal.G.p(viewabilityConfig, "viewabilityConfig");
        kotlin.jvm.internal.G.p(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.G.p(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f153442a = weakHashMap;
        this.f153443b = weakHashMap2;
        this.f153444c = visibilityTracker;
        this.f153445d = "v4";
        this.f153448g = viewabilityConfig.getImpressionPollIntervalMillis();
        C3705r4 c3705r4 = new C3705r4(this);
        N4 n42 = visibilityTracker.f152828e;
        if (n42 != null) {
            ((O4) n42).c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.f152833j = c3705r4;
        this.f153446e = handler;
        this.f153447f = new RunnableC3747u4(this);
        this.f153449h = listener;
    }

    public final void a(View view, Object token, int i10, int i11) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(token, "token");
        C3733t4 c3733t4 = (C3733t4) this.f153442a.get(view);
        if (kotlin.jvm.internal.G.g(c3733t4 != null ? c3733t4.f153396a : null, token)) {
            return;
        }
        a(view);
        this.f153442a.put(view, new C3733t4(token, i10, i11));
        this.f153444c.a(view, token, i10);
    }

    public final void a(View view) {
        kotlin.jvm.internal.G.p(view, "view");
        this.f153442a.remove(view);
        this.f153443b.remove(view);
        this.f153444c.a(view);
    }
}
