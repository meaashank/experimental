package com.bytedance.sdk.openadsdk.core.lp;

import Y6.d;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.qF;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private double FA;
    private String Ht;
    private String Mm;
    NOt NOt;
    private String TFq;
    private int Vor;
    private String ZH;
    private int aT;
    mZ mZ;
    private String oK;
    private String uR;
    uR ZRu = new uR(this);
    private final Set<aT> lp = new HashSet();
    private String sAl = "VAST_ACTION_BUTTON";
    private boolean edo = false;

    private JSONArray yBV() {
        JSONArray jSONArray = new JSONArray();
        for (aT aTVar : this.lp) {
            if (aTVar != null) {
                jSONArray.put(aTVar.uR());
            }
        }
        return jSONArray;
    }

    public double FA() {
        return this.FA;
    }

    public String Ht() {
        return this.Ht;
    }

    public String Mm() {
        return this.Mm;
    }

    public NOt NOt() {
        return this.NOt;
    }

    public String TFq() {
        return this.TFq;
    }

    public String Vor() {
        mZ mZVar;
        String str = this.Ht;
        if (!TextUtils.isEmpty(this.oK)) {
            String str2 = this.oK;
            this.oK = null;
            return str2;
        }
        String str3 = this.sAl;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            NOt nOt = this.NOt;
            if (nOt != null && !TextUtils.isEmpty(nOt.FA)) {
                str = this.NOt.FA;
            }
        } else if (str3.equals("VAST_END_CARD") && (mZVar = this.mZ) != null && !TextUtils.isEmpty(mZVar.FA)) {
            str = this.mZ.FA;
        }
        this.sAl = "VAST_ACTION_BUTTON";
        return str;
    }

    public String ZH() {
        return this.ZH;
    }

    public uR ZRu() {
        return this.ZRu;
    }

    public JSONObject aT() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.ZRu.ZRu());
        NOt nOt = this.NOt;
        if (nOt != null) {
            jSONObject.put("vastIcon", nOt.ZRu());
        }
        mZ mZVar = this.mZ;
        if (mZVar != null) {
            jSONObject.put("endCard", mZVar.ZRu());
        }
        jSONObject.put("title", this.uR);
        jSONObject.put("description", this.TFq);
        jSONObject.put("clickThroughUrl", this.Ht);
        jSONObject.put("videoUrl", this.Mm);
        jSONObject.put("videDuration", this.FA);
        jSONObject.put(d.C0152d.f79310d, this.ZH);
        jSONObject.put("videoWidth", this.Vor);
        jSONObject.put("videoHeight", this.aT);
        jSONObject.put("viewabilityVendor", yBV());
        return jSONObject;
    }

    public Set<aT> edo() {
        return this.lp;
    }

    public int lp() {
        return this.Vor;
    }

    public mZ mZ() {
        return this.mZ;
    }

    public void oK() {
        this.edo = true;
    }

    public int sAl() {
        return this.aT;
    }

    public String uR() {
        return this.uR;
    }

    public void Ht(String str) {
        this.ZH = str;
        this.ZRu.ZRu(str);
    }

    public void Mm(String str) {
        this.oK = str;
    }

    public void NOt(String str) {
        this.TFq = str;
    }

    public void TFq(String str) {
        this.sAl = str;
    }

    public void ZRu(NOt nOt) {
        if (nOt != null) {
            nOt.ZRu(this.Mm);
        }
        this.NOt = nOt;
    }

    public void mZ(String str) {
        this.Ht = str;
    }

    public void uR(String str) {
        this.Mm = str;
    }

    public void NOt(int i10) {
        this.aT = i10;
    }

    public void ZRu(mZ mZVar) {
        if (mZVar != null) {
            mZVar.ZRu(this.Mm);
        }
        this.mZ = mZVar;
    }

    public void ZRu(String str) {
        this.uR = str;
    }

    public void ZRu(double d10) {
        this.FA = d10;
    }

    public static ZRu ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ZRu zRu = new ZRu();
        zRu.ZRu.ZRu(jSONObject.optJSONObject("videoTrackers"));
        zRu.NOt = NOt.ZRu(jSONObject.optJSONObject("vastIcon"));
        zRu.mZ = mZ.NOt(jSONObject.optJSONObject("endCard"));
        zRu.uR = jSONObject.optString("title");
        zRu.TFq = jSONObject.optString("description");
        zRu.Ht = jSONObject.optString("clickThroughUrl");
        zRu.Mm = jSONObject.optString("videoUrl");
        zRu.FA = jSONObject.optDouble("videDuration");
        zRu.ZH = jSONObject.optString(d.C0152d.f79310d);
        zRu.Vor = jSONObject.optInt("videoWidth");
        zRu.Vor = jSONObject.optInt("videoHeight");
        zRu.lp.addAll(aT.ZRu(jSONObject.optJSONArray("viewabilityVendor")));
        return zRu;
    }

    public void ZRu(qF qFVar) {
        this.ZRu.ZRu(qFVar);
        NOt nOt = this.NOt;
        if (nOt != null) {
            nOt.ZRu(qFVar);
        }
        mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.ZRu(qFVar);
        }
    }

    public void ZRu(int i10) {
        this.Vor = i10;
    }

    public void ZRu(Set<aT> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.lp.addAll(set);
    }
}
