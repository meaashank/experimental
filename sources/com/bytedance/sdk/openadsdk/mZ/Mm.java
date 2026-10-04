package com.bytedance.sdk.openadsdk.mZ;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class Mm extends LinearLayout {
    private FA NOt;
    private final FilterWord ZRu;
    private final aT mZ;

    public Mm(Context context, FilterWord filterWord, aT aTVar) {
        super(context);
        setOrientation(1);
        this.ZRu = filterWord;
        this.mZ = aTVar;
        ZRu();
    }

    private void NOt() {
        this.NOt = new FA(getContext(), this.mZ);
        new LinearLayout.LayoutParams(-1, -2);
        this.NOt.ZRu(this.ZRu.getOptions());
        addView(this.NOt);
    }

    private void ZRu() {
        mZ();
        NOt();
    }

    private void mZ() {
        String name = this.ZRu.getName();
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = Cox.mZ(getContext(), 12.0f);
        layoutParams.gravity = 17;
        fa2.setGravity(17);
        fa2.setText(name);
        fa2.setTextColor(Color.argb(85, 22, 24, 35));
        fa2.setTextSize(this.mZ.Vor() ? 14 : 10);
        addView(fa2, layoutParams);
    }
}
