package com.bytedance.sdk.openadsdk.component.Vor;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.WMI;
import com.bytedance.sdk.openadsdk.core.widget.yBV;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mZ extends com.bytedance.sdk.openadsdk.core.TFq.Mm {
    final Mm FA;
    WMI Ht;
    com.bytedance.sdk.openadsdk.core.TFq.FA Mm;
    com.bytedance.sdk.openadsdk.core.TFq.mZ NOt;
    com.bytedance.sdk.openadsdk.core.TFq.FA TFq;
    WMI Vor;
    com.bytedance.sdk.openadsdk.core.TFq.FA ZH;
    com.bytedance.sdk.openadsdk.core.TFq.uR ZRu;
    com.bytedance.sdk.openadsdk.core.TFq.FA aT;
    com.bytedance.sdk.openadsdk.core.widget.mZ lp;
    com.bytedance.sdk.openadsdk.core.TFq.uR mZ;
    PAGLogoView uR;

    public mZ(Context context) {
        super(context);
        this.FA = new Mm(context);
    }

    public abstract com.bytedance.sdk.openadsdk.core.TFq.uR getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.uR;
    }

    public abstract com.bytedance.sdk.openadsdk.core.TFq.FA getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.TFq.uR getBackImage() {
        return this.ZRu;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA getClickButton() {
        return this.TFq;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA getContent() {
        return this.ZH;
    }

    public com.bytedance.sdk.openadsdk.core.widget.mZ getDspAdChoice() {
        return this.lp;
    }

    public WMI getHostAppIcon() {
        return this.Ht;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.FA getHostAppName() {
        return this.Mm;
    }

    public WMI getIconOnlyView() {
        return this.Vor;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.uR getImageView() {
        return this.mZ;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.TFq getOverlayLayout() {
        return null;
    }

    public abstract yBV getScoreBar();

    public com.bytedance.sdk.openadsdk.core.TFq.FA getTitle() {
        return this.aT;
    }

    public View getTopDisLike() {
        Mm mm = this.FA;
        if (mm != null) {
            return mm.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.TFq.uR getTopSkip() {
        Mm mm = this.FA;
        if (mm != null) {
            return mm.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public com.bytedance.sdk.openadsdk.core.TFq.mZ getVideoContainer() {
        return this.NOt;
    }
}
