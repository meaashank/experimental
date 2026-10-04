package com.mbridge.msdk.click;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.prism.commons.utils.C3843g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f154053r = "o";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f154054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f154055b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f154057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f154058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f154059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f154060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WebView f154061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f154062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f154063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f154064k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f154066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f154067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f154068o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f154065l = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f154069p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f154070q = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f154056c = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f154071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f154072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f154073c;

        public a(String str, String str2, Context context) {
            this.f154071a = str;
            this.f154072b = str2;
            this.f154073c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            oVar.a(this.f154071a, this.f154072b, this.f154073c, oVar.f154059f);
        }
    }

    public class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f154075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f154076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f154077c;

        public b(String str, String str2, Context context) {
            this.f154075a = str;
            this.f154076b = str2;
            this.f154077c = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            try {
                webView.loadUrl("javascript:window.navigator.vibrate([]);");
                if (o.this.f154066m) {
                    o.this.f154064k = 0;
                    o.this.f();
                    return;
                }
                o.this.f154068o = false;
                if (webView.getTag() == null) {
                    webView.setTag("has_first_started");
                } else {
                    o.this.f154067n = true;
                }
                synchronized (o.f154053r) {
                    try {
                        o.this.f154059f = str;
                        if (o.this.f154058e == null || !o.this.f154058e.a(str)) {
                            o.this.h();
                        } else {
                            o.this.f154066m = true;
                            o.this.f();
                        }
                    } finally {
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            synchronized (o.f154053r) {
                o.this.f154066m = true;
                o.this.b();
                o.this.f();
            }
            if (o.this.f154058e != null) {
                o.this.f154058e.a(i10, webView.getUrl(), str, o.this.f154063j);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            try {
                if (MBridgeConstans.IS_SP_CBT_CF && sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (TextUtils.isEmpty(this.f154075a) || TextUtils.isEmpty(this.f154076b)) {
                    return;
                }
                new com.mbridge.msdk.foundation.same.report.h(this.f154077c).a(this.f154076b, this.f154075a, webView.getUrl());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                synchronized (o.f154053r) {
                    o.this.f154066m = true;
                    o.this.b();
                    o.this.f();
                }
                if (o.this.f154058e != null) {
                    o.this.f154058e.a(-1, webView.getUrl(), "WebView render process crash.", o.this.f154063j);
                }
                if (webView != null) {
                    webView.destroy();
                }
                return true;
            } catch (Throwable th) {
                q0.b(o.f154053r, th.getMessage());
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            synchronized (o.f154053r) {
                try {
                    o oVar = o.this;
                    oVar.f154068o = true;
                    oVar.c();
                    if (o.this.f154066m) {
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    o.this.f154059f = str;
                    if (o.this.f154058e != null && o.this.f154058e.c(str)) {
                        o.this.f154066m = true;
                        o.this.d();
                        o.this.f();
                        return true;
                    }
                    if (o.this.f154062i) {
                        HashMap map = new HashMap();
                        if (o.this.f154061h.getUrl() != null) {
                            map.put("Referer", o.this.f154061h.getUrl());
                        }
                        o.this.f154061h.loadUrl(str, map);
                    } else {
                        o.this.f154061h.loadUrl(str);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                try {
                    webView.loadUrl("javascript:window.navigator.vibrate([]);");
                    if (!o.this.f154066m) {
                        o oVar = o.this;
                        if (!oVar.f154068o) {
                            oVar.g();
                        }
                    }
                    if (o.this.f154058e != null) {
                        o.this.f154058e.b(webView.getUrl());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f154065l = true;
            o.this.f154064k = 1;
            o.this.e();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f154065l = true;
            o.this.f154064k = 2;
            o.this.e();
        }
    }

    public interface f {
        void a(int i10, String str, String str2, String str3);

        void a(String str, boolean z10, String str2);

        boolean a(String str);

        boolean b(String str);

        boolean c(String str);
    }

    public o() {
        this.f154054a = 15000;
        this.f154055b = 3000;
        com.mbridge.msdk.setting.g gVarA = com.mbridge.msdk.advanced.manager.g.a(com.mbridge.msdk.setting.i.b());
        this.f154057d = gVarA;
        if (gVarA == null) {
            this.f154057d = com.mbridge.msdk.setting.i.b().a();
        }
        this.f154062i = this.f154057d.O0();
        this.f154054a = (int) this.f154057d.u0();
        this.f154055b = (int) this.f154057d.u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f154056c.removeCallbacks(this.f154069p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f154056c.removeCallbacks(this.f154070q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        synchronized (f154053r) {
            try {
                try {
                    b();
                    this.f154061h.destroy();
                    f fVar = this.f154058e;
                    if (fVar != null) {
                        fVar.a(this.f154059f, this.f154065l, this.f154063j);
                    }
                } catch (Exception e10) {
                    q0.b(f154053r, e10.getMessage());
                } catch (Throwable th) {
                    q0.b(f154053r, th.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        synchronized (f154053r) {
            try {
                try {
                    try {
                        b();
                        f fVar = this.f154058e;
                        if (fVar != null) {
                            fVar.a(this.f154059f, this.f154065l, this.f154063j);
                        }
                    } finally {
                    }
                } catch (Exception e10) {
                    q0.b(f154053r, e10.getMessage());
                }
            } catch (Throwable th) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        c();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        d();
        j();
    }

    private void i() {
        this.f154056c.postDelayed(this.f154069p, this.f154055b);
    }

    private void j() {
        this.f154056c.postDelayed(this.f154070q, this.f154054a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        c();
        d();
    }

    public void a(String str, String str2, Context context, String str3, String str4, f fVar) {
        if (fVar != null) {
            this.f154060g = str4;
            this.f154059f = str3;
            this.f154058e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    public void a(String str, String str2, Context context, String str3, f fVar) {
        if (fVar != null) {
            this.f154059f = str3;
            this.f154058e = fVar;
            a(str, str2, context);
            return;
        }
        throw new NullPointerException("OverrideUrlLoadingListener can not be null");
    }

    private void a(String str, String str2, Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str, str2, context, this.f154059f);
        } else {
            this.f154056c.post(new a(str, str2, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.f154060g)) {
                this.f154061h.getSettings().setDefaultTextEncodingName(C3843g.f162098b);
                this.f154055b = 2000;
                this.f154054a = 2000;
                q0.c(f154053r, this.f154060g);
                this.f154061h.loadDataWithBaseURL(str3, this.f154060g, "*/*", C3843g.f162098b, str3);
                return;
            }
            if (this.f154062i) {
                HashMap map = new HashMap();
                if (this.f154061h.getUrl() != null) {
                    map.put("Referer", this.f154061h.getUrl());
                }
                this.f154061h.loadUrl(str3, map);
                return;
            }
            this.f154061h.loadUrl(str3);
        } catch (Throwable th) {
            try {
                f fVar = this.f154058e;
                if (fVar != null) {
                    fVar.a(0, this.f154059f, th.getMessage(), this.f154063j);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, String str, String str2) {
        WebView webView = new WebView(context);
        this.f154061h = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f154061h.getSettings().setCacheMode(2);
        this.f154061h.getSettings().setLoadsImagesAutomatically(false);
        this.f154061h.setWebViewClient(new b(str2, str, context));
        this.f154061h.setWebChromeClient(new c());
    }
}
