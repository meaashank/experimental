package com.android.launcher3.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class WorkFooterContainer extends RelativeLayout {
    public WorkFooterContainer(Context context) {
        super(context);
    }

    private void updateTranslation() {
        if (getParent() instanceof View) {
            View view = (View) getParent();
            setTranslationY(Math.max(0, (view.getHeight() - view.getPaddingBottom()) - getBottom()));
        }
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i10) {
        super.offsetTopAndBottom(i10);
        updateTranslation();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        updateTranslation();
    }

    public WorkFooterContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WorkFooterContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
