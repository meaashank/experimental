package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class FA extends LinearLayout {
    public FA(Context context) {
        super(context);
        ZRu();
    }

    private static ImageView ZRu(Context context, float f10, float f11, float f12, float f13) {
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        uRVar.setClickable(true);
        uRVar.setFocusable(true);
        uRVar.setPadding(Cox.mZ(context, f12), Cox.mZ(context, f13), Cox.mZ(context, f12), Cox.mZ(context, f13));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Cox.mZ(context, 40.0f), Cox.mZ(context, 44.0f));
        if (f10 > 0.0f) {
            layoutParams.leftMargin = Cox.mZ(context, f10);
        }
        if (f11 > 0.0f) {
            layoutParams.rightMargin = Cox.mZ(context, f11);
        }
        uRVar.setLayoutParams(layoutParams);
        return uRVar;
    }

    private void ZRu() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.sAl.wZ);
        setLayoutParams(new ViewGroup.LayoutParams(-1, Cox.mZ(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, Cox.mZ(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        tFq.setOrientation(0);
        addView(tFq, new LinearLayout.LayoutParams(-1, Cox.mZ(context, 44.0f)));
        ImageView imageViewZRu = ZRu(context, 16.0f, 0.0f, 14.75f, 12.5f);
        imageViewZRu.setId(com.bytedance.sdk.openadsdk.utils.sAl.MO);
        imageViewZRu.setImageResource(om.uR(context, "tt_ad_arrow_backward"));
        tFq.addView(imageViewZRu);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        tFq.addView(view2, layoutParams);
        ImageView imageViewZRu2 = ZRu(context, 8.0f, 0.0f, 14.75f, 12.5f);
        imageViewZRu2.setId(com.bytedance.sdk.openadsdk.utils.sAl.CXy);
        imageViewZRu2.setImageResource(om.uR(context, "tt_ad_arrow_forward"));
        tFq.addView(imageViewZRu2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        tFq.addView(view3, layoutParams2);
        ImageView imageViewZRu3 = ZRu(context, 8.0f, 0.0f, 10.0f, 12.0f);
        imageViewZRu3.setId(com.bytedance.sdk.openadsdk.utils.sAl.pDA);
        imageViewZRu3.setImageResource(om.uR(context, "tt_ad_refresh"));
        tFq.addView(imageViewZRu3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        tFq.addView(view4, layoutParams3);
        ImageView imageViewZRu4 = ZRu(context, 0.0f, 16.0f, 9.0f, 11.0f);
        imageViewZRu4.setId(com.bytedance.sdk.openadsdk.utils.sAl.FFX);
        imageViewZRu4.setImageResource(om.uR(context, "tt_ad_link"));
        tFq.addView(imageViewZRu4);
    }
}
