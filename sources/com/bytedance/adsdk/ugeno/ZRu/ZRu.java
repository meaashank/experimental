package com.bytedance.adsdk.ugeno.ZRu;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu Ht;
    private NOt NOt;
    private int TFq;
    private com.bytedance.adsdk.ugeno.NOt.mZ ZRu;
    private ValueAnimator mZ;
    private Context uR;

    public ZRu(Context context, com.bytedance.adsdk.ugeno.NOt.mZ mZVar, NOt nOt) {
        this.ZRu = mZVar;
        this.NOt = nOt;
        this.uR = context;
    }

    public void NOt() {
        ValueAnimator valueAnimator = this.mZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void ZRu() {
        ValueAnimator valueAnimator = this.mZ;
        if (valueAnimator == null || this.TFq == -2) {
            return;
        }
        valueAnimator.start();
    }

    public ValueAnimator mZ() {
        String key;
        com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu mZVar;
        NOt nOt = this.NOt;
        if (nOt == null || this.ZRu == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> mapNOt = nOt.NOt();
        ArrayList arrayList = new ArrayList();
        if (mapNOt != null && !mapNOt.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : mapNOt.entrySet()) {
                if (entry != null) {
                    key = entry.getKey();
                    String strMZ = uR.ZRu(key).mZ();
                    strMZ.getClass();
                    switch (strMZ) {
                        case "int":
                            mZVar = new com.bytedance.adsdk.ugeno.ZRu.NOt.mZ(this.uR, this.ZRu, key, entry.getValue());
                            break;
                        case "float":
                            mZVar = new com.bytedance.adsdk.ugeno.ZRu.NOt.NOt(this.uR, this.ZRu, key, entry.getValue());
                            break;
                        case "point":
                            mZVar = new com.bytedance.adsdk.ugeno.ZRu.NOt.uR(this.uR, this.ZRu, key, entry.getValue());
                            break;
                        default:
                            mZVar = null;
                            break;
                    }
                    if (mZVar != null) {
                        arrayList.addAll(mZVar.TFq());
                    }
                }
            }
        }
        JSONObject jSONObjectZRu = this.NOt.ZRu();
        if (jSONObjectZRu != null) {
            com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu ZRu = ZRu.C0393ZRu.ZRu(this.ZRu, jSONObjectZRu);
            this.Ht = ZRu;
            if (ZRu != null) {
                arrayList.addAll(ZRu.mZ());
            }
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.ZRu.Vor(), (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.TFq = mZ.ZRu(this.NOt.uR());
        objectAnimatorOfPropertyValuesHolder.setDuration(this.NOt.mZ());
        int i10 = this.TFq;
        if (i10 != -2) {
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(i10);
        }
        objectAnimatorOfPropertyValuesHolder.setStartDelay(this.NOt.Ht());
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(mZ.ZRu(this.NOt.TFq()));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(mZ.NOt(this.NOt.Mm()));
        this.mZ = objectAnimatorOfPropertyValuesHolder;
        return objectAnimatorOfPropertyValuesHolder;
    }

    public void ZRu(Canvas canvas) {
        com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu zRu = this.Ht;
        if (zRu != null) {
            zRu.ZRu(canvas);
        }
    }

    public void ZRu(int i10, int i11) {
        com.bytedance.adsdk.ugeno.ZRu.ZRu.ZRu zRu = this.Ht;
        if (zRu != null) {
            zRu.ZRu(i10, i11);
        }
    }
}
