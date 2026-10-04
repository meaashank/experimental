package com.gaia.ngallery.ui.widget.floatingbutton;

import N4.l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import e.InterfaceC4339m;
import e.InterfaceC4346u;

/* JADX INFO: loaded from: classes3.dex */
public class AddFloatingActionButton extends FloatingActionButton {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f150456o;

    public class a extends Shape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f150457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f150458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f150459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f150460d;

        public a(float f10, float f11, float f12, float f13) {
            this.f150457a = f10;
            this.f150458b = f11;
            this.f150459c = f12;
            this.f150460d = f13;
        }

        @Override // android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float f10 = this.f150457a;
            float f11 = this.f150458b;
            float f12 = this.f150459c;
            canvas.drawRect(f10, f11 - f12, this.f150460d - f10, f11 + f12, paint);
            float f13 = this.f150458b;
            float f14 = this.f150459c;
            float f15 = this.f150457a;
            canvas.drawRect(f13 - f14, f15, f13 + f14, this.f150460d - f15, paint);
        }
    }

    public AddFloatingActionButton(Context context) {
        this(context, null);
    }

    @Override // com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionButton
    public void C(@InterfaceC4346u int i10) {
        throw new UnsupportedOperationException("Use FloatingActionButton if you want to use custom icon");
    }

    public int K() {
        return this.f150456o;
    }

    public void L(int i10) {
        if (this.f150456o != i10) {
            this.f150456o = i10;
            H();
        }
    }

    public void M(@InterfaceC4339m int i10) {
        L(g(i10));
    }

    @Override // com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionButton
    public Drawable l() {
        float fK = k(l.f.f61127a2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new a((fK - k(l.f.f61172d2)) / 2.0f, fK / 2.0f, k(l.f.f61187e2) / 2.0f, fK));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f150456o);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }

    @Override // com.gaia.ngallery.ui.widget.floatingbutton.FloatingActionButton
    public void q(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.r.f64336Z, 0, 0);
        this.f150456o = typedArrayObtainStyledAttributes.getColor(l.r.f64351a0, g(R.color.white));
        typedArrayObtainStyledAttributes.recycle();
        super.q(context, attributeSet);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
