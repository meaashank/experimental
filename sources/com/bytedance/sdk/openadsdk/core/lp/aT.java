package com.bytedance.sdk.openadsdk.core.lp;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aT {
    private final URL NOt;
    private final String ZRu;
    private final String mZ;
    private final String uR;

    private aT(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.ZRu = str2;
        this.NOt = new URL(str);
        this.mZ = str3;
        this.uR = str4;
    }

    public String NOt() {
        return this.mZ;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aT)) {
            return false;
        }
        aT aTVar = (aT) obj;
        if (ZRu(this.ZRu, aTVar.ZRu) && ZRu(this.NOt, aTVar.NOt) && ZRu(this.mZ, aTVar.mZ)) {
            return ZRu(this.uR, aTVar.uR);
        }
        return false;
    }

    public int hashCode() {
        String str = this.ZRu;
        int iHashCode = (this.NOt.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.mZ;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.uR;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public URL mZ() {
        return this.NOt;
    }

    public JSONObject uR() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.NOt.toString());
            if (!TextUtils.isEmpty(this.ZRu)) {
                jSONObject.put("vendorKey", this.ZRu);
            }
            if (!TextUtils.isEmpty(this.mZ)) {
                jSONObject.put("verificationParameters", this.mZ);
            }
            if (!TextUtils.isEmpty(this.uR)) {
                jSONObject.put("verificationNotExecuted", this.uR);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean ZRu(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static aT ZRu(String str, String str2, String str3, String str4, String str5) {
        if (CampaignEx.KEY_OMID.equalsIgnoreCase(str) && !TextUtils.isEmpty(str2)) {
            try {
                return new aT(str2, str3, str4, str5);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static aT ZRu(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new aT(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static Set<aT> ZRu(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    hashSet.add(ZRu(jSONArray.getJSONObject(i10)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
