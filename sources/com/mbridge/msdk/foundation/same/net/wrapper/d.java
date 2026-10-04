package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f156509a = "d";

    public d(String str, String str2) {
        setKey(str);
        setRKE(str2);
    }

    private void a(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar.f156415b.f156440d == 204) {
            a(new JSONObject());
        } else {
            b(eVar);
        }
    }

    private void b(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        JSONObject jSONObject = eVar.f156416c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int iOptInt = jSONObject.optInt("status", -9999);
        if (iOptInt == -9999) {
            a(eVar.f156416c);
            return;
        }
        if (iOptInt != 1 && iOptInt != 200) {
            String strOptString = eVar.f156416c.optString("msg");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = "error message is null";
            }
            a(strOptString);
            return;
        }
        JSONObject jSONObjectOptJSONObject = eVar.f156416c.optJSONObject("data");
        if (jSONObjectOptJSONObject != null) {
            try {
                String strOptString2 = jSONObjectOptJSONObject.optString(CampaignEx.JSON_KEY_AD_R);
                if (!TextUtils.isEmpty(strOptString2)) {
                    String strA = v0.a(strOptString2, "ebmclXzZOhtU2sRlZxGL8A");
                    if (!TextUtils.isEmpty(strA)) {
                        try {
                            jSONObjectOptJSONObject = new JSONObject(strA);
                        } catch (Exception e10) {
                            q0.b(f156509a, e10.getMessage(), e10);
                        }
                    }
                }
            } catch (Exception e11) {
                q0.b(f156509a, "put rk error", e11);
            }
        }
        if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("e_str"))) {
            jSONObjectOptJSONObject.put("rk", getKey());
        }
        a(jSONObjectOptJSONObject);
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f156509a, "errorCode = " + aVar.f156417a);
        a(com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(eVar);
        if (eVar.f156415b == null) {
            b(eVar);
        } else {
            a(eVar);
        }
    }

    public d() {
    }
}
