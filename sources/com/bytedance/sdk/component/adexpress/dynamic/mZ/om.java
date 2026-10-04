package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Ht.MR;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class om implements Mm<MR> {
    private com.bytedance.sdk.component.adexpress.dynamic.uR.aT Ht;
    private Context NOt;
    private String TFq;
    private MR ZRu;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq mZ;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.Mm uR;

    public om(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm, String str, com.bytedance.sdk.component.adexpress.dynamic.uR.aT aTVar) {
        this.NOt = context;
        this.mZ = tFq;
        this.uR = mm;
        this.TFq = str;
        this.Ht = aTVar;
        TFq();
    }

    private void TFq() {
        int iNBW = this.uR.NBW();
        final com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu dynamicClickListener = this.mZ.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 2);
        } catch (Throwable unused) {
        }
        if ("18".equals(this.TFq)) {
            Context context = this.NOt;
            MR mr = new MR(context, com.bytedance.sdk.component.adexpress.mZ.ZRu.Vor(context), this.Ht);
            this.ZRu = mr;
            if (mr.getWriggleLayout() != null) {
                this.ZRu.getWriggleLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
            if (this.ZRu.getTopTextView() != null) {
                if (TextUtils.isEmpty(this.uR.gaw())) {
                    this.ZRu.getTopTextView().setText(com.bytedance.sdk.component.utils.om.NOt(this.NOt, "tt_splash_wriggle_top_text_style_17"));
                } else {
                    this.ZRu.getTopTextView().setText(this.uR.gaw());
                }
            }
        } else {
            Context context2 = this.NOt;
            this.ZRu = new MR(context2, com.bytedance.sdk.component.adexpress.mZ.ZRu.Vor(context2), this.Ht);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        this.ZRu.setTranslationY(-((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, iNBW)));
        this.ZRu.setLayoutParams(layoutParams);
        this.ZRu.setShakeText(this.uR.Gis());
        this.ZRu.setClipChildren(false);
        final View wriggleProgressIv = this.ZRu.getWriggleProgressIv();
        this.ZRu.setOnShakeViewListener(new MR.ZRu() { // from class: com.bytedance.sdk.component.adexpress.dynamic.mZ.om.1
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void NOt() {
        this.ZRu.clearAnimation();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void ZRu() {
        this.ZRu.ZRu();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    /* JADX INFO: renamed from: uR, reason: merged with bridge method [inline-methods] */
    public MR mZ() {
        return this.ZRu;
    }
}
