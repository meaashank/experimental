package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends aT {
    public NOt(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public com.bytedance.sdk.openadsdk.core.TFq.FA NOt(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA faNOt = super.NOt(context);
        faNOt.setTextColor(-1);
        faNOt.setTextSize(2, 13.0f);
        faNOt.setText("Pangle");
        return faNOt;
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public void ZRu(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        tFq.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tFq.setOrientation(1);
        addView(tFq);
        com.bytedance.sdk.openadsdk.core.TFq.mZ mZVar = new com.bytedance.sdk.openadsdk.core.TFq.mZ(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        mZVar.setLayoutParams(layoutParams);
        tFq.addView(mZVar);
        com.bytedance.sdk.openadsdk.core.TFq.mZ mZVarTFq = TFq(context);
        this.ZRu = mZVarTFq;
        mZVarTFq.setId(com.bytedance.sdk.openadsdk.utils.sAl.AOL);
        this.ZRu.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mZVar.addView(this.ZRu);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVarHt = Ht(context);
        this.NOt = uRVarHt;
        uRVarHt.setId(com.bytedance.sdk.openadsdk.utils.sAl.wcb);
        this.NOt.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mZVar.addView(this.NOt);
        PAGLogoView pAGLogoViewFA = FA(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int iMZ = Cox.mZ(context, 10.0f);
        layoutParams2.leftMargin = iMZ;
        layoutParams2.topMargin = iMZ;
        layoutParams2.bottomMargin = iMZ;
        pAGLogoViewFA.setLayoutParams(layoutParams2);
        mZVar.addView(pAGLogoViewFA);
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq2 = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        tFq2.setLayoutParams(layoutParams3);
        tFq2.setOrientation(1);
        tFq2.setGravity(81);
        int iMZ2 = Cox.mZ(context, 16.0f);
        tFq2.setPadding(iMZ2, iMZ2, iMZ2, iMZ2);
        tFq.addView(tFq2);
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        mm.setId(com.bytedance.sdk.openadsdk.utils.sAl.CTl);
        mm.setLayoutParams(new LinearLayout.LayoutParams(-2, Cox.mZ(context, 40.0f)));
        mm.setGravity(17);
        tFq2.addView(mm);
        WMI wmiMm = Mm(context);
        this.mZ = wmiMm;
        wmiMm.setId(com.bytedance.sdk.openadsdk.utils.sAl.HZ);
        int iMZ3 = Cox.mZ(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iMZ3, iMZ3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.mZ.setLayoutParams(layoutParams4);
        mm.addView(this.mZ);
        com.bytedance.sdk.openadsdk.core.TFq.FA faNOt = NOt(context);
        this.uR = faNOt;
        faNOt.setId(com.bytedance.sdk.openadsdk.utils.sAl.cA);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, iMZ * 2);
        int iMZ4 = Cox.mZ(context, 6.0f);
        layoutParams5.leftMargin = iMZ4;
        layoutParams5.setMarginStart(iMZ4);
        layoutParams5.addRule(1, this.mZ.getId());
        layoutParams5.addRule(17, this.mZ.getId());
        this.uR.setLayoutParams(layoutParams5);
        mm.addView(this.uR);
        com.bytedance.sdk.openadsdk.core.TFq.FA faMZ = mZ(context);
        this.TFq = faMZ;
        faMZ.setId(com.bytedance.sdk.openadsdk.utils.sAl.bDW);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, Cox.mZ(context, 20.0f));
        layoutParams6.addRule(3, this.uR.getId());
        layoutParams6.addRule(8, this.mZ.getId());
        layoutParams6.addRule(17, this.mZ.getId());
        layoutParams6.addRule(1, this.mZ.getId());
        layoutParams6.leftMargin = iMZ4;
        layoutParams6.setMarginStart(iMZ4);
        this.TFq.setLayoutParams(layoutParams6);
        mm.addView(this.TFq);
        com.bytedance.sdk.openadsdk.core.TFq.FA faUR = uR(context);
        this.Ht = faUR;
        faUR.setId(com.bytedance.sdk.openadsdk.utils.sAl.jJC);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, Cox.mZ(context, 22.0f));
        layoutParams7.topMargin = iMZ2;
        this.Ht.setLayoutParams(layoutParams7);
        tFq2.addView(this.Ht);
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public com.bytedance.sdk.openadsdk.core.TFq.FA mZ(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA faMZ = super.mZ(context);
        faMZ.setTextColor(-1);
        return faMZ;
    }

    public NOt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NOt(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
