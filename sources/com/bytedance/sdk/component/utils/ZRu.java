package com.bytedance.sdk.component.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.G;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;
import t1.b;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0425ZRu {
        static final Random ZRu = ZRu.mZ();
    }

    public static String NOt(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strZRu = ZRu();
        String strZRu2 = ZRu(strZRu, 32);
        String strNOt = NOt();
        return G.a(b.f238888Z4, strZRu, strNOt, (strZRu2 == null || strNOt == null) ? null : com.bytedance.sdk.component.uR.ZRu.ZRu(str, strNOt, strZRu2));
    }

    public static JSONObject ZRu(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : ZRu(jSONObject.toString());
    }

    public static String mZ(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strZRu = ZRu(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strZRu == null) ? str : com.bytedance.sdk.component.uR.ZRu.NOt(str.substring(49), strSubstring, strZRu);
    }

    public static JSONObject ZRu(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strNOt = NOt(str);
                    if (!TextUtils.isEmpty(strNOt)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strNOt);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    public static Random mZ() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String NOt() {
        String strZRu = ZRu(8);
        if (strZRu == null || strZRu.length() != 16) {
            return null;
        }
        return strZRu;
    }

    public static String ZRu() {
        String strZRu = ZRu(16);
        if (strZRu == null || strZRu.length() != 32) {
            return null;
        }
        return strZRu;
    }

    public static String ZRu(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String ZRu(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0425ZRu.ZRu.nextBytes(bArr);
            return TFq.ZRu(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
