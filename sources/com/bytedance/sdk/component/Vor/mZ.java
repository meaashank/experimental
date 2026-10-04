package com.bytedance.sdk.component.Vor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.Vor.uR;
import com.bytedance.sdk.component.utils.lp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends WebView {
    private ZRu Ht;
    private final HashSet<String> NOt;
    private boolean TFq;
    public long ZRu;
    private boolean mZ;
    private boolean uR;

    public mZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.NOt = new HashSet<>();
        this.ZRu = System.currentTimeMillis();
        ZRu();
    }

    private void NOt() {
        if (this.mZ) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.NOt.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    private void ZRu() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new uR.ZRu());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        } else {
            super.addJavascriptInterface(obj, str);
            this.NOt.add(str);
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z10) {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        } else {
            super.clearCache(z10);
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.mZ) {
            return;
        }
        this.mZ = true;
        NOt();
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.mZ && !this.TFq) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            lp.ZRu("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        } else {
            super.goBack();
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i10) {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        } else {
            super.goBackOrForward(i10);
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        } else {
            super.goForward();
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e10) {
            lp.ZRu("TTAD.PangleWebView", "loadUrl: ", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.uR) {
            destroy();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mZ || this.TFq) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.mZ || this.TFq) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "onPause: has destroyed or recycler");
            return;
        }
        try {
            super.onPause();
        } catch (Exception e10) {
            lp.ZRu("TTAD.PangleWebView", "onPause: ", e10);
        }
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "onResume: has destroyed or recycler");
            return;
        }
        try {
            super.onResume();
        } catch (Exception e10) {
            lp.ZRu("TTAD.PangleWebView", "onResume: ", e10);
        }
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.mZ || this.TFq) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "reload: has destroyed or recycler");
        } else {
            super.reload();
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.mZ || this.TFq) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.NOt.remove(str);
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.mZ || this.TFq) {
            return;
        }
        super.resumeTimers();
    }

    public void setArbitrageTouchListener(ZRu zRu) {
        this.Ht = zRu;
    }

    public void setDestroyOnDetached(boolean z10) {
        this.uR = z10;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        ZRu zRu = this.Ht;
        if (zRu == null) {
            super.setOnTouchListener(onTouchListener);
        } else {
            zRu.ZRu(onTouchListener);
            super.setOnTouchListener(this.Ht);
        }
    }

    public void setRecycler(boolean z10) {
        this.TFq = z10;
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.mZ || this.TFq) {
            lp.ZRu("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            lp.ZRu("TTAD.PangleWebView", "stopLoading: ", e10);
        }
    }

    public mZ(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.NOt = new HashSet<>();
        this.ZRu = System.currentTimeMillis();
        ZRu();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.mZ && !this.TFq) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e10) {
                lp.ZRu("TTAD.PangleWebView", "loadUrl: ", e10);
                return;
            }
        }
        lp.ZRu("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }
}
