package com.bytedance.adsdk.ugeno.yoga;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FA extends ViewGroup implements com.bytedance.adsdk.ugeno.NOt.NOt, com.bytedance.adsdk.ugeno.ZRu.TFq {
    private final lp NOt;
    private final Map<View, lp> ZRu;
    private com.bytedance.adsdk.ugeno.mZ mZ;
    private com.bytedance.adsdk.ugeno.ZRu.Ht uR;

    public FA(Context context) {
        this(context, null, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.NOt
    public void NOt(int i10) {
        lp lpVar = this.NOt;
        if (lpVar != null) {
            NOt(lpVar, i10);
            requestLayout();
        }
    }

    public lp ZRu(View view) {
        return this.ZRu.get(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        lp lpVarZRu;
        this.NOt.ZRu((Vor) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.ZRu) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.ZRu.containsKey(view)) {
            return;
        }
        if (view instanceof FA) {
            lpVarZRu = ((FA) view).getYogaNode();
        } else {
            lpVarZRu = this.ZRu.containsKey(view) ? this.ZRu.get(view) : sAl.ZRu();
            lpVarZRu.ZRu(view);
            lpVarZRu.ZRu((Vor) new NOt());
        }
        ZRu((ZRu) view.getLayoutParams(), lpVarZRu, view);
        this.ZRu.put(view, lpVarZRu);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.NOt.ZRu()));
        } else {
            lp lpVar = this.NOt;
            lpVar.ZRu(lpVarZRu, lpVar.ZRu());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ZRu;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ZRu(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ZRu(layoutParams);
    }

    public float getBorderRadius() {
        return this.uR.ZRu();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.uR.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getRubIn() {
        return this.uR.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getShine() {
        return this.uR.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getStretch() {
        return this.uR.getStretch();
    }

    public lp getYogaNode() {
        return this.NOt;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.NOt
    public void mZ(View view, int i10) {
        uR(view, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.FA();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.ZRu(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.Ht();
        }
        if (!(getParent() instanceof FA)) {
            ZRu(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        ZRu(this.NOt, 0.0f, 0.0f);
        com.bytedance.adsdk.ugeno.mZ mZVar2 = this.mZ;
        if (mZVar2 != null) {
            mZVar2.ZRu(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof FA)) {
            ZRu(i10, i11);
        }
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            int[] iArrZRu = mZVar.ZRu(i10, i11);
            setMeasuredDimension(iArrZRu[0], iArrZRu[1]);
        } else {
            setMeasuredDimension(Math.round(this.NOt.Mm()), Math.round(this.NOt.FA()));
        }
        com.bytedance.adsdk.ugeno.mZ mZVar2 = this.mZ;
        if (mZVar2 != null) {
            mZVar2.TFq();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.NOt(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ZRu(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ZRu(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        ZRu(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        ZRu(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        ZRu(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            ZRu(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            ZRu(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.uR.ZRu(i10);
    }

    public void setBorderRadius(float f10) {
        this.uR.ZRu(f10);
    }

    public void setRipple(float f10) {
        com.bytedance.adsdk.ugeno.ZRu.Ht ht = this.uR;
        if (ht != null) {
            ht.NOt(f10);
        }
    }

    public void setRubIn(float f10) {
        com.bytedance.adsdk.ugeno.ZRu.Ht ht = this.uR;
        if (ht != null) {
            ht.TFq(f10);
        }
    }

    public void setShine(float f10) {
        com.bytedance.adsdk.ugeno.ZRu.Ht ht = this.uR;
        if (ht != null) {
            ht.mZ(f10);
        }
    }

    public void setStretch(float f10) {
        com.bytedance.adsdk.ugeno.ZRu.Ht ht = this.uR;
        if (ht != null) {
            ht.uR(f10);
        }
    }

    public void uR(View view, int i10) {
        int iZRu;
        view.setVisibility(i10);
        try {
            lp lpVar = this.ZRu.get(view);
            Object tag = view.getTag(151060224);
            if (i10 != 0) {
                if (i10 != 8 || (iZRu = this.NOt.ZRu(lpVar)) == -1) {
                    return;
                }
                this.NOt.NOt(iZRu);
                view.setTag(151060224, Integer.valueOf(iZRu));
                ZRu(this.NOt);
                return;
            }
            if (tag == null || this.NOt.ZRu(lpVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.NOt.ZRu()) {
                this.NOt.ZRu(this.ZRu.get(view), iIntValue);
            } else {
                this.NOt.ZRu(this.ZRu.get(view), this.NOt.ZRu());
            }
            ZRu(this.NOt);
        } catch (Throwable unused) {
        }
    }

    public FA(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.uR = new com.bytedance.adsdk.ugeno.ZRu.Ht(this);
        lp lpVarZRu = sAl.ZRu();
        this.NOt = lpVarZRu;
        this.ZRu = new HashMap();
        lpVarZRu.ZRu(this);
        lpVarZRu.ZRu((Vor) new NOt());
        ZRu((ZRu) generateDefaultLayoutParams(), lpVarZRu, this);
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.NOt
    public void ZRu(int i10) {
        lp lpVar = this.NOt;
        if (lpVar != null) {
            ZRu(lpVar, i10);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.NOt
    public void NOt(View view, int i10) {
        lp lpVarZRu;
        if (view == null || (lpVarZRu = ZRu(view)) == null) {
            return;
        }
        NOt(lpVarZRu, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.NOt
    public void ZRu(View view, int i10) {
        lp lpVarZRu;
        if (view == null || (lpVarZRu = ZRu(view)) == null) {
            return;
        }
        ZRu(lpVarZRu, i10);
        view.requestLayout();
    }

    private void NOt(lp lpVar, int i10) {
        if (i10 == -1) {
            lpVar.Mm(100.0f);
        } else if (i10 == -2) {
            lpVar.uR();
        } else {
            lpVar.Ht(i10);
        }
    }

    private void ZRu(lp lpVar, int i10) {
        if (i10 == -1) {
            lpVar.TFq(100.0f);
        } else if (i10 == -2) {
            lpVar.mZ();
        } else {
            lpVar.uR(i10);
        }
    }

    public static class NOt implements Vor {
        @Override // com.bytedance.adsdk.ugeno.yoga.Vor
        public long ZRu(lp lpVar, float f10, aT aTVar, float f11, aT aTVar2) {
            View view = (View) lpVar.Vor();
            if (view == null || (view instanceof FA)) {
                return ZH.ZRu(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, ZRu(aTVar)), View.MeasureSpec.makeMeasureSpec((int) f11, ZRu(aTVar2)));
            return ZH.ZRu(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int ZRu(aT aTVar) {
            if (aTVar == aT.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return aTVar == aT.EXACTLY ? 1073741824 : 0;
        }
    }

    public static class ZRu extends ViewGroup.LayoutParams {
        private float FA;
        private float Ht;
        private float Mm;
        SparseArray<String> NOt;
        private float TFq;
        private float Vor;
        private float WMI;
        private float ZH;
        SparseArray<Float> ZRu;
        private float aT;
        private float edo;
        private float lp;
        private float mZ;
        private float oK;
        private float sAl;
        private float uR;
        private float yBV;

        public ZRu(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof ZRu) {
                ZRu zRu = (ZRu) layoutParams;
                this.ZRu = zRu.ZRu.clone();
                this.NOt = zRu.NOt.clone();
                return;
            }
            this.ZRu = new SparseArray<>();
            this.NOt = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.ZRu.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.ZRu.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void FA(float f10) {
            this.edo = f10;
            this.ZRu.put(11, Float.valueOf(f10));
        }

        public void Ht(float f10) {
            this.lp = f10;
            this.ZRu.put(14, Float.valueOf(f10));
        }

        public void Mm(float f10) {
            this.sAl = f10;
            this.ZRu.put(10, Float.valueOf(f10));
        }

        public void NOt(float f10) {
            this.FA = f10;
            this.ZRu.put(6, Float.valueOf(f10));
        }

        public void TFq(float f10) {
            this.ZH = f10;
            this.ZRu.put(9, Float.valueOf(f10));
        }

        public void Vor(float f10) {
            this.oK = f10;
            this.ZRu.put(12, Float.valueOf(f10));
        }

        public void ZH(float f10) {
            this.mZ = f10;
            this.ZRu.put(17, Float.valueOf(f10));
        }

        public void ZRu(float f10) {
            this.Mm = f10;
            this.ZRu.put(5, Float.valueOf(f10));
        }

        public void aT(float f10) {
            this.yBV = f10;
            this.ZRu.put(13, Float.valueOf(f10));
        }

        public void edo(float f10) {
            this.Ht = f10;
            this.ZRu.put(20, Float.valueOf(f10));
        }

        public void lp(float f10) {
            this.uR = f10;
            this.ZRu.put(18, Float.valueOf(f10));
        }

        public void mZ(float f10) {
            this.Vor = f10;
            this.ZRu.put(7, Float.valueOf(f10));
        }

        public void oK(float f10) {
            this.WMI = f10;
            this.ZRu.put(25, Float.valueOf(f10));
        }

        public void sAl(float f10) {
            this.TFq = f10;
            this.ZRu.put(19, Float.valueOf(f10));
        }

        public void uR(float f10) {
            this.aT = f10;
            this.ZRu.put(8, Float.valueOf(f10));
        }

        public ZRu(int i10, int i11) {
            super(i10, i11);
            this.ZRu = new SparseArray<>();
            this.NOt = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.ZRu.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.ZRu.put(16, Float.valueOf(i11));
            }
        }
    }

    private void ZRu(lp lpVar) {
        if (lpVar.NOt() != null) {
            ZRu(lpVar.NOt());
        } else {
            lpVar.ZRu(Float.NaN, Float.NaN);
        }
    }

    private void ZRu(View view, boolean z10) {
        lp lpVar = this.ZRu.get(view);
        if (lpVar == null) {
            return;
        }
        lp lpVarNOt = lpVar.NOt();
        int i10 = 0;
        while (true) {
            if (i10 >= lpVarNOt.ZRu()) {
                break;
            }
            if (lpVarNOt.ZRu(i10).equals(lpVar)) {
                lpVarNOt.NOt(i10);
                break;
            }
            i10++;
        }
        lpVar.ZRu((Object) null);
        this.ZRu.remove(view);
        if (z10) {
            this.NOt.ZRu(Float.NaN, Float.NaN);
        }
    }

    private void ZRu(lp lpVar, float f10, float f11) {
        View view = (View) lpVar.Vor();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(lpVar.TFq() + f10);
            int iRound2 = Math.round(lpVar.Ht() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(lpVar.Mm()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(lpVar.FA()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iZRu = lpVar.ZRu();
        for (int i10 = 0; i10 < iZRu; i10++) {
            if (equals(view)) {
                ZRu(lpVar.ZRu(i10), f10, f11);
            } else if (!(view instanceof FA)) {
                ZRu(lpVar.ZRu(i10), lpVar.TFq() + f10, lpVar.Ht() + f11);
            }
        }
    }

    private void ZRu(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.NOt.Ht(size2);
        }
        if (mode == 1073741824) {
            this.NOt.uR(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.NOt.Vor(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.NOt.FA(size);
        }
        this.NOt.ZRu(Float.NaN, Float.NaN);
    }

    public static void ZRu(ZRu zRu, lp lpVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            lpVar.ZRu(uR.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                lpVar.NOt(TFq.LEFT, r0.left);
                lpVar.NOt(TFq.TOP, r0.top);
                lpVar.NOt(TFq.RIGHT, r0.right);
                lpVar.NOt(TFq.BOTTOM, r0.bottom);
            }
        }
        for (int i10 = 0; i10 < zRu.ZRu.size(); i10++) {
            int iKeyAt = zRu.ZRu.keyAt(i10);
            float fFloatValue = zRu.ZRu.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                lpVar.mZ(com.bytedance.adsdk.ugeno.yoga.NOt.ZRu(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                lpVar.ZRu(com.bytedance.adsdk.ugeno.yoga.NOt.ZRu(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                lpVar.NOt(com.bytedance.adsdk.ugeno.yoga.NOt.ZRu(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                lpVar.aT(fFloatValue);
            } else if (iKeyAt == 8) {
                lpVar.mZ(fFloatValue);
            } else if (iKeyAt == 1) {
                lpVar.ZRu(Ht.ZRu(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                lpVar.ZRu(fFloatValue);
            } else if (iKeyAt == 7) {
                lpVar.NOt(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    lpVar.Mm(100.0f);
                } else if (fFloatValue == -2.0f) {
                    lpVar.uR();
                } else {
                    lpVar.Ht(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                lpVar.ZRu(TFq.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                lpVar.ZRu(Mm.ZRu(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                lpVar.ZRu(TFq.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                lpVar.ZRu(TFq.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                lpVar.ZRu(TFq.BOTTOM, fFloatValue);
            } else if (iKeyAt == 22) {
                lpVar.NOt(TFq.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                lpVar.NOt(TFq.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                lpVar.NOt(TFq.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                lpVar.NOt(TFq.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                lpVar.mZ(TFq.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                lpVar.mZ(TFq.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                lpVar.mZ(TFq.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                lpVar.mZ(TFq.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                lpVar.ZRu(oK.ZRu(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    lpVar.TFq(100.0f);
                } else if (fFloatValue == -2.0f) {
                    lpVar.mZ();
                } else {
                    lpVar.uR(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                lpVar.ZRu(yBV.ZRu(Math.round(fFloatValue)));
            }
        }
    }

    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        this.mZ = mZVar;
    }
}
