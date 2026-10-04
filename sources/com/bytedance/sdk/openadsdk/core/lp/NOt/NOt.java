package com.bytedance.sdk.openadsdk.core.lp.NOt;

import com.bytedance.sdk.openadsdk.core.lp.NOt.mZ;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt extends mZ implements Comparable<NOt> {
    private final float ZRu;

    public static class ZRu {
        private final float NOt;
        private final String ZRu;
        private mZ.EnumC0452mZ mZ = mZ.EnumC0452mZ.TRACKING_URL;
        private boolean uR = false;

        public ZRu(String str, float f10) {
            this.ZRu = str;
            this.NOt = f10;
        }

        public NOt ZRu() {
            return new NOt(this.NOt, this.ZRu, this.mZ, Boolean.valueOf(this.uR));
        }
    }

    public JSONObject NOt() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", mZ());
        jSONObject.put("trackingFraction", this.ZRu);
        return jSONObject;
    }

    public boolean ZRu(float f10) {
        return this.ZRu <= f10 && !TFq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.lp.NOt.mZ
    public void j_() {
        super.j_();
    }

    private NOt(float f10, String str, mZ.EnumC0452mZ enumC0452mZ, Boolean bool) {
        super(str, enumC0452mZ, bool);
        this.ZRu = f10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(NOt nOt) {
        if (nOt == null) {
            return 1;
        }
        float f10 = this.ZRu;
        float f11 = nOt.ZRu;
        if (f10 > f11) {
            return 1;
        }
        return f10 < f11 ? -1 : 0;
    }
}
