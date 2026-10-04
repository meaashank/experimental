package com.bytedance.sdk.openadsdk.FA;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.th;
import com.prism.gaia.download.j;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class uR extends ZRu {
    public static mZ ZRu;

    public static String ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, String str) {
        mZ mZVarZRu;
        Map map;
        if (!th.mZ() || (mZVarZRu = NOt.ZRu("net")) == null || (map = (Map) mZVarZRu.ZRu(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get(j.b.a.f164784c);
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                mZVar.NOt(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
