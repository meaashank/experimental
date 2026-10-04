package com.bytedance.sdk.openadsdk.core.FA;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.WD;

/* JADX INFO: loaded from: classes3.dex */
public class Ht extends com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu {
    private com.bytedance.sdk.component.adexpress.NOt.Mm NOt;
    private final com.bytedance.sdk.component.adexpress.NOt.sAl ZRu;
    private final com.bytedance.sdk.component.FA.FA mZ;
    private final Runnable uR;

    public Ht(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.TFq.FA fa2, com.bytedance.sdk.component.adexpress.NOt.sAl sal, com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu zRu) {
        super(context, themeStatusBroadcastReceiver, z10, fa2, sal, zRu);
        this.mZ = new com.bytedance.sdk.component.FA.FA("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.FA.Ht.1
            @Override // java.lang.Runnable
            public void run() {
                Ht.this.ZRu.mZ();
                com.bytedance.sdk.openadsdk.core.edo.mZ().post(Ht.this.uR);
            }
        };
        this.uR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.FA.Ht.2
            @Override // java.lang.Runnable
            public void run() {
                if (Ht.this.NOt != null) {
                    Ht ht = Ht.this;
                    Ht.super.ZRu(ht.NOt);
                }
            }
        };
        this.ZRu = sal;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu
    public void NOt() {
        super.NOt();
        com.bytedance.sdk.openadsdk.core.edo.mZ().removeCallbacks(this.uR);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu, com.bytedance.sdk.component.adexpress.NOt.uR
    public void ZRu(com.bytedance.sdk.component.adexpress.NOt.Mm mm) {
        this.NOt = mm;
        WD.NOt(this.mZ);
    }
}
