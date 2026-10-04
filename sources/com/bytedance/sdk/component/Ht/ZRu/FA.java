package com.bytedance.sdk.component.Ht.ZRu;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private static volatile com.bytedance.sdk.component.Ht.ZRu.TFq.ZRu aT;
    private static FA sAl;
    private volatile boolean FA;
    private volatile com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu Ht;
    private volatile com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq Mm;
    private volatile com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu NOt;
    private volatile com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu TFq;
    private volatile TFq Vor;
    private volatile com.bytedance.sdk.component.Ht.ZRu.NOt.mZ ZH;
    private volatile Context ZRu;
    private final AtomicBoolean edo = new AtomicBoolean(false);
    private volatile Map<Integer, com.bytedance.sdk.component.Ht.ZRu.NOt.mZ> lp;
    private volatile com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu mZ;
    private long oK;
    private volatile com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu uR;

    private FA() {
    }

    public static synchronized FA Mm() {
        try {
            if (sAl == null) {
                sAl = new FA();
            }
        } catch (Throwable th) {
            throw th;
        }
        return sAl;
    }

    public static com.bytedance.sdk.component.Ht.ZRu.TFq.ZRu TFq() {
        if (aT == null) {
            synchronized (FA.class) {
                try {
                    if (aT == null) {
                        aT = new com.bytedance.sdk.component.Ht.ZRu.TFq.NOt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return aT;
    }

    public com.bytedance.sdk.component.Ht.ZRu.NOt.mZ FA() {
        return this.ZH;
    }

    public Context Ht() {
        return this.ZRu;
    }

    public boolean NOt() {
        return this.FA;
    }

    public void Vor() {
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.NOt();
    }

    public long WMI() {
        return this.oK * 86400000;
    }

    public void ZH() {
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.mZ();
    }

    public boolean ZRu() {
        return this.edo.get();
    }

    public com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu aT() {
        return this.Ht;
    }

    public com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu edo() {
        return this.uR;
    }

    public com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu lp() {
        return this.NOt;
    }

    public Map<Integer, com.bytedance.sdk.component.Ht.ZRu.NOt.mZ> mZ() {
        return this.lp;
    }

    public com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu oK() {
        return this.TFq;
    }

    public com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu sAl() {
        return this.mZ;
    }

    public com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq uR() {
        return this.Mm;
    }

    public TFq yBV() {
        return this.Vor;
    }

    public void NOt(boolean z10) {
        this.FA = z10;
    }

    public void ZRu(boolean z10) {
        this.edo.set(z10);
    }

    public void mZ(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        this.mZ = zRu;
    }

    public void uR(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        this.uR = zRu;
    }

    public void NOt(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        this.NOt = zRu;
    }

    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.ZRu.TFq tFq) {
        this.Mm = tFq;
    }

    public void ZRu(Context context) {
        this.ZRu = context;
    }

    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.mZ mZVar) {
        this.ZH = mZVar;
    }

    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        this.Ht = zRu;
    }

    public void TFq(com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu) {
        this.TFq = zRu;
    }

    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu) {
        if (zRu == null) {
            return;
        }
        zRu.ZRu(System.currentTimeMillis());
        com.bytedance.sdk.component.Ht.ZRu.NOt.uR.ZRu.ZRu(zRu, zRu.uR());
    }

    public void ZRu(String str, boolean z10) {
        com.bytedance.sdk.component.Ht.ZRu.Ht.ZRu.ZRu().ZRu(str, z10);
    }

    public void ZRu(String str, List<String> list, boolean z10, Map<String, String> map, int i10, String str2) {
        com.bytedance.sdk.component.Ht.ZRu.Ht.ZRu.ZRu().ZRu(str, list, z10, map, i10, str2);
    }

    public void ZRu(TFq tFq) {
        this.Vor = tFq;
    }

    public void ZRu(long j10) {
        this.oK = j10;
    }
}
