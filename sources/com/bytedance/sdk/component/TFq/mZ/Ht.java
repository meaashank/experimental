package com.bytedance.sdk.component.TFq.mZ;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.TFq.WMI;
import com.bytedance.sdk.component.TFq.lp;
import com.bytedance.sdk.component.TFq.om;
import com.bytedance.sdk.component.TFq.qF;
import com.bytedance.sdk.component.TFq.sAl;
import com.bytedance.sdk.component.TFq.to;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private ExecutorService FA;
    private com.bytedance.sdk.component.TFq.uR Ht;
    private lp Mm;
    private final sAl NOt;
    private WMI Vor;
    private Map<String, List<mZ>> ZRu = new ConcurrentHashMap();
    private Map<String, qF> mZ = new HashMap();
    private Map<String, om> uR = new HashMap();
    private Map<String, com.bytedance.sdk.component.TFq.mZ> TFq = new HashMap();

    public Ht(Context context, sAl sal) {
        this.NOt = (sAl) FA.ZRu(sal);
        com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu(context, sal.Vor());
    }

    private com.bytedance.sdk.component.TFq.mZ Ht(com.bytedance.sdk.component.TFq.NOt nOt) {
        com.bytedance.sdk.component.TFq.mZ mZVarMm = this.NOt.Mm();
        return mZVarMm != null ? mZVarMm : new com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.NOt(nOt.TFq(), nOt.ZRu(), Ht());
    }

    private om TFq(com.bytedance.sdk.component.TFq.NOt nOt) {
        om omVarHt = this.NOt.Ht();
        return omVarHt != null ? omVarHt : com.bytedance.sdk.component.TFq.mZ.ZRu.NOt.TFq.ZRu(nOt.NOt());
    }

    private com.bytedance.sdk.component.TFq.uR Vor() {
        com.bytedance.sdk.component.TFq.uR uRVarUR = this.NOt.uR();
        return uRVarUR == null ? com.bytedance.sdk.component.TFq.NOt.NOt.ZRu() : uRVarUR;
    }

    private ExecutorService ZH() {
        ExecutorService executorServiceNOt = this.NOt.NOt();
        return executorServiceNOt != null ? executorServiceNOt : com.bytedance.sdk.component.TFq.ZRu.mZ.ZRu();
    }

    private lp aT() {
        lp lpVarZRu = this.NOt.ZRu();
        return lpVarZRu != null ? lpVarZRu : com.bytedance.sdk.component.TFq.ZRu.NOt.ZRu();
    }

    private WMI lp() {
        WMI wmiFA = this.NOt.FA();
        return wmiFA == null ? new Mm() : wmiFA;
    }

    private qF uR(com.bytedance.sdk.component.TFq.NOt nOt) {
        qF qFVarTFq = this.NOt.TFq();
        return qFVarTFq != null ? com.bytedance.sdk.component.TFq.mZ.ZRu.NOt.ZRu.ZRu(qFVarTFq) : com.bytedance.sdk.component.TFq.mZ.ZRu.NOt.ZRu.ZRu(nOt.NOt());
    }

    public WMI FA() {
        if (this.Vor == null) {
            this.Vor = lp();
        }
        return this.Vor;
    }

    public Map<String, List<mZ>> Mm() {
        return this.ZRu;
    }

    public Collection<om> NOt() {
        return this.uR.values();
    }

    public Collection<qF> ZRu() {
        return this.mZ.values();
    }

    public Collection<com.bytedance.sdk.component.TFq.mZ> mZ() {
        return this.TFq.values();
    }

    public om NOt(com.bytedance.sdk.component.TFq.NOt nOt) {
        if (nOt == null) {
            nOt = com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.Mm();
        }
        String string = nOt.TFq().toString();
        om omVar = this.uR.get(string);
        if (omVar != null) {
            return omVar;
        }
        om omVarTFq = TFq(nOt);
        this.uR.put(string, omVarTFq);
        return omVarTFq;
    }

    public qF ZRu(com.bytedance.sdk.component.TFq.NOt nOt) {
        if (nOt == null) {
            nOt = com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.Mm();
        }
        String string = nOt.TFq().toString();
        qF qFVar = this.mZ.get(string);
        if (qFVar != null) {
            return qFVar;
        }
        qF qFVarUR = uR(nOt);
        this.mZ.put(string, qFVarUR);
        return qFVarUR;
    }

    public com.bytedance.sdk.component.TFq.mZ mZ(com.bytedance.sdk.component.TFq.NOt nOt) {
        if (nOt == null) {
            nOt = com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.Mm();
        }
        String string = nOt.TFq().toString();
        com.bytedance.sdk.component.TFq.mZ mZVar = this.TFq.get(string);
        if (mZVar != null) {
            return mZVar;
        }
        com.bytedance.sdk.component.TFq.mZ mZVarHt = Ht(nOt);
        this.TFq.put(string, mZVarHt);
        return mZVarHt;
    }

    public ExecutorService Ht() {
        ExecutorService executorServiceZRu;
        to toVarMZ = this.NOt.mZ();
        if (toVarMZ != null && (executorServiceZRu = toVarMZ.ZRu()) != null) {
            return executorServiceZRu;
        }
        if (this.FA == null) {
            this.FA = ZH();
        }
        return this.FA;
    }

    public lp TFq() {
        if (this.Mm == null) {
            this.Mm = aT();
        }
        return this.Mm;
    }

    public com.bytedance.sdk.component.TFq.uR uR() {
        if (this.Ht == null) {
            this.Ht = Vor();
        }
        return this.Ht;
    }

    public com.bytedance.sdk.component.TFq.mZ ZRu(String str) {
        return mZ(com.bytedance.sdk.component.TFq.mZ.ZRu.ZRu.ZRu(new File(str)));
    }

    public com.bytedance.sdk.component.TFq.mZ.NOt.ZRu ZRu(mZ mZVar) {
        ImageView.ScaleType scaleTypeUR = mZVar.uR();
        if (scaleTypeUR == null) {
            scaleTypeUR = com.bytedance.sdk.component.TFq.mZ.NOt.ZRu.ZRu;
        }
        ImageView.ScaleType scaleType = scaleTypeUR;
        Bitmap.Config configZH = mZVar.ZH();
        if (configZH == null) {
            configZH = com.bytedance.sdk.component.TFq.mZ.NOt.ZRu.NOt;
        }
        return new com.bytedance.sdk.component.TFq.mZ.NOt.ZRu(mZVar.NOt(), mZVar.mZ(), scaleType, configZH, mZVar.Mm(), mZVar.FA());
    }
}
