package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.view.menu.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends View {
    private List<Integer> FA;
    private int Ht;
    private boolean Mm;
    private int NOt;
    private float TFq;
    private List<Integer> Vor;
    private Paint ZH;
    private int ZRu;
    private Paint aT;
    private int edo;
    private float lp;
    private float mZ;
    private float sAl;
    private int uR;

    public uR(Context context) {
        this(context, null);
    }

    private void mZ() {
        Paint paint = new Paint();
        this.aT = paint;
        paint.setAntiAlias(true);
        this.aT.setStrokeWidth(this.edo);
        this.FA.add(255);
        this.Vor.add(0);
        Paint paint2 = new Paint();
        this.ZH = paint2;
        paint2.setAntiAlias(true);
        this.ZH.setColor(Color.parseColor("#0FFFFFFF"));
        this.ZH.setStyle(Paint.Style.FILL);
    }

    public void NOt() {
        this.Mm = false;
        this.Vor.clear();
        this.FA.clear();
        this.FA.add(255);
        this.Vor.add(0);
        invalidate();
    }

    public void ZRu() {
        this.Mm = true;
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.aT.setShader(new LinearGradient(this.lp, 0.0f, this.sAl, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            if (i10 >= this.FA.size()) {
                break;
            }
            Integer num = this.FA.get(i10);
            this.aT.setAlpha(num.intValue());
            Integer num2 = this.Vor.get(i10);
            if (this.mZ + num2.intValue() < this.TFq) {
                canvas.drawCircle(this.lp, this.sAl, this.mZ + num2.intValue(), this.aT);
            }
            if (num.intValue() > 0 && num2.intValue() < this.TFq) {
                this.FA.set(i10, Integer.valueOf(num.intValue() - this.Ht > 0 ? num.intValue() - (this.Ht * 3) : 1));
                this.Vor.set(i10, Integer.valueOf(num2.intValue() + this.Ht));
            }
            i10++;
        }
        if (((Integer) d.a(this.Vor, 1)).intValue() >= this.TFq / this.uR) {
            this.FA.add(255);
            this.Vor.add(0);
        }
        if (this.Vor.size() >= 3) {
            this.Vor.remove(0);
            this.FA.remove(0);
        }
        this.aT.setAlpha(255);
        this.aT.setColor(this.NOt);
        canvas.drawCircle(this.lp, this.sAl, this.mZ, this.ZH);
        if (this.Mm) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2.0f;
        this.lp = f10;
        this.sAl = i11 / 2.0f;
        float f11 = f10 - (this.edo / 2.0f);
        this.TFq = f11;
        this.mZ = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void setColor(int i10) {
        this.ZRu = i10;
    }

    public void setCoreColor(int i10) {
        this.NOt = i10;
    }

    public void setCoreRadius(int i10) {
        this.mZ = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.Ht = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.uR = i10;
    }

    public void setMaxWidth(int i10) {
        this.TFq = i10;
    }

    public uR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public uR(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.ZRu = -1;
        this.NOt = -65536;
        this.mZ = 18.0f;
        this.uR = 3;
        this.TFq = 50.0f;
        this.Ht = 2;
        this.Mm = false;
        this.FA = new ArrayList();
        this.Vor = new ArrayList();
        this.edo = 24;
        mZ();
    }
}
