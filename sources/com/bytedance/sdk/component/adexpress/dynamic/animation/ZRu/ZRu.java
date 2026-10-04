package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends uR {
    public ZRu(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    public List<ObjectAnimator> ZRu() {
        float fQF = this.NOt.qF() / 100.0f;
        float fOm = this.NOt.om() / 100.0f;
        if ("reverse".equals(this.NOt.yBV()) && this.NOt.edo() <= 0.0d) {
            fOm = fQF;
            fQF = fOm;
        }
        this.mZ.setAlpha(fQF);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "alpha", fQF, fOm).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        return arrayList;
    }
}
