package com.flask.colorpicker.slider;

import J4.f;
import K4.d;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import com.flask.colorpicker.ColorPickerView;

/* JADX INFO: loaded from: classes3.dex */
public class LightnessSlider extends AbsCustomSlider {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f150308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint f150309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint f150310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Paint f150311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorPickerView f150312p;

    public LightnessSlider(Context context) {
        super(context);
        this.f150309m = new d.b().f58415a;
        this.f150310n = new d.b().f58415a;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(-1);
        bVar.h(PorterDuff.Mode.CLEAR);
        this.f150311o = bVar.f58415a;
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    public void b(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float[] fArr = new float[3];
        Color.colorToHSV(this.f150308l, fArr);
        int iMax = Math.max(2, width / 256);
        int i10 = 0;
        while (i10 <= width) {
            float f10 = i10;
            fArr[2] = f10 / (width - 1);
            this.f150309m.setColor(Color.HSVToColor(fArr));
            i10 += iMax;
            canvas.drawRect(f10, 0.0f, i10, height, this.f150309m);
        }
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    public void c(Canvas canvas, float f10, float f11) {
        this.f150310n.setColor(f.c(this.f150308l, this.f150296i));
        if (this.f150297j) {
            canvas.drawCircle(f10, f11, this.f150294g, this.f150311o);
        }
        canvas.drawCircle(f10, f11, this.f150294g * 0.75f, this.f150310n);
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    public void f(float f10) {
        ColorPickerView colorPickerView = this.f150312p;
        if (colorPickerView != null) {
            colorPickerView.w(f10);
        }
    }

    public void j(int i10) {
        this.f150308l = i10;
        this.f150296i = f.f(i10);
        if (this.f150290c != null) {
            i();
            invalidate();
        }
    }

    public void k(ColorPickerView colorPickerView) {
        this.f150312p = colorPickerView;
    }

    public LightnessSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150309m = new d.b().f58415a;
        this.f150310n = new d.b().f58415a;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(-1);
        bVar.h(PorterDuff.Mode.CLEAR);
        this.f150311o = bVar.f58415a;
    }

    public LightnessSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f150309m = new d.b().f58415a;
        this.f150310n = new d.b().f58415a;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(-1);
        bVar.h(PorterDuff.Mode.CLEAR);
        this.f150311o = bVar.f58415a;
    }
}
