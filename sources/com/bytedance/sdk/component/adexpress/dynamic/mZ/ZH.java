package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class ZH implements Mm<ViewGroup> {
    private final FrameLayout NOt;
    private final com.bytedance.sdk.component.adexpress.Ht.aT ZRu;

    public ZH(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm, String str, String str2) {
        com.bytedance.sdk.component.adexpress.Ht.aT aTVar = new com.bytedance.sdk.component.adexpress.Ht.aT(context);
        this.ZRu = aTVar;
        aTVar.setImageLottieTosPath(str);
        FrameLayout frameLayout = new FrameLayout(context);
        this.NOt = frameLayout;
        frameLayout.addView(aTVar, new FrameLayout.LayoutParams(-2, -2));
        double dGC = mm.GC();
        dGC = dGC == 0.0d ? 1.0d : dGC;
        double dVE = mm.vE();
        double d10 = dVE != 0.0d ? dVE : 1.0d;
        if ("22".equals(str2)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, 250.0f));
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, 120.0f);
            frameLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!"20".equals(str2)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (((double) tFq.getDynamicWidth()) * 0.32d * dGC), (int) (((double) tFq.getDynamicWidth()) * 0.32d * d10));
            layoutParams2.gravity = 17;
            frameLayout.setLayoutParams(layoutParams2);
        } else {
            ZRu(context, frameLayout, mm);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 81;
            layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, mm.NBW() > 0 ? mm.NBW() : com.bytedance.sdk.component.adexpress.uR.NOt() ? 0 : 120);
            frameLayout.setLayoutParams(layoutParams3);
            frameLayout.setClipChildren(false);
        }
    }

    private void ZRu(Context context, FrameLayout frameLayout, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, -le.ZRu(context, 5.0f), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText(context.getString(com.bytedance.sdk.component.utils.om.NOt(context, "tt_splash_brush_mask_title")));
        textView.setTextColor(-1);
        textView.setTextSize(2, 20.0f);
        TextView textView2 = new TextView(context);
        textView2.setId(2097610738);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, le.ZRu(context, 5.0f), 0, 0);
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(com.bytedance.sdk.component.utils.om.NOt(context, "tt_splash_brush_mask_hint")));
        if (mm != null && !TextUtils.isEmpty(mm.Gis())) {
            textView2.setText(mm.Gis());
        }
        textView2.setTextColor(-1);
        textView2.setTextSize(2, 14.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(linearLayout);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void NOt() {
        this.ZRu.Ht();
        ViewParent parent = this.NOt.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.NOt);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public ViewGroup mZ() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void ZRu() {
        this.ZRu.FA();
    }
}
