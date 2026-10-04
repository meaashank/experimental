package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends Dialog {
    private final Context FA;
    private com.bytedance.sdk.openadsdk.core.TFq.ZRu Ht;
    private View Mm;
    private com.bytedance.sdk.openadsdk.core.TFq.uR NOt;
    private com.bytedance.sdk.openadsdk.core.TFq.ZRu TFq;
    private String Vor;
    private String ZH;
    public ZRu ZRu;
    private String aT;
    private boolean edo;
    private String lp;
    private com.bytedance.sdk.openadsdk.core.TFq.FA mZ;
    private int sAl;
    private com.bytedance.sdk.openadsdk.core.TFq.FA uR;

    public interface ZRu {
        void NOt();

        void ZRu();
    }

    public NOt(Context context) {
        super(context, com.bytedance.sdk.component.utils.om.Ht(context, "tt_custom_dialog"));
        this.sAl = -1;
        this.edo = false;
        this.FA = context;
    }

    private void NOt() {
        if (TextUtils.isEmpty(this.aT)) {
            this.mZ.setVisibility(8);
        } else {
            this.mZ.setText(this.aT);
            this.mZ.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.Vor)) {
            this.uR.setText(this.Vor);
        }
        if (TextUtils.isEmpty(this.ZH)) {
            this.Ht.setText(com.bytedance.sdk.component.utils.om.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), "tt_postive_txt"));
        } else {
            this.Ht.setText(this.ZH);
        }
        if (TextUtils.isEmpty(this.lp)) {
            this.TFq.setText(com.bytedance.sdk.component.utils.om.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu(), "tt_negtive_txt"));
        } else {
            this.TFq.setText(this.lp);
        }
        int i10 = this.sAl;
        if (i10 != -1) {
            this.NOt.setImageResource(i10);
            this.NOt.setVisibility(0);
        } else {
            this.NOt.setVisibility(8);
        }
        if (this.edo) {
            this.Mm.setVisibility(8);
            this.TFq.setVisibility(8);
        } else {
            this.TFq.setVisibility(0);
            this.Mm.setVisibility(0);
        }
    }

    private void ZRu() {
        this.Ht.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.NOt.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ZRu zRu = NOt.this.ZRu;
                if (zRu != null) {
                    zRu.ZRu();
                }
            }
        });
        this.TFq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.NOt.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ZRu zRu = NOt.this.ZRu;
                if (zRu != null) {
                    zRu.NOt();
                }
            }
        });
    }

    public NOt mZ(String str) {
        this.lp = str;
        return this;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ZRu(this.FA));
        setCanceledOnTouchOutside(false);
        NOt();
        ZRu();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        NOt();
    }

    private View ZRu(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.Mm mm = new com.bytedance.sdk.openadsdk.core.TFq.Mm(context);
        mm.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        RelativeLayout.LayoutParams layoutParamsA = E3.a.a(-1, -2, 13);
        tFq.setMinimumWidth(ZRu(260.0f));
        tFq.setPadding(0, ZRu(32.0f), 0, 0);
        tFq.setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_custom_dialog_bg"));
        tFq.setOrientation(1);
        tFq.setLayoutParams(layoutParamsA);
        this.mZ = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = ZRu(16.0f);
        layoutParams.rightMargin = ZRu(16.0f);
        layoutParams.bottomMargin = ZRu(16.0f);
        this.mZ.setGravity(17);
        this.mZ.setVisibility(0);
        this.mZ.setTextColor(Color.parseColor("#333333"));
        this.mZ.setTextSize(18.0f);
        this.mZ.setLayoutParams(layoutParams);
        this.NOt = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = ZRu(16.0f);
        layoutParams2.rightMargin = ZRu(16.0f);
        layoutParams2.bottomMargin = ZRu(10.0f);
        this.NOt.setMaxHeight(ZRu(150.0f));
        this.NOt.setMaxWidth(ZRu(150.0f));
        this.NOt.setVisibility(0);
        this.NOt.setLayoutParams(layoutParams2);
        this.uR = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = ZRu(20.0f);
        layoutParams3.rightMargin = ZRu(20.0f);
        this.uR.setGravity(17);
        this.uR.setLineSpacing(ZRu(3.0f), 1.2f);
        this.uR.setTextSize(18.0f);
        this.uR.setTextColor(Color.parseColor("#000000"));
        this.uR.setLayoutParams(layoutParams3);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams4.topMargin = ZRu(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.TFq.TFq tFq2 = new com.bytedance.sdk.openadsdk.core.TFq.TFq(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        tFq2.setOrientation(0);
        tFq2.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.TFq.ZRu zRu = new com.bytedance.sdk.openadsdk.core.TFq.ZRu(context);
        this.TFq = zRu;
        zRu.setId(520093718);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
        layoutParams6.leftMargin = ZRu(10.0f);
        layoutParams6.weight = 1.0f;
        this.TFq.setPadding(0, ZRu(16.0f), 0, ZRu(16.0f));
        this.TFq.setBackground(null);
        this.TFq.setGravity(17);
        this.TFq.setSingleLine(true);
        this.TFq.setTextColor(Color.parseColor("#999999"));
        this.TFq.setTextSize(16.0f);
        this.TFq.setLayoutParams(layoutParams6);
        this.Mm = new View(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(1, -1);
        this.Mm.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.Mm.setLayoutParams(layoutParams7);
        this.Ht = new com.bytedance.sdk.openadsdk.core.TFq.ZRu(context);
        this.TFq.setId(520093719);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -2);
        layoutParams8.rightMargin = ZRu(10.0f);
        layoutParams8.weight = 1.0f;
        this.Ht.setPadding(0, ZRu(16.0f), 0, ZRu(16.0f));
        this.Ht.setBackground(null);
        this.Ht.setGravity(17);
        this.Ht.setSingleLine(true);
        this.Ht.setTextColor(Color.parseColor("#38ADFF"));
        this.Ht.setTextSize(16.0f);
        this.Ht.setLayoutParams(layoutParams8);
        mm.addView(tFq);
        tFq.addView(this.mZ);
        tFq.addView(this.NOt);
        tFq.addView(this.uR);
        tFq.addView(view);
        tFq.addView(tFq2);
        tFq2.addView(this.TFq);
        tFq2.addView(this.Mm);
        tFq2.addView(this.Ht);
        return mm;
    }

    public NOt NOt(String str) {
        this.ZH = str;
        return this;
    }

    private int ZRu(float f10) {
        return Cox.mZ(getContext(), f10);
    }

    public NOt ZRu(ZRu zRu) {
        this.ZRu = zRu;
        return this;
    }

    public NOt ZRu(String str) {
        this.Vor = str;
        return this;
    }
}
