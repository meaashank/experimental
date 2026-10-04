package com.bytedance.sdk.component.utils;

import android.annotation.TargetApi;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class ZH {
    private static final ZRu ZRu = new NOt();

    @TargetApi(19)
    public static class NOt extends ZRu {
        private NOt() {
            super();
        }

        @Override // com.bytedance.sdk.component.utils.ZH.ZRu
        public void ZRu(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            if (str != null && str.startsWith("javascript:")) {
                try {
                    webView.evaluateJavascript(str, null);
                    return;
                } catch (Throwable th) {
                    boolean z10 = th instanceof IllegalStateException;
                }
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static class ZRu {
        private ZRu() {
        }

        public void ZRu(WebView webView, String str) {
            if (webView == null) {
                return;
            }
            try {
                webView.loadUrl(str);
            } catch (Throwable unused) {
            }
        }
    }

    public static void ZRu(WebView webView, String str) {
        ZRu.ZRu(webView, str);
    }
}
