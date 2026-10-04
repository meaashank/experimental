package com.iab.omid.library.bytedance2.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.h;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f151342g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f151343h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f151344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f151345j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0526b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f151347a;

        public RunnableC0526b() {
            this.f151347a = b.this.f151342g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f151347a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f151343h = null;
        this.f151344i = map;
        this.f151345j = str2;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0526b(), Math.max(4000 - (this.f151343h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f151343h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f151342g = null;
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f151342g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f151342g.getSettings().setAllowContentAccess(false);
        this.f151342g.getSettings().setAllowFileAccess(false);
        this.f151342g.setWebViewClient(new a());
        a(this.f151342g);
        h.a().c(this.f151342g, this.f151345j);
        for (String str : this.f151344i.keySet()) {
            h.a().c(this.f151342g, this.f151344i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f151343h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.bytedance2.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
