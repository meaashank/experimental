package com.bytedance.sdk.openadsdk.uR;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.core.model.qF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class FA {
    private int Ht;
    private final WebView Mm;
    private int TFq;
    private long Vor;
    private final qF ZRu;
    private String FA = "landingpage";
    private final Map<Integer, Long> NOt = new HashMap();
    private final List<Integer> mZ = new ArrayList();
    private final Map<Integer, String> uR = new HashMap();

    public FA(qF qFVar, WebView webView) {
        this.ZRu = qFVar;
        this.Mm = webView;
    }

    public void NOt(String str) {
        String str2 = this.uR.get(Integer.valueOf(this.TFq));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i10 = this.TFq;
        if (i10 > 0) {
            mZ.ZRu(this.ZRu, this.FA, i10, str3, str, 1);
        }
    }

    public void ZRu(String str, int i10) {
        if (ZRu(true)) {
            mZ.ZRu(this.ZRu, this.FA, this.TFq, str, i10);
            this.uR.put(Integer.valueOf(this.TFq), str);
            this.Vor = SystemClock.elapsedRealtime();
        }
    }

    public void mZ(String str) {
        this.FA = str;
    }

    public void ZRu(String str) {
        if (ZRu(false)) {
            mZ.ZRu(this.ZRu, this.FA, this.TFq, str, SystemClock.elapsedRealtime() - this.Vor);
        }
    }

    private void NOt(boolean z10) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.Mm.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z10) {
                    this.TFq = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
                } else {
                    this.Ht = webBackForwardListCopyBackForwardList.getCurrentIndex() + 1;
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("ArbitrageLandingLog", th.toString());
        }
    }

    public void ZRu(WebView webView, String str) {
        qF qFVar = this.ZRu;
        if (qFVar == null || !com.bytedance.sdk.component.Vor.NOt.ZRu(qFVar.aT().mZ(), str)) {
            return;
        }
        String str2 = this.uR.get(Integer.valueOf(this.TFq));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        mZ.ZRu(this.ZRu, this.FA, this.TFq, str2, str, 2);
    }

    private boolean ZRu(boolean z10) {
        int i10 = z10 ? this.TFq : this.Ht;
        NOt(z10);
        int i11 = z10 ? this.TFq : this.Ht;
        return i11 > 0 && i11 != i10;
    }
}
