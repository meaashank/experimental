package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class FA extends aT {
    public FA(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public com.bytedance.sdk.openadsdk.core.TFq.FA NOt(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA faNOt = super.NOt(context);
        faNOt.setGravity(16);
        faNOt.setMaxWidth(Cox.mZ(context, 250.0f));
        faNOt.setTextColor(-1);
        faNOt.setTextSize(2, 17.0f);
        faNOt.setText("APP NAME");
        return faNOt;
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public void ZRu(Context context) {
        int iMZ = Cox.mZ(context, 10.0f);
        int iMZ2 = Cox.mZ(context, 16.0f);
        int iMZ3 = Cox.mZ(context, 15.0f);
        int iMZ4 = Cox.mZ(context, 20.0f);
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        mm.setLayoutParams(layoutParams);
        addView(mm);
        com.bytedance.sdk.openadsdk.core.TFq.mZ mZVarTFq = TFq(context);
        this.ZRu = mZVarTFq;
        mZVarTFq.setId(com.bytedance.sdk.openadsdk.utils.sAl.AOL);
        this.ZRu.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        mm.addView(this.ZRu);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVarHt = Ht(context);
        this.NOt = uRVarHt;
        uRVarHt.setId(com.bytedance.sdk.openadsdk.utils.sAl.wcb);
        this.NOt.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        mm.addView(this.NOt);
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm2 = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.sAl.hNL;
        mm2.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, Cox.mZ(context, 60.0f));
        layoutParams2.addRule(12);
        layoutParams2.rightMargin = iMZ3;
        layoutParams2.leftMargin = iMZ3;
        layoutParams2.bottomMargin = iMZ3;
        layoutParams2.setMarginEnd(iMZ3);
        layoutParams2.setMarginStart(iMZ3);
        mm2.setBackgroundColor(Color.parseColor("#26000000"));
        mm2.setLayoutParams(layoutParams2);
        mm.addView(mm2);
        WMI wmiMm = Mm(context);
        this.mZ = wmiMm;
        int i11 = com.bytedance.sdk.openadsdk.utils.sAl.HZ;
        wmiMm.setId(i11);
        int iMZ5 = Cox.mZ(context, 50.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(iMZ5, iMZ5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.mZ.setLayoutParams(layoutParams3);
        mm2.addView(this.mZ);
        com.bytedance.sdk.openadsdk.core.TFq.FA faNOt = NOt(context);
        this.uR = faNOt;
        faNOt.setId(com.bytedance.sdk.openadsdk.utils.sAl.cA);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15);
        layoutParams4.leftMargin = iMZ4;
        layoutParams4.setMarginStart(iMZ4);
        layoutParams4.addRule(1, i11);
        layoutParams4.addRule(17, i11);
        this.uR.setLayoutParams(layoutParams4);
        mm2.addView(this.uR);
        com.bytedance.sdk.openadsdk.core.TFq.FA faUR = uR(context);
        this.Ht = faUR;
        faUR.setId(com.bytedance.sdk.openadsdk.utils.sAl.jJC);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(Cox.mZ(context, 100.0f), Cox.mZ(context, 30.0f));
        layoutParams5.addRule(21);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        layoutParams5.rightMargin = iMZ;
        layoutParams5.setMarginEnd(iMZ);
        this.Ht.setLayoutParams(layoutParams5);
        mm2.addView(this.Ht);
        View viewFA = FA(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(2, i10);
        layoutParams6.leftMargin = iMZ2;
        layoutParams6.bottomMargin = iMZ;
        viewFA.setLayoutParams(layoutParams6);
        mm.addView(viewFA);
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public com.bytedance.sdk.openadsdk.core.TFq.FA uR(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA faUR = super.uR(context);
        faUR.setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_download_corner_bg"));
        faUR.setTextSize(2, 15.0f);
        return faUR;
    }

    public FA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FA(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
