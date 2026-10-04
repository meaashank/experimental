package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class oK extends com.bytedance.sdk.openadsdk.core.TFq.Mm {
    public oK(Context context) {
        this(context, null);
    }

    private void ZRu(Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.sAl.wzV);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.sAl.yx;
        fa2.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        fa2.setLayoutParams(layoutParams);
        fa2.setIncludeFontPadding(false);
        fa2.setText(om.ZRu(context, "tt_video_without_wifi_tips"));
        fa2.setTextColor(Color.parseColor("#cacaca"));
        fa2.setTextSize(2, 14.0f);
        addView(fa2);
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        mm.setId(com.bytedance.sdk.openadsdk.utils.sAl.DoD);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        mm.setLayoutParams(layoutParams2);
        addView(mm);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        uRVar.setId(com.bytedance.sdk.openadsdk.utils.sAl.GE);
        int iMZ = Cox.mZ(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iMZ, iMZ);
        layoutParams3.addRule(15);
        uRVar.setLayoutParams(layoutParams3);
        uRVar.setImageDrawable(om.mZ(context, "tt_new_play_video"));
        uRVar.setScaleType(ImageView.ScaleType.FIT_XY);
        mm.addView(uRVar);
    }

    public oK(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public oK(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ZRu(context);
    }
}
