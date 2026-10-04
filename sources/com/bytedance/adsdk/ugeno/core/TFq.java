package com.bytedance.adsdk.ugeno.core;

import android.support.v4.media.e;
import android.text.TextUtils;
import com.prism.gaia.server.accounts.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    private JSONObject Ht;
    private boolean Mm;
    private JSONObject NOt;
    private String TFq;
    private JSONObject ZRu;
    private String mZ;
    private JSONObject uR;

    public static class ZRu {
        private String FA;
        private ZRu Ht;
        private String Mm;
        private String NOt;
        private List<ZRu> TFq;
        private String ZRu;
        private JSONObject mZ;
        private JSONObject uR;

        public JSONObject Ht() {
            return this.uR;
        }

        public List<ZRu> TFq() {
            return this.TFq;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UGNode{id='");
            sb2.append(this.ZRu);
            sb2.append("', name='");
            return e.a(sb2, this.NOt, "'}");
        }

        public String mZ() {
            return this.NOt;
        }

        public JSONObject uR() {
            return this.mZ;
        }

        public String NOt() {
            return this.Mm;
        }

        public String ZRu() {
            return this.ZRu;
        }

        public void ZRu(ZRu zRu) {
            if (this.TFq == null) {
                this.TFq = new ArrayList();
            }
            this.TFq.add(zRu);
        }
    }

    public TFq(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public String NOt() {
        return this.mZ;
    }

    public ZRu ZRu() {
        return ZRu(this.ZRu, (ZRu) null);
    }

    public List<ZRu> mZ() {
        if (this.NOt == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = this.NOt.keys();
        while (itKeys.hasNext()) {
            ZRu ZRu2 = ZRu(this.NOt.optJSONObject(itKeys.next()), (ZRu) null);
            if (ZRu2 != null) {
                arrayList.add(ZRu2);
            }
        }
        return arrayList;
    }

    public boolean uR() {
        return this.Mm;
    }

    public TFq(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.ZRu = jSONObject.optJSONObject("body");
            } else {
                this.ZRu = jSONObject.optJSONObject("main_template");
            }
            this.NOt = jSONObject.optJSONObject("sub_templates");
            JSONObject jSONObjectOptJSONObject = jSONObject.has(b.f166415I) ? jSONObject.optJSONObject(b.f166415I) : jSONObject.optJSONObject("template_info");
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.Mm = true;
                    String strOptString = jSONObjectOptJSONObject.optString("version");
                    this.mZ = strOptString;
                    if (TextUtils.isEmpty(strOptString)) {
                        this.mZ = "3.0";
                    }
                } else {
                    this.mZ = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.TFq = jSONObjectOptJSONObject.optString("adType");
                }
            } else if (jSONObject.has("body")) {
                this.mZ = "3.0";
                this.Mm = true;
            }
            this.uR = jSONObject2;
            this.Ht = jSONObject3;
        }
    }

    private ZRu ZRu(JSONObject jSONObject, ZRu zRu) {
        ZRu ZRu2;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        ZRu zRu2 = new ZRu();
        zRu2.ZRu = strOptString2;
        if (this.Mm && TextUtils.equals("Video", strOptString)) {
            zRu2.NOt = strOptString + "V3";
        } else {
            zRu2.NOt = strOptString;
        }
        zRu2.mZ = jSONObject2;
        zRu2.Ht = zRu;
        zRu2.Mm = this.mZ;
        zRu2.FA = this.TFq;
        if (jSONObject2.has("i18n")) {
            zRu2.uR = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(strOptString, "CustomComponent")) {
            ZRu(jSONObject, zRu2.mZ);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                String strOptString3 = jSONObject.has("type") ? jSONObject.optString("type") : jSONObject.optString("name");
                String strZRu = com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObjectOptJSONObject.optString("id"), this.uR);
                if (TextUtils.equals(strOptString3, "Template")) {
                    JSONObject jSONObject3 = this.NOt;
                    if (jSONObject3 != null) {
                        jSONObjectOptJSONObject = jSONObject3.optJSONObject(strZRu);
                        ZRu2 = ZRu(jSONObjectOptJSONObject, zRu2);
                    } else {
                        ZRu2 = null;
                    }
                } else {
                    ZRu2 = ZRu(jSONObjectOptJSONObject, zRu2);
                }
                if (ZRu2 != null) {
                    zRu2.ZRu(ZRu2);
                }
            }
        }
        return zRu2;
    }

    private void ZRu(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.Ht == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.Ht.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (objOpt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.Mm.NOt.ZRu(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                        }
                    } else {
                        jSONObject3.put(next, objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean ZRu(ZRu zRu) {
        return (zRu == null || zRu.mZ == null) ? false : true;
    }
}
