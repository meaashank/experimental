package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FA extends uR {
    public FA(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> ZRu() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.NOt.aT() * 1000.0d));
        ((ViewGroup) this.mZ.getParent()).setClipChildren(false);
        ((ViewGroup) this.mZ.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.mZ.getParent().getParent().getParent()).setClipChildren(false);
        this.mZ.setTag(2097610712, this.NOt.FA());
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        return arrayList;
    }
}
