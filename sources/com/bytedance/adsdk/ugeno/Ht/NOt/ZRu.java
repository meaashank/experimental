package com.bytedance.adsdk.ugeno.Ht.NOt;

import android.view.View;
import com.bytedance.adsdk.ugeno.FA.mZ;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements mZ.TFq {
    final float ZRu = 0.8f;
    final float NOt = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.FA.mZ.TFq
    public void ZRu(View view, float f10) {
        float f11 = ((f10 < 0.0f ? 0.19999999f : -0.19999999f) * f10) + 1.0f;
        float f12 = (f10 * (f10 < 0.0f ? 0.5f : -0.5f)) + 1.0f;
        if (f10 < 0.0f) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f11);
        view.setScaleY(f11);
        view.setAlpha(Math.abs(f12));
    }
}
