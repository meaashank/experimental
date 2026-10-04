package com.bytedance.sdk.component.Vor;

import U6.b;
import Y6.d;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.Vor.ZRu;
import com.bytedance.sdk.component.utils.OCA;
import com.bytedance.sdk.component.utils.lp;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends FrameLayout {

    /* JADX INFO: renamed from: Nb, reason: collision with root package name */
    private static mZ f140646Nb;
    private long FA;
    private float Ht;
    private AtomicBoolean MR;
    private long Mm;
    private String NOt;
    private NOt OCA;
    private float TFq;
    private long VdW;
    private long Vor;
    private float WMI;
    private volatile WebView ZH;
    private com.bytedance.sdk.component.Vor.NOt.ZRu ZRu;
    private Context Zf;
    private boolean aT;
    private com.bytedance.sdk.component.Vor.ZRu edo;
    private InterfaceC0414uR fcs;
    private AtomicBoolean le;
    private View lp;
    private JSONObject mZ;
    private List<String> oK;
    private int om;
    private float qF;
    private AtomicBoolean ru;
    private ZRu.InterfaceC0413ZRu sAl;
    private long th;
    private OCA to;
    private boolean uR;
    private AttributeSet xY;
    private float yBV;

    public interface NOt {
    }

    public static class ZRu extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.Vor.uR.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public interface mZ {
        WebView createWebView(Context context, AttributeSet attributeSet, int i10);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.Vor.uR$uR, reason: collision with other inner class name */
    public interface InterfaceC0414uR {
    }

    public uR(Context context) {
        this(ZRu(context), false);
    }

    private void WMI() {
        if (this.to == null) {
            this.MR.set(false);
            this.to = new OCA(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.Vor.uR.1
        };
        this.MR.set(true);
    }

    private static Context ZRu(Context context) {
        return context;
    }

    private static void mZ(Context context) {
    }

    private void oK() {
        if (this.ZH == null) {
            return;
        }
        try {
            this.ZH.removeJavascriptInterface("searchBoxJavaBridge_");
            this.ZH.removeJavascriptInterface("accessibility");
            this.ZH.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(mZ mZVar) {
        f140646Nb = mZVar;
    }

    private void yBV() {
        try {
            WebSettings settings = this.ZH.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    public void FA() {
        try {
            this.ZH.goForward();
        } catch (Throwable unused) {
        }
    }

    public void Ht() {
        try {
            this.ZH.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean Mm() {
        if (this.ZH == null) {
            return false;
        }
        try {
            return this.ZH.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void NOt() {
        if (this.ZH != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.ZH.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.ZH, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public boolean TFq() {
        if (this.ZH == null) {
            return false;
        }
        try {
            return this.ZH.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void Vor() {
        if (this.ZH != null) {
            this.ZH.onResume();
        }
    }

    public void ZH() {
        if (this.ZH == null) {
            return;
        }
        try {
            this.ZH.onPause();
        } catch (Throwable unused) {
        }
    }

    public void aT() {
        try {
            this.ZH.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.ZH.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.ZH.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.ZH == null) {
            return;
        }
        try {
            this.ZH.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void edo() {
        try {
            this.ZH.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void f_() {
        try {
            this.ZH = ZRu(this.xY, 0);
            NOt();
            NOt(ZRu(this.Zf));
        } catch (Throwable th) {
            lp.ZRu("SSWebView.TAG", "initWebview: " + th.getMessage());
        }
    }

    public View getArbitrageLoadingView() {
        return this.lp;
    }

    public int getContentHeight() {
        if (this.ZH == null) {
            return 0;
        }
        try {
            return this.ZH.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.VdW;
    }

    public long getLandingPageClickEnd() {
        return this.th;
    }

    public com.bytedance.sdk.component.Vor.NOt.ZRu getMaterialMeta() {
        return this.ZRu;
    }

    public String getOriginalUrl() {
        String url;
        if (this.ZH == null) {
            return null;
        }
        try {
            String originalUrl = this.ZH.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.ZH.getUrl()) != null) {
                if (url.startsWith(R3.a.f67727e)) {
                    return url;
                }
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.ZH == null) {
            return 0;
        }
        try {
            return this.ZH.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public String getUrl() {
        if (this.ZH == null) {
            return null;
        }
        try {
            return this.ZH.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.ZH == null) {
            return "";
        }
        try {
            return this.ZH.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.ZH;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void lp() {
        if (this.ZH == null) {
            return;
        }
        try {
            this.ZH.destroy();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ru.set(true);
        if (!this.le.get() || this.MR.get()) {
            return;
        }
        WMI();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ru.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentZRu;
        try {
            ZRu(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.aT && (viewParentZRu = ZRu(this)) != null) {
                viewParentZRu.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.ZH.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void sAl() {
        try {
            this.ZH.clearView();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z10) {
        try {
            this.ZH.getSettings().setAllowFileAccess(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.ZH.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z10) {
        try {
            this.ZH.getSettings().setAppCacheEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        try {
            this.ZH.setBackgroundColor(i10);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z10) {
        try {
            this.ZH.getSettings().setBuiltInZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i10) {
        try {
            this.ZH.getSettings().setCacheMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i10) {
        this.om = i10;
    }

    public void setDatabaseEnabled(boolean z10) {
        try {
            this.ZH.getSettings().setDatabaseEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.WMI = f10;
    }

    public void setDefaultFontSize(int i10) {
        try {
            this.ZH.getSettings().setDefaultFontSize(i10);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.ZH.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z10) {
        try {
            this.ZH.getSettings().setDisplayZoomControls(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z10) {
        try {
            this.ZH.getSettings().setDomStorageEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.ZH.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z10) {
        this.aT = z10;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        try {
            this.ZH.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z10) {
        try {
            this.ZH.getSettings().setJavaScriptEnabled(z10);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z10) {
        this.uR = z10;
    }

    public void setLandingPageClickBegin(long j10) {
        this.VdW = j10;
    }

    public void setLandingPageClickEnd(long j10) {
        this.th = j10;
    }

    @Override // android.view.View
    public void setLayerType(int i10, Paint paint) {
        try {
            this.ZH.setLayerType(i10, paint);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.ZH.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z10) {
        try {
            this.ZH.getSettings().setLoadWithOverviewMode(z10);
        } catch (Throwable unused) {
        }
    }

    public void setMaterialMeta(com.bytedance.sdk.component.Vor.NOt.ZRu zRu) {
        this.ZRu = zRu;
    }

    public void setMixedContentMode(int i10) {
        try {
            this.ZH.getSettings().setMixedContentMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z10) {
        try {
            this.ZH.setNetworkAvailable(z10);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(NOt nOt) {
        this.OCA = nOt;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        try {
            this.ZH.setOverScrollMode(i10);
            super.setOverScrollMode(i10);
        } catch (Throwable unused) {
        }
    }

    public void setRecycler(boolean z10) {
        if (this.ZH == null || !(this.ZH instanceof com.bytedance.sdk.component.Vor.mZ)) {
            return;
        }
        ((com.bytedance.sdk.component.Vor.mZ) this.ZH).setRecycler(z10);
    }

    public void setShakeValue(float f10) {
        this.yBV = f10;
    }

    public void setSupportZoom(boolean z10) {
        try {
            this.ZH.getSettings().setSupportZoom(z10);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.NOt = str;
        com.bytedance.sdk.component.Vor.ZRu zRu = this.edo;
        if (zRu != null) {
            zRu.ZRu(str);
        }
    }

    public void setTouchStateListener(InterfaceC0414uR interfaceC0414uR) {
        this.fcs = interfaceC0414uR;
    }

    public void setUseWideViewPort(boolean z10) {
        try {
            this.ZH.getSettings().setUseWideViewPort(z10);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.ZH.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        try {
            super.setVisibility(i10);
            this.ZH.setVisibility(i10);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.ZH.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof InterfaceC0414uR) {
                setTouchStateListener((InterfaceC0414uR) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new ZRu();
            }
            this.ZH.setWebViewClient(new TFq(this.sAl, webViewClient, this.oK));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.qF = f10;
    }

    public void uR() {
        try {
            this.ZH.reload();
        } catch (Throwable unused) {
        }
    }

    public uR(Context context, boolean z10) {
        super(ZRu(context));
        this.TFq = 0.0f;
        this.Ht = 0.0f;
        this.Mm = 0L;
        this.FA = 0L;
        this.Vor = 0L;
        this.aT = false;
        this.yBV = 20.0f;
        this.qF = 50.0f;
        this.ru = new AtomicBoolean();
        this.le = new AtomicBoolean();
        this.MR = new AtomicBoolean();
        this.Zf = context;
        if (z10) {
            return;
        }
        try {
            this.ZH = ZRu((AttributeSet) null, 0);
            NOt();
        } catch (Throwable unused) {
        }
        NOt(ZRu(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.ZH.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase(b.h.f68653a)) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ZRu(boolean z10, int i10, int i11, List<Integer> list, int i12, List<String> list2) {
        if (z10 && this.ZH != null && (this.ZH instanceof com.bytedance.sdk.component.Vor.mZ)) {
            this.edo = new com.bytedance.sdk.component.Vor.ZRu(this.Zf, i10, i11, list, i12);
            this.oK = list2;
            if (!TextUtils.isEmpty(this.NOt)) {
                this.edo.ZRu(this.NOt);
            }
            ((com.bytedance.sdk.component.Vor.mZ) this.ZH).setArbitrageTouchListener(this.edo);
            this.sAl = this.edo.ZRu();
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.NOt;
    }

    public void mZ() {
        try {
            this.ZH.stopLoading();
        } catch (Throwable unused) {
        }
    }

    private static boolean mZ(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private void NOt(Context context) {
        mZ(context);
        yBV();
        oK();
    }

    private static boolean NOt(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void ZRu(boolean z10, View view) {
        if (z10) {
            this.lp = view;
            if (view == null || view.getParent() != null) {
                return;
            }
            addView(this.lp, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView ZRu(AttributeSet attributeSet, int i10) {
        mZ mZVar = f140646Nb;
        if (mZVar != null) {
            return mZVar.createWebView(getContext(), attributeSet, i10);
        }
        if (attributeSet == null) {
            return new WebView(ZRu(this.Zf));
        }
        return new WebView(ZRu(this.Zf), attributeSet);
    }

    @TargetApi(19)
    public void ZRu(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.ZH.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void ZRu(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.ZH.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void ZRu(boolean z10) {
        try {
            this.ZH.clearCache(z10);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent ZRu(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (NOt(view2) || mZ(view2)) ? parent : ZRu(view2);
    }

    @SuppressLint({"JavascriptInterface"})
    public void ZRu(Object obj, String str) {
        try {
            this.ZH.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void ZRu(MotionEvent motionEvent) {
        if (!this.uR || this.ZRu == null) {
            return;
        }
        if ((this.NOt == null && this.mZ == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.TFq = motionEvent.getRawX();
                this.Ht = motionEvent.getRawY();
                this.Mm = System.currentTimeMillis();
                this.mZ = new JSONObject();
                if (this.ZH != null) {
                    this.VdW = this.Mm;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.mZ.put("start_x", String.valueOf(this.TFq));
                this.mZ.put("start_y", String.valueOf(this.Ht));
                this.mZ.put("offset_x", String.valueOf(motionEvent.getRawX() - this.TFq));
                this.mZ.put("offset_y", String.valueOf(motionEvent.getRawY() - this.Ht));
                this.mZ.put("url", String.valueOf(getUrl()));
                this.mZ.put(d.C0152d.f79310d, "");
                this.FA = System.currentTimeMillis();
                if (this.ZH != null) {
                    this.th = this.FA;
                }
                this.mZ.put("down_time", this.Mm);
                this.mZ.put("up_time", this.FA);
                if (com.bytedance.sdk.component.Vor.ZRu.ZRu.ZRu().NOt() != null) {
                    long j10 = this.Vor;
                    long j11 = this.Mm;
                    if (j10 != j11) {
                        this.Vor = j11;
                        com.bytedance.sdk.component.Vor.ZRu.ZRu.ZRu().NOt().ZRu(this.ZRu, this.NOt, "in_web_click", this.mZ, this.FA - this.Mm);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
