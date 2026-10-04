package com.bytedance.sdk.component.adexpress.dynamic.ZRu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.NOt.Mm;
import com.bytedance.sdk.component.adexpress.NOt.ZH;
import com.bytedance.sdk.component.adexpress.NOt.edo;
import com.bytedance.sdk.component.adexpress.NOt.sAl;
import com.bytedance.sdk.component.adexpress.NOt.uR;
import com.bytedance.sdk.component.adexpress.dynamic.TFq.FA;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.uR.Ht;
import com.bytedance.sdk.component.adexpress.mZ;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements ZH, uR<DynamicRootView> {
    private AtomicBoolean FA = new AtomicBoolean(false);
    private sAl Ht;
    private ScheduledFuture<?> Mm;
    private FA NOt;
    private com.bytedance.sdk.component.adexpress.NOt.FA TFq;
    private DynamicRootView ZRu;
    private Context mZ;
    private Mm uR;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu$ZRu, reason: collision with other inner class name */
    public class RunnableC0423ZRu implements Runnable {
        private int NOt;

        public RunnableC0423ZRu(int i10) {
            this.NOt = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.NOt == 2) {
                ZRu.this.ZRu.callBackRenderFail(ZRu.this.NOt instanceof com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm ? 127 : 117, null);
            }
        }
    }

    public ZRu(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, FA fa2, sAl sal, com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu zRu) {
        this.mZ = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z10, sal, zRu);
        this.ZRu = dynamicRootView;
        this.NOt = fa2;
        this.Ht = sal;
        dynamicRootView.setRenderListener(this);
        this.Ht = sal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FA() {
        try {
            ScheduledFuture<?> scheduledFuture = this.Mm;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.Mm.cancel(false);
            this.Mm = null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Ht() {
        this.Ht.TFq().NOt(mZ());
        JSONObject jSONObjectMZ = this.Ht.mZ();
        if (com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.ZRu(jSONObjectMZ)) {
            this.NOt.ZRu(new com.bytedance.sdk.component.adexpress.dynamic.Ht.NOt() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.Ht.NOt
                public void ZRu(final com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
                    ZRu.this.FA();
                    ZRu.this.Ht.TFq().mZ(ZRu.this.mZ());
                    ZRu.this.ZRu(fa2);
                    ZRu.this.NOt(fa2);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        ZRu.this.mZ(fa2);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ZRu.this.mZ(fa2);
                            }
                        });
                    }
                    if (ZRu.this.ZRu == null || fa2 == null) {
                        return;
                    }
                    ZRu.this.ZRu.setBgColor(fa2.ZRu());
                    ZRu.this.ZRu.setBgMaterialCenterCalcColor(fa2.NOt());
                }
            });
            this.NOt.ZRu(this.Ht);
            return;
        }
        int i10 = this.NOt instanceof com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm ? 123 : 113;
        DynamicRootView dynamicRootView = this.ZRu;
        StringBuilder sb2 = new StringBuilder("data null is ");
        sb2.append(jSONObjectMZ == null);
        dynamicRootView.callBackRenderFail(i10, sb2.toString());
    }

    private boolean Mm() {
        DynamicRootView dynamicRootView = this.ZRu;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    public DynamicRootView uR() {
        return this.ZRu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        float fMm;
        float fHt;
        List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> listZH;
        if (fa2 == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> listZH2 = fa2.ZH();
        if (listZH2 == null || listZH2.size() <= 0) {
            fMm = 0.0f;
        } else {
            fMm = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa3 : listZH2) {
                if (fa3.Mm() > fa2.Mm() - fa3.Vor() || (listZH = fa3.ZH()) == null || listZH.size() <= 0) {
                    fHt = 0.0f;
                } else {
                    fHt = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa4 : listZH) {
                        if (fa4.aT().NOt().equals("logo-union")) {
                            fHt = fa4.aT().Ht();
                            fMm = ((fa2.Mm() + (-fHt)) - fa3.Mm()) + fa3.aT().TFq().pU();
                        }
                    }
                }
                NOt(fa3);
                if (fHt <= -15.0f) {
                    fa3.Ht(fa3.Vor() - fHt);
                    fa3.uR(fa3.Mm() + fHt);
                    for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa5 : fa3.ZH()) {
                        fa5.uR(fa5.Mm() - fHt);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA faLp = fa2.lp();
        if (faLp == null) {
            return;
        }
        float fHt2 = fa2.Ht() - faLp.Ht();
        float fMm2 = fa2.Mm() - faLp.Mm();
        fa2.mZ(fHt2);
        fa2.uR(fMm2);
        if (fMm > 0.0f) {
            fa2.uR(fa2.Mm() - fMm);
            fa2.Ht(fa2.Vor() + fMm);
            for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa6 : fa2.ZH()) {
                fa6.uR(fa6.Mm() + fMm);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    public void ZRu(Mm mm) {
        this.uR = mm;
        int iHt = this.Ht.Ht();
        if (iHt < 0) {
            this.ZRu.callBackRenderFail(this.NOt instanceof com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm ? 127 : 117, "time is ".concat(String.valueOf(iHt)));
            return;
        }
        this.Mm = com.bytedance.sdk.component.adexpress.uR.uR.ZRu(new RunnableC0423ZRu(2), iHt, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.Ht.Vor() <= 0) {
            Ht();
        } else {
            com.bytedance.sdk.component.utils.Mm.NOt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu.1
                @Override // java.lang.Runnable
                public void run() {
                    ZRu.this.Ht();
                }
            }, this.Ht.Vor());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    public int mZ() {
        return this.NOt instanceof com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZ(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        if (fa2 == null) {
            this.ZRu.callBackRenderFail(this.NOt instanceof com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.Ht.TFq().uR(mZ());
        try {
            this.ZRu.render(fa2, mZ());
        } catch (Exception e10) {
            int i10 = this.NOt instanceof com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm ? 128 : 118;
            this.ZRu.callBackRenderFail(i10, "exception is " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA> listZH;
        if (fa2 == null || (listZH = fa2.ZH()) == null || listZH.size() <= 0) {
            return;
        }
        Collections.sort(listZH, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa3, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa4) {
                Ht htTFq = fa3.aT().TFq();
                Ht htTFq2 = fa4.aT().TFq();
                if (htTFq == null || htTFq2 == null) {
                    return 0;
                }
                return htTFq.cvm() >= htTFq2.cvm() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa3 : listZH) {
            if (fa3 != null) {
                ZRu(fa3);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.uR
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public DynamicRootView TFq() {
        return uR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ZRu(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                ZRu(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof Cox) {
            ((Cox) view).NOt();
        }
    }

    public void ZRu(com.bytedance.sdk.component.adexpress.NOt.FA fa2) {
        this.TFq = fa2;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.ZH
    public void ZRu(edo edoVar) {
        if (this.FA.get()) {
            return;
        }
        this.FA.set(true);
        if (edoVar.mZ() && Mm()) {
            this.ZRu.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.uR.ZRu(TFq(), edoVar);
            return;
        }
        this.uR.ZRu(edoVar.ZH(), edoVar.aT());
    }

    public void NOt() {
        ZRu(TFq());
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.ZH
    public void ZRu(View view, int i10, mZ mZVar) {
        com.bytedance.sdk.component.adexpress.NOt.FA fa2 = this.TFq;
        if (fa2 != null) {
            fa2.ZRu(view, i10, mZVar);
        }
    }
}
