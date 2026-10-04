package com.bytedance.sdk.openadsdk.sAl;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.om;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.WMI;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aT extends com.bytedance.sdk.openadsdk.core.TFq.mZ {
    protected com.bytedance.sdk.openadsdk.core.TFq.FA Ht;
    protected com.bytedance.sdk.openadsdk.core.TFq.uR NOt;
    protected com.bytedance.sdk.openadsdk.core.TFq.FA TFq;
    protected com.bytedance.sdk.openadsdk.core.TFq.mZ ZRu;
    protected WMI mZ;
    protected com.bytedance.sdk.openadsdk.core.TFq.FA uR;

    public aT(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ZRu(context);
    }

    public PAGLogoView FA(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.uR Ht(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.uR uRVar = new com.bytedance.sdk.openadsdk.core.TFq.uR(context);
        uRVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return uRVar;
    }

    public WMI Mm(Context context) {
        WMI wmi = new WMI(context);
        wmi.setScaleType(ImageView.ScaleType.FIT_XY);
        wmi.setBackgroundColor(0);
        return wmi;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA NOt(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        fa2.setEllipsize(TextUtils.TruncateAt.END);
        fa2.setMaxLines(1);
        fa2.setTextColor(Color.parseColor("#FF999999"));
        fa2.setTextSize(2, 16.0f);
        return fa2;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.mZ TFq(Context context) {
        return new com.bytedance.sdk.openadsdk.core.TFq.mZ(context);
    }

    public abstract void ZRu(Context context);

    public FrameLayout getTtAdContainer() {
        return this.ZRu;
    }

    public TextView getTtFullAdAppName() {
        return this.uR;
    }

    public TextView getTtFullAdDesc() {
        return this.TFq;
    }

    public TextView getTtFullAdDownload() {
        return this.Ht;
    }

    public WMI getTtFullAdIcon() {
        return this.mZ;
    }

    public ImageView getTtFullImg() {
        return this.NOt;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA mZ(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        fa2.setEllipsize(TextUtils.TruncateAt.END);
        fa2.setMaxLines(1);
        fa2.setSingleLine();
        fa2.setTextColor(Color.parseColor("#FF999999"));
        fa2.setTextSize(2, 12.0f);
        return fa2;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA uR(Context context) {
        com.bytedance.sdk.openadsdk.core.TFq.FA fa2 = new com.bytedance.sdk.openadsdk.core.TFq.FA(context);
        fa2.setBackground(com.bytedance.sdk.openadsdk.utils.FA.ZRu(context, "tt_backup_btn_1"));
        fa2.setGravity(17);
        fa2.setText(om.ZRu(context, "tt_video_download_apk"));
        fa2.setTextColor(-1);
        fa2.setTextSize(2, 14.0f);
        return fa2;
    }
}
