package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class yBV extends uR {
    public yBV(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    public List<ObjectAnimator> ZRu() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.uR.FA.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.uR.FA.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), 20.0f), 0.0f).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        return arrayList;
    }
}
