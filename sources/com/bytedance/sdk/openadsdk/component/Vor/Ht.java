package com.bytedance.sdk.openadsdk.component.Vor;

import E3.a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.WMI;
import com.bytedance.sdk.openadsdk.core.widget.yBV;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.sAl;

/* JADX INFO: loaded from: classes3.dex */
public class Ht extends mZ {
    private final yBV edo;
    private final com.bytedance.sdk.openadsdk.core.TFq.TFq sAl;

    public Ht(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        this.sAl = tFq;
        tFq.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = Cox.mZ(context, 24.0f);
        layoutParams.topMargin = Cox.mZ(context, 56.0f);
        tFq.setLayoutParams(layoutParams);
        tFq.setClickable(false);
        tFq.setGravity(16);
        tFq.setOrientation(0);
        WMI wmi = new WMI(context);
        this.Ht = wmi;
        wmi.setId(520093759);
        this.Ht.setLayoutParams(new LinearLayout.LayoutParams(Cox.mZ(context, 24.0f), Cox.mZ(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        this.Mm = fa2;
        fa2.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = Cox.mZ(context, 8.0f);
        this.Mm.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa3 = this.Mm;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fa3.setEllipsize(truncateAt);
        this.Mm.setMaxLines(2);
        this.Mm.setTextColor(Color.parseColor("#161823"));
        this.Mm.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(Cox.mZ(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = Cox.mZ(context, 24.0f);
        layoutParams3.rightMargin = Cox.mZ(context, 24.0f);
        mm.setLayoutParams(layoutParams3);
        WMI wmi2 = new WMI(context);
        this.Vor = wmi2;
        int i10 = sAl.oZ;
        wmi2.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(Cox.mZ(context, 80.0f), Cox.mZ(context, 80.0f));
        layoutParams4.addRule(14);
        this.Vor.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa4 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        this.aT = fa4;
        int i11 = sAl.XyE;
        fa4.setId(i11);
        this.aT.setTextSize(24.0f);
        this.aT.setTextColor(Color.parseColor("#161823"));
        this.aT.setGravity(17);
        this.aT.setMaxLines(1);
        this.aT.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i10);
        layoutParams5.topMargin = Cox.mZ(context, 12.0f);
        layoutParams5.addRule(14);
        this.aT.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa5 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        this.ZH = fa5;
        int i12 = sAl.zG;
        fa5.setId(i12);
        this.ZH.setTextSize(16.0f);
        this.ZH.setTextColor(Color.parseColor("#80161823"));
        this.ZH.setGravity(17);
        this.ZH.setMaxLines(2);
        this.ZH.setEllipsize(truncateAt);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i11);
        layoutParams6.topMargin = Cox.mZ(context, 4.0f);
        layoutParams6.addRule(14);
        this.ZH.setLayoutParams(layoutParams6);
        yBV ybv = new yBV(context);
        this.edo = ybv;
        RelativeLayout.LayoutParams layoutParamsA = a.a(-2, -2, 14);
        layoutParamsA.topMargin = Cox.mZ(context, 12.0f);
        ybv.setLayoutParams(layoutParamsA);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa6 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        this.TFq = fa6;
        fa6.setId(520093717);
        this.TFq.setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_reward_full_video_backup_btn_bg"));
        this.TFq.setEllipsize(truncateAt);
        this.TFq.setLines(1);
        this.TFq.setGravity(17);
        this.TFq.setTextColor(-1);
        this.TFq.setTextSize(16.0f);
        this.TFq.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, Cox.mZ(context, 44.0f));
        layoutParams7.addRule(3, i12);
        layoutParams7.topMargin = Cox.mZ(context, 54.0f);
        layoutParams7.addRule(14);
        this.TFq.setLayoutParams(layoutParams7);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.uR = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, Cox.mZ(context, 14.0f));
        layoutParams8.leftMargin = Cox.mZ(context, 16.0f);
        layoutParams8.bottomMargin = Cox.mZ(context, 24.0f);
        layoutParams8.addRule(12);
        this.uR.setLayoutParams(layoutParams8);
        addView(this.FA);
        tFq.addView(this.Ht);
        tFq.addView(this.Mm);
        addView(tFq);
        mm.addView(this.Vor);
        mm.addView(this.aT);
        mm.addView(this.ZH);
        mm.addView(ybv);
        mm.addView(this.TFq);
        addView(mm);
        addView(this.uR);
    }

    @Override // com.bytedance.sdk.openadsdk.component.Vor.mZ
    public com.bytedance.sdk.openadsdk.core.TFq.uR getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.Vor.mZ
    public com.bytedance.sdk.openadsdk.core.TFq.FA getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.Vor.mZ
    public yBV getScoreBar() {
        return this.edo;
    }

    @Override // com.bytedance.sdk.openadsdk.component.Vor.mZ
    public View getUserInfo() {
        return this.sAl;
    }
}
