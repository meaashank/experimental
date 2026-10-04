package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes3.dex */
public class FA extends com.bytedance.sdk.openadsdk.core.TFq.Mm {
    private boolean Ht;
    private boolean Mm;
    private com.bytedance.sdk.openadsdk.core.TFq.FA NOt;
    private com.bytedance.sdk.openadsdk.core.TFq.uR TFq;
    private WMI ZRu;
    private Vor mZ;
    private com.bytedance.sdk.openadsdk.core.TFq.FA uR;

    public FA(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if (ZRu()) {
            NOt();
        }
    }

    public void NOt() {
        if (this.Ht) {
            return;
        }
        this.Ht = true;
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        WMI wmi = new WMI(context);
        this.ZRu = wmi;
        wmi.setId(520093745);
        int iMZ = Cox.mZ(context, 64.0f);
        this.ZRu.setLayoutParams(new RelativeLayout.LayoutParams(iMZ, iMZ));
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        this.NOt = fa2;
        fa2.setId(520093746);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Cox.mZ(context, 219.0f), -2);
        layoutParams2.topMargin = Cox.mZ(context, 16.0f);
        this.NOt.setLayoutParams(layoutParams2);
        this.NOt.setEllipsize(TextUtils.TruncateAt.END);
        this.NOt.setGravity(17);
        this.NOt.setMaxWidth(Cox.mZ(context, 150.0f));
        this.NOt.setMaxLines(2);
        this.NOt.setTextColor(-1);
        this.NOt.setTextSize(1, 16.0f);
        Vor vor = new Vor(context);
        this.mZ = vor;
        vor.setId(520093748);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(Cox.mZ(context, 219.0f), Cox.mZ(context, 6.0f));
        layoutParams3.topMargin = Cox.mZ(context, 24.0f);
        this.mZ.setLayoutParams(layoutParams3);
        this.uR = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(Cox.mZ(context, 138.0f), Cox.mZ(context, 42.0f));
        layoutParams4.topMargin = Cox.mZ(context, 48.0f);
        this.uR.setLayoutParams(layoutParams4);
        this.uR.setTextColor(-1);
        this.uR.setTextSize(16.0f);
        this.uR.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(2, -1);
        gradientDrawable.setCornerRadius(layoutParams4.height / 2);
        this.uR.setBackground(gradientDrawable);
        linearLayout.addView(this.ZRu);
        linearLayout.addView(this.NOt);
        linearLayout.addView(this.mZ);
        linearLayout.addView(this.uR);
        ZRu(context);
        addView(linearLayout);
        addView(this.TFq);
    }

    public boolean ZRu() {
        return true;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.TFq.FA getDownloadButton() {
        return this.uR;
    }

    @Nullable
    public Vor getLoadingProgressBar() {
        return this.mZ;
    }

    public void setProgress(int i10) {
        Vor vor = this.mZ;
        if (vor != null) {
            vor.setProgress(i10);
        }
    }

    public void ZRu(final com.bytedance.sdk.openadsdk.core.model.qF qFVar, int i10) {
        if (!this.Ht || qFVar == null || this.Mm) {
            return;
        }
        this.Mm = true;
        boolean zNBW = qFVar.NBW();
        if (zNBW || qFVar.yz() == null || TextUtils.isEmpty(qFVar.yz().ZRu())) {
            this.ZRu.setVisibility(8);
        } else {
            try {
                com.bytedance.sdk.openadsdk.Vor.uR.ZRu(qFVar.yz()).ZRu(new com.bytedance.sdk.openadsdk.Vor.NOt(qFVar, qFVar.yz().ZRu(), new le(this.ZRu)));
            } catch (Throwable unused) {
                this.ZRu.setVisibility(8);
            }
        }
        if (zNBW) {
            this.NOt.setText("Loading");
        } else if (TextUtils.isEmpty(qFVar.yM())) {
            this.NOt.setVisibility(8);
        } else {
            this.NOt.setText(qFVar.yM());
        }
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = this.uR;
        if (fa2 != null) {
            fa2.setText(qFVar.GC());
        }
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = this.TFq;
        if (uRVar != null) {
            uRVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.FA.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Context context = FA.this.getContext();
                    com.bytedance.sdk.openadsdk.core.model.qF qFVar2 = qFVar;
                    TTWebsiteActivity.ZRu(context, qFVar2, Yx.ZRu(qFVar2));
                }
            });
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.TFq.getLayoutParams();
            if (i10 == 1) {
                marginLayoutParams.width = Cox.mZ(getContext(), 64.0f);
                marginLayoutParams.height = Cox.mZ(getContext(), 24.0f);
                marginLayoutParams.bottomMargin = Cox.mZ(getContext(), 60.0f);
            } else {
                marginLayoutParams.width = Cox.mZ(getContext(), 41.0f);
                marginLayoutParams.height = Cox.mZ(getContext(), 15.0f);
                marginLayoutParams.bottomMargin = Cox.mZ(getContext(), 24.0f);
            }
            this.TFq.setLayoutParams(marginLayoutParams);
        }
    }

    public void ZRu(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        this.TFq = uRVar;
        uRVar.setImageDrawable(com.bytedance.sdk.component.utils.om.mZ(context, "tt_ad_logo_big"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Cox.mZ(context, 64.0f), Cox.mZ(context, 24.0f));
        layoutParams.bottomMargin = Cox.mZ(context, 60.0f);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.TFq.setLayoutParams(layoutParams);
    }
}
