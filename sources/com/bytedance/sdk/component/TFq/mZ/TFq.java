package com.bytedance.sdk.component.TFq.mZ;

import android.content.Context;
import com.bytedance.sdk.component.TFq.WMI;
import com.bytedance.sdk.component.TFq.lp;
import com.bytedance.sdk.component.TFq.om;
import com.bytedance.sdk.component.TFq.qF;
import com.bytedance.sdk.component.TFq.sAl;
import com.bytedance.sdk.component.TFq.to;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class TFq implements sAl {
    private com.bytedance.sdk.component.TFq.NOt FA;
    private com.bytedance.sdk.component.TFq.mZ Ht;
    private WMI Mm;
    private ExecutorService NOt;
    private om TFq;
    private to Vor;
    private lp ZRu;
    private com.bytedance.sdk.component.TFq.uR mZ;
    private qF uR;

    public static class ZRu {
        private com.bytedance.sdk.component.TFq.NOt FA;
        private com.bytedance.sdk.component.TFq.mZ Ht;
        private WMI Mm;
        private ExecutorService NOt;
        private om TFq;
        private to Vor;
        private lp ZRu;
        private com.bytedance.sdk.component.TFq.uR mZ;
        private qF uR;

        public ZRu ZRu(com.bytedance.sdk.component.TFq.NOt nOt) {
            this.FA = nOt;
            return this;
        }

        public ZRu ZRu(to toVar) {
            this.Vor = toVar;
            return this;
        }

        public ZRu ZRu(com.bytedance.sdk.component.TFq.uR uRVar) {
            this.mZ = uRVar;
            return this;
        }

        public TFq ZRu() {
            return new TFq(this);
        }
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public WMI FA() {
        return this.Mm;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public om Ht() {
        return this.TFq;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public com.bytedance.sdk.component.TFq.mZ Mm() {
        return this.Ht;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public ExecutorService NOt() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public qF TFq() {
        return this.uR;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public com.bytedance.sdk.component.TFq.NOt Vor() {
        return this.FA;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public lp ZRu() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public to mZ() {
        return this.Vor;
    }

    @Override // com.bytedance.sdk.component.TFq.sAl
    public com.bytedance.sdk.component.TFq.uR uR() {
        return this.mZ;
    }

    private TFq(ZRu zRu) {
        this.ZRu = zRu.ZRu;
        this.NOt = zRu.NOt;
        this.mZ = zRu.mZ;
        this.uR = zRu.uR;
        this.TFq = zRu.TFq;
        this.Ht = zRu.Ht;
        this.FA = zRu.FA;
        this.Mm = zRu.Mm;
        this.Vor = zRu.Vor;
    }

    public static TFq ZRu(Context context) {
        return new ZRu().ZRu();
    }
}
