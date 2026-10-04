package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class oK extends com.bytedance.sdk.openadsdk.core.TFq.FA {
    private RectF NOt;
    private Paint ZRu;
    private int mZ;

    public oK(Context context) {
        this(context, null);
    }

    private void ZRu() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ZRu.setColor(Color.parseColor("#99333333"));
        this.ZRu.setAntiAlias(true);
        this.ZRu.setStrokeWidth(0.0f);
        this.NOt = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.NOt;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.ZRu);
        canvas.translate((this.NOt.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.TFq.FA, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.NOt.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        int iMeasureText = (int) getPaint().measureText("00");
        this.mZ = iMeasureText;
        if (measuredWidth < iMeasureText) {
            measuredWidth = iMeasureText;
        }
        int i12 = ((measuredHeight / 2) * 2) + measuredWidth;
        setMeasuredDimension(i12, measuredHeight);
        this.NOt.set(0.0f, 0.0f, i12, measuredHeight);
    }

    public oK(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public oK(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mZ = 0;
        ZRu();
    }
}
