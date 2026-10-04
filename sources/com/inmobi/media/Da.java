package com.inmobi.media;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Da extends WebViewRenderProcessClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N4 f151855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fa f151856b;

    public Da(N4 n42, Fa fa2) {
        this.f151855a = n42;
        this.f151856b = fa2;
    }

    public final void onRenderProcessResponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        kotlin.jvm.internal.G.p(view, "view");
        N4 n42 = this.f151855a;
        if (n42 != null) {
            ((O4) n42).a("RenderViewRenderProcessClient", "onRenderProcessResponsive " + view + ' ' + webViewRenderProcess);
        }
        Fa fa2 = this.f151856b;
        if (fa2 != null) {
            Map mapA = fa2.a();
            mapA.put("creativeId", fa2.f151936a.f151800f);
            int i10 = fa2.f151939d + 1;
            fa2.f151939d = i10;
            mapA.put("count", Integer.valueOf(i10));
            Lb lb2 = Lb.f152196a;
            Lb.b("RenderProcessResponsive", mapA, Qb.f152402a);
        }
    }

    public final void onRenderProcessUnresponsive(WebView view, WebViewRenderProcess webViewRenderProcess) {
        kotlin.jvm.internal.G.p(view, "view");
        N4 n42 = this.f151855a;
        if (n42 != null) {
            ((O4) n42).a("RenderViewRenderProcessClient", "onRenderProcessUnresponsive " + view + ' ' + webViewRenderProcess);
        }
        Fa fa2 = this.f151856b;
        if (fa2 != null) {
            Map mapA = fa2.a();
            mapA.put("creativeId", fa2.f151936a.f151800f);
            int i10 = fa2.f151938c + 1;
            fa2.f151938c = i10;
            mapA.put("count", Integer.valueOf(i10));
            Lb lb2 = Lb.f152196a;
            Lb.b("RenderProcessUnResponsive", mapA, Qb.f152402a);
        }
    }
}
