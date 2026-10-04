package com.bytedance.adsdk.ugeno.uR;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.uR.NOt;
import com.bytedance.adsdk.ugeno.uR.NOt.ZRu;
import com.bytedance.adsdk.ugeno.uR.mZ.ZRu;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TFq implements Mm {
    private com.bytedance.adsdk.ugeno.NOt.mZ NOt;
    private Map<String, com.bytedance.adsdk.ugeno.uR.mZ.ZRu> ZRu;
    private boolean mZ;

    public TFq(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, Map<String, com.bytedance.adsdk.ugeno.uR.mZ.ZRu> map) {
        this.NOt = mZVar;
        this.ZRu = map;
    }

    public void NOt() {
        com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu = ZRu("twist");
        if (ZRu != null) {
            ZRu.ZRu(this);
            ZRu.ZRu(new Object[0]);
        }
    }

    public void ZRu() {
        com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu = ZRu("shake");
        if (ZRu != null) {
            ZRu.ZRu(this);
            ZRu.ZRu(new Object[0]);
        }
    }

    public void mZ() {
        for (Map.Entry<String, com.bytedance.adsdk.ugeno.uR.mZ.ZRu> entry : this.ZRu.entrySet()) {
            if (entry != null) {
                com.bytedance.adsdk.ugeno.uR.mZ.ZRu value = entry.getValue();
                if (value instanceof com.bytedance.adsdk.ugeno.uR.mZ.NOt) {
                    value.ZRu(this);
                    value.ZRu(new Object[0]);
                }
            }
        }
    }

    public void uR() {
        com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu = ZRu("timer");
        if (ZRu != null) {
            ZRu.ZRu(this);
            ZRu.ZRu(new Object[0]);
        }
    }

    public boolean ZRu(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu = ZRu("tap");
        if (ZRu instanceof com.bytedance.adsdk.ugeno.uR.mZ.uR) {
            ZRu.ZRu(this);
            this.mZ = ZRu.ZRu(motionEvent);
        }
        if (this.mZ) {
            return true;
        }
        com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu2 = ZRu("slide");
        if (ZRu2 instanceof com.bytedance.adsdk.ugeno.uR.mZ.mZ) {
            ZRu2.ZRu(this);
            return ZRu2.ZRu(motionEvent);
        }
        return this.mZ;
    }

    private void ZRu(String str, List<NOt.ZRu> list) {
        com.bytedance.adsdk.ugeno.uR.NOt.ZRu ZRu;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (NOt.ZRu zRu : list) {
            if (zRu != null && (ZRu = ZRu.C0397ZRu.ZRu(this.NOt, str, zRu)) != null) {
                ZRu.ZRu();
            }
        }
    }

    private com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu(String str) {
        Map<String, com.bytedance.adsdk.ugeno.uR.mZ.ZRu> map = this.ZRu;
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.ZRu.get(str);
    }

    @Override // com.bytedance.adsdk.ugeno.uR.Mm
    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, List<NOt.ZRu> list) {
        ZRu(str, list);
    }

    public static TFq ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str) {
        com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu;
        if (mZVar != null && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return null;
                }
                HashMap map = new HashMap();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (ZRu = ZRu.C0398ZRu.ZRu(mZVar.Vor().getContext(), mZVar, jSONObjectOptJSONObject, mZVar.aT())) != null) {
                        map.put(ZRu.NOt(), ZRu);
                    }
                }
                return new TFq(mZVar, map);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
