package com.bytedance.sdk.openadsdk.mZ;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class ZH extends View {
    private final int ZRu;

    public ZH(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(getMeasuredWidth(), this.ZRu);
    }

    public ZH(Context context, int i10) {
        super(context);
        setBackgroundColor(i10);
        this.ZRu = Cox.mZ(getContext(), 0.66f);
    }
}
