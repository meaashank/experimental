package com.bytedance.sdk.component.Vor;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.Vor.ZRu;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends WebViewClient {
    private final ZRu.InterfaceC0413ZRu NOt;
    private final WebViewClient ZRu;
    private final List<String> mZ;

    public TFq(ZRu.InterfaceC0413ZRu interfaceC0413ZRu, WebViewClient webViewClient, List<String> list) {
        this.NOt = interfaceC0413ZRu;
        this.ZRu = webViewClient;
        this.mZ = list;
    }

    private int ZRu(WebView webView) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                return webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.ZRu.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ZRu.InterfaceC0413ZRu interfaceC0413ZRu = this.NOt;
        if (interfaceC0413ZRu != null) {
            interfaceC0413ZRu.ZRu(ZRu(webView));
        }
        this.ZRu.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.ZRu.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.ZRu.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.ZRu.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return Build.VERSION.SDK_INT >= 26 ? this.ZRu.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.ZRu.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ZRu.InterfaceC0413ZRu interfaceC0413ZRu = this.NOt;
        if (interfaceC0413ZRu != null) {
            interfaceC0413ZRu.ZRu();
        }
        return this.ZRu.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.ZRu.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        ZRu.InterfaceC0413ZRu interfaceC0413ZRu;
        if (NOt.ZRu(this.mZ, webResourceRequest.getUrl().toString()) && (interfaceC0413ZRu = this.NOt) != null) {
            interfaceC0413ZRu.ZRu();
        }
        return this.ZRu.shouldInterceptRequest(webView, webResourceRequest);
    }
}
