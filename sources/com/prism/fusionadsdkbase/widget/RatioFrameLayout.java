package com.prism.fusionadsdkbase.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.prism.fusionadsdkbase.i;

/* JADX INFO: loaded from: classes6.dex */
public class RatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f164184b = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f164185a;

    public RatioFrameLayout(Context context) {
        this(context, null);
    }

    public static boolean a(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.001f;
    }

    public void b(float f10) {
        this.f164185a = f10;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i11) - getPaddingTop()) - getPaddingBottom();
        if (mode == 1073741824 && mode2 != 1073741824 && !a(this.f164185a, 0.0f)) {
            i11 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + ((int) ((size / this.f164185a) + 0.5f)), 1073741824);
        } else if (mode != 1073741824 && mode2 == 1073741824 && !a(this.f164185a, 0.0f)) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) ((size2 * this.f164185a) + 0.5f)), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f164185a = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.n.f163641B6);
        this.f164185a = typedArrayObtainStyledAttributes.getFloat(i.n.f163661D6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
