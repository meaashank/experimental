package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class mZ extends com.bytedance.sdk.openadsdk.core.TFq.uR {
    public mZ(Context context) {
        super(context);
        ZRu();
    }

    private void ZRu() {
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.sAl.ACq);
    }

    public void ZRu(int i10, com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (qFVar.wcb() || (qFVar.KIc() && qFVar.FA())) {
            Cox.ZRu((View) this, 0);
            com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().ZRu((int) Cox.ZRu(getContext(), i10, true), this, qFVar);
        }
    }
}
