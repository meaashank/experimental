package com.inmobi.media;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3594j4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C3552g4 f153036k = new C3552g4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f153037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f153041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N4 f153042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3761v4 f153043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3636m4 f153044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f153045i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3566h4 f153046j = new C3566h4(this);

    public C3594j4(byte b10, String str, int i10, int i11, int i12, N4 n42) {
        this.f153037a = b10;
        this.f153038b = str;
        this.f153039c = i10;
        this.f153040d = i11;
        this.f153041e = i12;
        this.f153042f = n42;
    }

    public final void a(View view) {
        C3761v4 c3761v4;
        kotlin.jvm.internal.G.p(view, "view");
        N4 n42 = this.f153042f;
        if (n42 != null) {
            ((O4) n42).c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (kotlin.jvm.internal.G.g(this.f153038b, "video") || kotlin.jvm.internal.G.g(this.f153038b, "audio") || (c3761v4 = this.f153043g) == null) {
            return;
        }
        c3761v4.f153442a.remove(view);
        c3761v4.f153443b.remove(view);
        c3761v4.f153444c.a(view);
        if (c3761v4.f153442a.isEmpty()) {
            N4 n43 = this.f153042f;
            if (n43 != null) {
                ((O4) n43).a("HtmlAdTracker", "Impression tracker is free, removing it");
            }
            C3761v4 c3761v42 = this.f153043g;
            if (c3761v42 != null) {
                c3761v42.f153442a.clear();
                c3761v42.f153443b.clear();
                c3761v42.f153444c.a();
                c3761v42.f153446e.removeMessages(0);
                c3761v42.f153444c.b();
            }
            this.f153043g = null;
        }
    }

    public final void b(View view) {
        kotlin.jvm.internal.G.p(view, "view");
        N4 n42 = this.f153042f;
        if (n42 != null) {
            ((O4) n42).c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        C3636m4 c3636m4 = this.f153044h;
        if (c3636m4 != null) {
            c3636m4.a(view);
            if (c3636m4.f152824a.isEmpty()) {
                N4 n43 = this.f153042f;
                if (n43 != null) {
                    ((O4) n43).a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                C3636m4 c3636m42 = this.f153044h;
                if (c3636m42 != null) {
                    c3636m42.b();
                }
                this.f153044h = null;
            }
        }
        this.f153045i.remove(view);
    }

    public final void b() {
        N4 n42 = this.f153042f;
        if (n42 != null) {
            ((O4) n42).c("HtmlAdTracker", "onActivityStopped");
        }
        C3761v4 c3761v4 = this.f153043g;
        if (c3761v4 != null) {
            String TAG = c3761v4.f153445d;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            c3761v4.f153444c.a();
            c3761v4.f153446e.removeCallbacksAndMessages(null);
            c3761v4.f153443b.clear();
        }
        C3636m4 c3636m4 = this.f153044h;
        if (c3636m4 != null) {
            c3636m4.e();
        }
    }

    public final void a() {
        N4 n42 = this.f153042f;
        if (n42 != null) {
            ((O4) n42).c("HtmlAdTracker", "onActivityStarted");
        }
        C3761v4 c3761v4 = this.f153043g;
        if (c3761v4 != null) {
            String TAG = c3761v4.f153445d;
            kotlin.jvm.internal.G.o(TAG, "TAG");
            for (Map.Entry entry : c3761v4.f153442a.entrySet()) {
                View view = (View) entry.getKey();
                C3733t4 c3733t4 = (C3733t4) entry.getValue();
                c3761v4.f153444c.a(view, c3733t4.f153396a, c3733t4.f153397b);
            }
            if (!c3761v4.f153446e.hasMessages(0)) {
                c3761v4.f153446e.postDelayed(c3761v4.f153447f, c3761v4.f153448g);
            }
            c3761v4.f153444c.f();
        }
        C3636m4 c3636m4 = this.f153044h;
        if (c3636m4 != null) {
            c3636m4.f();
        }
    }
}
