package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lp extends uR {
    public lp(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> ZRu() {
        int i10;
        int i11;
        this.mZ.setTag(2097610711, Integer.valueOf(this.NOt.uR()));
        View view = this.mZ;
        if (view == null || !com.bytedance.sdk.component.adexpress.uR.NOt.ZRu(view.getContext())) {
            i10 = 0;
            i11 = 1;
        } else {
            i11 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "shineValue", i10, i11).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        return arrayList;
    }
}
