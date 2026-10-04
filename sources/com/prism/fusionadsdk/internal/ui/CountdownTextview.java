package com.prism.fusionadsdk.internal.ui;

import J6.g;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes6.dex */
public class CountdownTextview extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f162346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f162347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f162348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f162349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f162350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f162351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RectF f162352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f162353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f162354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f162355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f162356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f162357m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f162358n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Runnable f162359o;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CountdownTextview.this.removeCallbacks(this);
            CountdownTextview countdownTextview = CountdownTextview.this;
            int i10 = countdownTextview.f162356l + 1;
            countdownTextview.f162356l = i10;
            long j10 = countdownTextview.f162355k;
            if (((long) i10) * j10 < countdownTextview.f162353i) {
                countdownTextview.postDelayed(countdownTextview.f162359o, j10);
                CountdownTextview.this.invalidate();
            } else {
                b bVar = countdownTextview.f162358n;
                if (bVar != null) {
                    bVar.onFinish();
                }
            }
        }
    }

    public interface b {
        void a(int i10);

        void onFinish();
    }

    public CountdownTextview(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p();
    }

    public final void e(Context context, AttributeSet attributeSet) {
        this.f162351g.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.o.f57433E7);
        int i10 = g.o.f57448F7;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f162347c = typedArrayObtainStyledAttributes.getColorStateList(i10);
        } else {
            this.f162347c = ColorStateList.valueOf(0);
        }
        this.f162348d = this.f162347c.getColorForState(getDrawableState(), 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public CountdownTextview f(b bVar) {
        this.f162358n = bVar;
        return this;
    }

    public CountdownTextview g(long j10) {
        this.f162353i = j10;
        return this;
    }

    public void h(@InterfaceC4337k int i10) {
        this.f162347c = ColorStateList.valueOf(i10);
        invalidate();
    }

    public CountdownTextview i(long j10) {
        this.f162354j = j10;
        this.f162355k = j10 / 50;
        return this;
    }

    public void j(@InterfaceC4337k int i10) {
        this.f162345a = i10;
        invalidate();
    }

    public void k(@InterfaceC4337k int i10) {
        this.f162346b = i10;
        invalidate();
    }

    public void l(@InterfaceC4337k int i10) {
        this.f162349e = i10;
        invalidate();
    }

    public void m(int i10) {
        this.f162350f = i10;
        invalidate();
    }

    public void n() {
        o();
        post(this.f162359o);
    }

    public void o() {
        removeCallbacks(this.f162359o);
        this.f162356l = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getDrawingRect(this.f162357m);
        float fWidth = (this.f162357m.height() > this.f162357m.width() ? this.f162357m.width() : this.f162357m.height()) / 2;
        int colorForState = this.f162347c.getColorForState(getDrawableState(), 0);
        this.f162351g.setStyle(Paint.Style.FILL);
        this.f162351g.setColor(colorForState);
        canvas.drawCircle(this.f162357m.centerX(), this.f162357m.centerY(), fWidth - this.f162346b, this.f162351g);
        Paint paint = this.f162351g;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f162351g.setStrokeWidth(this.f162346b);
        this.f162351g.setColor(this.f162345a);
        canvas.drawCircle(this.f162357m.centerX(), this.f162357m.centerY(), fWidth - (this.f162346b / 2), this.f162351g);
        TextPaint paint2 = getPaint();
        paint2.setColor(getCurrentTextColor());
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        float fCenterY = this.f162357m.centerY() - ((paint2.ascent() + paint2.descent()) / 2.0f);
        long j10 = this.f162355k;
        int i10 = this.f162356l;
        if ((((long) i10) * j10) % this.f162354j == 0) {
            canvas.drawText(String.valueOf(this.f162353i - (j10 * ((long) i10))), this.f162357m.centerX(), fCenterY, paint2);
        }
        this.f162351g.setColor(this.f162349e);
        this.f162351g.setStyle(style);
        this.f162351g.setStrokeWidth(this.f162350f);
        this.f162351g.setStrokeCap(Paint.Cap.ROUND);
        int i11 = this.f162350f + this.f162346b;
        RectF rectF = this.f162352h;
        Rect rect = this.f162357m;
        int i12 = i11 / 2;
        rectF.set(rect.left + i12, rect.top + i12, rect.right - i12, rect.bottom - i12);
        canvas.drawArc(this.f162352h, 0.0f, ((((long) this.f162356l) * this.f162355k) * 360) / this.f162353i, false, this.f162351g);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = (this.f162346b + this.f162350f) * 4;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= measuredHeight) {
            measuredWidth = measuredHeight;
        }
        int i13 = measuredWidth + i12;
        setMeasuredDimension(i13, i13);
    }

    public final void p() {
        int colorForState = this.f162347c.getColorForState(getDrawableState(), 0);
        if (this.f162348d != colorForState) {
            this.f162348d = colorForState;
            invalidate();
        }
    }

    public CountdownTextview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountdownTextview(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f162345a = -16777216;
        this.f162346b = 2;
        this.f162347c = ColorStateList.valueOf(0);
        this.f162349e = -16776961;
        this.f162350f = 8;
        this.f162351g = new Paint();
        this.f162352h = new RectF();
        this.f162353i = 4000L;
        this.f162354j = 1000L;
        this.f162355k = 20L;
        this.f162356l = 0;
        this.f162357m = new Rect();
        this.f162359o = new a();
        e(context, attributeSet);
    }

    @TargetApi(21)
    public CountdownTextview(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f162345a = -16777216;
        this.f162346b = 2;
        this.f162347c = ColorStateList.valueOf(0);
        this.f162349e = -16776961;
        this.f162350f = 8;
        this.f162351g = new Paint();
        this.f162352h = new RectF();
        this.f162353i = 4000L;
        this.f162354j = 1000L;
        this.f162355k = 20L;
        this.f162356l = 0;
        this.f162357m = new Rect();
        this.f162359o = new a();
        e(context, attributeSet);
    }
}
