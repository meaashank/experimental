package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class OCA extends Mm implements com.bytedance.sdk.component.adexpress.dynamic.mZ {
    public OCA(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq
    public void Ht() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.Mm, this.FA);
        int i10 = this.Vor;
        layoutParams.leftMargin = i10;
        layoutParams.gravity = 16;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ
    public void ZRu(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        if (i10 != 0) {
            ((TextView) this.oK).setText(" | ".concat(String.format(com.bytedance.sdk.component.utils.om.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu(), "tt_reward_full_skip_count_down"), Integer.valueOf(i10))));
        } else if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Mm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.oK).getText())) {
            setMeasuredDimension(0, this.FA);
        }
    }
}
