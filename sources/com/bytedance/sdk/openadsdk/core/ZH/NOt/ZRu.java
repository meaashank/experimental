package com.bytedance.sdk.openadsdk.core.ZH.NOt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.om;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends com.bytedance.adsdk.ugeno.Vor.Ht.NOt {
    public ZRu(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.Vor.Ht.NOt
    public void Mm(String str) {
        super.Mm(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(om.ZRu(this.mZ, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.Vor.Ht.ZRu) this.Ht).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
