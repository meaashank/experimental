package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OCA extends om {
    private TextView ZRu;

    public OCA(@NonNull Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context, view, i10, i11, i12, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.Ht.om
    public void ZRu(Context context, View view) {
        addView(view);
        this.ZRu = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.Ht.om
    public void setShakeText(String str) {
        if (this.ZRu == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.ZRu.setText(str);
            return;
        }
        try {
            this.ZRu.setText(com.bytedance.sdk.component.utils.om.NOt(this.ZRu.getContext(), "tt_splash_default_click_shake"));
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("shakeClickView", e10.getMessage());
        }
    }
}
