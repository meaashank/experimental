package com.bytedance.sdk.openadsdk.Zf.ZRu;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private final int NOt;
    private final int ZRu;
    private final float mZ;

    public ZRu(int i10, int i11, float f10) {
        this.ZRu = i10;
        this.NOt = i11;
        this.mZ = f10;
    }

    public static JSONObject ZRu(ZRu zRu) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNetworkValues.WIDTH, zRu.ZRu);
        jSONObject.put(InMobiNetworkValues.HEIGHT, zRu.NOt);
        jSONObject.put("alpha", zRu.mZ);
        return jSONObject;
    }
}
