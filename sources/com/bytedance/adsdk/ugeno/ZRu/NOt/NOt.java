package com.bytedance.adsdk.ugeno.ZRu.NOt;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.Mm.FA;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends ZRu {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ZRu.NOt.NOt$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[com.bytedance.adsdk.ugeno.ZRu.uR.values().length];
            ZRu = iArr;
            try {
                iArr[com.bytedance.adsdk.ugeno.ZRu.uR.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                ZRu[com.bytedance.adsdk.ugeno.ZRu.uR.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public NOt(Context context, com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, TreeMap<Float, String> treeMap) {
        super(context, mZVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public TypeEvaluator Ht() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public void NOt() {
        float fLp;
        switch (AnonymousClass1.ZRu[this.uR.ordinal()]) {
            case 1:
                fLp = this.Mm.lp();
                break;
            case 2:
                fLp = this.Mm.sAl();
                break;
            case 3:
                fLp = this.Mm.edo();
                break;
            case 4:
                fLp = this.Mm.oK();
                break;
            case 5:
                fLp = this.Mm.yBV();
                break;
            case 6:
                fLp = this.Mm.WMI();
                break;
            case 7:
                fLp = this.Mm.qF();
                break;
            case 8:
                fLp = this.Mm.om();
                break;
            case 9:
                fLp = this.Mm.OCA();
                break;
            default:
                fLp = 0.0f;
                break;
        }
        this.TFq.add(Keyframe.ofFloat(0.0f, fLp));
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.NOt.ZRu
    public void ZRu(float f10, String str) {
        this.TFq.add(Keyframe.ofFloat(f10, (this.NOt.startsWith(com.bytedance.adsdk.ugeno.ZRu.uR.TRANSLATE.ZRu()) || this.uR == com.bytedance.adsdk.ugeno.ZRu.uR.BORDER_RADIUS) ? FA.ZRu(this.ZRu, com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str, 0.0f)) : com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str, 0.0f)));
    }
}
