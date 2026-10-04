package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class Mm extends Ht {
    public Mm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.ZRu zRu = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.ZRu(context);
        this.oK = zRu;
        zRu.setTag(Integer.valueOf(getClickArea()));
        addView(this.oK, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yx
    public boolean Vor() {
        super.Vor();
        if (TextUtils.equals("download-progress-button", this.sAl.aT().NOt()) && TextUtils.isEmpty(this.lp.aT())) {
            this.oK.setVisibility(4);
            return true;
        }
        this.oK.setTextAlignment(this.lp.FA());
        ((TextView) this.oK).setText(this.lp.aT());
        ((TextView) this.oK).setTextColor(this.lp.Mm());
        ((TextView) this.oK).setTextSize(this.lp.TFq());
        ((TextView) this.oK).setGravity(17);
        ((TextView) this.oK).setIncludeFontPadding(false);
        if ("fillButton".equals(this.sAl.aT().NOt())) {
            this.oK.setPadding(0, 0, 0, 0);
        } else {
            this.oK.setPadding(this.lp.mZ(), this.lp.NOt(), this.lp.uR(), this.lp.ZRu());
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (!com.bytedance.sdk.component.adexpress.uR.NOt() || !"fillButton".equals(this.sAl.aT().NOt())) {
            return super.getWidgetLayoutParams();
        }
        ((TextView) this.oK).setEllipsize(TextUtils.TruncateAt.END);
        ((TextView) this.oK).setMaxLines(1);
        FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
        widgetLayoutParams.width -= this.lp.qF() * 2;
        widgetLayoutParams.height -= this.lp.qF() * 2;
        widgetLayoutParams.topMargin = this.lp.qF() + widgetLayoutParams.topMargin;
        int iQF = this.lp.qF() + widgetLayoutParams.leftMargin;
        widgetLayoutParams.leftMargin = iQF;
        widgetLayoutParams.setMarginStart(iQF);
        widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
        return widgetLayoutParams;
    }
}
