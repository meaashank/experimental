package com.bytedance.sdk.openadsdk.core.widget.ZRu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.lp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private final WeakReference<Context> ZRu;
    private boolean NOt = true;
    private final boolean mZ = true;
    private final boolean uR = true;
    private final boolean TFq = false;
    private final boolean Ht = true;
    private boolean Mm = true;

    private mZ(Context context) {
        this.ZRu = new WeakReference<>(context);
    }

    public static mZ ZRu(Context context) {
        return new mZ(context);
    }

    public mZ NOt(boolean z10) {
        this.NOt = z10;
        return this;
    }

    public static void NOt(WebView webView) {
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            lp.NOt(th.toString());
        }
    }

    public mZ ZRu(boolean z10) {
        this.Mm = z10;
        return this;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void ZRu(WebView webView) {
        if (webView == null || this.ZRu.get() == null) {
            return;
        }
        NOt(webView);
        WebSettings settings = webView.getSettings();
        ZRu(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e10) {
            lp.ZRu("SSWebSettings", e10.getMessage());
        }
        try {
            if (this.NOt) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            lp.ZRu("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.Mm) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            lp.ZRu("SSWebSettings", th2.getMessage());
        }
    }

    private void ZRu(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            lp.NOt(th.toString());
        }
    }
}
