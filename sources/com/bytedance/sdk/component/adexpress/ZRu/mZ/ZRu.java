package com.bytedance.sdk.component.adexpress.ZRu.mZ;

import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private Map<String, ZRu> Ht = new ConcurrentHashMap();
    private String NOt;
    private NOt TFq;
    private String ZRu;
    private String mZ;
    private List<C0421ZRu> uR;

    public static class NOt {
        private String NOt;
        private String ZRu;
        private List<Pair<String, String>> mZ;

        public void NOt(String str) {
            this.NOt = str;
        }

        public String ZRu() {
            return this.ZRu;
        }

        public List<Pair<String, String>> NOt() {
            return this.mZ;
        }

        public void ZRu(String str) {
            this.ZRu = str;
        }

        public void ZRu(List<Pair<String, String>> list) {
            this.mZ = list;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ZRu.mZ.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0421ZRu {
        private String NOt;
        private String ZRu;
        private int mZ;

        public String NOt() {
            return this.NOt;
        }

        public String ZRu() {
            return this.ZRu;
        }

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0421ZRu)) {
                return super.equals(obj);
            }
            String str2 = this.ZRu;
            if (str2 != null) {
                C0421ZRu c0421ZRu = (C0421ZRu) obj;
                if (str2.equals(c0421ZRu.ZRu()) && (str = this.NOt) != null && str.equals(c0421ZRu.NOt())) {
                    return true;
                }
            }
            return false;
        }

        public int mZ() {
            return this.mZ;
        }

        public void NOt(String str) {
            this.NOt = str;
        }

        public void ZRu(String str) {
            this.ZRu = str;
        }

        public void ZRu(int i10) {
            this.mZ = i10;
        }
    }

    public JSONObject FA() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", NOt());
            jSONObject.putOpt("version", mZ());
            jSONObject.putOpt("main", uR());
            JSONArray jSONArray = new JSONArray();
            if (Ht() != null) {
                for (C0421ZRu c0421ZRu : Ht()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0421ZRu.ZRu());
                    jSONObject2.putOpt(FileResponse.FIELD_MD5, c0421ZRu.NOt());
                    jSONObject2.putOpt(FirebaseAnalytics.Param.LEVEL, Integer.valueOf(c0421ZRu.mZ()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.Ht.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.Ht.keySet()) {
                    ZRu zRu = this.Ht.get(str);
                    if (zRu != null) {
                        jSONObject3.put(str, zRu.FA());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            NOt nOtTFq = TFq();
            if (nOtTFq != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", nOtTFq.ZRu);
                jSONObject4.put(FileResponse.FIELD_MD5, nOtTFq.NOt);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> listNOt = nOtTFq.NOt();
                if (listNOt != null) {
                    for (Pair<String, String> pair : listNOt) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public List<C0421ZRu> Ht() {
        if (this.uR == null) {
            this.uR = new ArrayList();
        }
        return this.uR;
    }

    public boolean Mm() {
        return (TextUtils.isEmpty(uR()) || TextUtils.isEmpty(mZ()) || TextUtils.isEmpty(NOt())) ? false : true;
    }

    public String NOt() {
        return this.ZRu;
    }

    public NOt TFq() {
        return this.TFq;
    }

    public String Vor() {
        JSONObject jSONObjectFA;
        if (!Mm() || (jSONObjectFA = FA()) == null) {
            return null;
        }
        return jSONObjectFA.toString();
    }

    public Map<String, ZRu> ZRu() {
        return this.Ht;
    }

    public String mZ() {
        return this.NOt;
    }

    public String uR() {
        return this.mZ;
    }

    public static ZRu uR(String str) {
        if (str == null) {
            return null;
        }
        try {
            return ZRu(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void NOt(String str) {
        this.NOt = str;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void mZ(String str) {
        this.mZ = str;
    }

    public void ZRu(NOt nOt) {
        this.TFq = nOt;
    }

    public void ZRu(List<C0421ZRu> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.uR = list;
    }

    public static ZRu ZRu(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return null;
        }
        ZRu zRu = new ZRu();
        zRu.ZRu(jSONObject.optString("name"));
        zRu.NOt(jSONObject.optString("version"));
        zRu.mZ(jSONObject.optString("main"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                C0421ZRu c0421ZRu = new C0421ZRu();
                c0421ZRu.ZRu(jSONObjectOptJSONObject2.optString("url"));
                c0421ZRu.NOt(jSONObjectOptJSONObject2.optString(FileResponse.FIELD_MD5));
                c0421ZRu.ZRu(jSONObjectOptJSONObject2.optInt(FirebaseAnalytics.Param.LEVEL));
                arrayList.add(c0421ZRu);
            }
        }
        zRu.ZRu(arrayList);
        try {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("engines");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ZRu ZRu = ZRu(jSONObjectOptJSONObject3.optJSONObject(next));
                    if (ZRu != null) {
                        zRu.ZRu().put(next, ZRu);
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        if (jSONObject.has("resources_archive") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            NOt nOt = new NOt();
            nOt.ZRu(jSONObjectOptJSONObject.optString("url"));
            nOt.NOt(jSONObjectOptJSONObject.optString(FileResponse.FIELD_MD5));
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("map");
            if (jSONObjectOptJSONObject4 != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    arrayList2.add(new Pair(next2, jSONObjectOptJSONObject4.optString(next2)));
                }
                nOt.ZRu(arrayList2);
            }
            zRu.ZRu(nOt);
        }
        if (zRu.Mm()) {
            return zRu;
        }
        return null;
    }
}
