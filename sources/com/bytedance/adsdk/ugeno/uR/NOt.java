package com.bytedance.adsdk.ugeno.uR;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.N;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private List<ZRu> NOt;
    private ZRu ZRu;

    public static class ZRu {
        private String NOt;
        private String ZRu = "global";
        private Map<String, String> mZ;

        public String NOt() {
            return this.NOt;
        }

        public String ZRu() {
            return this.ZRu;
        }

        public Map<String, String> mZ() {
            return this.mZ;
        }

        public String toString() {
            return "Action{scheme='" + this.ZRu + "', name='" + this.NOt + "', params=" + this.mZ + '}';
        }

        public void NOt(String str) {
            this.NOt = str;
        }

        public void ZRu(String str) {
            this.ZRu = str;
        }

        public void ZRu(Map<String, String> map) {
            this.mZ = map;
        }
    }

    public List<ZRu> NOt() {
        return this.NOt;
    }

    public ZRu ZRu() {
        return this.ZRu;
    }

    public static NOt ZRu(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        NOt nOt = new NOt();
        String strOptString = jSONObject.optString(N.f218776d);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        nOt.ZRu = FA.ZRu(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            ZRu ZRu2 = FA.ZRu(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (ZRu2 != null) {
                arrayList.add(ZRu2);
            }
        }
        nOt.NOt = arrayList;
        return nOt;
    }
}
