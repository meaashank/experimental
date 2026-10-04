package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class lp extends com.bytedance.sdk.openadsdk.core.TFq.Mm {
    public lp(Context context) {
        this(context, null);
    }

    private void ZRu(Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.sAl.Ds);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(getContext());
        uRVar.setId(com.bytedance.sdk.openadsdk.utils.sAl.CH);
        uRVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        uRVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        uRVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        uRVar.setBackgroundColor(Color.parseColor("#7f000000"));
        uRVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(uRVar);
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        mm.setId(com.bytedance.sdk.openadsdk.utils.sAl.qZ);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        mm.setLayoutParams(layoutParams);
        addView(mm);
        int iMZ = Cox.mZ(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.ZRu zRu = new com.bytedance.sdk.openadsdk.core.widget.ZRu(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.sAl.Vr;
        zRu.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMZ, iMZ);
        layoutParams2.addRule(14);
        zRu.setLayoutParams(layoutParams2);
        zRu.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        mm.addView(zRu);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        fa2.setId(com.bytedance.sdk.openadsdk.utils.sAl.Qg);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iMZ, iMZ);
        layoutParams3.addRule(8, i10);
        layoutParams3.addRule(19, i10);
        layoutParams3.addRule(5, i10);
        layoutParams3.addRule(7, i10);
        layoutParams3.addRule(18, i10);
        layoutParams3.addRule(6, i10);
        layoutParams3.addRule(14);
        fa2.setLayoutParams(layoutParams3);
        fa2.setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_circle_solid_mian"));
        fa2.setGravity(17);
        fa2.setTextColor(-1);
        fa2.setTextSize(2, 19.0f);
        fa2.setTypeface(Typeface.defaultFromStyle(1));
        fa2.setVisibility(8);
        mm.addView(fa2);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa3 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        int i11 = com.bytedance.sdk.openadsdk.utils.sAl.Hvv;
        fa3.setId(i11);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i10);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = Cox.mZ(context, 6.0f);
        fa3.setLayoutParams(layoutParams4);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fa3.setEllipsize(truncateAt);
        fa3.setMaxLines(1);
        fa3.setTextColor(-1);
        fa3.setTextSize(2, 12.0f);
        mm.addView(fa3);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa4 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        fa4.setId(com.bytedance.sdk.openadsdk.utils.sAl.IZ);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(Cox.mZ(context, 100.0f), Cox.mZ(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i11);
        layoutParams5.topMargin = Cox.mZ(context, 20.0f);
        fa4.setLayoutParams(layoutParams5);
        fa4.setMinWidth(Cox.mZ(context, 72.0f));
        fa4.setMaxLines(1);
        fa4.setEllipsize(truncateAt);
        fa4.setTextColor(-1);
        fa4.setTextSize(2, 14.0f);
        fa4.setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_ad_cover_btn_begin_bg"));
        fa4.setGravity(17);
        int iMZ2 = Cox.mZ(context, 10.0f);
        int iMZ3 = Cox.mZ(context, 2.0f);
        fa4.setPadding(iMZ2, iMZ3, iMZ2, iMZ3);
        fa4.setVisibility(8);
        mm.addView(fa4);
    }

    public lp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lp(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ZRu(context);
    }
}
