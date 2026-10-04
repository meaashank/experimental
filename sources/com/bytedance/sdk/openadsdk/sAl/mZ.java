package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends aT {
    public mZ(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public com.bytedance.sdk.openadsdk.core.TFq.FA NOt(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA faNOt = super.NOt(context);
        faNOt.setTextColor(-1);
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
        layoutParams.weight = 337.0f;
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
        layoutParams3.weight = 263.0f;
        tFq2.setLayoutParams(layoutParams3);
        tFq2.setOrientation(1);
        tFq2.setGravity(81);
        int iMZ2 = Cox.mZ(context, 16.0f);
        tFq2.setPadding(iMZ2, iMZ2, iMZ2, iMZ2);
        tFq.addView(tFq2);
        WMI wmiMm = Mm(context);
        this.mZ = wmiMm;
        wmiMm.setId(com.bytedance.sdk.openadsdk.utils.sAl.HZ);
        int iMZ3 = Cox.mZ(context, 45.0f);
        this.mZ.setLayoutParams(new LinearLayout.LayoutParams(iMZ3, iMZ3));
        tFq2.addView(this.mZ);
        com.bytedance.sdk.openadsdk.core.TFq.FA faNOt = NOt(context);
        this.uR = faNOt;
        faNOt.setId(com.bytedance.sdk.openadsdk.utils.sAl.cA);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = Cox.mZ(context, 4.0f);
        this.uR.setLayoutParams(layoutParams4);
        tFq2.addView(this.uR);
        com.bytedance.sdk.openadsdk.core.TFq.FA faMZ = mZ(context);
        this.TFq = faMZ;
        faMZ.setId(com.bytedance.sdk.openadsdk.utils.sAl.bDW);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = iMZ;
        layoutParams5.bottomMargin = Cox.mZ(context, 25.0f);
        this.TFq.setLayoutParams(layoutParams5);
        tFq2.addView(this.TFq);
        com.bytedance.sdk.openadsdk.core.TFq.FA faUR = uR(context);
        this.Ht = faUR;
        faUR.setId(com.bytedance.sdk.openadsdk.utils.sAl.jJC);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, Cox.mZ(context, 32.0f));
        layoutParams6.topMargin = iMZ2;
        this.Ht.setLayoutParams(layoutParams6);
        tFq2.addView(this.Ht);
    }

    public mZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mZ(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
