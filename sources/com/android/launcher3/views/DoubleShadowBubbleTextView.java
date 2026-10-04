package com.android.launcher3.views;

import G0.C1162y;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.R;

/* JADX INFO: loaded from: classes2.dex */
public class DoubleShadowBubbleTextView extends BubbleTextView {
    private final ShadowInfo mShadowInfo;

    public static class ShadowInfo {
        public final float ambientShadowBlur;
        public final int ambientShadowColor;
        public final float keyShadowBlur;
        public final int keyShadowColor;
        public final float keyShadowOffset;

        public ShadowInfo(Context context, AttributeSet attributeSet, int i10) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShadowInfo, i10, 0);
            this.ambientShadowBlur = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            this.ambientShadowColor = typedArrayObtainStyledAttributes.getColor(1, 0);
            this.keyShadowBlur = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
            this.keyShadowOffset = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
            this.keyShadowColor = typedArrayObtainStyledAttributes.getColor(3, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean skipDoubleShadow(TextView textView) {
            int iAlpha = Color.alpha(textView.getCurrentTextColor());
            int iAlpha2 = Color.alpha(this.keyShadowColor);
            int iAlpha3 = Color.alpha(this.ambientShadowColor);
            if (iAlpha == 0 || (iAlpha2 == 0 && iAlpha3 == 0)) {
                textView.getPaint().clearShadowLayer();
                return true;
            }
            if (iAlpha3 > 0) {
                textView.getPaint().setShadowLayer(this.ambientShadowBlur, 0.0f, 0.0f, C1162y.D(this.ambientShadowColor, iAlpha));
                return true;
            }
            if (iAlpha2 <= 0) {
                return false;
            }
            textView.getPaint().setShadowLayer(this.keyShadowBlur, 0.0f, this.keyShadowOffset, C1162y.D(this.keyShadowColor, iAlpha));
            return true;
        }
    }

    public DoubleShadowBubbleTextView(Context context) {
        this(context, null);
    }

    @Override // com.android.launcher3.BubbleTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mShadowInfo.skipDoubleShadow(this)) {
            super.onDraw(canvas);
            return;
        }
        int iAlpha = Color.alpha(getCurrentTextColor());
        TextPaint paint = getPaint();
        ShadowInfo shadowInfo = this.mShadowInfo;
        paint.setShadowLayer(shadowInfo.ambientShadowBlur, 0.0f, 0.0f, C1162y.D(shadowInfo.ambientShadowColor, iAlpha));
        drawWithoutBadge(canvas);
        canvas.save();
        canvas.clipRect(getScrollX(), getExtendedPaddingTop() + getScrollY(), getWidth() + getScrollX(), getHeight() + getScrollY());
        TextPaint paint2 = getPaint();
        ShadowInfo shadowInfo2 = this.mShadowInfo;
        paint2.setShadowLayer(shadowInfo2.keyShadowBlur, 0.0f, shadowInfo2.keyShadowOffset, C1162y.D(shadowInfo2.keyShadowColor, iAlpha));
        drawWithoutBadge(canvas);
        canvas.restore();
        drawBadgeIfNecessary(canvas);
    }

    public DoubleShadowBubbleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DoubleShadowBubbleTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ShadowInfo shadowInfo = new ShadowInfo(context, attributeSet, i10);
        this.mShadowInfo = shadowInfo;
        setShadowLayer(shadowInfo.ambientShadowBlur, 0.0f, 0.0f, shadowInfo.ambientShadowColor);
    }
}
