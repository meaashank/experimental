package com.bytedance.sdk.component.adexpress.NOt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.NOt.aT;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements aT {
    private int Ht;
    private com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu NOt;
    private sAl TFq;
    private Context ZRu;
    private ThemeStatusBroadcastReceiver mZ;
    private FA uR;

    public NOt(Context context, sAl sal, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.TFq.FA fa2, FA fa3, com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu zRu, com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu zRu2) {
        this.ZRu = context;
        this.TFq = sal;
        this.mZ = themeStatusBroadcastReceiver;
        this.uR = fa3;
        if (zRu2 != null) {
            this.NOt = zRu2;
        } else {
            this.NOt = new com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu(context, themeStatusBroadcastReceiver, z10, fa2, sal, zRu);
        }
        this.NOt.ZRu(this.uR);
        if (fa2 instanceof com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm) {
            this.Ht = 3;
        } else {
            this.Ht = 2;
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uR NOt() {
        com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu zRu = this.NOt;
        if (zRu != null) {
            return zRu.uR();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public boolean ZRu(final aT.ZRu zRu) {
        this.TFq.TFq().ZRu(this.Ht);
        this.NOt.ZRu(new Mm() { // from class: com.bytedance.sdk.component.adexpress.NOt.NOt.1
            @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
            public void ZRu(View view, edo edoVar) {
                if (zRu.mZ()) {
                    return;
                }
                NOt.this.TFq.TFq().TFq(NOt.this.Ht);
                NOt.this.TFq.TFq().Ht(NOt.this.Ht);
                NOt.this.TFq.TFq().aT();
                oK oKVarNOt = zRu.NOt();
                if (oKVarNOt == null) {
                    return;
                }
                oKVarNOt.ZRu(NOt.this.NOt, edoVar);
                zRu.ZRu(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
            public void ZRu(int i10, String str) {
                NOt.this.TFq.TFq().ZRu(NOt.this.Ht, i10, str, zRu.NOt(NOt.this));
                if (zRu.NOt(NOt.this)) {
                    zRu.ZRu(NOt.this);
                    return;
                }
                oK oKVarNOt = zRu.NOt();
                if (oKVarNOt == null) {
                    return;
                }
                oKVarNOt.a_(i10);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public void ZRu() {
        com.bytedance.sdk.component.adexpress.dynamic.ZRu.ZRu zRu = this.NOt;
        if (zRu != null) {
            zRu.NOt();
        }
    }
}
