package com.bytedance.sdk.component.ZRu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.fragment.app.C2564b;

/* JADX INFO: loaded from: classes2.dex */
public class le extends ZRu {
    static final /* synthetic */ boolean aT = true;
    protected String FA;
    protected WebView Vor;

    @Override // com.bytedance.sdk.component.ZRu.ZRu
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void NOt(aT aTVar) {
        this.Vor = aTVar.ZRu;
        this.FA = aTVar.mZ;
        if (aTVar.edo) {
            return;
        }
        mZ();
    }

    @Override // com.bytedance.sdk.component.ZRu.ZRu
    public Context ZRu(aT aTVar) {
        Context context = aTVar.TFq;
        if (context != null) {
            return context;
        }
        WebView webView = aTVar.ZRu;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.ZRu.ZRu
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void mZ() {
        if (!aT && this.Vor == null) {
            throw new AssertionError();
        }
        this.Vor.addJavascriptInterface(this, this.FA);
    }

    public void uR() {
        this.Vor.removeJavascriptInterface(this.FA);
    }

    @Override // com.bytedance.sdk.component.ZRu.ZRu
    public void NOt() {
        super.NOt();
        uR();
    }

    @Override // com.bytedance.sdk.component.ZRu.ZRu
    public String ZRu() {
        return this.Vor.getUrl();
    }

    @Override // com.bytedance.sdk.component.ZRu.ZRu
    public void ZRu(String str, yBV ybv) {
        if (ybv != null && !TextUtils.isEmpty(ybv.FA)) {
            String str2 = ybv.FA;
            ZRu(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.ZRu(str, ybv);
    }

    @Override // com.bytedance.sdk.component.ZRu.ZRu
    public void ZRu(String str) {
        ZRu(str, C2564b.a(new StringBuilder("javascript:"), this.FA, "._handleMessageFromToutiao(", str, ")"));
    }

    private void ZRu(String str, final String str2) {
        if (this.Ht || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.ZRu.le.1
            @Override // java.lang.Runnable
            public void run() {
                if (le.this.Ht) {
                    return;
                }
                try {
                    le.this.Vor.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.uR.post(runnable);
        } else {
            runnable.run();
        }
    }
}
