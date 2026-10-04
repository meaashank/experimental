package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class VdW {
    private static final Map<String, VdW> ZRu = new HashMap();
    private SharedPreferences NOt;

    private VdW(String str, Context context) {
        if (context != null) {
            this.NOt = context.getSharedPreferences(str, 0);
        }
    }

    public static VdW ZRu(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, VdW> map = ZRu;
        VdW vdW = map.get(str);
        if (vdW != null) {
            return vdW;
        }
        VdW vdW2 = new VdW(str, context);
        map.put(str, vdW2);
        return vdW2;
    }

    public String ZRu(String str, String str2) {
        try {
            return this.NOt.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void ZRu(String str) {
        try {
            this.NOt.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
