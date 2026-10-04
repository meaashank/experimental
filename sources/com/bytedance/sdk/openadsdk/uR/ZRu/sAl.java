package com.bytedance.sdk.openadsdk.uR.ZRu;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class sAl implements com.bytedance.sdk.openadsdk.edo.NOt {
    private final boolean NOt;
    private final com.bytedance.sdk.component.Ht.ZRu.Ht.uR ZRu;

    public sAl(boolean z10, com.bytedance.sdk.component.Ht.ZRu.Ht.uR uRVar) {
        this.ZRu = uRVar;
        this.NOt = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.edo.NOt
    @Nullable
    public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
        if (this.ZRu == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.NOt);
        jSONObject.put("url", this.ZRu.NOt());
        int iUR = this.ZRu.uR();
        if (iUR <= 0) {
            iUR = 0;
        }
        jSONObject.put("retry_times", iUR);
        jSONObject.put("ad_id", this.ZRu.Ht());
        jSONObject.put("track_type", this.ZRu.TFq());
        jSONObject.put("upload_scene", this.NOt ? this.ZRu.aT() ? 3 : this.ZRu.uR() <= 0 ? 1 : 2 : 4);
        String strMm = this.ZRu.Mm();
        if (!TextUtils.isEmpty(strMm)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strMm.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strVor = this.ZRu.Vor();
        if (!TextUtils.isEmpty(strVor)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strVor.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("track_link_result").NOt(jSONObject.toString());
    }
}
