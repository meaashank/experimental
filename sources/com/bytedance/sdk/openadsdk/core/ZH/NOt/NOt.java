package com.bytedance.sdk.openadsdk.core.ZH.NOt;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends com.bytedance.adsdk.ugeno.NOt.mZ<com.bytedance.sdk.openadsdk.core.widget.TFq> {
    protected ImageView.ScaleType NOt;
    protected String ZRu;

    public NOt(Context context) {
        super(context);
        this.NOt = ImageView.ScaleType.FIT_CENTER;
    }

    private ImageView.ScaleType Mm(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void mZ() {
        if (TextUtils.isEmpty(this.ZRu)) {
            return;
        }
        if (!this.ZRu.startsWith("local://")) {
            com.bytedance.adsdk.ugeno.uR.ZRu().NOt().ZRu(this.aT, this.ZRu, (ImageView) this.Ht);
        } else {
            ((com.bytedance.sdk.openadsdk.core.widget.TFq) this.Ht).ZRu(com.bytedance.adsdk.ugeno.Mm.uR.ZRu(this.mZ, this.ZRu.replace("local://", "")), false);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        mZ();
        ((com.bytedance.sdk.openadsdk.core.widget.TFq) this.Ht).setScaleType(this.NOt);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.core.widget.TFq uR() {
        com.bytedance.sdk.openadsdk.core.widget.TFq tFq = new com.bytedance.sdk.openadsdk.core.widget.TFq(this.mZ);
        this.Ht = tFq;
        return tFq;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        super.ZRu(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        if (str.equals("scaleType")) {
            this.NOt = Mm(str2);
        } else if (str.equals("src")) {
            this.ZRu = str2;
        }
    }
}
