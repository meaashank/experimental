package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import u4.g;

/* JADX INFO: loaded from: classes5.dex */
public class CollapsibleWebView extends CommonWebView {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.h> f157514v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.h> f157515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CopyOnWriteArrayList<e> f157516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f157517y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f157518z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.this.d();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.this.e();
        }
    }

    public class c implements CommonWebView.i {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.i
        public void a(String str) {
            CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
            collapsibleWebView.b(collapsibleWebView.f157534j, str);
        }
    }

    public class d extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Boolean f157522a = Boolean.FALSE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f157523b = "";

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f157522a.booleanValue()) {
                return;
            }
            CollapsibleWebView.this.a((View) webView, str);
            this.f157522a = Boolean.FALSE;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f157523b = str;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            HashMap map = new HashMap();
            map.put("type", CampaignEx.JSON_NATIVE_VIDEO_ERROR);
            map.put("url", str2);
            map.put("description", str);
            if (!this.f157522a.booleanValue() && this.f157523b.equals(str2)) {
                this.f157522a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, map);
            }
            CollapsibleWebView.this.a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            HashMap mapA = com.bytedance.sdk.openadsdk.activity.b.a("type", "http");
            String str = webResourceRequest.getUrl() + "";
            mapA.put("url", str);
            mapA.put("statusCode", webResourceResponse.getStatusCode() + "");
            mapA.put("description", "http error");
            if (!this.f157522a.booleanValue() && (this.f157523b.equals(str) || TextUtils.isEmpty(this.f157523b))) {
                this.f157522a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, mapA);
            }
            CollapsibleWebView.this.a(webView, mapA);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HashMap mapA = com.bytedance.sdk.openadsdk.activity.b.a("type", g.f239497B0);
            mapA.put("url", sslError.getUrl());
            mapA.put("description", "ssl error");
            if (!this.f157522a.booleanValue()) {
                if (this.f157523b.equals(sslError.getUrl() + "")) {
                    this.f157522a = Boolean.TRUE;
                    CollapsibleWebView.this.b(webView, mapA);
                }
            }
            CollapsibleWebView.this.a(webView, mapA);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            q0.b("CollapsibleWebView", "WebView called onRenderProcessGone");
            return true;
        }
    }

    public interface e {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Iterator<CommonWebView.h> it = this.f157514v.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Iterator<CommonWebView.h> it = this.f157515w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private ToolBar.b getCollapseButton() {
        return new ToolBar.b("doCollapse").a(false).a("mbridge_arrow_down_white_blackbg").a(new a());
    }

    private ToolBar.b getExpandButton() {
        return new ToolBar.b("doSpand").a("mbridge_arrow_up_black").a(new b());
    }

    public String getCollapseIconName() {
        return this.f157517y;
    }

    public String getExpandIconName() {
        return this.f157518z;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f157514v = new CopyOnWriteArrayList<>();
        this.f157515w = new CopyOnWriteArrayList<>();
        this.f157516x = new CopyOnWriteArrayList<>();
        this.f157517y = "mbridge_arrow_down_white_blackbg";
        this.f157518z = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        arrayList.add(getCollapseButton());
        arrayList.add(getExpandButton());
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new c());
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new d());
    }

    public void setCollapseIconName(String str) {
        this.f157517y = str;
    }

    public void setCollapseListener(CommonWebView.h hVar) {
        this.f157514v.add(hVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i10, int i11, int i12, int i13) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f157527c.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        this.f157527c.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f157518z = str;
    }

    public void setExpandListener(CommonWebView.h hVar) {
        this.f157515w.add(hVar);
    }

    public void setPageLoadListener(e eVar) {
        this.f157516x.add(eVar);
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, String str) {
        Iterator<e> it = this.f157516x.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, Map<String, String> map) {
        Iterator<e> it = this.f157516x.iterator();
        while (it.hasNext()) {
            it.next().b(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Map<String, String> map) {
        Iterator<e> it = this.f157516x.iterator();
        while (it.hasNext()) {
            it.next().a(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, String str) {
        Iterator<e> it = this.f157516x.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }
}
