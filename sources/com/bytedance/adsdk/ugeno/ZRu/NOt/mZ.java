package com.bytedance.adsdk.ugeno.ZRu.NOt;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends ZRu {
    public mZ(Context context, com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, TreeMap<Float, String> treeMap) {
        super(context, mZVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public TypeEvaluator Ht() {
        return this.uR == com.bytedance.adsdk.ugeno.ZRu.uR.BACKGROUND_COLOR ? new ArgbEvaluator() : new IntEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public void NOt() {
        if (this.uR == com.bytedance.adsdk.ugeno.ZRu.uR.BACKGROUND_COLOR) {
            this.TFq.add(Keyframe.ofInt(0.0f, this.Mm.gI()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public void ZRu(float f10, String str) {
        this.TFq.add(this.uR == com.bytedance.adsdk.ugeno.ZRu.uR.BACKGROUND_COLOR ? Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str)) : Keyframe.ofInt(f10, com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str, 0)));
    }
}
