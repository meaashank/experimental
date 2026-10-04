package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.inmobi.media.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3736t7 extends ViewGroup {
    public C3736t7(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p10) {
        kotlin.jvm.internal.G.p(p10, "p");
        return p10 instanceof C3722s7;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p10) {
        kotlin.jvm.internal.G.p(p10, "p");
        return new C3722s7(p10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.G.n(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C3722s7 c3722s7 = (C3722s7) layoutParams;
                int i15 = c3722s7.f153346a;
                childAt.layout(i15, c3722s7.f153347b, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + c3722s7.f153347b);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChildren(i10, i11);
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.G.n(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C3722s7 c3722s7 = (C3722s7) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + c3722s7.f153346a;
                int measuredHeight = childAt.getMeasuredHeight() + c3722s7.f153347b;
                iMax2 = Math.max(iMax2, measuredWidth);
                iMax = Math.max(iMax, measuredHeight);
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(iMax2, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(iMax, getSuggestedMinimumHeight()), i11));
    }
}
