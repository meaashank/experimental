package com.inmobi.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import ed.InterfaceC4376a;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class B3 extends K1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f151763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC4376a f151764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ed.p f151765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z5 f151766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public W5 f151767j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(String api, InterfaceC4376a onUserLandingCompleted, ed.p fireLandingPageTracker, N4 n42) {
        super(n42);
        kotlin.jvm.internal.G.p(api, "api");
        kotlin.jvm.internal.G.p(onUserLandingCompleted, "onUserLandingCompleted");
        kotlin.jvm.internal.G.p(fireLandingPageTracker, "fireLandingPageTracker");
        this.f151763f = api;
        this.f151764g = onUserLandingCompleted;
        this.f151765h = fireLandingPageTracker;
    }

    public final boolean a(WebView webView, String str) {
        String str2;
        Integer num;
        int i10;
        A3 a32;
        Ac userLeftApplicationListener;
        if (this.f152152e.get()) {
            return true;
        }
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", T.a("onShouldOverrideUrlLoading: ", str));
        }
        if (webView instanceof J1) {
            str2 = str;
            S5 s5A = U5.a(((J1) webView).getLandingPageHandler(), this.f151763f, null, str2, this.f151766i, false, 16);
            num = s5A.f152434b;
            i10 = s5A.f152433a;
        } else {
            str2 = str;
            num = null;
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                return false;
            }
            a(3, false, str2, Integer.valueOf(num != null ? num.intValue() : 10));
            return true;
        }
        if (webView instanceof F3) {
            ViewParent parent = ((F3) webView).getParent();
            if ((parent instanceof C3788x3) && (userLeftApplicationListener = ((C3788x3) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        a((View) webView);
        if (!AbstractC3592j2.a(str2)) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (webView instanceof F3) {
                ViewParent parent2 = ((F3) webView).getParent();
                if ((parent2 instanceof C3788x3) && (a32 = ((C3788x3) parent2).f153518c) != null) {
                    C3803y4.a(((C3789x4) a32).f153521a);
                }
            }
        }
        a(this, 2, false, str2, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", T.a("onPageCommitVisible: ", str));
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.K1, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", T.a("onPageFinished: ", str));
        }
        a(this, 2, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", T.a("onPageStarted: ", str));
        }
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i10, String description, String failingUrl) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(description, "description");
        kotlin.jvm.internal.G.p(failingUrl, "failingUrl");
        a(3, false, failingUrl, Integer.valueOf(i10));
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", T.a("onReceivedError: ", failingUrl));
        }
    }

    @Override // com.inmobi.media.K1, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(detail, "detail");
        boolean zOnRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            a(3, true, null, 8007);
            Map mapJ0 = kotlin.collections.n0.j0(new Pair("source", "embedded_browser"), new Pair("isCrashed", Boolean.valueOf(detail.didCrash())));
            Lb lb2 = Lb.f152196a;
            Lb.b("WebViewRenderProcessGoneEvent", mapJ0, Qb.f152402a);
        }
        return zOnRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string;
        Uri url;
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (!C3635m3.y()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "";
        }
        if (webView == null || string.length() <= 0) {
            return false;
        }
        return a(webView, string);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        kotlin.jvm.internal.G.p(view, "view");
        kotlin.jvm.internal.G.p(request, "request");
        kotlin.jvm.internal.G.p(error, "error");
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            a(3, true, request.getUrl().toString(), Integer.valueOf(error.getErrorCode()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        N4 n42 = this.f152148a;
        if (n42 != null) {
            ((O4) n42).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    public static /* synthetic */ void a(B3 b32, int i10, boolean z10, String str, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        b32.a(i10, z10, str, null);
    }

    public final void a(int i10, boolean z10, String str, Integer num) {
        W5 w52 = this.f151767j;
        if (w52 != null) {
            try {
                if (w52.f152550e) {
                    return;
                }
                Z5 z52 = w52.f152546a;
                if (z52 != null) {
                    z52.f152653g = "IN_CUSTOM";
                }
                switch (i10) {
                    case 1:
                        if (z10) {
                            w52.f152549d = str;
                            B3 b32 = w52.f152547b;
                            N5 funnelState = N5.f152291h;
                            b32.getClass();
                            kotlin.jvm.internal.G.p(funnelState, "funnelState");
                            R5.a(funnelState, z52, (Integer) null, b32.f151765h);
                        }
                        break;
                    case 2:
                        if (z10) {
                            w52.f152549d = str;
                            w52.f152550e = true;
                            if (!w52.f152548c.contains(1)) {
                                B3 b33 = w52.f152547b;
                                N5 funnelState2 = N5.f152291h;
                                Z5 z53 = w52.f152546a;
                                b33.getClass();
                                kotlin.jvm.internal.G.p(funnelState2, "funnelState");
                                R5.a(funnelState2, z53, (Integer) 8006, b33.f151765h);
                            }
                            w52.f152547b.f151764g.invoke();
                            B3 b34 = w52.f152547b;
                            N5 funnelState3 = N5.f152292i;
                            Z5 z54 = w52.f152546a;
                            b34.getClass();
                            kotlin.jvm.internal.G.p(funnelState3, "funnelState");
                            R5.a(funnelState3, z54, (Integer) null, b34.f151765h);
                        }
                        break;
                    case 3:
                        if (z10 || (str != null && str.equals(w52.f152549d))) {
                            w52.f152550e = true;
                            if (!w52.f152548c.contains(1)) {
                                B3 b35 = w52.f152547b;
                                N5 funnelState4 = N5.f152291h;
                                Z5 z55 = w52.f152546a;
                                b35.getClass();
                                kotlin.jvm.internal.G.p(funnelState4, "funnelState");
                                R5.a(funnelState4, z55, (Integer) 8006, b35.f151765h);
                            }
                            B3 b36 = w52.f152547b;
                            N5 funnelState5 = N5.f152293j;
                            Z5 z56 = w52.f152546a;
                            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                            b36.getClass();
                            kotlin.jvm.internal.G.p(funnelState5, "funnelState");
                            R5.a(funnelState5, z56, numValueOf, b36.f151765h);
                        }
                        break;
                    case 4:
                        if (z10) {
                            w52.f152549d = str;
                        }
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        w52.f152550e = true;
                        switch (i10) {
                            case 5:
                                i = 8200;
                                break;
                            case 6:
                                i = 8300;
                                break;
                            case 7:
                                i = 8400;
                                break;
                            case 8:
                                i = 8600;
                                break;
                            case 9:
                                i = 8500;
                                break;
                        }
                        int i11 = 4;
                        if (!w52.f152548c.contains(4)) {
                            i11 = 0;
                        }
                        int i12 = i + i11;
                        B3 b37 = w52.f152547b;
                        N5 funnelState6 = N5.f152293j;
                        Z5 z57 = w52.f152546a;
                        Integer numValueOf2 = Integer.valueOf(i12);
                        b37.getClass();
                        kotlin.jvm.internal.G.p(funnelState6, "funnelState");
                        R5.a(funnelState6, z57, numValueOf2, b37.f151765h);
                        break;
                }
                w52.f152548c.add(Integer.valueOf(i10));
            } catch (Exception e10) {
                e10.toString();
            }
        }
    }
}
