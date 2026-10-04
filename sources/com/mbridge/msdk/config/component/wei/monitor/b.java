package com.mbridge.msdk.config.component.wei.monitor;

import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.adsession.AdSession;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    AdSession f154893a;

    public b(AdSession adSession) {
        this.f154893a = adSession;
    }

    public void a(WebView webView) {
        this.f154893a.registerAdView(webView);
    }
}
