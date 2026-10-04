package com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZH extends uR {
    public ZH(View view, com.bytedance.sdk.component.adexpress.dynamic.uR.ZRu zRu) {
        super(view, zRu);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ZRu.uR
    public List<ObjectAnimator> ZRu() {
        float f10;
        float fZH = (float) this.NOt.ZH();
        float fLp = (float) this.NOt.lp();
        String strYBV = this.NOt.yBV();
        float f11 = 1.0f;
        if ("reverse".equals(strYBV) || "alternate-reverse".equals(strYBV)) {
            f10 = 1.0f;
        } else {
            f10 = fLp;
            fLp = 1.0f;
            f11 = fZH;
            fZH = 1.0f;
        }
        this.mZ.setTag(2097610710, this.NOt.NOt());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.mZ, "scaleX", fZH, f11).setDuration((int) (this.NOt.aT() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.mZ, "scaleY", fLp, f10).setDuration((int) (this.NOt.aT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ZRu(duration));
        arrayList.add(ZRu(duration2));
        return arrayList;
    }
}
