package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class edo extends com.bytedance.sdk.openadsdk.core.TFq.Mm {
    public edo(Context context) {
        this(context, null);
    }

    private void ZRu(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int iMZ = Cox.mZ(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.TFq.mZ mZVar = new com.bytedance.sdk.openadsdk.core.TFq.mZ(context);
        mZVar.setId(com.bytedance.sdk.openadsdk.utils.sAl.YuF);
        mZVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        mZVar.setBackgroundColor(0);
        addView(mZVar);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        uRVar.setId(com.bytedance.sdk.openadsdk.utils.sAl.kkl);
        uRVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        uRVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mZVar.addView(uRVar);
        com.bytedance.sdk.openadsdk.core.TFq.Ht ht = new com.bytedance.sdk.openadsdk.core.TFq.Ht(context);
        ht.setId(com.bytedance.sdk.openadsdk.utils.sAl.zr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMZ, iMZ);
        layoutParams.gravity = 17;
        ht.setLayoutParams(layoutParams);
        ht.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_video_loading_progress_bar"));
        mZVar.addView(ht);
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar2 = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        uRVar2.setId(com.bytedance.sdk.openadsdk.utils.sAl.eqw);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        uRVar2.setLayoutParams(layoutParams2);
        uRVar2.setScaleType(ImageView.ScaleType.CENTER);
        uRVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_play_movebar_textpage"));
        uRVar2.setVisibility(8);
        addView(uRVar2);
        View lpVar = new lp(context);
        lpVar.setId(com.bytedance.sdk.openadsdk.utils.sAl.Ds);
        lpVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(lpVar);
    }

    public edo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public edo(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ZRu(context);
    }
}
