package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends uR {
    public Ht(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    public List<ObjectAnimator> ZRu() {
        float f10 = this.mZ.getLayoutParams().width;
        this.mZ.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "translationX", f10, 0.0f).setDuration((int) (this.NOt.aT() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.mZ, "alpha", 0.0f, 1.0f).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        arrayList.add(ZRu(duration2));
        return arrayList;
    }
}
