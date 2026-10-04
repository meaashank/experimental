package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class Vor extends RelativeLayout {
    public Vor(Context context) {
        super(context);
        ZRu();
    }

    private void ZRu() {
        setId(com.bytedance.sdk.openadsdk.utils.sAl.vE);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, Cox.mZ(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.sAl.f140685Oc;
        uRVar.setId(i10);
        uRVar.setClickable(true);
        uRVar.setFocusable(true);
        uRVar.setPadding(Cox.mZ(context, 12.0f), Cox.mZ(context, 14.0f), Cox.mZ(context, 12.0f), Cox.mZ(context, 14.0f));
        uRVar.setImageResource(om.uR(context, "tt_ad_xmark"));
        addView(uRVar, new RelativeLayout.LayoutParams(Cox.mZ(context, 40.0f), Cox.mZ(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar2 = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        int i11 = com.bytedance.sdk.openadsdk.utils.sAl.IOC;
        uRVar2.setId(i11);
        uRVar2.setPadding(Cox.mZ(context, 8.0f), Cox.mZ(context, 10.0f), Cox.mZ(context, 8.0f), Cox.mZ(context, 10.0f));
        uRVar2.setImageResource(om.uR(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Cox.mZ(context, 40.0f), Cox.mZ(context, 44.0f));
        layoutParams.addRule(11);
        addView(uRVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        fa2.setId(com.bytedance.sdk.openadsdk.utils.sAl.gaw);
        fa2.setSingleLine(true);
        fa2.setEllipsize(TextUtils.TruncateAt.END);
        fa2.setGravity(17);
        fa2.setTextColor(Color.parseColor("#222222"));
        fa2.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Cox.mZ(context, 191.0f), Cox.mZ(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i11);
        layoutParams2.addRule(1, i10);
        int iMZ = Cox.mZ(context, 10.0f);
        layoutParams2.leftMargin = iMZ;
        layoutParams2.rightMargin = iMZ;
        addView(fa2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.TFq.Ht ht = new com.bytedance.sdk.openadsdk.core.TFq.Ht(context, null, R.style.Widget.ProgressBar.Horizontal);
        ht.setId(com.bytedance.sdk.openadsdk.utils.sAl.Wo);
        ht.setProgress(1);
        ht.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, Cox.mZ(context, 2.0f));
        layoutParams3.addRule(12);
        addView(ht, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, Cox.mZ(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
