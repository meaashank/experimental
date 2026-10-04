package com.bytedance.sdk.component.ZRu;

import android.webkit.WebView;
import com.bytedance.sdk.component.ZRu.uR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WMI {
    static xY ZRu;
    private volatile boolean Ht;
    private final ZRu NOt;
    private final List<edo> TFq;
    private final WebView mZ;
    private final aT uR;

    public WMI(aT aTVar) {
        ArrayList arrayList = new ArrayList();
        this.TFq = arrayList;
        this.Ht = false;
        this.uR = aTVar;
        if (aTVar.FA && ZRu != null) {
            throw null;
        }
        if (aTVar.ZRu != null) {
            ZRu zRu = aTVar.NOt;
            if (zRu == null) {
                this.NOt = new le();
            } else {
                this.NOt = zRu;
            }
        } else {
            this.NOt = aTVar.NOt;
        }
        this.NOt.ZRu(aTVar, (to) null);
        this.mZ = aTVar.ZRu;
        arrayList.add(aTVar.aT);
        ru.ZRu(aTVar.Mm);
    }

    private void NOt() {
        if (this.Ht) {
            Vor.ZRu(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public static aT ZRu(WebView webView) {
        return new aT(webView);
    }

    public WMI ZRu(String str, TFq<?, ?> tFq) {
        return ZRu(str, (String) null, tFq);
    }

    public WMI ZRu(String str, String str2, TFq<?, ?> tFq) {
        NOt();
        this.NOt.Mm.ZRu(str, tFq);
        return this;
    }

    public WMI ZRu(String str, uR.NOt nOt) {
        return ZRu(str, (String) null, nOt);
    }

    public WMI ZRu(String str, String str2, uR.NOt nOt) {
        NOt();
        this.NOt.Mm.ZRu(str, nOt);
        return this;
    }

    public void ZRu() {
        if (this.Ht) {
            return;
        }
        this.NOt.NOt();
        this.Ht = true;
        Iterator<edo> it = this.TFq.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
