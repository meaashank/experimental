package com.flask.colorpicker.slider;

import J4.f;
import K4.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import com.flask.colorpicker.ColorPickerView;

/* JADX INFO: loaded from: classes3.dex */
public class AlphaSlider extends AbsCustomSlider {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f150299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Paint f150300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint f150301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Paint f150302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint f150303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Paint f150304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f150305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Canvas f150306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorPickerView f150307t;

    public AlphaSlider(Context context) {
        super(context);
        this.f150300m = new d.b().f58415a;
        this.f150301n = new d.b().f58415a;
        this.f150302o = new d.b().f58415a;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(-1);
        bVar.h(PorterDuff.Mode.CLEAR);
        this.f150303p = bVar.f58415a;
        this.f150304q = new d.b().f58415a;
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    public void a() {
        super.a();
        this.f150300m.setShader(d.b(this.f150295h * 2));
        this.f150305r = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.f150306s = new Canvas(this.f150305r);
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    public void b(Canvas canvas) {
        int width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.drawRect(0.0f, 0.0f, width, height, this.f150300m);
        int iMax = Math.max(2, width / 256);
        int i10 = 0;
        while (i10 <= width) {
            float f10 = i10;
            this.f150301n.setColor(this.f150299l);
            this.f150301n.setAlpha(Math.round((f10 / (width - 1)) * 255.0f));
            i10 += iMax;
            float f11 = height;
            canvas.drawRect(f10, 0.0f, i10, f11, this.f150301n);
            height = f11;
        }
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    public void c(Canvas canvas, float f10, float f11) {
        this.f150302o.setColor(this.f150299l);
        this.f150302o.setAlpha(Math.round(this.f150296i * 255.0f));
        if (this.f150297j) {
            canvas.drawCircle(f10, f11, this.f150294g, this.f150303p);
        }
        if (this.f150296i >= 1.0f) {
            canvas.drawCircle(f10, f11, this.f150294g * 0.75f, this.f150302o);
            return;
        }
        Canvas canvas2 = this.f150306s;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas2.drawColor(0, mode);
        this.f150306s.drawCircle(f10, f11, (this.f150294g * 0.75f) + 4.0f, this.f150300m);
        this.f150306s.drawCircle(f10, f11, (this.f150294g * 0.75f) + 4.0f, this.f150302o);
        d.b bVar = new d.b();
        bVar.f58415a.setColor(-1);
        bVar.f58415a.setStyle(Paint.Style.STROKE);
        bVar.f58415a.setStrokeWidth(6.0f);
        bVar.h(mode);
        Paint paint = bVar.f58415a;
        this.f150304q = paint;
        this.f150306s.drawCircle(f10, f11, (paint.getStrokeWidth() / 2.0f) + (this.f150294g * 0.75f), this.f150304q);
        canvas.drawBitmap(this.f150305r, 0.0f, 0.0f, (Paint) null);
    }

    @Override // com.flask.colorpicker.slider.AbsCustomSlider
    public void f(float f10) {
        ColorPickerView colorPickerView = this.f150307t;
        if (colorPickerView != null) {
            colorPickerView.k(f10);
        }
    }

    public void j(int i10) {
        this.f150299l = i10;
        this.f150296i = f.d(i10);
        if (this.f150290c != null) {
            i();
            invalidate();
        }
    }

    public void k(ColorPickerView colorPickerView) {
        this.f150307t = colorPickerView;
    }

    public AlphaSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150300m = new d.b().f58415a;
        this.f150301n = new d.b().f58415a;
        this.f150302o = new d.b().f58415a;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(-1);
        bVar.h(PorterDuff.Mode.CLEAR);
        this.f150303p = bVar.f58415a;
        this.f150304q = new d.b().f58415a;
    }

    public AlphaSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f150300m = new d.b().f58415a;
        this.f150301n = new d.b().f58415a;
        this.f150302o = new d.b().f58415a;
        d.b bVar = new d.b();
        bVar.f58415a.setColor(-1);
        bVar.h(PorterDuff.Mode.CLEAR);
        this.f150303p = bVar.f58415a;
        this.f150304q = new d.b().f58415a;
    }
}
