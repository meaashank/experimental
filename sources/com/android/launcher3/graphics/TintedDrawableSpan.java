package com.android.launcher3.graphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

/* JADX INFO: loaded from: classes2.dex */
public class TintedDrawableSpan extends DynamicDrawableSpan {
    private final Drawable mDrawable;
    private int mOldTint;

    public TintedDrawableSpan(Context context, int i10) {
        super(0);
        Drawable drawable = context.getDrawable(i10);
        this.mDrawable = drawable;
        this.mOldTint = 0;
        drawable.setTint(0);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        int color = paint.getColor();
        if (this.mOldTint != color) {
            this.mOldTint = color;
            this.mDrawable.setTint(color);
        }
        super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        return this.mDrawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null) {
            fontMetricsInt = paint.getFontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        int i12 = fontMetricsInt2.bottom - fontMetricsInt2.top;
        this.mDrawable.setBounds(0, 0, i12, i12);
        return super.getSize(paint, charSequence, i10, i11, fontMetricsInt2);
    }
}
