package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class xY {
    private int FA;
    private String Ht;
    private int Mm;
    private int NOt;
    private String TFq;
    private int Vor;
    private int ZRu;
    private boolean aT;
    private boolean mZ;
    private int uR;

    public xY(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.mZ = jSONObject.optBoolean("is_playable");
        this.uR = jSONObject.optInt("playable_type", 0);
        this.TFq = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.Ht = jSONObjectOptJSONObject.optString("playable_url", "");
            this.Mm = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.NOt = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.ZRu = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int iNOt = NOt(this.uR);
            this.FA = jSONObjectOptJSONObject.optInt("playable_webview_timeout", iNOt);
            this.Vor = jSONObjectOptJSONObject.optInt("playable_js_timeout", iNOt);
            this.aT = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
        }
    }

    public static boolean FA(qF qFVar) {
        xY xYVarOK = qFVar.oK();
        return xYVarOK != null && !qFVar.Rgu() && xYVarOK.mZ && xYVarOK.NOt == 1;
    }

    public static boolean Ht(qF qFVar) {
        return TFq(qFVar) && le(qFVar) == 1;
    }

    public static boolean Mm(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        return (xYVarRu == null || qFVar.Rgu() || !xYVarRu.mZ || TextUtils.isEmpty(sAl(qFVar))) ? false : true;
    }

    private static int NOt(int i10) {
        return i10 == 1 ? 10 : 5;
    }

    public static long OCA(qF qFVar) {
        return Math.max(to(qFVar), xY(qFVar));
    }

    public static boolean TFq(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        return xYVarRu != null && qFVar.Rgu() && xYVarRu.mZ && !TextUtils.isEmpty(sAl(qFVar));
    }

    public static boolean Vor(qF qFVar) {
        xY xYVarOK = qFVar.oK();
        return xYVarOK != null && xYVarOK.mZ && xYVarOK.NOt == 1;
    }

    public static int WMI(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        if (xYVarRu == null) {
            return 0;
        }
        return xYVarRu.Mm;
    }

    public static String ZH(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        if (xYVarRu == null) {
            return null;
        }
        return xYVarRu.TFq;
    }

    public static int ZRu(int i10) {
        return i10 + 10;
    }

    public static boolean Zf(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        return xYVarRu != null && xYVarRu.mZ();
    }

    public static boolean aT(qF qFVar) {
        xY xYVarOK = qFVar.oK();
        return xYVarOK != null && qFVar.Rgu() && xYVarOK.mZ && xYVarOK.NOt == 1;
    }

    public static boolean edo(qF qFVar) {
        return true;
    }

    private static int le(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        if (xYVarRu == null) {
            return 0;
        }
        return xYVarRu.uR;
    }

    public static String lp(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        if (xYVarRu == null) {
            return null;
        }
        return xYVarRu.Ht;
    }

    public static boolean mZ(qF qFVar) {
        return NOt(qFVar) && le(qFVar) == 1;
    }

    public static boolean oK(qF qFVar) {
        return ((qFVar == null || qFVar.Qg() == null) ? 0 : qFVar.Qg().OCA()) != 1;
    }

    public static boolean om(qF qFVar) {
        return Mm(qFVar) && le(qFVar) == 0;
    }

    public static boolean qF(qF qFVar) {
        return Mm(qFVar) && le(qFVar) == 1;
    }

    private static xY ru(qF qFVar) {
        if (qFVar == null) {
            return null;
        }
        return qFVar.oK();
    }

    public static String sAl(qF qFVar) {
        if (qFVar == null) {
            return null;
        }
        xY xYVarOK = qFVar.oK();
        if (xYVarOK != null && xYVarOK.mZ) {
            String str = xYVarOK.Ht;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (qFVar.yBV() == 20) {
            return qFVar.Gis();
        }
        if (qFVar.Qg() != null) {
            return qFVar.Qg().lp();
        }
        return null;
    }

    public static long to(qF qFVar) {
        if (ru(qFVar) == null) {
            return 5L;
        }
        return r2.ZRu();
    }

    public static boolean uR(qF qFVar) {
        return mZ(qFVar) && !Vor(qFVar);
    }

    public static long xY(qF qFVar) {
        if (ru(qFVar) == null) {
            return 5L;
        }
        return r2.NOt();
    }

    public static boolean yBV(qF qFVar) {
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOtQg = qFVar.Qg();
        return nOtQg != null && nOtQg.OCA() == 1;
    }

    public static boolean NOt(qF qFVar) {
        xY xYVarRu = ru(qFVar);
        return (xYVarRu == null || !xYVarRu.mZ || TextUtils.isEmpty(sAl(qFVar))) ? false : true;
    }

    public static int ZRu(qF qFVar) {
        int i10;
        xY xYVarOK = qFVar.oK();
        if (xYVarOK != null && (i10 = xYVarOK.ZRu) >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public boolean mZ() {
        return this.aT;
    }

    public int NOt() {
        return this.Vor;
    }

    public void ZRu(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.mZ);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("PlayableModel", e10.getMessage());
        }
        if (!TextUtils.isEmpty(this.Ht)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.Ht);
                jSONObject2.put("playable_orientation", this.Mm);
                jSONObject2.put("new_style", this.NOt);
                jSONObject2.put("close_2_app", this.ZRu);
                jSONObject2.put("playable_webview_timeout", this.FA);
                jSONObject2.put("playable_js_timeout", this.Vor);
                jSONObject2.put("playable_backup_enable", this.aT ? 1 : 0);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e11) {
                com.bytedance.sdk.component.utils.lp.ZRu("PlayableModel", e11.getMessage());
            }
        }
        try {
            jSONObject.put("playable_type", this.uR);
        } catch (JSONException e12) {
            com.bytedance.sdk.component.utils.lp.ZRu("PlayableModel", e12.getMessage());
        }
        try {
            jSONObject.put("playable_style", this.TFq);
        } catch (JSONException e13) {
            com.bytedance.sdk.component.utils.lp.ZRu("PlayableModel", e13.getMessage());
        }
    }

    public int ZRu() {
        return this.FA;
    }
}
