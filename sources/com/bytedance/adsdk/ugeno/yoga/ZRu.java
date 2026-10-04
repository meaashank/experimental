package com.bytedance.adsdk.ugeno.yoga;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.FA;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof ZRu) {
            throw null;
        }
        lp lpVarZRu = sAl.ZRu();
        FA.ZRu(new FA.ZRu(layoutParams), lpVarZRu, view);
        lpVarZRu.ZRu(view);
        lpVarZRu.ZRu((Vor) new FA.NOt());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof FA.ZRu;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new FA.ZRu(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FA.ZRu(layoutParams);
    }

    public lp getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
