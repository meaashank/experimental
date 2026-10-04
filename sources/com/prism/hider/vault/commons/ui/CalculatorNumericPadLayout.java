package com.prism.hider.vault.commons.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.android.launcher3.IconCache;
import com.prism.hider.vault.commons.ui.e;

/* JADX INFO: loaded from: classes6.dex */
public class CalculatorNumericPadLayout extends CalculatorPadLayout {
    public CalculatorNumericPadLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof Button) {
                Button button = (Button) childAt;
                int id2 = button.getId();
                if (id2 == e.h.f176623u1) {
                    button.setText(String.valueOf('0'));
                } else if (id2 == e.h.f176632v1) {
                    button.setText(String.valueOf('1'));
                } else if (id2 == e.h.f176641w1) {
                    button.setText(String.valueOf('2'));
                } else if (id2 == e.h.f176650x1) {
                    button.setText(String.valueOf('3'));
                } else if (id2 == e.h.f176659y1) {
                    button.setText(String.valueOf('4'));
                } else if (id2 == e.h.f176668z1) {
                    button.setText(String.valueOf('5'));
                } else if (id2 == e.h.f176235A1) {
                    button.setText(String.valueOf('6'));
                } else if (id2 == e.h.f176243B1) {
                    button.setText(String.valueOf('7'));
                } else if (id2 == e.h.f176251C1) {
                    button.setText(String.valueOf('8'));
                } else if (id2 == e.h.f176259D1) {
                    button.setText(String.valueOf('9'));
                } else if (id2 == e.h.f176515i1) {
                    button.setText(IconCache.EMPTY_CLASS_NAME);
                }
            }
        }
    }

    public CalculatorNumericPadLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public CalculatorNumericPadLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
