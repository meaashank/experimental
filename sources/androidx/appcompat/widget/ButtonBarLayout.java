package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f85925d = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85928c;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f85928c = -1;
        int[] iArr = C4426a.m.f202092q3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C2507z0.E1(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f85926a = typedArrayObtainStyledAttributes.getBoolean(C4426a.m.f202100r3, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            d(this.f85926a);
        }
    }

    public final int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean b() {
        return this.f85927b;
    }

    public void c(boolean z10) {
        if (this.f85926a != z10) {
            this.f85926a = z10;
            if (!z10 && this.f85927b) {
                d(false);
            }
            requestLayout();
        }
    }

    public final void d(boolean z10) {
        if (this.f85927b != z10) {
            if (!z10 || this.f85926a) {
                this.f85927b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(C4426a.g.f201293i0);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f85926a) {
            if (size > this.f85928c && this.f85927b) {
                d(false);
            }
            this.f85928c = size;
        }
        if (this.f85927b || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f85926a && !this.f85927b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            d(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f85927b) {
                int iA2 = a(iA + 1);
                paddingBottom = iA2 >= 0 ? getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        if (C2507z0.h0(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }
}
