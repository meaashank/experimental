package com.bykv.vk.openvk.ZRu.ZRu.NOt;

import android.content.Context;
import com.bykv.vk.openvk.ZRu.ZRu.ZRu.ZRu.NOt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public static int NOt = 10;
    private static NOt TFq = null;
    public static int ZRu = 10;
    public static int mZ = 10;
    public static int uR = 10;

    public static int NOt() {
        return ZRu;
    }

    public static int TFq() {
        return uR;
    }

    public static void ZRu(Context context) {
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.ZRu.ZRu(context);
    }

    public static int mZ() {
        return NOt;
    }

    public static int uR() {
        return mZ;
    }

    public static void ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            ZRu = jSONObject.optInt("splash", 10);
            NOt = jSONObject.optInt("reward", 10);
            mZ = jSONObject.optInt("brand", 10);
            int iOptInt = jSONObject.optInt("other", 10);
            uR = iOptInt;
            if (ZRu < 0) {
                ZRu = 10;
            }
            if (NOt < 0) {
                NOt = 10;
            }
            if (mZ < 0) {
                mZ = 10;
            }
            if (iOptInt < 0) {
                uR = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void ZRu(NOt nOt) {
        TFq = nOt;
    }

    public static void ZRu() {
        NOt nOt = TFq;
        if (nOt != null) {
            nOt.uR();
        }
    }
}
