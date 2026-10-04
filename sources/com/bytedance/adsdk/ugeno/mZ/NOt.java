package com.bytedance.adsdk.ugeno.mZ;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.mZ.ZRu;
import com.bytedance.adsdk.ugeno.uR;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    public static String ZRu(String str, JSONObject jSONObject) {
        ZRu zRuMZ;
        ZRu.InterfaceC0396ZRu interfaceC0396ZRuZRu;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (zRuMZ = uR.ZRu().mZ()) != null && (interfaceC0396ZRuZRu = zRuMZ.ZRu(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0396ZRuZRu.ZRu(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
