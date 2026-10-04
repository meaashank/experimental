package com.bytedance.sdk.component.Mm.mZ;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    private static final Object uR = new Object();
    private uR NOt = new uR();
    private int TFq;
    private Context ZRu;
    private boolean mZ;

    public TFq(Context context, boolean z10, int i10) {
        this.ZRu = context;
        this.mZ = z10;
        this.TFq = i10;
    }

    public void NOt() {
        try {
            String strZRu = com.bytedance.sdk.component.Mm.uR.uR.ZRu(this.ZRu, 1, this.TFq);
            if (TextUtils.isEmpty(strZRu)) {
                return;
            }
            uR uRVarNOt = NOt(new JSONObject(strZRu));
            if (uRVarNOt != null) {
                uRVarNOt.toString();
            }
            if (uRVarNOt != null) {
                this.NOt = uRVarNOt;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ZRu(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Mm.mZ.TFq.ZRu(org.json.JSONObject):void");
    }

    public uR mZ() {
        return this.NOt;
    }

    private uR NOt(JSONObject jSONObject) {
        try {
            uR uRVar = new uR();
            if (jSONObject.has("local_enable")) {
                uRVar.ZRu = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                uRVar.NOt = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap map = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        String string = jSONArray.getString(i10);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(string, 0);
                        }
                    }
                }
                uRVar.mZ = map;
            } else {
                uRVar.mZ = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap map2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            map2.put(next, string2);
                        }
                    }
                }
                uRVar.uR = map2;
            } else {
                uRVar.uR = null;
            }
            uRVar.TFq = jSONObject.optInt("req_to_cnt", uRVar.TFq);
            uRVar.Ht = jSONObject.optInt("req_to_api_cnt", uRVar.Ht);
            uRVar.Mm = jSONObject.optInt("req_to_ip_cnt", uRVar.Mm);
            uRVar.FA = jSONObject.optInt("req_err_cnt", uRVar.FA);
            uRVar.Vor = jSONObject.optInt("req_err_api_cnt", uRVar.Vor);
            uRVar.aT = jSONObject.optInt("req_err_ip_cnt", uRVar.aT);
            uRVar.ZH = jSONObject.optInt("update_interval", uRVar.ZH);
            uRVar.lp = jSONObject.optInt("update_random_range", uRVar.lp);
            uRVar.sAl = jSONObject.optString("http_code_black", uRVar.sAl);
            return uRVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void ZRu() {
        if (this.mZ) {
            String string = this.ZRu.getSharedPreferences(FA.ZRu().ZRu(this.TFq).ZRu(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                uR uRVarNOt = NOt(new JSONObject(string));
                if (uRVarNOt != null) {
                    this.NOt = uRVarNOt;
                }
                if (uRVarNOt == null) {
                    return;
                }
                uRVarNOt.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
