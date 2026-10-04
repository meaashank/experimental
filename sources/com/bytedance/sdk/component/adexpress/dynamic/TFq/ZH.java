package com.bytedance.sdk.component.adexpress.dynamic.TFq;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.TFq.NOt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZH {
    private static String NOt;
    private static final Set<String> ZRu = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close-fill", "webview-close")));

    public static double NOt(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0472 A[Catch: Exception -> 0x0483, TryCatch #5 {Exception -> 0x0483, blocks: (B:220:0x0466, B:222:0x0472, B:227:0x047c), top: B:280:0x0466 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.TFq.NOt.mZ ZRu(java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, int r30, com.bytedance.sdk.component.adexpress.dynamic.uR.FA r31, double r32, int r34, double r35, java.lang.String r37, com.bytedance.sdk.component.adexpress.NOt.sAl r38) {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.TFq.ZH.ZRu(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.uR.FA, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.NOt.sAl):com.bytedance.sdk.component.adexpress.dynamic.TFq.NOt$mZ");
    }

    public static int[] NOt(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.uR.ZRu());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean NOt() {
        return !TextUtils.isEmpty(NOt);
    }

    public static String ZRu(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static NOt.mZ ZRu(NOt.mZ mZVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            mZVar.ZRu = 0.0f;
            mZVar.NOt = 0.0f;
            return mZVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = ZRu(str);
        }
        if (TextUtils.isEmpty(str3)) {
            mZVar.ZRu = 0.0f;
            mZVar.NOt = 0.0f;
            return mZVar;
        }
        return ZRu(str3, str2);
    }

    public static NOt.mZ ZRu(String str, String str2) {
        return ZRu(str, str2, false);
    }

    public static NOt.mZ ZRu(String str, String str2, boolean z10) {
        NOt.mZ mZVar = new NOt.mZ();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrZRu = ZRu(str, (float) NOt(str2), z10);
            mZVar.ZRu = iArrZRu[0];
            mZVar.NOt = iArrZRu[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                mZVar.NOt = 0.0f;
            }
        } catch (Exception unused) {
        }
        return mZVar;
    }

    public static int[] ZRu(String str, float f10, boolean z10) {
        int[] iArrNOt = NOt(str, f10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), iArrNOt[0]), com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), iArrNOt[1])};
    }

    public static String ZRu() {
        return NOt;
    }
}
