package com.bytedance.sdk.openadsdk.uR;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Ht extends ZRu {
    public static final SimpleDateFormat mZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    public Ht(String str, JSONObject jSONObject) {
        super(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.uR.ZRu
    public JSONObject mZ() {
        return this.NOt;
    }
}
