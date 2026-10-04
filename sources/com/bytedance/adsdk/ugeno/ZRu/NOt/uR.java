package com.bytedance.adsdk.ugeno.ZRu.NOt;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.Mm.FA;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZRu {
    private List<Keyframe> FA;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ZRu.NOt.uR$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.ZRu.uR.values().length];
            ZRu = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.ZRu.uR.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public uR(Context context, com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, Map<Float, String> map) {
        super(context, mZVar, str, map);
        this.FA = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public TypeEvaluator Ht() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public void NOt() {
        Keyframe keyframeOfFloat;
        Keyframe keyframeOfFloat2;
        int i10 = AnonymousClass1.ZRu[this.uR.ordinal()];
        if (i10 == 1) {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.Mm.lp());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.Mm.sAl());
        } else if (i10 != 2) {
            keyframeOfFloat = null;
            keyframeOfFloat2 = null;
        } else {
            keyframeOfFloat = Keyframe.ofFloat(0.0f, this.Mm.edo());
            keyframeOfFloat2 = Keyframe.ofFloat(0.0f, this.Mm.oK());
        }
        if (keyframeOfFloat != null) {
            this.TFq.add(keyframeOfFloat);
        }
        if (keyframeOfFloat2 != null) {
            this.FA.add(keyframeOfFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public List<PropertyValuesHolder> TFq() {
        String strNOt = this.uR.NOt();
        uR();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(strNOt + "X", (Keyframe[]) this.TFq.toArray(new Keyframe[0]));
        this.Ht.add(propertyValuesHolderOfKeyframe);
        PropertyValuesHolder propertyValuesHolderOfKeyframe2 = PropertyValuesHolder.ofKeyframe(strNOt + "Y", (Keyframe[]) this.FA.toArray(new Keyframe[0]));
        this.Ht.add(propertyValuesHolderOfKeyframe2);
        TypeEvaluator typeEvaluatorHt = Ht();
        if (typeEvaluatorHt != null) {
            propertyValuesHolderOfKeyframe.setEvaluator(typeEvaluatorHt);
            propertyValuesHolderOfKeyframe2.setEvaluator(typeEvaluatorHt);
        }
        return this.Ht;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public void ZRu(float f10, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float fOptDouble = (float) jSONArray.optDouble(0);
            float fOptDouble2 = (float) jSONArray.optDouble(1);
            if (this.uR == com.bytedance.adsdk.ugeno.ZRu.uR.TRANSLATE) {
                fOptDouble = FA.ZRu(this.ZRu, fOptDouble);
                fOptDouble2 = FA.ZRu(this.ZRu, fOptDouble2);
            }
            this.TFq.add(Keyframe.ofFloat(f10, fOptDouble));
            this.FA.add(Keyframe.ofFloat(f10, fOptDouble2));
        } catch (JSONException unused) {
        }
    }
}
