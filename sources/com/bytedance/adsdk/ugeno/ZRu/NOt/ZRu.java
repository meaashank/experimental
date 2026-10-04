package com.bytedance.adsdk.ugeno.ZRu.NOt;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu {
    protected com.bytedance.adsdk.ugeno.NOt.mZ Mm;
    protected String NOt;
    protected Context ZRu;
    protected Map<Float, String> mZ;
    protected com.bytedance.adsdk.ugeno.ZRu.uR uR;
    protected List<PropertyValuesHolder> Ht = new ArrayList();
    protected List<Keyframe> TFq = new ArrayList();

    public ZRu(Context context, com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, Map<Float, String> map) {
        this.ZRu = context;
        this.NOt = str;
        this.mZ = map;
        this.uR = com.bytedance.adsdk.ugeno.ZRu.uR.ZRu(this.NOt);
        this.Mm = mZVar;
    }

    public abstract TypeEvaluator Ht();

    public abstract void NOt();

    public List<PropertyValuesHolder> TFq() {
        String strNOt = this.uR.NOt();
        uR();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strNOt, (Keyframe[]) this.TFq.toArray(new Keyframe[0]));
        TypeEvaluator typeEvaluatorHt = Ht();
        if (typeEvaluatorHt != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorHt);
        }
        this.Ht.add(propertyValuesHolderOfKeyframe);
        return this.Ht;
    }

    public abstract void ZRu(float f10, String str);

    public boolean ZRu() {
        Map<Float, String> map = this.mZ;
        if (map == null || map.size() <= 0) {
            return false;
        }
        return this.mZ.containsKey(Float.valueOf(0.0f));
    }

    public void mZ() {
        Map<Float, String> map = this.mZ;
        if (map == null || map.size() <= 0) {
            return;
        }
        Map<Float, String> map2 = this.mZ;
        if (map2 instanceof TreeMap) {
            Float f10 = (Float) ((TreeMap) map2).lastKey();
            if (f10.floatValue() != 100.0f) {
                ZRu(100.0f, this.mZ.get(f10));
            }
        }
    }

    public void uR() {
        Map<Float, String> map = this.mZ;
        if (map == null || map.size() <= 0) {
            return;
        }
        if (!ZRu()) {
            NOt();
        }
        for (Map.Entry<Float, String> entry : this.mZ.entrySet()) {
            if (entry != null) {
                ZRu(entry.getKey().floatValue() / 100.0f, entry.getValue());
            }
        }
        mZ();
    }
}
