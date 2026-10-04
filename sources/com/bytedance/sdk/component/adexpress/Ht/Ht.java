package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends xY {
    private OCA ZRu;

    public Ht(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        ZRu(context, i10, i11, i12, jSONObject);
    }

    private void ZRu(Context context, int i10, int i11, int i12, JSONObject jSONObject) {
        OCA oca = new OCA(context, com.bytedance.sdk.component.adexpress.mZ.ZRu.mZ(context), i10, i11, i12, jSONObject);
        this.ZRu = oca;
        addView(oca);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.ZRu.setLayoutParams(layoutParams);
    }

    public OCA getShakeView() {
        return this.ZRu;
    }

    public void setShakeText(String str) {
        if (this.ZRu == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.ZRu.setShakeText("");
        } else {
            this.ZRu.setShakeText(str);
        }
    }
}
