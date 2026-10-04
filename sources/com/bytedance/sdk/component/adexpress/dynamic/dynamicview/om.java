package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class om extends Drawable {
    private int NOt;
    private Paint ZRu;
    private int mZ;
    private RectF uR;

    public om(int i10, int i11) {
        this.mZ = i10;
        this.NOt = i11;
        Paint paint = new Paint();
        this.ZRu = paint;
        paint.setColor(0);
        this.ZRu.setAntiAlias(true);
        this.ZRu.setShadowLayer(i11, 0.0f, 0.0f, -16777216);
        this.ZRu.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        RectF rectF = this.uR;
        int i10 = this.mZ;
        canvas.drawRoundRect(rectF, i10, i10, this.ZRu);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.ZRu.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        int i14 = this.NOt;
        this.uR = new RectF(i10 + i14, i11 + i14, i12 - i14, i13 - i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ZRu.setColorFilter(colorFilter);
    }
}
