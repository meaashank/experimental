package com.bytedance.sdk.component.adexpress.NOt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.NOt.aT;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class yBV implements aT {
    private AtomicBoolean Ht = new AtomicBoolean(false);
    private com.bytedance.sdk.component.adexpress.TFq.ZRu NOt;
    private ScheduledFuture<?> TFq;
    private Context ZRu;
    private FA mZ;
    private sAl uR;

    public class ZRu implements Runnable {
        aT.ZRu ZRu;
        private int mZ;

        public ZRu(int i10, aT.ZRu zRu) {
            this.mZ = i10;
            this.ZRu = zRu;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mZ == 1) {
                yBV.this.NOt.ZRu(true);
                yBV.this.ZRu(this.ZRu, 107, null);
            }
        }
    }

    public yBV(Context context, sAl sal, com.bytedance.sdk.component.adexpress.TFq.ZRu zRu, FA fa2) {
        this.ZRu = context;
        this.uR = sal;
        this.mZ = fa2;
        this.NOt = zRu;
        zRu.ZRu(this.mZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZ() {
        try {
            ScheduledFuture<?> scheduledFuture = this.TFq;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.TFq.cancel(false);
            this.TFq = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.TFq.ZRu NOt() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public boolean ZRu(final aT.ZRu zRu) {
        int iHt = this.uR.Ht();
        if (iHt < 0) {
            ZRu(zRu, 107, "time is ".concat(String.valueOf(iHt)));
        } else {
            this.TFq = com.bytedance.sdk.component.adexpress.uR.uR.ZRu(new ZRu(1, zRu), iHt, TimeUnit.MILLISECONDS);
            this.NOt.ZRu(new Mm() { // from class: com.bytedance.sdk.component.adexpress.NOt.yBV.1
                @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
                public void ZRu(View view, edo edoVar) {
                    oK oKVarNOt;
                    yBV.this.mZ();
                    if (zRu.mZ() || (oKVarNOt = zRu.NOt()) == null) {
                        return;
                    }
                    oKVarNOt.ZRu(yBV.this.NOt, edoVar);
                    zRu.ZRu(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
                public void ZRu(int i10, String str) {
                    yBV.this.ZRu(zRu, i10, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public void ZRu() {
        this.NOt.uR();
        mZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(aT.ZRu zRu, int i10, String str) {
        oK oKVarNOt;
        if (zRu.mZ() || this.Ht.get()) {
            return;
        }
        mZ();
        this.uR.TFq().ZRu(i10, str);
        if (zRu.NOt(this)) {
            zRu.ZRu(this);
        } else {
            if (zRu.mZ() || (oKVarNOt = zRu.NOt()) == null) {
                return;
            }
            zRu.ZRu(true);
            oKVarNOt.a_(i10);
        }
        this.Ht.getAndSet(true);
    }
}
