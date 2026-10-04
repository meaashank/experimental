package com.bytedance.adsdk.ugeno.ZRu;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;
import s0.C5563e;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Interpolator NOt(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case -1965072618: goto L28;
                case -1102672091: goto L1e;
                case -787702915: goto L14;
                case 1065009829: goto La;
                default: goto L9;
            }
        L9:
            goto L32
        La:
            java.lang.String r0 = "ease_in_out"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = r2
            goto L33
        L14:
            java.lang.String r0 = "ease_out"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = r1
            goto L33
        L1e:
            java.lang.String r0 = "linear"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = 3
            goto L33
        L28:
            java.lang.String r0 = "ease_in"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            r3 = 0
            goto L33
        L32:
            r3 = -1
        L33:
            if (r3 == 0) goto L4b
            if (r3 == r2) goto L45
            if (r3 == r1) goto L3f
            android.view.animation.LinearInterpolator r3 = new android.view.animation.LinearInterpolator
            r3.<init>()
            return r3
        L3f:
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            return r3
        L45:
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            return r3
        L4b:
            android.view.animation.AccelerateInterpolator r3 = new android.view.animation.AccelerateInterpolator
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.ZRu.mZ.NOt(java.lang.String):android.view.animation.Interpolator");
    }

    public static int ZRu(int i10) {
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 - 1;
    }

    public static float[] mZ(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArrayZRu = com.bytedance.adsdk.ugeno.Mm.NOt.ZRu(str, (JSONArray) null);
        if (jSONArrayZRu != null && jSONArrayZRu.length() == 2) {
            fArr[0] = (float) jSONArrayZRu.optDouble(0);
            fArr[1] = (float) jSONArrayZRu.optDouble(1);
        }
        return fArr;
    }

    public static NOt ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        NOt nOt = new NOt();
        nOt.NOt(jSONObject.optLong("delay"));
        nOt.ZRu(jSONObject.optLong(x.h.f238399b));
        nOt.ZRu(jSONObject.optInt("playCount", 1));
        nOt.ZRu(jSONObject.optString("playDirection"));
        nOt.NOt(jSONObject.optString("transformOrigin"));
        nOt.mZ(jSONObject.optString("timingFunction", C5563e.f238016l));
        nOt.ZRu(jSONObject.optJSONObject("effect"));
        nOt.ZRu(ZRu(jSONObject.optJSONArray("keyframes")));
        return nOt;
    }

    public static Map<String, TreeMap<Float, String>> ZRu(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                float fOptDouble = (float) jSONObjectOptJSONObject.optDouble(x.c.f238293R);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    TreeMap treeMap = (TreeMap) map.get(next);
                    if (!TextUtils.equals(next, x.c.f238293R)) {
                        if (map.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            new Pair(Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                            treeMap2.put(Float.valueOf(fOptDouble), jSONObjectOptJSONObject.optString(next));
                            map.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return map;
    }

    public static int ZRu(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1408024454) {
            return str.equals("alternate") ? 2 : 1;
        }
        if (iHashCode != -1039745817) {
            return 1;
        }
        str.equals("normal");
        return 1;
    }
}
