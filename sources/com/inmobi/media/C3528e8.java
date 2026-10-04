package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3528e8 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f152851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Canvas f152852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f152853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RectF f152854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f152855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f152856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f152857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f152858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f152859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f152860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f152861k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f152862l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f152863m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ValueAnimator f152864n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC3514d8 f152865o;

    public C3528e8(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-723724);
        this.f152857g = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        this.f152861k = paint2;
        this.f152855e = new Rect();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-16777216);
        this.f152858h = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(0);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f152859i = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setAntiAlias(true);
        paint5.setColor(-16777216);
        this.f152860j = paint5;
    }

    public final void a() {
        InterfaceC3514d8 interfaceC3514d8 = this.f152865o;
        if (interfaceC3514d8 != null) {
            M7 m72 = (M7) interfaceC3514d8;
            H7 h72 = m72.f152228a.f152319p;
            if (h72 != null) {
                C3486b8 timerAsset = m72.f152229b;
                kotlin.jvm.internal.G.p(timerAsset, "timerAsset");
                if (timerAsset.f153153j == 1) {
                    h72.f152029b.a();
                }
            }
        }
        ValueAnimator valueAnimator = this.f152864n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f152864n = null;
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f152864n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f152863m = valueAnimator.getCurrentPlayTime();
        valueAnimator.cancel();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f152864n;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.setCurrentPlayTime(this.f152863m);
        valueAnimator.start();
    }

    public final void d() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f152856f));
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C3500c8(this));
        this.f152864n = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.f152864n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.setCurrentPlayTime(this.f152856f * ((long) 1000));
        this.f152862l = 360 * 1.0f;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        kotlin.jvm.internal.G.p(canvas, "canvas");
        Canvas canvas4 = this.f152852b;
        if (canvas4 != null) {
            canvas4.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int iMin = Math.min(width, height);
        C3774w3 c3774w3 = AbstractC3760v3.f153433a;
        int iB = (int) (AbstractC3760v3.b() * ((int) (getWidth() * 7.0f * 0.007f)));
        float f10 = width;
        float f11 = height;
        canvas.drawCircle(f10, f11, iMin, this.f152857g);
        canvas.drawCircle(f10, f11, iMin - iB, this.f152860j);
        ValueAnimator valueAnimator = this.f152864n;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f152856f - (valueAnimator.getCurrentPlayTime() / ((long) 1000)));
            kotlin.jvm.internal.G.n(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) r4).floatValue() >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f152861k;
            Rect rect = this.f152855e;
            String strValueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            canvas.drawText(strValueOf, getWidth() / 2, (getHeight() / 2) + (((paint.descent() - paint.ascent()) / 2) - paint.descent()), paint);
            kotlin.jvm.internal.G.n(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) r0).floatValue() >= 1.0d) {
                a();
            }
        }
        float f12 = this.f152862l;
        if (f12 > 0.0f) {
            RectF rectF = this.f152853c;
            if (rectF != null && (canvas3 = this.f152852b) != null) {
                canvas3.drawArc(rectF, 270.0f, f12, true, this.f152858h);
            }
            RectF rectF2 = this.f152854d;
            if (rectF2 != null && (canvas2 = this.f152852b) != null) {
                canvas2.drawOval(rectF2, this.f152859i);
            }
        }
        Bitmap bitmap = this.f152851a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        if (i10 != i12 || i11 != i13) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.G.o(bitmapCreateBitmap, "createBitmap(...)");
            bitmapCreateBitmap.eraseColor(0);
            this.f152851a = bitmapCreateBitmap;
            this.f152852b = new Canvas(bitmapCreateBitmap);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        C3774w3 c3774w3 = AbstractC3760v3.f153433a;
        float fB = (int) (AbstractC3760v3.b() * ((int) (getWidth() * 4.0f * 0.007f)));
        float fB2 = (int) (AbstractC3760v3.b() * ((int) (getWidth() * 14.0f * 0.007f)));
        float fB3 = (int) (AbstractC3760v3.b() * ((int) (getWidth() * 5.0f * 0.007f)));
        float fB4 = (int) (AbstractC3760v3.b() * ((int) (getWidth() * 1.5f * 0.007f)));
        RectF rectF = new RectF(fB3, fB3, getWidth() - fB3, getHeight() - fB3);
        this.f152853c = rectF;
        this.f152854d = new RectF(rectF.left + fB, rectF.top + fB, rectF.right - fB, rectF.bottom - fB);
        this.f152860j.setStrokeWidth(fB4);
        this.f152861k.setTextSize(fB2);
        invalidate();
    }

    public final void setTimerEventsListener(@Nullable InterfaceC3514d8 interfaceC3514d8) {
        this.f152865o = interfaceC3514d8;
    }

    public final void setTimerValue(long j10) {
        this.f152856f = j10;
    }
}
