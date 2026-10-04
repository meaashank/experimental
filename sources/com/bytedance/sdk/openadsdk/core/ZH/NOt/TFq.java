package com.bytedance.sdk.openadsdk.core.ZH.NOt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.NOt.FA;
import com.bytedance.sdk.component.adexpress.NOt.Mm;
import com.bytedance.sdk.component.adexpress.NOt.aT;
import com.bytedance.sdk.component.adexpress.NOt.edo;
import com.bytedance.sdk.component.adexpress.NOt.oK;
import com.bytedance.sdk.component.adexpress.NOt.sAl;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.utils.WD;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements aT {
    private com.bytedance.sdk.openadsdk.core.ZH.uR.mZ NOt;
    private AtomicBoolean TFq = new AtomicBoolean(false);
    private Context ZRu;
    private sAl mZ;
    private ScheduledFuture<?> uR;

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
                TFq.this.NOt.ZRu(true);
                TFq.this.ZRu(this.ZRu, Opcodes.L2F, "real time out" + TFq.this.mZ.Ht());
            }
        }
    }

    public TFq(Context context, com.bytedance.sdk.openadsdk.core.ZH.uR.mZ mZVar, FA fa2, sAl sal) {
        this.ZRu = context;
        this.NOt = mZVar;
        this.mZ = sal;
        this.NOt.ZRu(fa2);
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public void ZRu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt() {
        try {
            ScheduledFuture<?> scheduledFuture = this.uR;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.uR.cancel(false);
            this.uR = null;
        } catch (Throwable th) {
            lp.ZRu("RenderInterceptor", "remove ugen time out task fail", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public boolean ZRu(final aT.ZRu zRu) {
        int iHt = this.mZ.Ht();
        if (iHt < 0) {
            ZRu(zRu, Opcodes.L2F, "time is ".concat(String.valueOf(iHt)));
        } else {
            this.uR = WD.ZRu().schedule(new ZRu(1, zRu), iHt, TimeUnit.MILLISECONDS);
            this.NOt.ZRu(new Mm() { // from class: com.bytedance.sdk.openadsdk.core.ZH.NOt.TFq.1
                @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
                public void ZRu(View view, edo edoVar) {
                    TFq.this.NOt();
                    if (zRu.mZ()) {
                        return;
                    }
                    com.bytedance.adsdk.ugeno.core.edo edoVar2 = new com.bytedance.adsdk.ugeno.core.edo();
                    edoVar2.ZRu(0);
                    ((com.bytedance.sdk.openadsdk.core.ZH.uR.ZRu) TFq.this.mZ).VdW().ZRu(edoVar2);
                    TFq.this.mZ.TFq().aT();
                    oK oKVarNOt = zRu.NOt();
                    if (oKVarNOt == null) {
                        return;
                    }
                    oKVarNOt.ZRu(TFq.this.NOt, edoVar);
                    zRu.ZRu(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
                public void ZRu(int i10, String str) {
                    TFq.this.ZRu(zRu, i10, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(aT.ZRu zRu, int i10, String str) {
        oK oKVarNOt;
        if (zRu.mZ() || this.TFq.get()) {
            return;
        }
        NOt();
        com.bytedance.adsdk.ugeno.core.edo edoVar = new com.bytedance.adsdk.ugeno.core.edo();
        edoVar.ZRu(i10);
        edoVar.ZRu(str);
        ((com.bytedance.sdk.openadsdk.core.ZH.uR.ZRu) this.mZ).VdW().ZRu(edoVar);
        if (zRu.NOt(this)) {
            zRu.ZRu(this);
        } else {
            if (zRu.mZ() || (oKVarNOt = zRu.NOt()) == null) {
                return;
            }
            zRu.ZRu(true);
            oKVarNOt.a_(i10);
        }
        this.TFq.getAndSet(true);
    }
}
