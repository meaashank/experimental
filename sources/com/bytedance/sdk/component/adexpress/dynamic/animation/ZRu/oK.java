package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class oK extends uR {
    public oK(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    public List<ObjectAnimator> ZRu() {
        float f10;
        float fZRu = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), this.NOt.Ht());
        float fZRu2 = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), this.NOt.Mm());
        float f11 = 0.0f;
        if ("reverse".equals(this.NOt.yBV())) {
            f10 = fZRu2;
            fZRu2 = 0.0f;
            f11 = fZRu;
            fZRu = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.uR.NOt.ZRu(this.mZ.getContext())) {
            fZRu = -fZRu;
            f11 = -f11;
        }
        this.mZ.setTranslationX(fZRu);
        this.mZ.setTranslationY(fZRu2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "translationX", fZRu, f11).setDuration((int) (this.NOt.aT() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.mZ, "translationY", fZRu2, f10).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        arrayList.add(ZRu(duration2));
        return arrayList;
    }
}
