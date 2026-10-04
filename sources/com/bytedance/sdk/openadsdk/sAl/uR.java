package com.bytedance.sdk.openadsdk.sAl;

import E3.a;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class uR extends aT {
    public uR(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public void ZRu(Context context) {
        int iMZ = Cox.mZ(context, 10.0f);
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        tFq.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        tFq.setOrientation(1);
        tFq.setPadding(iMZ, iMZ, iMZ, iMZ);
        addView(tFq);
        com.bytedance.sdk.openadsdk.core.TFq.mZ mZVar = new com.bytedance.sdk.openadsdk.core.TFq.mZ(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        mZVar.setLayoutParams(layoutParams2);
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
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = iMZ;
        layoutParams3.topMargin = iMZ;
        layoutParams3.bottomMargin = iMZ;
        pAGLogoViewFA.setLayoutParams(layoutParams3);
        mZVar.addView(pAGLogoViewFA);
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        mm.setLayoutParams(layoutParams4);
        tFq.addView(mm);
        WMI wmiMm = Mm(context);
        this.mZ = wmiMm;
        int i10 = com.bytedance.sdk.openadsdk.utils.sAl.HZ;
        wmiMm.setId(i10);
        int iMZ2 = Cox.mZ(context, 40.0f);
        this.mZ.setLayoutParams(a.a(iMZ2, iMZ2, 15));
        mm.addView(this.mZ);
        com.bytedance.sdk.openadsdk.core.TFq.FA faNOt = NOt(context);
        this.uR = faNOt;
        faNOt.setId(com.bytedance.sdk.openadsdk.utils.sAl.cA);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(15);
        layoutParams5.leftMargin = iMZ;
        layoutParams5.setMarginStart(iMZ);
        layoutParams5.addRule(1, i10);
        layoutParams5.addRule(17, i10);
        this.uR.setLayoutParams(layoutParams5);
        mm.addView(this.uR);
        com.bytedance.sdk.openadsdk.core.TFq.FA faUR = uR(context);
        this.Ht = faUR;
        faUR.setId(com.bytedance.sdk.openadsdk.utils.sAl.jJC);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(Cox.mZ(context, 100.0f), Cox.mZ(context, 32.0f));
        layoutParams6.addRule(11);
        layoutParams6.addRule(21);
        layoutParams6.addRule(15);
        this.Ht.setLayoutParams(layoutParams6);
        mm.addView(this.Ht);
    }

    public uR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public uR(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
