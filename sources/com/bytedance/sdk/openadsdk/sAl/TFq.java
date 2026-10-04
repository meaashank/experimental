package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class TFq extends aT {
    private com.bytedance.sdk.openadsdk.core.TFq.FA FA;
    private com.bytedance.sdk.openadsdk.core.TFq.uR Mm;

    public TFq(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.sAl.aT
    public void ZRu(Context context) {
        int iMZ = Cox.mZ(context, 6.0f);
        setPadding(iMZ, iMZ, iMZ, iMZ);
        com.bytedance.sdk.openadsdk.core.TFq.mZ mZVarTFq = TFq(context);
        this.ZRu = mZVarTFq;
        mZVarTFq.setId(com.bytedance.sdk.openadsdk.utils.sAl.AOL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iMZ2 = Cox.mZ(context, 26.0f);
        layoutParams.topMargin = iMZ2;
        this.ZRu.setLayoutParams(layoutParams);
        addView(this.ZRu);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        this.Mm = uRVar;
        uRVar.setId(com.bytedance.sdk.openadsdk.utils.sAl.KIc);
        this.Mm.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iMZ2;
        this.Mm.setLayoutParams(layoutParams2);
        addView(this.Mm);
        PAGLogoView pAGLogoViewFA = FA(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iMZ3 = Cox.mZ(context, 10.0f);
        layoutParams3.leftMargin = iMZ3;
        layoutParams3.topMargin = iMZ3;
        layoutParams3.bottomMargin = iMZ3;
        pAGLogoViewFA.setLayoutParams(layoutParams3);
        addView(pAGLogoViewFA);
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        tFq.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        tFq.setOrientation(0);
        tFq.setGravity(17);
        addView(tFq);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        this.FA = fa2;
        fa2.setId(com.bytedance.sdk.openadsdk.utils.sAl.pU);
        this.FA.setEllipsize(TextUtils.TruncateAt.END);
        this.FA.setMaxLines(1);
        this.FA.setTextColor(-1);
        this.FA.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.FA.setLayoutParams(layoutParams4);
        tFq.addView(this.FA);
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA getTtBuDescTV() {
        return this.FA;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.uR getTtBuImg() {
        return this.Mm;
    }

    public TFq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TFq(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
