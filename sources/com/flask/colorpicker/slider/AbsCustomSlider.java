package com.flask.colorpicker.slider;

import M4.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import com.flask.colorpicker.a;
import e.InterfaceC4342p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbsCustomSlider extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f150288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Canvas f150289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f150290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Canvas f150291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f150292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f150293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f150294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f150295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f150296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f150297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f150298k;

    public AbsCustomSlider(Context context) {
        super(context);
        this.f150294g = 20;
        this.f150295h = 5;
        this.f150296i = 1.0f;
        this.f150297j = false;
        this.f150298k = false;
        e(context, null);
    }

    public void a() {
        int width;
        int height;
        if (this.f150298k) {
            width = getHeight();
            height = getWidth();
        } else {
            width = getWidth();
            height = getHeight();
        }
        int iMax = Math.max(width - (this.f150293f * 2), 1);
        int i10 = this.f150295h;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f150290c = Bitmap.createBitmap(iMax, i10, config);
        this.f150291d = new Canvas(this.f150290c);
        Bitmap bitmap = this.f150288a;
        if (bitmap != null && bitmap.getWidth() == width && this.f150288a.getHeight() == height) {
            return;
        }
        Bitmap bitmap2 = this.f150288a;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.f150288a = Bitmap.createBitmap(width, height, config);
        this.f150289b = new Canvas(this.f150288a);
    }

    public abstract void b(Canvas canvas);

    public abstract void c(Canvas canvas, float f10, float f11);

    public int d(@InterfaceC4342p int i10) {
        return getResources().getDimensionPixelSize(i10);
    }

    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.m.f150028a, 0, 0);
        try {
            this.f150298k = typedArrayObtainStyledAttributes.getBoolean(a.m.f150038b, this.f150298k);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public abstract void f(float f10);

    public void g(M4.a aVar) {
        this.f150292e = aVar;
    }

    public void h(boolean z10) {
        this.f150297j = z10;
    }

    public void i() {
        this.f150294g = d(a.e.f149010M0);
        this.f150295h = d(a.e.f149008L0);
        this.f150293f = this.f150294g;
        if (this.f150290c == null) {
            a();
        }
        b(this.f150291d);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int height;
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.f150298k) {
            width = getHeight();
            height = getWidth();
            canvas.rotate(-90.0f);
            canvas.translate(-width, 0.0f);
        } else {
            width = getWidth();
            height = getHeight();
        }
        if (this.f150290c == null || (canvas2 = this.f150289b) == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        this.f150289b.drawBitmap(this.f150290c, this.f150293f, (height - r4.getHeight()) / 2, (Paint) null);
        c(this.f150289b, (this.f150296i * (width - (r3 * 2))) + this.f150294g, height / 2.0f);
        canvas.drawBitmap(this.f150288a, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != 0) {
            i10 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i10) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 != 0) {
            i11 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i11) : 0;
        }
        setMeasuredDimension(i10, i11);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L1f
            goto L63
        Ld:
            float r4 = r3.f150296i
            r3.f(r4)
            M4.a r4 = r3.f150292e
            if (r4 == 0) goto L1b
            float r0 = r3.f150296i
            r4.a(r0)
        L1b:
            r3.invalidate()
            goto L63
        L1f:
            android.graphics.Bitmap r0 = r3.f150290c
            if (r0 == 0) goto L63
            boolean r0 = r3.f150298k
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L3e
            float r4 = r4.getY()
            int r0 = r3.f150293f
            float r0 = (float) r0
            float r4 = r4 - r0
            android.graphics.Bitmap r0 = r3.f150290c
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = r2 - r4
            r3.f150296i = r4
            goto L50
        L3e:
            float r4 = r4.getX()
            int r0 = r3.f150293f
            float r0 = (float) r0
            float r4 = r4 - r0
            android.graphics.Bitmap r0 = r3.f150290c
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            r3.f150296i = r4
        L50:
            float r4 = r3.f150296i
            float r4 = java.lang.Math.min(r4, r2)
            r0 = 0
            float r4 = java.lang.Math.max(r0, r4)
            r3.f150296i = r4
            r3.f(r4)
            r3.invalidate()
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flask.colorpicker.slider.AbsCustomSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public AbsCustomSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150294g = 20;
        this.f150295h = 5;
        this.f150296i = 1.0f;
        this.f150297j = false;
        this.f150298k = false;
        e(context, attributeSet);
    }

    public AbsCustomSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f150294g = 20;
        this.f150295h = 5;
        this.f150296i = 1.0f;
        this.f150297j = false;
        this.f150298k = false;
        e(context, attributeSet);
    }
}
