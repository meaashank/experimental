package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Mm extends uR {
    public Mm(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> ZRu() {
        this.mZ.setTag(2097610709, Integer.valueOf(this.NOt.mZ()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        return arrayList;
    }
}
