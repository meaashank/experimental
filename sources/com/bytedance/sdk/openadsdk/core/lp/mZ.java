package com.bytedance.sdk.openadsdk.core.lp;

import android.support.v4.media.e;
import com.bytedance.sdk.openadsdk.core.lp.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.lp.mZ.ZRu;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    protected String FA;
    protected List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> Ht;
    protected List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> Mm;
    protected int NOt;
    protected String TFq;
    protected int ZRu;
    private String aT;
    private qF lp;
    protected ZRu.EnumC0453ZRu mZ;
    protected ZRu.NOt uR;
    private final AtomicBoolean ZH = new AtomicBoolean(false);
    protected String Vor = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lp.mZ$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[ZRu.NOt.values().length];
            ZRu = iArr;
            try {
                iArr[ZRu.NOt.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[ZRu.NOt.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ZRu[ZRu.NOt.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public mZ(int i10, int i11, ZRu.EnumC0453ZRu enumC0453ZRu, ZRu.NOt nOt, String str, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list, List<com.bytedance.sdk.openadsdk.core.lp.NOt.mZ> list2, String str2) {
        this.Ht = new ArrayList();
        this.Mm = new ArrayList();
        this.ZRu = i10;
        this.NOt = i11;
        this.mZ = enumC0453ZRu;
        this.uR = nOt;
        this.TFq = str;
        this.Ht = list;
        this.Mm = list2;
        this.FA = str2;
    }

    public String Ht() {
        return this.TFq;
    }

    public int NOt() {
        return this.ZRu;
    }

    public String TFq() {
        if (this.uR == ZRu.NOt.STATIC_RESOURCE && this.mZ == ZRu.EnumC0453ZRu.IMAGE) {
            return this.TFq;
        }
        return null;
    }

    public void ZRu(long j10) {
        com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.Ht, null, j10, this.aT, new mZ.NOt(this.Vor, this.lp));
    }

    public int mZ() {
        return this.NOt;
    }

    public String uR() {
        int i10 = AnonymousClass1.ZRu[this.uR.ordinal()];
        if (i10 == 1) {
            ZRu.EnumC0453ZRu enumC0453ZRu = this.mZ;
            if (enumC0453ZRu == ZRu.EnumC0453ZRu.IMAGE) {
                return e.a(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.TFq, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0453ZRu == ZRu.EnumC0453ZRu.JAVASCRIPT) {
                return e.a(new StringBuilder("<script src=\""), this.TFq, "\"></script>");
            }
            return null;
        }
        if (i10 == 2) {
            return this.TFq;
        }
        if (i10 != 3) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb2.append(this.ZRu);
        sb2.append("\" height=\"");
        sb2.append(this.NOt);
        sb2.append("\" src=\"");
        return e.a(sb2, this.TFq, "\"></iframe>");
    }

    public static float ZRu(int i10, int i11, int i12, int i13, ZRu.NOt nOt, ZRu.EnumC0453ZRu enumC0453ZRu) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return ZRu(nOt, enumC0453ZRu) / ((Math.abs((f10 - f11) / f10) + Math.abs((f10 / i11) - (f11 / i13))) + 1.0f);
    }

    public void NOt(long j10) {
        if (this.ZH.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.NOt(this.Mm, null, j10, this.aT);
        }
    }

    public static mZ NOt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt(InMobiNetworkValues.WIDTH);
        int iOptInt2 = jSONObject.optInt(InMobiNetworkValues.HEIGHT);
        String strOptString = jSONObject.optString("creativeType", ZRu.EnumC0453ZRu.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", ZRu.NOt.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new mZ.ZRu(jSONArrayOptJSONArray.optString(i10)).ZRu());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new mZ.ZRu(jSONArrayOptJSONArray2.optString(i11)).ZRu());
        }
        return new mZ(iOptInt, iOptInt2, ZRu.EnumC0453ZRu.valueOf(strOptString), ZRu.NOt.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float ZRu(ZRu.NOt nOt, ZRu.EnumC0453ZRu enumC0453ZRu) {
        int i10 = AnonymousClass1.ZRu[nOt.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (ZRu.EnumC0453ZRu.JAVASCRIPT.equals(enumC0453ZRu)) {
            return 1.0f;
        }
        return ZRu.EnumC0453ZRu.IMAGE.equals(enumC0453ZRu) ? 0.8f : 0.0f;
    }

    public void ZRu(String str) {
        this.aT = str;
    }

    public JSONObject ZRu() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNetworkValues.WIDTH, this.ZRu);
        jSONObject.put(InMobiNetworkValues.HEIGHT, this.NOt);
        jSONObject.put("creativeType", this.mZ.toString());
        jSONObject.put("resourceType", this.uR.toString());
        jSONObject.put("contentUrl", this.TFq);
        jSONObject.put("clickThroughUri", this.FA);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.Ht));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(this.Mm));
        return jSONObject;
    }

    public void ZRu(qF qFVar) {
        this.lp = qFVar;
    }
}
