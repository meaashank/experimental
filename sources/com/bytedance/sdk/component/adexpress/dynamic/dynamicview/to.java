package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class to extends Mm implements com.bytedance.sdk.component.adexpress.dynamic.mZ {
    private int NOt;
    private int OCA;
    private int[] ZRu;

    public to(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq
    public void Ht() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.Mm, this.FA);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Mm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yx
    public boolean Vor() {
        super.Vor();
        ((TextView) this.oK).setText("");
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ
    @SuppressLint({"SetTextI18n"})
    public void ZRu(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String strZRu = com.bytedance.sdk.component.utils.om.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.oK.setVisibility(0);
            ((TextView) this.oK).setText("| ".concat(String.valueOf(strZRu)));
            this.oK.measure(-2, -2);
            this.ZRu = new int[]{this.oK.getMeasuredWidth() + 1, this.oK.getMeasuredHeight()};
            View view = this.oK;
            int[] iArr = this.ZRu;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.oK).setGravity(17);
            ((TextView) this.oK).setIncludeFontPadding(false);
            ZRu();
            this.oK.setPadding(this.lp.mZ(), this.NOt, this.lp.uR(), this.OCA);
        }
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.oK).getText())) {
            setMeasuredDimension(0, this.FA);
        } else {
            setMeasuredDimension(this.Mm, this.FA);
        }
    }

    private void ZRu() {
        int iZRu = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.TFq());
        this.NOt = ((this.FA - iZRu) / 2) - this.lp.ZRu();
        this.OCA = 0;
    }
}
