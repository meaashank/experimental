package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private String FA;
    private int NOt;
    private boolean TFq;
    private long Vor;
    private String ZRu;
    private boolean aT;
    private int lp;
    private String mZ;
    private String sAl;
    private C0455ZRu uR;
    private List<qF> Ht = new ArrayList();
    private List<FA> Mm = new ArrayList();
    private volatile boolean ZH = false;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0455ZRu extends qF.ZRu {
        private int ZRu;

        public JSONObject NOt() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", Ht());
                jSONObject.put(FileResponse.FIELD_MD5, Mm());
                jSONObject.put("url", FA());
                jSONObject.put("data", Vor());
                jSONObject.put("diff_data", aT());
                jSONObject.put("version", TFq());
                jSONObject.put("dynamic_creative", ZH());
                jSONObject.put("count_down_time", ZRu());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        public void ZRu(int i10) {
            this.ZRu = i10;
        }

        public int ZRu() {
            return this.ZRu;
        }

        public static C0455ZRu ZRu(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0455ZRu c0455ZRu = new C0455ZRu();
            c0455ZRu.mZ(jSONObject.optString("id"));
            c0455ZRu.uR(jSONObject.optString(FileResponse.FIELD_MD5));
            c0455ZRu.TFq(jSONObject.optString("url"));
            c0455ZRu.Ht(jSONObject.optString("data"));
            c0455ZRu.Mm(jSONObject.optString("diff_data"));
            c0455ZRu.NOt(jSONObject.optString("version"));
            c0455ZRu.FA(jSONObject.optString("dynamic_creative"));
            c0455ZRu.ZRu(jSONObject.optInt("count_down_time"));
            if (ZRu(c0455ZRu)) {
                return c0455ZRu;
            }
            return null;
        }

        private static boolean ZRu(C0455ZRu c0455ZRu) {
            return (c0455ZRu == null || TextUtils.isEmpty(c0455ZRu.Ht()) || TextUtils.isEmpty(c0455ZRu.FA())) ? false : true;
        }
    }

    public C0455ZRu FA() {
        return this.uR;
    }

    public boolean Ht() {
        if (FA() == null || mZ() == null || mZ().size() <= 1) {
            this.TFq = false;
            ZRu((C0455ZRu) null);
        } else {
            this.TFq = true;
        }
        return this.TFq;
    }

    public boolean Mm() {
        return this.aT;
    }

    public int NOt() {
        return this.NOt;
    }

    public qF TFq() {
        if (this.Ht.size() > 0) {
            return this.Ht.get(0);
        }
        return null;
    }

    public boolean Vor() {
        return this.ZH;
    }

    public boolean ZH() {
        return this.lp == 1;
    }

    public String ZRu() {
        qF qFVarTFq = TFq();
        return qFVarTFq != null ? qFVarTFq.jYr() : "";
    }

    public void aT() {
        this.ZH = false;
    }

    @Nullable
    public JSONObject lp() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0455ZRu c0455ZRuFA = FA();
            if (c0455ZRuFA != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObjectNOt = c0455ZRuFA.NOt();
                if (jSONObjectNOt != null) {
                    jSONObject2.put("tpl_info", jSONObjectNOt);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<qF> list = this.Ht;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.Ht.size(); i10++) {
                    jSONArray.put(this.Ht.get(i10).HZ());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.aT);
            jSONObject.put("multi_ad_style", this.lp);
            jSONObject.put("request_id", this.ZRu);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("AdInfo", "toJsonObj: ", th);
            return null;
        }
    }

    public List<qF> mZ() {
        return this.Ht;
    }

    public String sAl() {
        return this.sAl;
    }

    public boolean uR() {
        List<qF> list = this.Ht;
        return list != null && list.size() > 0;
    }

    public void NOt(String str) {
        this.mZ = str;
    }

    public void mZ(String str) {
        this.FA = str;
    }

    public void uR(String str) {
        this.sAl = str;
    }

    public void NOt(int i10) {
        this.lp = i10;
    }

    public static ZRu NOt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            ZRu zRu = new ZRu();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (jSONObjectOptJSONObject != null) {
                zRu.ZRu(jSONObjectOptJSONObject);
            }
            zRu.NOt(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    qF qFVarZRu = com.bytedance.sdk.openadsdk.core.NOt.ZRu(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (qFVarZRu != null) {
                        qFVarZRu.Vor(zRu.ZH());
                        arrayList.add(qFVarZRu);
                    }
                }
                zRu.ZRu(arrayList);
            }
            zRu.ZRu(jSONObject.optBoolean("is_choose_ad_original", false));
            zRu.ZRu(jSONObject.optString("request_id", ""));
            return zRu;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void ZRu(int i10) {
        this.NOt = i10;
    }

    public void ZRu(qF qFVar) {
        this.Ht.add(qFVar);
    }

    public void ZRu(List<qF> list) {
        this.Ht = list;
    }

    public void ZRu(FA fa2) {
        this.Mm.add(fa2);
    }

    public void ZRu(long j10) {
        this.Vor = j10;
    }

    public static Map<String, qF> ZRu(ZRu zRu) {
        if (zRu == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (qF qFVar : zRu.mZ()) {
            if (!TextUtils.isEmpty(qFVar.CXy())) {
                map.put(qFVar.CXy(), qFVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void ZRu(boolean z10) {
        this.aT = z10;
    }

    public void ZRu(C0455ZRu c0455ZRu) {
        this.uR = c0455ZRu;
        if (c0455ZRu == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.ZRu(qF.ZRu.ZRu(c0455ZRu, ""));
    }

    public void ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        ZRu(C0455ZRu.ZRu(jSONObject.optJSONObject("tpl_info")));
    }
}
