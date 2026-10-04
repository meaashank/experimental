package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes5.dex */
public final class nd extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail renderProcessGoneDetail) {
        kotlin.jvm.internal.G.p(view, "view");
        return od.a(view, renderProcessGoneDetail, "safe_web_view");
    }
}
