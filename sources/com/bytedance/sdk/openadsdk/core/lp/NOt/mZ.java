package com.bytedance.sdk.openadsdk.core.lp.NOt;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.component.utils.xY;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.lp.NOt.NOt;
import com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.prism.gaia.server.accounts.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private EnumC0452mZ NOt;
    private final String ZRu;
    private boolean mZ;
    private boolean uR;
    private static final Map<String, NOt> TFq = new ConcurrentHashMap();
    private static final AtomicBoolean Ht = new AtomicBoolean(false);

    public static class NOt {
        qF NOt;
        String ZRu;
        float mZ;

        public NOt(String str, qF qFVar) {
            this(str, qFVar, -1.0f);
        }

        public NOt(String str, qF qFVar, float f10) {
            this.ZRu = str;
            this.NOt = qFVar;
            this.mZ = f10;
        }
    }

    public static class ZRu {
        private final String ZRu;
        private EnumC0452mZ NOt = EnumC0452mZ.TRACKING_URL;
        private boolean mZ = false;

        public ZRu(String str) {
            this.ZRu = str;
        }

        public ZRu ZRu(boolean z10) {
            this.mZ = z10;
            return this;
        }

        public mZ ZRu() {
            return new mZ(this.ZRu, this.NOt, Boolean.valueOf(this.mZ));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lp.NOt.mZ$mZ, reason: collision with other inner class name */
    public enum EnumC0452mZ {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        xY.ZRu(new xY.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.1
            @Override // com.bytedance.sdk.component.utils.xY.ZRu
            public void ZRu(Context context, Intent intent, boolean z10, int i10) {
                if (i10 == 0 || mZ.TFq.size() <= 0) {
                    return;
                }
                mZ.NOt();
            }
        }, WMI.ZRu());
    }

    public mZ(String str, EnumC0452mZ enumC0452mZ, Boolean bool) {
        this.ZRu = str;
        this.NOt = enumC0452mZ;
        this.mZ = bool.booleanValue();
    }

    public static void NOt(@NonNull List<mZ> list, @Nullable com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu zRu, @Nullable long j10, @Nullable String str) {
        ZRu(list, zRu, j10, str, null);
    }

    public boolean TFq() {
        return this.uR;
    }

    public void j_() {
        this.uR = true;
    }

    public String mZ() {
        return this.ZRu;
    }

    public boolean uR() {
        return this.mZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt() {
        if (Ht.compareAndSet(false, true)) {
            Map<String, NOt> map = TFq;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    ZRu((String) entry.getKey(), (NOt) entry.getValue(), true);
                }
            }
            Ht.set(false);
        }
    }

    public static List<String> ZRu(@NonNull List<mZ> list, @Nullable com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu zRu, @Nullable long j10, @Nullable String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (mZ mZVar : list) {
            if (mZVar != null && (!mZVar.TFq() || mZVar.uR())) {
                arrayList.add(mZVar.mZ());
                mZVar.j_();
            }
        }
        return new com.bytedance.sdk.openadsdk.core.lp.mZ.mZ(arrayList).ZRu(zRu).ZRu(j10).ZRu(str).ZRu();
    }

    public static List<com.bytedance.sdk.openadsdk.core.lp.NOt.ZRu> mZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ZRu.C0451ZRu(jSONObjectOptJSONObject.optString("content"), jSONObjectOptJSONObject.optLong("trackingMilliseconds", 0L)).ZRu());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void NOt(final boolean z10, final String str, final String str2, final NOt nOt, final String str3, final boolean z11) {
        com.bytedance.sdk.openadsdk.uR.mZ.ZRu(new FA("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", nOt.ZRu);
                    jSONObject.put("success", z10);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put("url", str3);
                    float f10 = nOt.mZ;
                    if (f10 >= 0.0f) {
                        jSONObject.put("progress", ((double) Math.round(f10 * 100.0f)) / 100.0d);
                    }
                    if (z11) {
                        jSONObject.put("retry", true);
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.uR.mZ.NOt(nOt.NOt, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    public static List<com.bytedance.sdk.openadsdk.core.lp.NOt.NOt> NOt(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new NOt.ZRu(jSONObjectOptJSONObject.optString("content"), (float) jSONObjectOptJSONObject.optDouble("trackingFraction", 0.0d)).ZRu());
                }
            }
        }
        return arrayList;
    }

    public static void ZRu(@NonNull List<mZ> list, @Nullable com.bytedance.sdk.openadsdk.core.lp.ZRu.ZRu zRu, @Nullable long j10, @Nullable String str, NOt nOt) {
        ZRu(ZRu(list, zRu, j10, str), nOt);
    }

    public static void ZRu(List<String> list, NOt nOt) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (!TextUtils.isEmpty(str)) {
                ZRu(str, nOt, false);
            }
        }
    }

    private static void ZRu(final String str, final NOt nOt, final boolean z10) {
        com.bytedance.sdk.component.Mm.NOt.NOt nOtMZ = com.bytedance.sdk.openadsdk.WMI.mZ.ZRu().NOt().mZ();
        if (nOtMZ == null) {
            return;
        }
        nOtMZ.ZRu(true);
        nOtMZ.NOt(str);
        nOtMZ.ZRu(new com.bytedance.sdk.component.Mm.ZRu.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.2
            @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
            public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, com.bytedance.sdk.component.Mm.NOt nOt2) {
                boolean z11;
                NOt nOt3 = nOt;
                if (nOt3 == null || nOt3.NOt == null) {
                    return;
                }
                String str2 = null;
                if (nOt2 == null || !nOt2.Ht()) {
                    z11 = false;
                    if (nOt2 != null) {
                        str2 = nOt2.ZRu() + b.f166434b0 + nOt2.NOt();
                        if (!z10 && (nOt2.ZRu() <= 300 || nOt2.ZRu() >= 400)) {
                            mZ.TFq.put(str, nOt);
                        }
                    }
                } else {
                    z11 = true;
                }
                mZ.NOt(z11, str2, Yx.mZ(nOt.NOt.klw()), nOt, str, z10);
                if (nOt2 == null || nOt2.ZRu() != 200 || mZ.TFq.size() <= 0) {
                    return;
                }
                mZ.NOt();
            }

            @Override // com.bytedance.sdk.component.Mm.ZRu.ZRu
            public void ZRu(com.bytedance.sdk.component.Mm.NOt.mZ mZVar, IOException iOException) {
                qF qFVar;
                NOt nOt2 = nOt;
                if (nOt2 != null && (qFVar = nOt2.NOt) != null) {
                    mZ.NOt(false, iOException != null ? iOException.getMessage() : null, Yx.mZ(qFVar.klw()), nOt, str, z10);
                }
                if (z10 || nOt == null) {
                    return;
                }
                mZ.TFq.put(str, nOt);
            }
        });
    }

    public static JSONArray ZRu(List<mZ> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            jSONArray.put(list.get(i10).mZ());
        }
        return jSONArray;
    }

    public static List<mZ> ZRu(JSONArray jSONArray) {
        return ZRu(jSONArray, false);
    }

    public static List<mZ> ZRu(JSONArray jSONArray, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    arrayList.add(new ZRu(strOptString).ZRu(z10).ZRu());
                }
            }
        }
        return arrayList;
    }
}
