package com.iab.omid.library.inmobi.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.internal.g;
import com.iab.omid.library.inmobi.internal.h;
import com.iab.omid.library.inmobi.utils.c;
import com.iab.omid.library.inmobi.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class b extends AdSessionStatePublisher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WebView f151471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f151472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f151473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f151474j;

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

    /* JADX INFO: renamed from: com.iab.omid.library.inmobi.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0530b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WebView f151476a;

        public RunnableC0530b() {
            this.f151476a = b.this.f151471g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f151476a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f151472h = null;
        this.f151473i = map;
        this.f151474j = str2;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0530b(), Math.max(4000 - (this.f151472h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f151472h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f151471g = null;
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f151471g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f151471g.getSettings().setAllowContentAccess(false);
        this.f151471g.getSettings().setAllowFileAccess(false);
        this.f151471g.setWebViewClient(new a());
        a(this.f151471g);
        h.a().c(this.f151471g, this.f151474j);
        for (String str : this.f151473i.keySet()) {
            h.a().c(this.f151471g, this.f151473i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f151472h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.inmobi.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
