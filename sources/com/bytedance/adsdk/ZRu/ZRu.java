package com.bytedance.adsdk.ZRu;

import com.bytedance.adsdk.ugeno.mZ.ZRu;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements com.bytedance.adsdk.ugeno.mZ.ZRu {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ZRu.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0383ZRu implements ZRu.InterfaceC0396ZRu {
        private String NOt;
        private com.bytedance.adsdk.ZRu.NOt.ZRu ZRu;

        private C0383ZRu(String str) {
            this.NOt = str;
            this.ZRu = com.bytedance.adsdk.ZRu.NOt.ZRu.ZRu(str);
        }

        public static C0383ZRu ZRu(String str) {
            return new C0383ZRu(str);
        }

        @Override // com.bytedance.adsdk.ugeno.mZ.ZRu.InterfaceC0396ZRu
        public Object ZRu(JSONObject jSONObject) {
            com.bytedance.adsdk.ZRu.NOt.ZRu zRu = this.ZRu;
            if (zRu == null) {
                return this.NOt;
            }
            Object objZRu = zRu.ZRu(jSONObject);
            return objZRu instanceof String ? objZRu : objZRu instanceof com.bytedance.adsdk.ZRu.NOt.ZRu.ZRu ? String.valueOf(Mm.ZRu((com.bytedance.adsdk.ZRu.NOt.ZRu.ZRu) objZRu)) : String.valueOf(objZRu);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mZ.ZRu
    public ZRu.InterfaceC0396ZRu ZRu(String str) {
        return C0383ZRu.ZRu(str);
    }
}
