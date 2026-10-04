package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class Mm extends com.bytedance.sdk.openadsdk.core.TFq.uR {
    private int NOt;
    private float ZRu;

    public Mm(Context context) {
        super(context);
        this.ZRu = 2.25f;
        this.NOt = 12;
        ZRu();
    }

    public static com.bytedance.sdk.openadsdk.core.TFq.uR NOt(Context context) {
        return new Mm(context, 28, 5.0f);
    }

    private void ZRu() {
        setBackground(uR.ZRu());
        setImageResource(com.bytedance.sdk.component.utils.om.uR(getContext(), "tt_close_btn"));
        int iMZ = Cox.mZ(getContext(), this.ZRu);
        setPadding(iMZ, iMZ, iMZ, iMZ);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.TFq.uR, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int iMZ = Cox.mZ(getContext(), this.NOt);
            layoutParams.width = iMZ;
            layoutParams.height = iMZ;
        }
        super.setLayoutParams(layoutParams);
    }

    public Mm(Context context, int i10, float f10) {
        super(context);
        this.ZRu = f10;
        this.NOt = i10;
        ZRu();
    }

    public static com.bytedance.sdk.openadsdk.core.TFq.uR ZRu(Context context) {
        return new Mm(context);
    }
}
