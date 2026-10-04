package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3583i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f153001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N4 f153002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153003c = "i7";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f153004d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f153005e = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f153006f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3541f7 f153007g = new C3541f7();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3569h7 f153008h = new C3569h7(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3555g7 f153009i = new C3555g7();

    public C3583i7(byte b10, N4 n42) {
        this.f153001a = b10;
        this.f153002b = n42;
    }

    public final void a(Context context, View view, C3499c7 token, AdConfig.ViewabilityConfig viewabilityConfig) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(token, "token");
        kotlin.jvm.internal.G.p(viewabilityConfig, "viewabilityConfig");
        C3761v4 c3761v4 = (C3761v4) this.f153004d.get(context);
        if (c3761v4 == null) {
            c3761v4 = context instanceof Activity ? new C3761v4(viewabilityConfig, new C3509d3(this.f153009i, (Activity) context, this.f153002b), this.f153007g) : new C3761v4(viewabilityConfig, new D9(this.f153009i, viewabilityConfig, (byte) 1, this.f153002b), this.f153007g);
            this.f153004d.put(context, c3761v4);
        }
        byte b10 = this.f153001a;
        if (b10 == 0) {
            c3761v4.a(view, token, viewabilityConfig.getVideoImpressionMinPercentageViewed(), viewabilityConfig.getVideoImpressionMinTimeViewed());
        } else if (b10 == 1) {
            c3761v4.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        } else {
            c3761v4.a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        }
    }

    public final void a(Context context, C3499c7 token) {
        View view;
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(token, "token");
        C3761v4 c3761v4 = (C3761v4) this.f153004d.get(context);
        if (c3761v4 != null) {
            Iterator it = c3761v4.f153442a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (kotlin.jvm.internal.G.g(((C3733t4) entry.getValue()).f153396a, token)) {
                    view = (View) entry.getKey();
                    break;
                }
            }
            if (view != null) {
                c3761v4.f153442a.remove(view);
                c3761v4.f153443b.remove(view);
                c3761v4.f153444c.a(view);
            }
            if (c3761v4.f153442a.isEmpty()) {
                N4 n42 = this.f153002b;
                if (n42 != null) {
                    String TAG = this.f153003c;
                    kotlin.jvm.internal.G.o(TAG, "TAG");
                    ((O4) n42).a(TAG, "Impression tracker is free, removing it");
                }
                C3761v4 c3761v42 = (C3761v4) this.f153004d.remove(context);
                if (c3761v42 != null) {
                    c3761v42.f153442a.clear();
                    c3761v42.f153443b.clear();
                    c3761v42.f153444c.a();
                    c3761v42.f153446e.removeMessages(0);
                    c3761v42.f153444c.b();
                }
                if (context instanceof Activity) {
                    this.f153004d.isEmpty();
                }
            }
        }
    }

    public final void a(Context context, View view, C3499c7 token) {
        View view2;
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(token, "token");
        dd ddVar = (dd) this.f153005e.get(context);
        if (ddVar != null) {
            Iterator it = ddVar.f152824a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view2 = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (kotlin.jvm.internal.G.g(((ad) entry.getValue()).f152713d, token)) {
                    view2 = (View) entry.getKey();
                    break;
                }
            }
            if (view2 != null) {
                ddVar.a(view2);
            }
            if (ddVar.f152824a.isEmpty()) {
                N4 n42 = this.f153002b;
                if (n42 != null) {
                    String TAG = this.f153003c;
                    kotlin.jvm.internal.G.o(TAG, "TAG");
                    ((O4) n42).a(TAG, "Impression tracker is free, removing it");
                }
                dd ddVar2 = (dd) this.f153005e.remove(context);
                if (ddVar2 != null) {
                    ddVar2.b();
                }
                if (context instanceof Activity) {
                    this.f153005e.isEmpty();
                }
            }
        }
        this.f153006f.remove(view);
    }

    public final void a(Context context, View view, C3499c7 token, Wc listener, AdConfig.ViewabilityConfig config) {
        kotlin.jvm.internal.G.p(context, "context");
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(token, "token");
        kotlin.jvm.internal.G.p(listener, "listener");
        kotlin.jvm.internal.G.p(config, "config");
        dd d92 = (dd) this.f153005e.get(context);
        if (d92 == null) {
            if (context instanceof Activity) {
                d92 = new C3509d3(this.f153009i, (Activity) context, this.f153002b);
            } else {
                d92 = new D9(this.f153009i, config, (byte) 1, this.f153002b);
            }
            C3569h7 c3569h7 = this.f153008h;
            N4 n42 = d92.f152828e;
            if (n42 != null) {
                ((O4) n42).c("VisibilityTracker", "setVisibilityTrackerListener logger");
            }
            d92.f152833j = c3569h7;
            this.f153005e.put(context, d92);
        }
        this.f153006f.put(view, listener);
        byte b10 = this.f153001a;
        if (b10 == 0) {
            d92.a(view, token, config.getVideoMinPercentagePlay());
        } else if (b10 == 1) {
            d92.a(view, token, config.getDisplayMinPercentageAnimate());
        } else {
            d92.a(view, token, config.getDisplayMinPercentageAnimate());
        }
    }
}
