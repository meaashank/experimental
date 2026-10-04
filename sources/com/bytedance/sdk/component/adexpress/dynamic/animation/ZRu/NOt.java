package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class NOt implements Cox {
    List<uR> ZRu = new ArrayList();

    public NOt(View view, List<com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu> it = list.iterator();
        while (it.hasNext()) {
            uR uRVarZRu = mZ.ZRu().ZRu(view, it.next());
            if (uRVarZRu != null) {
                this.ZRu.add(uRVarZRu);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Cox
    public void NOt() {
        Iterator<uR> it = this.ZRu.iterator();
        while (it.hasNext()) {
            try {
                it.next().NOt();
            } catch (Exception unused) {
            }
        }
    }

    public void ZRu() {
        Iterator<uR> it = this.ZRu.iterator();
        while (it.hasNext()) {
            try {
                it.next().mZ();
            } catch (Exception unused) {
            }
        }
    }
}
