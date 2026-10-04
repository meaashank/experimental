package com.bytedance.sdk.component.adexpress.NOt;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.NOt.aT;

/* JADX INFO: loaded from: classes2.dex */
public class Ht implements aT {
    private ZRu NOt;
    private Context ZRu;
    private sAl mZ;

    public Ht(Context context, sAl sal, ZRu zRu) {
        this.ZRu = context;
        this.NOt = zRu;
        this.mZ = sal;
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public void ZRu() {
    }

    @Override // com.bytedance.sdk.component.adexpress.NOt.aT
    public boolean ZRu(final aT.ZRu zRu) {
        this.mZ.TFq().Ht();
        this.NOt.ZRu(new Mm() { // from class: com.bytedance.sdk.component.adexpress.NOt.Ht.1
            @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
            public void ZRu(View view, edo edoVar) {
                if (zRu.mZ()) {
                    return;
                }
                oK oKVarNOt = zRu.NOt();
                if (oKVarNOt != null) {
                    oKVarNOt.ZRu(Ht.this.NOt, edoVar);
                }
                zRu.ZRu(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.NOt.Mm
            public void ZRu(int i10, String str) {
                oK oKVarNOt = zRu.NOt();
                if (oKVarNOt != null) {
                    oKVarNOt.a_(i10);
                }
            }
        });
        return true;
    }

    public void ZRu(mZ mZVar) {
        this.NOt.ZRu(mZVar);
    }
}
