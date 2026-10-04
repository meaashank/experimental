package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.a0;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private String Ht;
    private float NOt;
    private long TFq;
    private String ZRu;
    private List<C0394ZRu> mZ;
    private long uR;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0394ZRu {
        private float[] FA;
        private float Ht;
        private float Mm;
        private float NOt;
        private String TFq;
        private String Vor;
        private long ZRu;
        private String aT;
        private String mZ;
        private long uR;

        public float[] FA() {
            return this.FA;
        }

        public float Ht() {
            return this.Ht;
        }

        public float Mm() {
            return this.Mm;
        }

        public float NOt() {
            return this.NOt;
        }

        public String TFq() {
            return this.TFq;
        }

        public String Vor() {
            return this.Vor;
        }

        public long ZRu() {
            return this.ZRu;
        }

        public String aT() {
            return this.aT;
        }

        public String mZ() {
            return this.mZ;
        }

        public long uR() {
            return this.uR;
        }

        public void NOt(long j10) {
            this.uR = j10;
        }

        public void ZRu(long j10) {
            this.ZRu = j10;
        }

        public void mZ(float f10) {
            this.Mm = f10;
        }

        public void uR(String str) {
            this.Vor = str;
        }

        public void NOt(String str) {
            this.TFq = str;
        }

        public void ZRu(float f10) {
            this.NOt = f10;
        }

        public void mZ(String str) {
            this.aT = str;
        }

        public void NOt(float f10) {
            this.Ht = f10;
        }

        public void ZRu(String str) {
            this.mZ = str;
        }

        public void ZRu(float[] fArr) {
            this.FA = fArr;
        }

        public static C0394ZRu ZRu(JSONObject jSONObject, com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
            if (jSONObject == null) {
                return null;
            }
            C0394ZRu c0394ZRu = new C0394ZRu();
            c0394ZRu.ZRu(jSONObject.optLong(x.h.f238399b));
            String strOptString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", strOptString)) {
                c0394ZRu.ZRu(-1.0f);
            } else {
                try {
                    c0394ZRu.ZRu(Float.parseFloat(strOptString));
                } catch (NumberFormatException unused) {
                    c0394ZRu.ZRu(0.0f);
                }
            }
            c0394ZRu.ZRu(jSONObject.optString("loopMode"));
            c0394ZRu.NOt(jSONObject.optString("type"));
            if (TextUtils.equals(c0394ZRu.TFq(), "ripple")) {
                c0394ZRu.mZ(jSONObject.optString("rippleColor"));
            }
            View viewVor = mZVar.Vor();
            Context context = viewVor != null ? viewVor.getContext() : null;
            if (TextUtils.equals(c0394ZRu.TFq(), "backgroundColor")) {
                String strZRu = com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObject.optString("valueTo"), mZVar.aT());
                int iZRu = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(jSONObject.optString("valueFrom"));
                int iZRu2 = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(strZRu);
                c0394ZRu.NOt(iZRu);
                c0394ZRu.mZ(iZRu2);
            } else if ((TextUtils.equals(c0394ZRu.TFq(), "translateX") || TextUtils.equals(c0394ZRu.TFq(), "translateY")) && context != null) {
                try {
                    float fZRu = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(context, (float) jSONObject.optDouble("valueFrom"));
                    float fZRu2 = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(context, (float) jSONObject.optDouble("valueTo"));
                    c0394ZRu.NOt(fZRu);
                    c0394ZRu.mZ(fZRu2);
                } catch (Exception unused2) {
                    Log.e(GlideExecutor.f139627g, "animation ");
                }
            } else {
                c0394ZRu.NOt((float) jSONObject.optDouble("valueFrom"));
                c0394ZRu.mZ((float) jSONObject.optDouble("valueTo"));
            }
            c0394ZRu.uR(jSONObject.optString("interpolator"));
            String strZRu2 = com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObject.optString("startDelay"), mZVar.aT());
            Log.d("TAG", "createAnimationModel: ");
            c0394ZRu.NOt(com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(strZRu2, 0L));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(a0.f114167g);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                float[] fArr = new float[jSONArrayOptJSONArray.length()];
                int i10 = 0;
                if ((TextUtils.equals(c0394ZRu.TFq(), "translateX") || TextUtils.equals(c0394ZRu.TFq(), "translateY")) && context != null) {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = com.bytedance.adsdk.ugeno.Mm.FA.ZRu(context, (float) ZRu.ZRu(jSONArrayOptJSONArray.optString(i10), mZVar.aT()));
                        i10++;
                    }
                } else {
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        fArr[i10] = (float) ZRu.ZRu(jSONArrayOptJSONArray.optString(i10), mZVar.aT());
                        i10++;
                    }
                }
                c0394ZRu.ZRu(fArr);
            }
            return c0394ZRu;
        }
    }

    public String Ht() {
        return this.Ht;
    }

    public float NOt() {
        return this.NOt;
    }

    public long TFq() {
        return this.TFq;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public List<C0394ZRu> mZ() {
        return this.mZ;
    }

    public long uR() {
        return this.uR;
    }

    public void NOt(long j10) {
        this.TFq = j10;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void NOt(String str) {
        this.Ht = str;
    }

    public void ZRu(float f10) {
        this.NOt = f10;
    }

    public void ZRu(List<C0394ZRu> list) {
        this.mZ = list;
    }

    public void ZRu(long j10) {
        this.uR = j10;
    }

    public static ZRu ZRu(String str, com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ZRu(new JSONObject(str), mZVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static ZRu ZRu(JSONObject jSONObject, com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        return ZRu(jSONObject, null, mZVar);
    }

    public static ZRu ZRu(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        if (jSONObject == null) {
            return null;
        }
        ZRu zRu = new ZRu();
        zRu.ZRu(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            zRu.ZRu(-1.0f);
        } else {
            try {
                zRu.ZRu(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                zRu.ZRu(0.0f);
            }
        }
        zRu.ZRu(jSONObject.optLong(x.h.f238399b, 0L));
        zRu.NOt(com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObject.optString("startDelay"), mZVar.aT()), 0L));
        zRu.NOt(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.Mm.NOt.ZRu(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0394ZRu.ZRu(jSONObjectOptJSONObject, mZVar));
            }
            zRu.ZRu(arrayList);
        }
        return zRu;
    }

    public static double ZRu(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(com.bytedance.adsdk.ugeno.mZ.NOt.ZRu((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
