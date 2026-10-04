package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Ht.OCA;
import com.bytedance.sdk.component.adexpress.Ht.om;
import com.bytedance.sdk.component.adexpress.Ht.xY;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends WMI<com.bytedance.sdk.component.adexpress.Ht.Ht> {
    public Ht(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, tFq, mm);
        this.NOt = context;
        this.uR = mm;
        this.mZ = tFq;
        ZRu(i10, i11, i12, jSONObject, mm);
    }

    private void ZRu(int i10, int i11, int i12, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        this.ZRu = new com.bytedance.sdk.component.adexpress.Ht.Ht(this.NOt, i10, i11, i12, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, 300.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, mm.NBW() > 0 ? mm.NBW() : com.bytedance.sdk.component.adexpress.uR.NOt() ? 0 : 120);
        this.ZRu.setLayoutParams(layoutParams);
        this.ZRu.setClipChildren(false);
        this.ZRu.setSlideText(this.uR.Gis());
        xY xYVar = this.ZRu;
        if (xYVar instanceof com.bytedance.sdk.component.adexpress.Ht.Ht) {
            ((com.bytedance.sdk.component.adexpress.Ht.Ht) xYVar).setShakeText(this.uR.HX());
            final OCA shakeView = ((com.bytedance.sdk.component.adexpress.Ht.Ht) this.ZRu).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new om.ZRu() { // from class: com.bytedance.sdk.component.adexpress.dynamic.mZ.Ht.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.mZ.getDynamicClickListener());
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.WMI
    public void uR() {
    }
}
