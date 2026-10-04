package com.prism.hider.vault.calculator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public class CalculatorPadLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f168466b;

    public CalculatorPadLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int iRound = Math.round(((i12 - i10) - paddingLeft) - paddingRight) / this.f168466b;
        int iRound2 = Math.round(((i13 - i11) - paddingTop) - paddingBottom) / this.f168465a;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int i17 = marginLayoutParams.topMargin;
                int i18 = (i14 * iRound2) + paddingTop + i17;
                int i19 = ((i18 - i17) - marginLayoutParams.bottomMargin) + iRound2;
                int i20 = marginLayoutParams.leftMargin;
                int i21 = (i15 * iRound) + paddingLeft + i20;
                int i22 = ((i21 - i20) - marginLayoutParams.rightMargin) + iRound;
                int i23 = i22 - i21;
                int i24 = i19 - i18;
                if (i23 != childAt.getMeasuredWidth() || i24 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, 1073741824), View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                }
                childAt.layout(i21, i18, i22, i19);
                int i25 = i15 + 1;
                int i26 = this.f168466b;
                int i27 = ((i25 / i26) + i14) % this.f168465a;
                i15 = i25 % i26;
                i14 = i27;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public CalculatorPadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public CalculatorPadLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.rowCount, R.attr.columnCount}, i10, 0);
        this.f168465a = typedArrayObtainStyledAttributes.getInt(0, 1);
        this.f168466b = typedArrayObtainStyledAttributes.getInt(1, 1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
