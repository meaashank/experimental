package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends GradientDrawable {
    private final Paint NOt;
    protected Path ZRu;

    public NOt() {
        this.ZRu = new Path();
        Paint paint = new Paint(1);
        this.NOt = paint;
        paint.setColor(-1);
    }

    public void ZRu(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Path path = this.ZRu;
        if (path == null || path.isEmpty()) {
            ZRu(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), this.NOt, 31);
        ZRu(canvas);
        this.NOt.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.ZRu, this.NOt);
        this.NOt.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public void ZRu(int i10, int i11, int i12, int i13) {
        this.ZRu.addRect(i10, i11, i12, i13, Path.Direction.CW);
        invalidateSelf();
    }

    public NOt(GradientDrawable.Orientation orientation, @InterfaceC4337k int[] iArr) {
        super(orientation, iArr);
        this.ZRu = new Path();
        Paint paint = new Paint(1);
        this.NOt = paint;
        paint.setColor(-1);
    }
}
