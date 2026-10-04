package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Ht.om;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class oK implements Mm<com.bytedance.sdk.component.adexpress.Ht.om> {
    private int FA;
    private int Ht;
    private int Mm;
    private Context NOt;
    private String TFq;
    private JSONObject Vor;
    private com.bytedance.sdk.component.adexpress.Ht.om ZRu;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq mZ;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.Mm uR;

    public oK(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm, String str, int i10, int i11, int i12, JSONObject jSONObject) {
        this.NOt = context;
        this.mZ = tFq;
        this.uR = mm;
        this.TFq = str;
        this.Ht = i10;
        this.Mm = i11;
        this.FA = i12;
        this.Vor = jSONObject;
        TFq();
    }

    private void TFq() {
        final com.bytedance.sdk.component.adexpress.dynamic.Ht.ZRu dynamicClickListener = this.mZ.getDynamicClickListener();
        try {
            new JSONObject().put("convertActionType", 1);
        } catch (Throwable unused) {
        }
        if ("16".equals(this.TFq)) {
            Context context = this.NOt;
            com.bytedance.sdk.component.adexpress.Ht.om omVar = new com.bytedance.sdk.component.adexpress.Ht.om(context, com.bytedance.sdk.component.adexpress.mZ.ZRu.FA(context), this.Ht, this.Mm, this.FA, this.Vor);
            this.ZRu = omVar;
            if (omVar.getShakeLayout() != null) {
                this.ZRu.getShakeLayout().setOnClickListener((View.OnClickListener) dynamicClickListener);
            }
        } else {
            Context context2 = this.NOt;
            this.ZRu = new com.bytedance.sdk.component.adexpress.Ht.om(context2, com.bytedance.sdk.component.adexpress.mZ.ZRu.Mm(context2), this.Ht, this.Mm, this.FA, this.Vor);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.ZRu.setGravity(17);
        layoutParams.gravity = 17;
        this.ZRu.setLayoutParams(layoutParams);
        this.ZRu.setTranslationY(com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, this.uR.Oc()));
        this.ZRu.setShakeText(this.uR.Gis());
        this.ZRu.setClipChildren(false);
        this.ZRu.setOnShakeViewListener(new om.ZRu() { // from class: com.bytedance.sdk.component.adexpress.dynamic.mZ.oK.1
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
    public com.bytedance.sdk.component.adexpress.Ht.om mZ() {
        return this.ZRu;
    }
}
