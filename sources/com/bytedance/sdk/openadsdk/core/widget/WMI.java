package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
public class WMI extends com.bytedance.sdk.openadsdk.core.TFq.uR {
    private BitmapShader Ht;
    private int NOt;
    private final RectF TFq;
    private final Paint ZRu;
    private int mZ;
    private final Matrix uR;

    public WMI(Context context) {
        this(context, null);
    }

    private Bitmap ZRu(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = drawable.getIntrinsicWidth() <= 0 ? getWidth() : drawable.getIntrinsicWidth();
        int height = drawable.getIntrinsicHeight() <= 0 ? getHeight() : drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmapZRu;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.Ht == null && (bitmapZRu = ZRu(drawable)) != null) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.Ht = new BitmapShader(bitmapZRu, tileMode, tileMode);
            float fMax = (bitmapZRu.getWidth() == getWidth() && bitmapZRu.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapZRu.getWidth(), (getHeight() * 1.0f) / bitmapZRu.getHeight());
            this.uR.setScale(fMax, fMax);
            this.Ht.setLocalMatrix(this.uR);
        }
        BitmapShader bitmapShader = this.Ht;
        if (bitmapShader == null) {
            super.onDraw(canvas);
        } else {
            this.ZRu.setShader(bitmapShader);
            canvas.drawRoundRect(this.TFq, this.NOt, this.mZ, this.ZRu);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.TFq.set(0.0f, 0.0f, i10, i11);
    }

    public void setXRound(int i10) {
        this.NOt = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.mZ = i10;
        postInvalidate();
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        this.Ht = null;
    }

    public WMI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WMI(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.NOt = 25;
        this.mZ = 25;
        this.TFq = new RectF();
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.uR = new Matrix();
    }
}
