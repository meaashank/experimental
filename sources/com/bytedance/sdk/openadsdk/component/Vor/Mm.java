package com.bytedance.sdk.openadsdk.component.Vor;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class Mm extends com.bytedance.sdk.openadsdk.core.TFq.Mm {
    private final com.bytedance.sdk.openadsdk.core.TFq.uR NOt;
    private final com.bytedance.sdk.openadsdk.core.TFq.uR ZRu;

    public Mm(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        Cox.mZ(context, 12.0f);
        int iMZ = Cox.mZ(context, 16.0f);
        int iMZ2 = Cox.mZ(context, 20.0f);
        Cox.mZ(context, 24.0f);
        int iMZ3 = Cox.mZ(context, 28.0f);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        this.ZRu = uRVar;
        uRVar.setId(520093713);
        int iMZ4 = Cox.mZ(getContext(), 5.0f);
        uRVar.setPadding(iMZ4, iMZ4, iMZ4, iMZ4);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        uRVar.setScaleType(scaleType);
        uRVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.uR.ZRu());
        uRVar.setImageResource(om.uR(WMI.ZRu(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iMZ3, iMZ3);
        layoutParams.topMargin = iMZ2;
        layoutParams.leftMargin = iMZ;
        layoutParams.setMarginStart(iMZ);
        uRVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar2 = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        this.NOt = uRVar2;
        uRVar2.setId(520093714);
        uRVar2.setPadding(iMZ4, iMZ4, iMZ4, iMZ4);
        uRVar2.setScaleType(scaleType);
        uRVar2.setBackground(com.bytedance.sdk.openadsdk.core.widget.uR.ZRu());
        uRVar2.setImageResource(om.uR(WMI.ZRu(), "tt_close_btn"));
        if (uRVar2.getDrawable() != null) {
            uRVar2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iMZ3, iMZ3);
        layoutParams2.topMargin = iMZ2;
        layoutParams2.rightMargin = iMZ;
        layoutParams2.setMarginEnd(iMZ);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        uRVar2.setLayoutParams(layoutParams2);
        addView(uRVar);
        addView(uRVar2);
    }

    public View getTopDislike() {
        return this.ZRu;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.uR getTopSkip() {
        return this.NOt;
    }
}
