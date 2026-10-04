package com.prism.hider.vault.calculator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.android.launcher3.IconCache;
import rb.C5548b;

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
                if (id2 == C5548b.h.f235255V1) {
                    button.setText(String.valueOf('0'));
                } else if (id2 == C5548b.h.f235264W1) {
                    button.setText(String.valueOf('1'));
                } else if (id2 == C5548b.h.f235273X1) {
                    button.setText(String.valueOf('2'));
                } else if (id2 == C5548b.h.f235282Y1) {
                    button.setText(String.valueOf('3'));
                } else if (id2 == C5548b.h.f235291Z1) {
                    button.setText(String.valueOf('4'));
                } else if (id2 == C5548b.h.f235301a2) {
                    button.setText(String.valueOf('5'));
                } else if (id2 == C5548b.h.f235311b2) {
                    button.setText(String.valueOf('6'));
                } else if (id2 == C5548b.h.f235321c2) {
                    button.setText(String.valueOf('7'));
                } else if (id2 == C5548b.h.f235331d2) {
                    button.setText(String.valueOf('8'));
                } else if (id2 == C5548b.h.f235341e2) {
                    button.setText(String.valueOf('9'));
                } else if (id2 == C5548b.h.f235138I1) {
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
