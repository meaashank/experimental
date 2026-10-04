package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class Vor extends Ht {
    public Vor(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
            this.oK = new ImageView(context);
        } else {
            this.oK = new com.bytedance.sdk.component.adexpress.Ht.Vor(context);
        }
        this.oK.setTag(3);
        addView(this.oK, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.oK);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yx
    public boolean Vor() {
        super.Vor();
        if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
            Drawable drawableZRu = com.bytedance.sdk.component.adexpress.uR.mZ.ZRu(getContext(), this.lp);
            if (drawableZRu != null) {
                this.oK.setBackground(drawableZRu);
            }
            int iUR = com.bytedance.sdk.component.utils.om.uR(getContext(), "tt_close_btn");
            if (iUR > 0) {
                ((ImageView) this.oK).setImageResource(iUR);
            }
            ((ImageView) this.oK).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int iZRu = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.WMI());
        View view = this.oK;
        if (view instanceof com.bytedance.sdk.component.adexpress.Ht.Vor) {
            ((com.bytedance.sdk.component.adexpress.Ht.Vor) view).setRadius((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, this.lp.oK()));
            ((com.bytedance.sdk.component.adexpress.Ht.Vor) this.oK).setStrokeWidth(iZRu);
            ((com.bytedance.sdk.component.adexpress.Ht.Vor) this.oK).setStrokeColor(this.lp.yBV());
            ((com.bytedance.sdk.component.adexpress.Ht.Vor) this.oK).setBgColor(this.lp.Nb());
            ((com.bytedance.sdk.component.adexpress.Ht.Vor) this.oK).setDislikeColor(this.lp.Mm());
            ((com.bytedance.sdk.component.adexpress.Ht.Vor) this.oK).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.ZH, 1.0f));
        }
        return true;
    }
}
