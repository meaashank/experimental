package com.bytedance.sdk.openadsdk.uR;

import Y6.d;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.model.xY;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.mbridge.msdk.MBridgeConstans;
import com.prism.gaia.download.a;
import com.tonyodev.fetch2core.server.FileResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu implements com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.NOt {
    private int FA;
    private final String Ht;
    private int Mm;
    protected final JSONObject NOt;
    private com.bytedance.sdk.openadsdk.uR.NOt.ZRu OCA;
    private long TFq;
    private int Vor;
    private String WMI;
    public final String ZRu;
    private int Zf;
    private String edo;
    private final AtomicBoolean lp;
    private boolean mZ;
    private String oK;
    private String om;
    private String qF;
    private String ru;
    private JSONObject sAl;
    private String to;
    private long uR;
    private String xY;
    private String yBV;
    private static final Set<String> aT = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> ZH = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.uR.ZRu.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put(FileResponse.FIELD_MD5, "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.uR.ZRu$ZRu, reason: collision with other inner class name */
    public static final class C0470ZRu {
        private String FA;
        private String Ht;
        private String Mm;
        private String NOt;
        private String OCA;
        private String TFq;
        private String Vor;
        private int WMI;
        private String ZH;
        public int ZRu;
        private JSONObject aT;
        private com.bytedance.sdk.openadsdk.uR.NOt.NOt edo;
        private final int lp;
        private String mZ;
        private com.bytedance.sdk.openadsdk.uR.NOt.ZRu oK;
        private boolean om;
        private int qF;
        private String sAl;
        private String uR;
        private final long yBV;

        public C0470ZRu(long j10, qF qFVar) {
            this.WMI = -1;
            this.qF = -1;
            this.ZRu = -1;
            if (qFVar != null) {
                this.om = xY.NOt(qFVar);
                this.WMI = qFVar.WMI();
                this.qF = qFVar.yBV();
                this.ZRu = qFVar.wZ();
            }
            this.yBV = j10;
            this.lp = com.bytedance.sdk.component.utils.oK.mZ(com.bytedance.sdk.openadsdk.core.WMI.ZRu());
        }

        public C0470ZRu FA(String str) {
            this.OCA = str;
            return this;
        }

        public C0470ZRu Ht(String str) {
            this.Vor = str;
            return this;
        }

        public C0470ZRu Mm(String str) {
            this.Mm = str;
            return this;
        }

        public C0470ZRu NOt(String str) {
            this.mZ = str;
            return this;
        }

        public C0470ZRu TFq(String str) {
            this.FA = str;
            return this;
        }

        public C0470ZRu mZ(String str) {
            this.uR = str;
            return this;
        }

        public C0470ZRu uR(String str) {
            this.TFq = str;
            return this;
        }

        public C0470ZRu ZRu(String str) {
            this.sAl = str;
            return this;
        }

        public C0470ZRu ZRu(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.aT = jSONObject;
            return this;
        }

        public void ZRu(com.bytedance.sdk.openadsdk.uR.NOt.ZRu zRu) {
            com.bytedance.sdk.openadsdk.Ht.NOt.ZRu().ZRu(this.uR, this.OCA, this.Mm, this.mZ);
            this.oK = zRu;
            final ZRu zRu2 = new ZRu(this);
            try {
                com.bytedance.sdk.openadsdk.uR.NOt.NOt nOt = this.edo;
                if (nOt != null) {
                    nOt.ZRu(zRu2.NOt, this.yBV);
                } else {
                    new com.bytedance.sdk.openadsdk.uR.NOt.mZ().ZRu(zRu2.NOt, this.yBV);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.NOt.mZ()) {
                WD.mZ(new com.bytedance.sdk.component.FA.FA("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.uR.ZRu.ZRu.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(zRu2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(zRu2);
            }
        }
    }

    public ZRu(String str, JSONObject jSONObject) {
        this.Ht = "adiff";
        this.lp = new AtomicBoolean(false);
        this.sAl = new JSONObject();
        this.ZRu = str;
        this.NOt = jSONObject;
    }

    private void Ht() {
        JSONObject jSONObject = this.sAl;
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("value");
            String strOptString2 = this.sAl.optString("category");
            String strOptString3 = this.sAl.optString("log_extra");
            if (ZRu(this.WMI, this.yBV, this.xY)) {
                if (!TextUtils.isEmpty(strOptString) && TextUtils.equals(strOptString, MBridgeConstans.ENDCARD_URL_TYPE_PL)) {
                    return;
                }
                if (!TextUtils.isEmpty(strOptString2) && !NOt(strOptString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(strOptString) || TextUtils.equals(strOptString, MBridgeConstans.ENDCARD_URL_TYPE_PL)) && (TextUtils.isEmpty(this.WMI) || TextUtils.equals(this.WMI, MBridgeConstans.ENDCARD_URL_TYPE_PL))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.yBV) || !NOt(this.yBV)) && (TextUtils.isEmpty(strOptString2) || !NOt(strOptString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.xY) && TextUtils.isEmpty(strOptString3)) {
                    return;
                }
            }
        } else if (!ZRu(this.WMI, this.yBV, this.xY)) {
            return;
        }
        this.uR = com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu.incrementAndGet();
    }

    private void Mm() throws JSONException {
        this.NOt.putOpt("app_log_url", this.ru);
        this.NOt.putOpt(d.C0152d.f79310d, this.edo);
        this.NOt.putOpt("label", this.oK);
        this.NOt.putOpt("category", this.yBV);
        if (!TextUtils.isEmpty(this.WMI)) {
            try {
                this.NOt.putOpt("value", Long.valueOf(Long.parseLong(this.WMI)));
            } catch (NumberFormatException unused) {
                this.NOt.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.om)) {
            try {
                this.NOt.putOpt("ext_value", Long.valueOf(Long.parseLong(this.om)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.xY)) {
            this.NOt.putOpt("log_extra", this.xY);
        }
        if (!TextUtils.isEmpty(this.to)) {
            try {
                this.NOt.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.to)));
            } catch (NumberFormatException unused3) {
            }
        }
        ZRu(this.NOt, this.oK);
        try {
            this.NOt.putOpt("nt", Integer.valueOf(this.Zf));
        } catch (Exception unused4) {
        }
        Iterator<String> itKeys = this.sAl.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.NOt.putOpt(next, this.sAl.opt(next));
        }
    }

    private boolean NOt(String str) {
        str.getClass();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean ZRu(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, MBridgeConstans.ENDCARD_URL_TYPE_PL) || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        switch (str2) {
        }
        return false;
    }

    public boolean TFq() {
        Set<String> setSAl;
        if (this.NOt == null || (setSAl = com.bytedance.sdk.openadsdk.core.WMI.uR().sAl()) == null) {
            return false;
        }
        String strOptString = this.NOt.optString("label");
        if (!TextUtils.isEmpty(strOptString)) {
            return setSAl.contains(strOptString);
        }
        if (TextUtils.isEmpty(this.oK)) {
            return false;
        }
        return setSAl.contains(this.oK);
    }

    public JSONObject mZ() {
        if (this.lp.get()) {
            return this.NOt;
        }
        try {
            Mm();
            if (this.NOt.has("ad_extra_data")) {
                Object objOpt = this.NOt.opt("ad_extra_data");
                if (objOpt != null) {
                    try {
                        if (objOpt instanceof JSONObject) {
                            com.bytedance.sdk.component.utils.lp.ZRu("AdEvent", "ad_extra_data is JSONObject");
                            this.NOt.put("ad_extra_data", ZRu((JSONObject) objOpt).toString());
                        } else if (objOpt instanceof String) {
                            this.NOt.put("ad_extra_data", ZRu(new JSONObject((String) objOpt)).toString());
                        }
                    } catch (JSONException e10) {
                        com.bytedance.sdk.component.utils.lp.ZRu("AdEvent", "json error", e10.getMessage());
                    }
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("adiff", this.ZRu);
                    if (this.mZ) {
                        jSONObject.put("interaction_method", this.Mm);
                        jSONObject.put("real_interaction_method", this.FA);
                        jSONObject.put("image_mode", this.Vor);
                    }
                    this.NOt.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException e11) {
                    com.bytedance.sdk.component.utils.lp.ZRu("AdEvent", "json error", e11.getMessage());
                }
            }
            this.lp.set(true);
        } catch (Throwable unused) {
        }
        return this.NOt;
    }

    public String uR() {
        return this.ZRu;
    }

    private void NOt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : ZH.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object objOpt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(ZH.get(str), objOpt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject ZRu(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.ZRu);
            }
            if (this.mZ) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.Mm);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.FA);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.Vor);
                }
            }
            if (com.bytedance.sdk.openadsdk.OCA.ZRu.ZRu("replace_log_extra_key", false)) {
                NOt(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.ZRu + a.f164606q + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    public ZRu(C0470ZRu c0470ZRu) {
        this.Ht = "adiff";
        this.lp = new AtomicBoolean(false);
        this.sAl = new JSONObject();
        if (!TextUtils.isEmpty(c0470ZRu.NOt)) {
            this.ZRu = c0470ZRu.NOt;
        } else {
            this.ZRu = com.bytedance.sdk.openadsdk.utils.xY.ZRu();
        }
        this.OCA = c0470ZRu.oK;
        this.xY = c0470ZRu.Ht;
        this.edo = c0470ZRu.mZ;
        this.oK = c0470ZRu.uR;
        if (!TextUtils.isEmpty(c0470ZRu.TFq)) {
            this.yBV = c0470ZRu.TFq;
        } else {
            this.yBV = "app_union";
        }
        this.to = c0470ZRu.ZH;
        this.WMI = c0470ZRu.FA;
        this.om = c0470ZRu.Vor;
        this.qF = c0470ZRu.Mm;
        this.Zf = c0470ZRu.lp;
        this.ru = c0470ZRu.sAl;
        this.sAl = c0470ZRu.aT = c0470ZRu.aT != null ? c0470ZRu.aT : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.NOt = jSONObject;
        if (!TextUtils.isEmpty(c0470ZRu.sAl)) {
            try {
                jSONObject.put("app_log_url", c0470ZRu.sAl);
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.lp.ZRu("AdEvent", e10.getMessage());
            }
        }
        this.Mm = c0470ZRu.WMI;
        this.FA = c0470ZRu.qF;
        this.Vor = c0470ZRu.ZRu;
        this.mZ = c0470ZRu.om;
        this.TFq = System.currentTimeMillis();
        Ht();
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.NOt
    public long NOt() {
        return this.uR;
    }

    public JSONObject ZRu(boolean z10) {
        JSONObject jSONObjectMZ = mZ();
        try {
            if (z10) {
                JSONObject jSONObject = new JSONObject(jSONObjectMZ.toString());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                if (jSONObjectOptJSONObject == null) {
                    return jSONObject;
                }
                jSONObjectOptJSONObject.remove("app_log_url");
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(jSONObjectMZ.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("AdEvent", e10.getMessage());
            return jSONObjectMZ;
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.NOt
    public JSONObject ZRu(String str) {
        return mZ();
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.uR.ZRu.NOt
    public long ZRu() {
        return this.TFq;
    }

    private static void ZRu(JSONObject jSONObject, String str) {
        try {
            Set<String> set = aT;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("AdEvent", th);
        }
    }
}
