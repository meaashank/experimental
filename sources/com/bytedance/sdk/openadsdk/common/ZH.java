package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class ZH {
    protected Context NOt;
    private com.bytedance.sdk.openadsdk.core.TFq.FA TFq;
    protected View ZRu = TFq();
    private com.bytedance.sdk.openadsdk.core.widget.Vor mZ;
    private com.bytedance.sdk.openadsdk.core.widget.WMI uR;

    public ZH(Context context) {
        this.NOt = context;
    }

    private View TFq() {
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(this.NOt);
        tFq.setGravity(1);
        tFq.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.WMI wmi = new com.bytedance.sdk.openadsdk.core.widget.WMI(this.NOt);
        this.uR = wmi;
        wmi.setId(520093745);
        int iMZ = Cox.mZ(this.NOt, 64.0f);
        tFq.addView(this.uR, new LinearLayout.LayoutParams(iMZ, iMZ));
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(this.NOt);
        this.TFq = fa2;
        fa2.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Cox.mZ(this.NOt, 219.0f), -2);
        layoutParams.topMargin = Cox.mZ(this.NOt, 16.0f);
        this.TFq.setLayoutParams(layoutParams);
        this.TFq.setEllipsize(TextUtils.TruncateAt.END);
        this.TFq.setGravity(17);
        this.TFq.setMaxWidth(Cox.mZ(this.NOt, 150.0f));
        this.TFq.setMaxLines(2);
        this.TFq.setTextColor(-1);
        this.TFq.setTextSize(1, 16.0f);
        tFq.addView(this.TFq);
        this.mZ = new com.bytedance.sdk.openadsdk.core.widget.Vor(this.NOt);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(Cox.mZ(this.NOt, 219.0f), Cox.mZ(this.NOt, 6.0f));
        layoutParams2.topMargin = Cox.mZ(this.NOt, 32.0f);
        tFq.addView(this.mZ, layoutParams2);
        return tFq;
    }

    public com.bytedance.sdk.openadsdk.core.widget.WMI NOt() {
        return this.uR;
    }

    public View ZRu() {
        return this.ZRu;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA mZ() {
        return this.TFq;
    }

    public void uR() {
        this.ZRu = null;
        this.NOt = null;
    }

    public void ZRu(int i10) {
        this.mZ.setProgress(i10);
    }
}
