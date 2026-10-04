package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class edo extends com.bytedance.sdk.openadsdk.core.TFq.uR {
    private RectF NOt;
    private Paint ZRu;

    public edo(Context context) {
        super(context);
        ZRu();
    }

    private void ZRu() {
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.ZRu.setColor(Color.parseColor("#99333333"));
        this.ZRu.setAntiAlias(true);
        this.ZRu.setStrokeWidth(0.0f);
        this.NOt = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.NOt;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.ZRu);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.TFq.uR, android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.NOt.right == getMeasuredWidth() && this.NOt.bottom == getMeasuredHeight()) {
            return;
        }
        this.NOt.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }
}
