package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.TFq.uR;
import com.bytedance.sdk.openadsdk.utils.Cox;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes3.dex */
public class NiceImageView extends uR {
    private int FA;
    private int Ht;
    private int Mm;
    private boolean NOt;
    private RectF OCA;
    private int TFq;
    private int Vor;
    private float WMI;
    private int ZH;
    private final Context ZRu;
    private final Path Zf;
    private int aT;
    private final Xfermode edo;
    private int lp;
    private boolean mZ;
    private int oK;
    private final float[] om;
    private final float[] qF;
    private Path ru;
    private int sAl;
    private final RectF to;
    private int uR;
    private final Paint xY;
    private int yBV;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void NOt() {
        if (!this.NOt) {
            this.OCA.set(0.0f, 0.0f, this.oK, this.yBV);
            if (this.mZ) {
                this.OCA = this.to;
                return;
            }
            return;
        }
        float fMin = Math.min(this.oK, this.yBV) / 2.0f;
        this.WMI = fMin;
        RectF rectF = this.OCA;
        int i10 = this.oK;
        int i11 = this.yBV;
        rectF.set((i10 / 2.0f) - fMin, (i11 / 2.0f) - fMin, (i10 / 2.0f) + fMin, (i11 / 2.0f) + fMin);
    }

    private void ZRu(Canvas canvas) {
        if (!this.NOt) {
            int i10 = this.uR;
            if (i10 > 0) {
                ZRu(canvas, i10, this.TFq, this.to, this.qF);
                return;
            }
            return;
        }
        int i11 = this.uR;
        if (i11 > 0) {
            ZRu(canvas, i11, this.TFq, this.WMI - (i11 / 2.0f));
        }
        int i12 = this.Ht;
        if (i12 > 0) {
            ZRu(canvas, i12, this.Mm, (this.WMI - this.uR) - (i12 / 2.0f));
        }
    }

    private void mZ() {
        if (this.NOt) {
            return;
        }
        int i10 = 0;
        if (this.FA <= 0) {
            float[] fArr = this.qF;
            int i11 = this.Vor;
            float f10 = i11;
            fArr[1] = f10;
            fArr[0] = f10;
            int i12 = this.aT;
            float f11 = i12;
            fArr[3] = f11;
            fArr[2] = f11;
            int i13 = this.lp;
            float f12 = i13;
            fArr[5] = f12;
            fArr[4] = f12;
            int i14 = this.ZH;
            float f13 = i14;
            fArr[7] = f13;
            fArr[6] = f13;
            float[] fArr2 = this.om;
            int i15 = this.uR;
            float f14 = i11 - (i15 / 2.0f);
            fArr2[1] = f14;
            fArr2[0] = f14;
            float f15 = i12 - (i15 / 2.0f);
            fArr2[3] = f15;
            fArr2[2] = f15;
            float f16 = i13 - (i15 / 2.0f);
            fArr2[5] = f16;
            fArr2[4] = f16;
            float f17 = i14 - (i15 / 2.0f);
            fArr2[7] = f17;
            fArr2[6] = f17;
            return;
        }
        while (true) {
            float[] fArr3 = this.qF;
            if (i10 >= fArr3.length) {
                return;
            }
            int i16 = this.FA;
            fArr3[i10] = i16;
            this.om[i10] = i16 - (this.uR / 2.0f);
            i10++;
        }
    }

    private void uR() {
        if (this.NOt) {
            return;
        }
        this.Ht = 0;
    }

    public void isCircle(boolean z10) {
        this.NOt = z10;
        uR();
        NOt();
        invalidate();
    }

    public void isCoverSrc(boolean z10) {
        this.mZ = z10;
        NOt();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.OCA, null, 31);
        if (!this.mZ) {
            int i10 = this.oK;
            int i11 = this.uR;
            int i12 = this.Ht;
            int i13 = this.yBV;
            canvas.scale((((i10 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i10, (((i13 - (i11 * 2)) - (i12 * 2)) * 1.0f) / i13, i10 / 2.0f, i13 / 2.0f);
        }
        super.onDraw(canvas);
        this.xY.reset();
        this.Zf.reset();
        if (this.NOt) {
            this.Zf.addCircle(this.oK / 2.0f, this.yBV / 2.0f, this.WMI, Path.Direction.CCW);
        } else {
            this.Zf.addRoundRect(this.OCA, this.om, Path.Direction.CCW);
        }
        this.xY.setAntiAlias(true);
        this.xY.setStyle(Paint.Style.FILL);
        this.xY.setXfermode(this.edo);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.Zf, this.xY);
        } else {
            this.ru.addRect(this.OCA, Path.Direction.CCW);
            this.ru.op(this.Zf, Path.Op.DIFFERENCE);
            canvas.drawPath(this.ru, this.xY);
        }
        this.xY.setXfermode(null);
        int i14 = this.sAl;
        if (i14 != 0) {
            this.xY.setColor(i14);
            canvas.drawPath(this.Zf, this.xY);
        }
        canvas.restore();
        ZRu(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.oK = i10;
        this.yBV = i11;
        ZRu();
        NOt();
    }

    public void setBorderColor(@InterfaceC4337k int i10) {
        this.TFq = i10;
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.uR = Cox.mZ(this.ZRu, i10);
        ZRu(false);
    }

    public void setCornerBottomLeftRadius(int i10) {
        this.ZH = Cox.mZ(this.ZRu, i10);
        ZRu(true);
    }

    public void setCornerBottomRightRadius(int i10) {
        this.lp = Cox.mZ(this.ZRu, i10);
        ZRu(true);
    }

    public void setCornerRadius(int i10) {
        this.FA = Cox.mZ(this.ZRu, i10);
        ZRu(false);
    }

    public void setCornerTopLeftRadius(int i10) {
        this.Vor = Cox.mZ(this.ZRu, i10);
        ZRu(true);
    }

    public void setCornerTopRightRadius(int i10) {
        this.aT = Cox.mZ(this.ZRu, i10);
        ZRu(true);
    }

    public void setInnerBorderColor(@InterfaceC4337k int i10) {
        this.Mm = i10;
        invalidate();
    }

    public void setInnerBorderWidth(int i10) {
        this.Ht = Cox.mZ(this.ZRu, i10);
        uR();
        invalidate();
    }

    public void setMaskColor(@InterfaceC4337k int i10) {
        this.sAl = i10;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.TFq = -1;
        this.Mm = -1;
        this.ZRu = context;
        this.FA = Cox.mZ(context, 10.0f);
        this.qF = new float[8];
        this.om = new float[8];
        this.to = new RectF();
        this.OCA = new RectF();
        this.xY = new Paint();
        this.Zf = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.edo = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.edo = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.ru = new Path();
        }
        mZ();
        uR();
    }

    private void ZRu(Canvas canvas, int i10, int i11, float f10) {
        ZRu(i10, i11);
        this.Zf.addCircle(this.oK / 2.0f, this.yBV / 2.0f, f10, Path.Direction.CCW);
        canvas.drawPath(this.Zf, this.xY);
    }

    private void ZRu(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        ZRu(i10, i11);
        this.Zf.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.Zf, this.xY);
    }

    private void ZRu(int i10, int i11) {
        this.Zf.reset();
        this.xY.setStrokeWidth(i10);
        this.xY.setColor(i11);
        this.xY.setStyle(Paint.Style.STROKE);
    }

    private void ZRu() {
        if (this.NOt) {
            return;
        }
        RectF rectF = this.to;
        int i10 = this.uR;
        rectF.set(i10 / 2.0f, i10 / 2.0f, this.oK - (i10 / 2.0f), this.yBV - (i10 / 2.0f));
    }

    private void ZRu(boolean z10) {
        if (z10) {
            this.FA = 0;
        }
        mZ();
        ZRu();
        invalidate();
    }
}
