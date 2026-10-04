package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@com.bytedance.adsdk.ugeno.yoga.ZRu.ZRu
public abstract class YogaNodeJNIBase extends lp implements Cloneable {
    private Object Ht;
    private boolean Mm;
    private YogaNodeJNIBase NOt;
    private mZ TFq;
    protected long ZRu;

    @com.bytedance.adsdk.ugeno.yoga.ZRu.ZRu
    private float[] arr;

    @com.bytedance.adsdk.ugeno.yoga.ZRu.ZRu
    private int mLayoutDirection;
    private List<YogaNodeJNIBase> mZ;
    private Vor uR;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.Mm = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.ZRu = j10;
    }

    @com.bytedance.adsdk.ugeno.yoga.ZRu.ZRu
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.mZ;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.mZ.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.NOt = this;
        return yogaNodeJNIBase.ZRu;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void FA(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.ZRu, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void Ht(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.ZRu, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void Mm(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.ZRu, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void TFq(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.ZRu, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void Vor(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.ZRu, f10);
    }

    public boolean ZH() {
        return this.uR != null;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    /* JADX INFO: renamed from: aT, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase NOt() {
        return this.NOt;
    }

    @com.bytedance.adsdk.ugeno.yoga.ZRu.ZRu
    public final float baseline(float f10, float f11) {
        return this.TFq.ZRu(this, f10, f11);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    /* JADX INFO: renamed from: mZ, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase ZRu(int i10) {
        List<YogaNodeJNIBase> list = this.mZ;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    @com.bytedance.adsdk.ugeno.yoga.ZRu.ZRu
    public final long measure(float f10, int i10, float f11, int i11) {
        if (ZH()) {
            return this.uR.ZRu(this, f10, aT.ZRu(i10), f11, aT.ZRu(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    /* JADX INFO: renamed from: uR, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase NOt(int i10) {
        List<YogaNodeJNIBase> list = this.mZ;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
        yogaNodeJNIBaseRemove.NOt = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.ZRu, yogaNodeJNIBaseRemove.ZRu);
        return yogaNodeJNIBaseRemove;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public float FA() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public float Ht() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public float Mm() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public float TFq() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public Object Vor() {
        return this.Ht;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public int ZRu() {
        List<YogaNodeJNIBase> list = this.mZ;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void aT(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.ZRu, f10);
    }

    private void NOt(lp lpVar) {
        Vor();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(lp lpVar, int i10) {
        if (lpVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) lpVar;
            if (yogaNodeJNIBase.NOt == null) {
                if (this.mZ == null) {
                    this.mZ = new ArrayList(4);
                }
                this.mZ.add(i10, yogaNodeJNIBase);
                yogaNodeJNIBase.NOt = this;
                YogaNative.jni_YGNodeInsertChildJNI(this.ZRu, yogaNodeJNIBase.ZRu, i10);
                return;
            }
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void NOt(NOt nOt) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.ZRu, nOt.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void mZ(NOt nOt) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.ZRu, nOt.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void NOt(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.ZRu, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void mZ(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.ZRu, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void NOt(TFq tFq, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.ZRu, tFq.ZRu(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void mZ(TFq tFq, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.ZRu, tFq.ZRu(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void uR(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.ZRu, f10);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void mZ() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.ZRu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void uR() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.ZRu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public int ZRu(lp lpVar) {
        List<YogaNodeJNIBase> list = this.mZ;
        if (list == null) {
            return -1;
        }
        return list.indexOf(lpVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(float f10, float f11) {
        NOt((lp) null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.mZ;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.NOt(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].ZRu;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.ZRu, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(uR uRVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.ZRu, uRVar.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(Ht ht) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.ZRu, ht.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(Mm mm) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.ZRu, mm.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(NOt nOt) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.ZRu, nOt.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(oK oKVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.ZRu, oKVar.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(yBV ybv) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.ZRu, ybv.ZRu());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.ZRu, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(TFq tFq, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.ZRu, tFq.ZRu(), f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(Vor vor) {
        this.uR = vor;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.ZRu, vor != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.lp
    public void ZRu(Object obj) {
        this.Ht = obj;
    }
}
