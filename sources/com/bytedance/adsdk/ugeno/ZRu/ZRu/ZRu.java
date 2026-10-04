package com.bytedance.adsdk.ugeno.ZRu.ZRu;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu {
    protected com.bytedance.adsdk.ugeno.NOt.mZ NOt;
    protected JSONObject ZRu;
    private String mZ;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0393ZRu {
        public static ZRu ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject) {
            if (mZVar == null || jSONObject == null) {
                return null;
            }
            String strOptString = jSONObject.optString("type");
            strOptString.getClass();
            switch (strOptString) {
                case "stretch":
                    return new TFq(mZVar, jSONObject);
                case "ripple":
                    return new NOt(mZVar, jSONObject);
                case "rub_in":
                    return new mZ(mZVar, jSONObject);
                case "shine":
                    return new uR(mZVar, jSONObject);
                default:
                    return null;
            }
        }
    }

    public ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject) {
        this.ZRu = jSONObject;
        this.NOt = mZVar;
        ZRu();
    }

    public abstract void NOt();

    public void ZRu() {
        this.mZ = this.ZRu.optString("type");
        NOt();
    }

    public abstract void ZRu(int i10, int i11);

    public abstract void ZRu(Canvas canvas);

    public abstract List<PropertyValuesHolder> mZ();

    public String uR() {
        return this.mZ;
    }
}
