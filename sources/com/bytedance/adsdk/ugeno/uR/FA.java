package com.bytedance.adsdk.ugeno.uR;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uR.NOt;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    public static NOt.ZRu ZRu(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        NOt.ZRu zRu = new NOt.ZRu();
        Uri uri = Uri.parse(str);
        if (uri == null) {
            return null;
        }
        if (!TextUtils.isEmpty(uri.getScheme())) {
            zRu.ZRu(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        zRu.NOt(authority);
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(uri.getQueryParameter(str2), jSONObject));
            }
        }
        zRu.ZRu(map);
        return zRu;
    }
}
