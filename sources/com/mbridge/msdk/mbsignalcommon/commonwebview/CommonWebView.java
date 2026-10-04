package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.webview.ProgressBar;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f157525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f157526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ToolBar f157527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ToolBar f157528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ProgressBar f157529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RelativeLayout f157530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f157531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.b f157532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.commonwebview.a f157533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected BaseWebView f157534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.OnClickListener f157535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f157536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View.OnClickListener f157537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View.OnClickListener f157538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Handler f157539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f157540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WebViewClient f157541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f157542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private i f157543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f157544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f157545u;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("CommonWebView", "webview js!！超时上限：" + CommonWebView.this.f157540p + "ms");
            if (CommonWebView.this.f157543s != null) {
                CommonWebView.this.f157544t = false;
                CommonWebView.this.f157543s.a(CommonWebView.this.f157542r);
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            q0.c("CommonWebView", "newProgress! 开始! = " + str);
            CommonWebView.this.f157529e.setVisible(true);
            CommonWebView.this.f157529e.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th) {
                    q0.b("CommonWebView", th.getMessage());
                }
            }
            return true;
        }
    }

    public class c extends WebChromeClient {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebView.this.f157529e.setVisible(false);
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            q0.c("CommonWebView", "newProgress! = " + i10);
            if (i10 == 100) {
                CommonWebView.this.f157529e.setProgressState(7);
                new Handler().postDelayed(new a(), 200L);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f157534j;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f157528d.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f157534j.canGoBack()) {
                        CommonWebView.this.f157534j.goBack();
                    }
                    CommonWebView.this.f157528d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f157534j.canGoBack());
                    if (CommonWebView.this.f157535k != null) {
                        CommonWebView.this.f157535k.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f157528d.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f157534j.canGoForward()) {
                        CommonWebView.this.f157534j.goForward();
                    }
                    CommonWebView.this.f157528d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f157534j.canGoForward());
                    if (CommonWebView.this.f157536l != null) {
                        CommonWebView.this.f157536l.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f157528d.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f157534j.canGoBack());
                    CommonWebView.this.f157528d.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f157534j.canGoForward());
                    CommonWebView.this.f157534j.reload();
                    if (CommonWebView.this.f157537m != null) {
                        CommonWebView.this.f157537m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f157531g != null) {
                        CommonWebView.this.f157531g.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f157538n != null) {
                        CommonWebView.this.f157538n.onClick(view);
                    }
                    com.mbridge.msdk.click.c.c(CommonWebView.this.getContext(), CommonWebView.this.f157534j.getUrl());
                }
            }
        }
    }

    public class e extends WebViewClient {
        public e() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f157528d.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f157528d.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    public class f extends WebViewClient {
        public f() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (u0.a.b(str)) {
                u0.a.a(CommonWebView.this.getContext(), str, null);
            }
            return CommonWebView.this.a(webView, str);
        }
    }

    public class g extends WebViewClient {
        public g() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            CommonWebView.this.f157544t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            CommonWebView.this.f157542r = str;
            if (CommonWebView.this.f157544t) {
                return;
            }
            CommonWebView.this.f157544t = true;
            CommonWebView.this.c();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            CommonWebView.this.f157544t = false;
            CommonWebView.this.a();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f157542r = str;
            if (CommonWebView.this.f157544t) {
                CommonWebView.this.a();
            }
            CommonWebView.this.f157544t = true;
            CommonWebView.this.c();
            return false;
        }
    }

    public interface h {
        void a();
    }

    public interface i {
        void a(String str);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f157545u = new a();
        init();
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f157533i.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f157532h.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f157527c;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f157528d) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f157534j;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f157534j;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f157527c;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f157528d;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f157527c.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.f157530f = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.f157530f, layoutParams);
        this.f157525a = v0.a(getContext(), 40.0f);
        this.f157526b = v0.a(getContext(), 40.0f);
        this.f157532h = new com.mbridge.msdk.mbsignalcommon.commonwebview.b();
        this.f157533i = new com.mbridge.msdk.mbsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f157534j == null) {
                this.f157534j = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f157534j.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f157534j;
            com.mbridge.msdk.mbsignalcommon.base.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f157532h);
            this.f157534j.setWebChromeClient(this.f157533i);
            addWebViewClient(bVar);
        } catch (Throwable th) {
            q0.b("CommonWebView", "webview is error", th);
        }
        this.f157530f.addView(this.f157534j);
    }

    public void loadUrl(String str) {
        this.f157534j.loadUrl(str);
        if (this.f157541q != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f157535k = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f157536l = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f157538n = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f157537m = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f157533i.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f157532h.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f157527c.getParent()).removeView(this.f157527c);
        this.f157530f.addView(this.f157527c);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f157527c.getParent()).removeView(this.f157527c);
        addView(this.f157527c, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f157531g = onClickListener;
    }

    public void setPageLoadTimtout(int i10) {
        this.f157540p = i10;
        if (this.f157539o == null) {
            this.f157539o = new Handler(Looper.getMainLooper());
        }
        if (this.f157541q == null) {
            g gVar = new g();
            this.f157541q = gVar;
            addWebViewClient(gVar);
        }
    }

    public void setPageLoadTimtoutListener(i iVar) {
        this.f157543s = iVar;
    }

    public void setToolBarTitle(String str, int i10) {
        this.f157527c.setTitle(str, i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f157527c;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f157528d;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View viewFindToolBarButton = findToolBarButton(str);
        if (viewFindToolBarButton != null) {
            viewFindToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f157527c.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z10) {
        a(arrayList, z10);
    }

    public void useDeeplink() {
        addWebViewClient(new f());
    }

    public void useDefaultToolBar() {
        b();
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f157529e = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new b());
        addWebChromeClient(new c());
        addView(this.f157529e);
        this.f157529e.initResource(true);
    }

    private void b() {
        if (this.f157528d != null) {
            return;
        }
        this.f157528d = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f157526b);
        layoutParams.bottomMargin = 0;
        this.f157528d.setLayoutParams(layoutParams);
        this.f157528d.setBackgroundColor(-1);
        this.f157528d.setOnItemClickListener(new d());
        addWebViewClient(new e());
        addView(this.f157528d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f157539o.postDelayed(this.f157545u, this.f157540p);
    }

    public void setToolBarTitle(String str) {
        this.f157527c.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f157545u = new a();
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z10) {
        if (this.f157527c != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.a(40);
        aVar.b(80);
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f157527c = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, 255, 255, 255));
        if (z10) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f157525a);
            layoutParams.addRule(10);
            this.f157527c.setLayoutParams(layoutParams);
            this.f157530f.addView(this.f157527c);
            return;
        }
        this.f157527c.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f157525a));
        addView(this.f157527c, 0);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f157545u = new a();
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th) {
            q0.b("CommonWebView", th.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
            if (uri.getScheme().equals("intent")) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    str2 = uri2.getPackage();
                } catch (Throwable th2) {
                    q0.b("CommonWebView", th2.getMessage());
                }
                if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    uri2.setComponent(null);
                    uri2.setSelector(null);
                    uri2.setFlags(268435456);
                    getContext().startActivity(uri2);
                    return true;
                }
                try {
                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                } catch (Throwable th3) {
                    q0.b("CommonWebView", th3.getMessage());
                }
                q0.b("CommonWebView", th.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(getContext(), str)) {
                q0.b("CommonWebView", "openDeepLink");
                return true;
            }
            if (!TextUtils.isEmpty(str)) {
                return !(str.startsWith("http") || str.startsWith("https"));
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f157539o.removeCallbacks(this.f157545u);
    }
}
