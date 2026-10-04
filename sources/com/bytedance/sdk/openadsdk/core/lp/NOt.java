package com.bytedance.sdk.openadsdk.core.lp;

import com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends mZ {
    private long ZH;
    private long aT;

    public NOt(int i10, int i11, long j10, long j11, ZRu.EnumC0453ZRu enumC0453ZRu, ZRu.NOt nOt, String str, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list2, String str2) {
        super(i10, i11, enumC0453ZRu, nOt, str, list, list2, str2);
        this.aT = j10;
        this.ZH = j11;
        this.Vor = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.lp.mZ
    public JSONObject ZRu() throws JSONException {
        JSONObject jSONObjectZRu = super.ZRu();
        if (jSONObjectZRu != null) {
            jSONObjectZRu.put(x.c.f238293R, this.aT);
            jSONObjectZRu.put(x.h.f238399b, this.ZH);
        }
        return jSONObjectZRu;
    }

    public static NOt ZRu(JSONObject jSONObject) {
        mZ mZVarNOt = mZ.NOt(jSONObject);
        if (mZVarNOt == null) {
            return null;
        }
        return new NOt(mZVarNOt.ZRu, mZVarNOt.NOt, jSONObject.optLong(x.c.f238293R, -1L), jSONObject.optLong(x.h.f238399b, -1L), mZVarNOt.mZ, mZVarNOt.uR, mZVarNOt.TFq, mZVarNOt.Ht, mZVarNOt.Mm, mZVarNOt.FA);
    }
}
