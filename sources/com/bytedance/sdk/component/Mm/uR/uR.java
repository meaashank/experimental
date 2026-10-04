package com.bytedance.sdk.component.Mm.uR;

import android.content.Context;
import com.bytedance.sdk.component.Mm.mZ.FA;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    public static void ZRu(Context context, int i10, String str, int i11) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (i10 == 1) {
                linkedHashMap.put(ZRu(i11), str);
            }
            if (FA.ZRu().ZRu(i11).uR() != null) {
                FA.ZRu().ZRu(i11).uR().ZRu(context, linkedHashMap);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String ZRu(android.content.Context r2, int r3, int r4) {
        /*
            r0 = 1
            java.lang.String r1 = ""
            if (r3 == r0) goto L6
            goto L29
        L6:
            com.bytedance.sdk.component.Mm.mZ.FA r3 = com.bytedance.sdk.component.Mm.mZ.FA.ZRu()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.Mm.mZ.Ht r3 = r3.ZRu(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.Mm.mZ.NOt r3 = r3.uR()     // Catch: java.lang.Exception -> L29
            if (r3 == 0) goto L29
            com.bytedance.sdk.component.Mm.mZ.FA r3 = com.bytedance.sdk.component.Mm.mZ.FA.ZRu()     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.Mm.mZ.Ht r3 = r3.ZRu(r4)     // Catch: java.lang.Exception -> L29
            com.bytedance.sdk.component.Mm.mZ.NOt r3 = r3.uR()     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = ZRu(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r3.ZRu(r2, r4, r1)     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r2 = r1
        L2a:
            boolean r3 = androidx.activity.D.a(r2)
            if (r3 == 0) goto L34
            java.lang.String r1 = java.lang.String.valueOf(r2)
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.Mm.uR.uR.ZRu(android.content.Context, int, int):java.lang.String");
    }

    private static String ZRu(int i10) {
        return "tnc_config".concat(String.valueOf(i10));
    }
}
