package com.bytedance.sdk.openadsdk.core.ZH.NOt;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: loaded from: classes3.dex */
public class uR extends com.bytedance.adsdk.ugeno.NOt.mZ<FrameLayout> {
    public uR(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public FrameLayout uR() {
        FrameLayout frameLayout = new FrameLayout(this.mZ);
        frameLayout.addView(new PAGLogoView(this.mZ));
        return frameLayout;
    }
}
