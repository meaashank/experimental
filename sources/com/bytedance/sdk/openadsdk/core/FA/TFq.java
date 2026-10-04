package com.bytedance.sdk.openadsdk.core.FA;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import com.bytedance.sdk.component.Vor.uR;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.FA.mZ;
import com.bytedance.sdk.openadsdk.core.WD;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import u.e;

/* JADX INFO: loaded from: classes3.dex */
public class TFq extends com.bytedance.sdk.component.Vor.uR implements mZ.InterfaceC0440mZ {
    private String FA;
    private mZ Ht;
    private com.bytedance.sdk.openadsdk.core.model.qF Mm;
    protected boolean NOt;
    private xY TFq;
    private int Vor;
    private NOt ZH;
    protected boolean ZRu;
    private List<String> aT;
    private int lp;
    AtomicBoolean mZ;
    private long sAl;
    AtomicBoolean uR;

    public interface NOt {
        View NOt();

        View ZRu();

        void ZRu(int i10, int i11);

        void ZRu(View view, int i10);

        void e_();
    }

    public static class ZRu extends uR.ZRu {
        public static final Set<String> ZRu = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.FA.TFq.ZRu.1
            {
                add(".jpeg");
                add(e.f239314f);
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        mZ.InterfaceC0440mZ NOt;

        public ZRu(mZ.InterfaceC0440mZ interfaceC0440mZ) {
            this.NOt = interfaceC0440mZ;
        }

        private void ZRu(String str) {
            int iLastIndexOf;
            mZ.InterfaceC0440mZ interfaceC0440mZ;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(IconCache.EMPTY_CLASS_NAME)) > 0) {
                if (!ZRu.contains(str.substring(iLastIndexOf).toLowerCase()) || (interfaceC0440mZ = this.NOt) == null) {
                    return;
                }
                interfaceC0440mZ.NOt(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            mZ.InterfaceC0440mZ interfaceC0440mZ = this.NOt;
            if (interfaceC0440mZ != null) {
                interfaceC0440mZ.ZRu();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                ZRu(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            ZRu(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.NOt.ZRu(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            ZRu(webResourceRequest.getUrl().toString());
        }

        private void ZRu(String str, int i10, String str2) {
            mZ.InterfaceC0440mZ interfaceC0440mZ = this.NOt;
            if (interfaceC0440mZ != null) {
                interfaceC0440mZ.ZRu(106, i10);
            }
        }
    }

    public TFq(Context context) {
        super(context);
        this.ZRu = false;
        this.NOt = false;
        this.mZ = new AtomicBoolean(false);
        this.uR = new AtomicBoolean(false);
        this.Vor = 0;
    }

    private void WMI() {
        if (this.aT == null) {
            com.bytedance.sdk.openadsdk.uR.mZ.NOt(this.Mm, this.FA, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(new com.bytedance.sdk.component.FA.FA("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.FA.TFq.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (TFq.this.aT != null && TFq.this.uR.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = TFq.this.aT.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.uR.mZ.NOt(TFq.this.Mm, TFq.this.FA, "dsp_html_error_url", jSONObject);
                            TFq.this.aT = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.Vor.uR
    public void lp() {
        this.Ht.NOt();
        super.lp();
    }

    public void oK() {
        NOt nOt = this.ZH;
        if (nOt != null) {
            nOt.e_();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.sAl);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.uR.mZ.NOt(this.Mm, this.FA, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.Vor.uR, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.ZRu) {
            this.Ht.ZRu(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.Vor.uR, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.Ht.ZRu();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.lp / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.uR.mZ.NOt(this.Mm, this.FA, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        boolean z10 = i10 == 0;
        this.NOt = z10;
        this.Ht.ZRu(z10);
    }

    public void yBV() {
        this.mZ.set(false);
        String strPU = this.Mm.pU();
        if (TextUtils.isEmpty(strPU)) {
            return;
        }
        String strZRu = com.bytedance.sdk.openadsdk.core.lp.TFq.ZRu(strPU);
        String str = TextUtils.isEmpty(strZRu) ? strPU : strZRu;
        this.Vor = 0;
        ZRu(null, str, "text/html", "UTF-8", null);
        this.sAl = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.FA.mZ.InterfaceC0440mZ
    public void NOt(String str) {
        if (this.aT == null) {
            this.aT = new ArrayList();
        }
        this.aT.add(str);
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, NOt nOt, String str) {
        this.ZH = nOt;
        this.Mm = qFVar;
        this.FA = str;
        this.Ht = new mZ();
        this.TFq = new xY(getContext());
        setWebViewClient(new ZRu(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.FA.TFq.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                TFq.this.lp = i10;
                super.onProgressChanged(webView, i10);
                if (i10 >= 100) {
                    TFq.this.ZRu();
                }
            }
        });
        com.bytedance.sdk.component.utils.Mm.NOt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.FA.TFq.2
            @Override // java.lang.Runnable
            @SuppressLint({"ClickableViewAccessibility"})
            public void run() {
                WebView webView = TFq.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.FA.TFq.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            TFq.this.TFq.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public static class mZ {
        protected int ZRu = 0;
        private com.bytedance.sdk.openadsdk.core.lp.Ht NOt = com.bytedance.sdk.openadsdk.core.lp.Ht.ZRu();

        public void NOt() {
            ZRu();
        }

        public void ZRu(WebView webView) {
            if (webView != null && this.ZRu == 0) {
                if (this.NOt == null) {
                    this.NOt = com.bytedance.sdk.openadsdk.core.lp.Ht.ZRu();
                }
                this.NOt.ZRu(webView);
                this.NOt.NOt();
                this.ZRu = 1;
            }
        }

        public void ZRu(boolean z10) {
            com.bytedance.sdk.openadsdk.core.lp.Ht ht;
            if (this.ZRu == 1 && z10 && (ht = this.NOt) != null) {
                ht.mZ();
                this.ZRu = 3;
            }
        }

        public void ZRu(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.lp.Ht ht = this.NOt;
            if (ht != null) {
                ht.ZRu(view, friendlyObstructionPurpose);
            }
        }

        public void ZRu() {
            com.bytedance.sdk.openadsdk.core.lp.Ht ht;
            int i10 = this.ZRu;
            if (i10 != 0 && i10 != 4 && (ht = this.NOt) != null) {
                ht.uR();
            }
            this.ZRu = 4;
            this.NOt = null;
        }
    }

    public void ZRu(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.Ht.ZRu(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.FA.mZ.InterfaceC0440mZ
    public void ZRu(String str) {
        String strNOt;
        boolean zZRu;
        View view;
        if (TextUtils.isEmpty(str) || this.Mm == null || !this.TFq.NOt()) {
            return;
        }
        int iZRu = Yx.ZRu(this.FA);
        View view2 = null;
        if (com.bytedance.sdk.component.utils.oK.ZRu(str) || !(this.Mm.IOC() == null || TextUtils.isEmpty(this.Mm.IOC().ZRu()))) {
            strNOt = str;
        } else {
            com.bytedance.sdk.openadsdk.core.model.ZH zh = new com.bytedance.sdk.openadsdk.core.model.ZH();
            zh.ZRu(str);
            this.Mm.ZRu(zh);
            strNOt = null;
        }
        this.Mm.ZRu(true);
        com.bytedance.sdk.openadsdk.core.model.qF qFVar = this.Mm;
        if (qFVar == null || qFVar.IOC() == null || TextUtils.isEmpty(this.Mm.IOC().ZRu())) {
            zZRu = false;
        } else {
            zZRu = WD.ZRu(getContext(), this.Mm, iZRu, this.FA, true, (Map<String, Object>) null);
            if (!zZRu && !TextUtils.isEmpty(this.Mm.IOC().NOt())) {
                strNOt = this.Mm.IOC().NOt();
                com.bytedance.sdk.openadsdk.uR.mZ.ZRu(this.Mm, this.FA, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = strNOt;
        if (!zZRu) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                WD.ZRu(getContext(), this.Mm, iZRu, (PAGNativeAd) null, (PangleAd) null, this.FA, true, str2);
            }
        }
        if (this.TFq != null) {
            NOt nOt = this.ZH;
            if (nOt != null) {
                View viewZRu = nOt.ZRu();
                View viewNOt = this.ZH.NOt();
                this.ZH.ZRu(this, 2);
                view2 = viewNOt;
                view = viewZRu;
            } else {
                view = null;
            }
            com.bytedance.sdk.openadsdk.core.model.aT aTVarZRu = this.TFq.ZRu(getContext(), view2, view);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu("click", this.Mm, aTVarZRu, this.FA, true, (Map<String, Object>) map, this.TFq.NOt() ? 1 : 2);
        }
        xY xYVar = this.TFq;
        if (xYVar != null) {
            xYVar.ZRu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.FA.mZ.InterfaceC0440mZ
    public void ZRu(int i10, int i11) {
        NOt nOt = this.ZH;
        if (nOt != null) {
            nOt.ZRu(i10, i11);
        }
        this.Vor = i11;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i11);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.sAl);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.uR.mZ.NOt(this.Mm, this.FA, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.FA.mZ.InterfaceC0440mZ
    public void ZRu() {
        if (this.mZ.compareAndSet(false, true)) {
            this.ZRu = true;
            this.Ht.ZRu(getWebView());
            this.Ht.ZRu(this.NOt);
            oK();
            WMI();
        }
    }
}
