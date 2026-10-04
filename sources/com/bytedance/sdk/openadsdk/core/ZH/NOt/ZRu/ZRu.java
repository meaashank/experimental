package com.bytedance.sdk.openadsdk.core.ZH.NOt.ZRu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends com.bytedance.adsdk.ugeno.Vor.NOt.ZRu {
    private final com.bytedance.adsdk.ugeno.Vor.NOt.ZRu NOt;
    private final com.bytedance.adsdk.ugeno.Vor.NOt.ZRu ZRu;

    public ZRu(Context context) {
        super(context);
        com.bytedance.adsdk.ugeno.Vor.NOt.ZRu zRu = new com.bytedance.adsdk.ugeno.Vor.NOt.ZRu(context);
        this.ZRu = zRu;
        addView(zRu, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.Vor.NOt.ZRu zRu2 = new com.bytedance.adsdk.ugeno.Vor.NOt.ZRu(context);
        this.NOt = zRu2;
        zRu2.setBackgroundColor(0);
        addView(zRu2, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.Vor.NOt.ZRu getVideoView() {
        return this.ZRu;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.NOt.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.NOt.setOnTouchListener(onTouchListener);
    }
}
