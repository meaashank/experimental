package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class aT extends RelativeLayout {
    public aT(Context context) {
        super(context);
        ZRu();
    }

    private void ZRu() {
        Context context = getContext();
        int iMZ = Cox.mZ(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, Cox.mZ(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        uRVar.setId(520093720);
        uRVar.setClickable(true);
        uRVar.setFocusable(true);
        uRVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_leftbackicon_selector"));
        int iMZ2 = Cox.mZ(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMZ2, iMZ2);
        layoutParams.leftMargin = iMZ;
        layoutParams.addRule(15);
        addView(uRVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar2 = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        uRVar2.setId(520093716);
        uRVar2.setClickable(true);
        uRVar2.setFocusable(true);
        uRVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMZ2, iMZ2);
        layoutParams2.leftMargin = iMZ;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(uRVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar3 = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.sAl.pvl;
        uRVar3.setId(i10);
        uRVar3.setImageDrawable(om.mZ(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iMZ2, iMZ2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = iMZ;
        addView(uRVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        fa2.setId(com.bytedance.sdk.openadsdk.utils.sAl.AZ);
        fa2.setSingleLine(true);
        fa2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        fa2.setGravity(17);
        fa2.setTextColor(-16777216);
        fa2.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(Cox.mZ(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int iMZ3 = Cox.mZ(context, 25.0f);
        layoutParams4.rightMargin = iMZ3;
        layoutParams4.leftMargin = iMZ3;
        addView(fa2, layoutParams4);
    }
}
