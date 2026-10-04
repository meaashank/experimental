package com.bytedance.sdk.component.adexpress.Ht;

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
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class le extends ImageView {
    private int NOt;
    private Paint ZRu;
    private int mZ;
    private Matrix uR;

    public le(Context context) {
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
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        Bitmap bitmapZRu = ZRu(drawable);
        if (bitmapZRu == null) {
            super.onDraw(canvas);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmapZRu, tileMode, tileMode);
        float fMax = (bitmapZRu.getWidth() == getWidth() && bitmapZRu.getHeight() == getHeight()) ? 1.0f : Math.max((getWidth() * 1.0f) / bitmapZRu.getWidth(), (getHeight() * 1.0f) / bitmapZRu.getHeight());
        this.uR.setScale(fMax, fMax);
        bitmapShader.setLocalMatrix(this.uR);
        this.ZRu.setShader(bitmapShader);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.NOt, this.mZ, this.ZRu);
    }

    public void setXRound(int i10) {
        this.NOt = i10;
        postInvalidate();
    }

    public void setYRound(int i10) {
        this.mZ = i10;
        postInvalidate();
    }

    public le(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public le(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.NOt = 25;
        this.mZ = 25;
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setAntiAlias(true);
        this.ZRu.setFilterBitmap(true);
        this.uR = new Matrix();
    }
}
