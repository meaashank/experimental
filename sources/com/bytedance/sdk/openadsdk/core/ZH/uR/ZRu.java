package com.bytedance.sdk.openadsdk.core.ZH.uR;

import com.bytedance.adsdk.ugeno.core.oK;
import com.bytedance.sdk.component.adexpress.NOt.sAl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends sAl {
    private oK NOt;
    private JSONObject ZRu;
    private float mZ;
    private float uR;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ZH.uR.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0447ZRu extends sAl.ZRu {
        private oK NOt;
        private JSONObject ZRu;
        private float mZ;
        private float uR;

        public C0447ZRu NOt(float f10) {
            this.uR = f10;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.NOt.sAl.ZRu
        /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
        public ZRu ZRu() {
            return new ZRu(this);
        }

        public C0447ZRu ZRu(JSONObject jSONObject) {
            this.ZRu = jSONObject;
            return this;
        }

        public C0447ZRu ZRu(oK oKVar) {
            this.NOt = oKVar;
            return this;
        }

        public C0447ZRu ZRu(float f10) {
            this.mZ = f10;
            return this;
        }
    }

    public ZRu(C0447ZRu c0447ZRu) {
        super(c0447ZRu);
        this.ZRu = c0447ZRu.ZRu;
        this.NOt = c0447ZRu.NOt;
        this.mZ = c0447ZRu.mZ;
        this.uR = c0447ZRu.uR;
    }

    public float MR() {
        return this.mZ;
    }

    public JSONObject Nb() {
        return this.ZRu;
    }

    public oK VdW() {
        return this.NOt;
    }

    public float fcs() {
        return this.uR;
    }
}
