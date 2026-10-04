package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.utils.Cox;
import e.T;

/* JADX INFO: loaded from: classes3.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    private void initView(Context context) {
        Cox.mZ(context, 1.0f);
        int iMZ = Cox.mZ(context, 2.0f);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Cox.mZ(context, 14.0f), Cox.mZ(context, 6.0f));
        layoutParams.leftMargin = iMZ;
        uRVar.setLayoutParams(layoutParams);
        uRVar.setImageDrawable(com.bytedance.sdk.component.utils.om.mZ(context, "tt_ad_logo"));
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = iMZ;
        layoutParams2.rightMargin = iMZ;
        fa2.setLayoutParams(layoutParams2);
        fa2.setText(com.bytedance.sdk.component.utils.om.ZRu(context, "tt_logo_en"));
        fa2.setTextSize(1, 8.0f);
        fa2.setGravity(17);
        fa2.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(uRVar);
        addView(fa2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iMZ);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = Cox.mZ(getContext(), 12.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.TFq.Vor.ZRu(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    @T(api = 21)
    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
