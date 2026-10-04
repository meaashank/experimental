package com.bytedance.sdk.component.adexpress.TFq;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.NOt.FA;
import com.bytedance.sdk.component.adexpress.NOt.Mm;
import com.bytedance.sdk.component.adexpress.NOt.ZH;
import com.bytedance.sdk.component.adexpress.NOt.edo;
import com.bytedance.sdk.component.adexpress.NOt.sAl;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import e.e0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu implements ZH, com.bytedance.sdk.component.adexpress.NOt.uR<com.bytedance.sdk.component.Vor.uR>, com.bytedance.sdk.component.adexpress.ZRu, com.bytedance.sdk.component.adexpress.theme.ZRu {
    private String FA;
    private Context Ht;
    private String Mm;
    protected boolean NOt;
    private volatile Mm Vor;
    private FA ZH;
    protected JSONObject ZRu;
    private boolean aT;
    private int edo;
    private sAl lp;
    protected com.bytedance.sdk.component.Vor.uR mZ;
    private boolean sAl;
    protected int uR = 8;
    protected AtomicBoolean TFq = new AtomicBoolean(false);
    private boolean oK = false;

    public ZRu(Context context, sAl sal, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.aT = false;
        this.Ht = context;
        this.lp = sal;
        this.Mm = sal.uR();
        themeStatusBroadcastReceiver.ZRu(this);
        if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
            lp();
            return;
        }
        com.bytedance.sdk.component.Vor.uR uRVarSAl = sAl();
        this.mZ = uRVarSAl;
        if (uRVarSAl != null) {
            this.aT = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.uR.ZRu() != null) {
                this.mZ = new com.bytedance.sdk.component.Vor.uR(com.bytedance.sdk.component.adexpress.uR.ZRu());
            }
        }
    }

    private void edo() {
        if (this.lp.Zf()) {
            TFq.ZRu().NOt(this.mZ);
        } else {
            TFq.ZRu().mZ(this.mZ);
        }
    }

    private void lp() {
        if (this.Ht == null && com.bytedance.sdk.component.adexpress.uR.ZRu() != null) {
            this.Ht = com.bytedance.sdk.component.adexpress.uR.ZRu();
        }
        if (this.Ht != null) {
            com.bytedance.sdk.component.Vor.uR uRVarSAl = sAl();
            this.mZ = uRVarSAl;
            if (uRVarSAl == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.mZ = new com.bytedance.sdk.component.Vor.uR(new MutableContextWrapper(this.Ht.getApplicationContext()));
            } else {
                this.aT = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private com.bytedance.sdk.component.Vor.uR sAl() {
        return this.lp.Zf() ? TFq.ZRu().ZRu(this.Ht, this.Mm) : TFq.ZRu().NOt(this.Ht, this.Mm);
    }

    public void FA() {
        Vor();
        Activity activityZRu = com.bytedance.sdk.component.utils.NOt.ZRu(this.mZ);
        if (activityZRu != null) {
            this.edo = NOt(activityZRu);
        }
    }

    public void Ht() {
        if (ZRu() == null) {
            return;
        }
        try {
            ZRu().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public abstract void Mm();

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.Vor.uR TFq() {
        return ZRu();
    }

    public void Vor() {
    }

    public sAl ZH() {
        return this.lp;
    }

    public abstract void ZRu(int i10);

    public void aT() {
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    public int mZ() {
        return 0;
    }

    public void uR() {
        if (this.TFq.get()) {
            return;
        }
        this.TFq.set(true);
        Mm();
        if (this.mZ.getParent() != null) {
            ((ViewGroup) this.mZ.getParent()).removeView(this.mZ);
        }
        if (this.NOt) {
            edo();
        } else {
            TFq.ZRu().TFq(this.mZ);
        }
    }

    private int NOt(Activity activity) {
        return activity.hashCode();
    }

    public void ZRu(String str) {
        this.FA = str;
    }

    public void NOt(boolean z10) {
        this.oK = z10;
    }

    public com.bytedance.sdk.component.Vor.uR ZRu() {
        return this.mZ;
    }

    public void ZRu(FA fa2) {
        this.ZH = fa2;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    public void ZRu(Mm mm) {
        this.Vor = mm;
        if (ZRu() != null && ZRu().getWebView() != null) {
            if (TextUtils.isEmpty(this.FA)) {
                this.Vor.ZRu(102, "url is empty");
                return;
            }
            if (!this.lp.Zf()) {
                if (!this.oK && !com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.ZRu(this.ZRu)) {
                    Mm mm2 = this.Vor;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.ZRu == null);
                    mm2.ZRu(103, sb2.toString());
                    return;
                }
                if (this.oK && !com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.mZ(this.ZRu)) {
                    Mm mm3 = this.Vor;
                    StringBuilder sb3 = new StringBuilder("choice ad data null is ");
                    sb3.append(this.ZRu == null);
                    mm3.ZRu(103, sb3.toString());
                    return;
                }
            } else if (mZ() == 9 && !com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.NOt(this.ZRu)) {
                Mm mm4 = this.Vor;
                StringBuilder sb4 = new StringBuilder("data null is ");
                sb4.append(this.ZRu == null);
                mm4.ZRu(103, sb4.toString());
                return;
            }
            this.lp.TFq().ZRu(this.aT);
            if (this.aT) {
                try {
                    this.mZ.sAl();
                    this.lp.TFq();
                    com.bytedance.sdk.component.utils.ZH.ZRu(this.mZ.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                    return;
                } catch (Exception e10) {
                    TFq.ZRu().TFq(this.mZ);
                    this.Vor.ZRu(102, "load exception is " + e10.getMessage());
                    return;
                }
            }
            com.bytedance.sdk.component.Vor.uR uRVarZRu = ZRu();
            uRVarZRu.sAl();
            this.lp.TFq();
            uRVarZRu.a_(this.FA);
            return;
        }
        Mm mm5 = this.Vor;
        StringBuilder sb5 = new StringBuilder("SSWebview null is ");
        sb5.append(ZRu() == null);
        sb5.append(" or Webview is null");
        mm5.ZRu(102, sb5.toString());
    }

    public void ZRu(boolean z10) {
        this.sAl = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.ZH
    public void ZRu(final edo edoVar) {
        if (edoVar == null) {
            if (this.Vor != null) {
                this.Vor.ZRu(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zMZ = edoVar.mZ();
        final float fUR = (float) edoVar.uR();
        final float fTFq = (float) edoVar.TFq();
        if (mZ() == 0 && (fUR <= 0.0f || fTFq <= 0.0f)) {
            if (this.Vor != null) {
                this.Vor.ZRu(105, "width is " + fUR + "height is " + fTFq);
                return;
            }
            return;
        }
        this.NOt = zMZ;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ZRu(edoVar, fUR, fTFq);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.TFq.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    ZRu.this.ZRu(edoVar, fUR, fTFq);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(edo edoVar, float f10, float f11) {
        edoVar.ZH();
        boolean z10 = this.NOt;
        if (z10 && !this.sAl) {
            ZRu(f10, f11);
            ZRu(this.uR);
            if (this.Vor != null) {
                this.Vor.ZRu(ZRu(), edoVar);
                return;
            }
            return;
        }
        if (!z10) {
            TFq.ZRu().TFq(this.mZ);
        }
        ZRu(edoVar.ZH(), edoVar.aT());
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.ZH
    public void ZRu(View view, int i10, com.bytedance.sdk.component.adexpress.mZ mZVar) {
        FA fa2 = this.ZH;
        if (fa2 != null) {
            fa2.ZRu(view, i10, mZVar);
        }
    }

    @e0
    private void ZRu(float f10, float f11) {
        this.lp.TFq().TFq();
        if (mZ() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ZRu().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            ZRu().setLayoutParams(layoutParams);
            return;
        }
        int iZRu = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.Ht, f10);
        int iZRu2 = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.Ht, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ZRu().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iZRu, iZRu2);
        }
        layoutParams2.width = iZRu;
        layoutParams2.height = iZRu2;
        ZRu().setLayoutParams(layoutParams2);
    }

    private void ZRu(int i10, String str) {
        if (this.Vor != null) {
            this.Vor.ZRu(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ZRu
    public void ZRu(Activity activity) {
        if (this.edo == 0 || activity == null || activity.hashCode() != this.edo) {
            return;
        }
        uR();
        aT();
    }

    public void ZRu(JSONObject jSONObject) {
        this.ZRu = jSONObject;
    }
}
