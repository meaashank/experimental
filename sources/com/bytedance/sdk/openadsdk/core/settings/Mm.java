package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Mm {
    public boolean Ht;
    public boolean TFq;
    public String mZ;
    public boolean uR;
    public static final Mm ZRu = new Mm(null);
    public static String NOt = "";

    public Mm(String str) {
        this.mZ = "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js";
        this.uR = true;
        this.TFq = true;
        this.Ht = true;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("performance_js");
            String strOptString = jSONObjectOptJSONObject.optString("url", "https://sf19-static.i18n-pglstatp.com/obj/ad-pattern-sg/3p_monitor.9db44671.js");
            if (!TextUtils.isEmpty(strOptString)) {
                this.mZ = strOptString;
            }
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("execute_time");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i10));
            }
            this.uR = arrayList.contains("load_finish");
            this.Ht = arrayList.contains("load_fail");
            this.TFq = arrayList.contains("load");
        } catch (Exception unused) {
        }
    }
}
