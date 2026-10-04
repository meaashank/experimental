package com.bytedance.sdk.component.ZRu;

import Hd.d;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.ZRu.ZH;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class aT {
    boolean FA;
    boolean Ht;
    boolean Mm;
    ZRu NOt;
    Context TFq;
    sAl Vor;
    WebView ZRu;
    edo aT;
    boolean edo;
    boolean oK;
    FA uR;
    ZH.ZRu yBV;
    String mZ = "IESJSBridge";
    String ZH = d.f50815k;
    final Set<String> lp = new LinkedHashSet();
    final Set<String> sAl = new LinkedHashSet();

    public aT(WebView webView) {
        this.ZRu = webView;
    }

    private void mZ() {
        if ((this.ZRu == null && !this.edo && this.NOt == null) || ((TextUtils.isEmpty(this.mZ) && this.ZRu != null) || this.uR == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public aT NOt(boolean z10) {
        this.Mm = z10;
        return this;
    }

    public aT ZRu(ZRu zRu) {
        this.NOt = zRu;
        return this;
    }

    public WMI NOt() {
        mZ();
        return new WMI(this);
    }

    public aT ZRu(String str) {
        this.mZ = str;
        return this;
    }

    public aT ZRu(lp lpVar) {
        this.uR = FA.ZRu(lpVar);
        return this;
    }

    public aT ZRu(boolean z10) {
        this.Ht = z10;
        return this;
    }

    public aT ZRu() {
        this.oK = true;
        return this;
    }

    public aT() {
    }
}
