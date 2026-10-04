package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lp extends View {
    private int FA;
    private int Ht;
    private int Mm;
    Rect NOt;
    private int TFq;
    private int[] Vor;
    private Paint ZH;
    Rect ZRu;
    private Bitmap aT;
    private LinearGradient edo;
    private Xfermode lp;
    private int mZ;
    private final List<ZRu> oK;
    private PorterDuff.Mode sAl;
    private int uR;

    public static class ZRu {
        private int NOt = 0;
        private final int ZRu;

        public ZRu(int i10) {
            this.ZRu = i10;
        }

        public void ZRu() {
            this.NOt += this.ZRu;
        }
    }

    public lp(Context context) {
        super(context);
        this.sAl = PorterDuff.Mode.DST_IN;
        this.oK = new ArrayList();
        ZRu();
    }

    private void ZRu() {
        this.mZ = com.bytedance.sdk.component.utils.om.uR(getContext(), "tt_splash_unlock_image_arrow");
        this.uR = Color.parseColor("#00ffffff");
        this.TFq = Color.parseColor("#ffffffff");
        int color = Color.parseColor("#00ffffff");
        this.Ht = color;
        this.Mm = 10;
        this.FA = 40;
        this.Vor = new int[]{this.uR, this.TFq, color};
        setLayerType(1, null);
        this.ZH = new Paint(1);
        this.aT = BitmapFactory.decodeResource(getResources(), this.mZ);
        this.lp = new PorterDuffXfermode(this.sAl);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(this.aT, this.ZRu, this.NOt, this.ZH);
        canvas.save();
        Iterator<ZRu> it = this.oK.iterator();
        while (it.hasNext()) {
            ZRu next = it.next();
            this.edo = new LinearGradient(next.NOt, 0.0f, next.NOt + this.FA, this.Mm, this.Vor, (float[]) null, Shader.TileMode.CLAMP);
            this.ZH.setColor(-1);
            this.ZH.setShader(this.edo);
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.ZH);
            this.ZH.setShader(null);
            next.ZRu();
            if (next.NOt > getWidth()) {
                it.remove();
            }
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.ZH.setXfermode(this.lp);
        canvas3.drawBitmap(this.aT, this.ZRu, this.NOt, this.ZH);
        this.ZH.setXfermode(null);
        canvas3.restore();
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.aT == null) {
            return;
        }
        this.ZRu = new Rect(0, 0, this.aT.getWidth(), this.aT.getHeight());
        this.NOt = new Rect(0, 0, getWidth(), getHeight());
    }

    public void ZRu(int i10) {
        this.oK.add(new ZRu(i10));
        postInvalidate();
    }
}
