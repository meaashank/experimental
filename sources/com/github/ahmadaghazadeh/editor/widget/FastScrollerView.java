package com.github.ahmadaghazadeh.editor.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.github.ahmadaghazadeh.editor.processor.TextProcessor;
import k5.b;
import o5.InterfaceC5327a;
import s5.C5574a;

/* JADX INFO: loaded from: classes3.dex */
public class FastScrollerView extends View implements InterfaceC5327a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f150621o = 3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f150622p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f150623q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f150624r = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f150625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f150626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f150627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextProcessor f150628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f150629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f150630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f150631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5574a f150632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f150633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f150634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f150635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f150636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f150637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f150638n;

    public FastScrollerView(Context context) {
        super(context);
        this.f150625a = new Runnable() { // from class: w5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f240109a.i(3);
            }
        };
        this.f150631g = new Handler();
        this.f150633i = 0;
        this.f150637m = 0.0f;
        if (isInEditMode()) {
            return;
        }
        this.f150635k = context.getResources().getDrawable(b.h.f215432D0);
        this.f150634j = context.getResources().getDrawable(b.h.f215435E0);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(b.d.f214555D1, typedValue, true);
        Drawable drawableMutate = this.f150635k.mutate();
        int i10 = typedValue.data;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(i10, mode);
        this.f150634j.mutate().setColorFilter(typedValue.data, mode);
        this.f150636l = this.f150635k.getIntrinsicHeight();
        C5574a c5574a = new C5574a(true, false);
        this.f150632h = c5574a;
        c5574a.setAlpha(250);
    }

    public final void b() {
        TextProcessor textProcessor = this.f150628d;
        if (textProcessor == null || textProcessor.getLayout() == null) {
            return;
        }
        this.f150638n = getHeight();
        this.f150629e = this.f150628d.getLayout().getHeight();
        this.f150630f = this.f150628d.getScrollY();
        this.f150628d.getHeight();
        this.f150628d.getLayout().getHeight();
        this.f150637m = d();
    }

    public int c() {
        return this.f150633i;
    }

    public final int d() {
        int iRound = Math.round((this.f150630f / ((this.f150629e - this.f150628d.getHeight()) + this.f150628d.getLineHeight())) * (this.f150638n - this.f150636l));
        return iRound > getHeight() - this.f150636l ? getHeight() - this.f150636l : iRound;
    }

    public final boolean e(float f10, float f11) {
        if (f10 < 0.0f || f10 > getWidth()) {
            return false;
        }
        float f12 = this.f150637m;
        return f11 >= f12 && f11 <= f12 + ((float) this.f150636l);
    }

    public final boolean f() {
        return ((double) (this.f150629e / ((float) this.f150628d.getHeight()))) >= 1.5d;
    }

    public void g(TextProcessor textProcessor) {
        if (textProcessor != null) {
            this.f150628d = textProcessor;
            textProcessor.m(this);
        }
    }

    public final void h() {
        float f10 = this.f150637m / (this.f150638n - this.f150636l);
        TextProcessor textProcessor = this.f150628d;
        textProcessor.scrollTo(textProcessor.getScrollX(), ((int) (this.f150629e * f10)) - ((int) (f10 * (this.f150628d.getHeight() - this.f150628d.getLineHeight()))));
    }

    public void i(int i10) {
        if (i10 == 0) {
            this.f150631g.removeCallbacks(this.f150625a);
            this.f150633i = 0;
            invalidate();
            return;
        }
        if (i10 == 1) {
            if (f()) {
                this.f150631g.removeCallbacks(this.f150625a);
                this.f150633i = 1;
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f150631g.removeCallbacks(this.f150625a);
            this.f150633i = 2;
            invalidate();
        } else {
            if (i10 != 3) {
                return;
            }
            this.f150631g.removeCallbacks(this.f150625a);
            this.f150633i = 3;
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f150628d == null || c() == 0) {
            return;
        }
        if (this.f150627c == null) {
            this.f150635k.setBounds(new Rect(0, 0, getWidth(), this.f150636l));
            this.f150627c = Bitmap.createBitmap(getWidth(), this.f150636l, Bitmap.Config.ARGB_8888);
            this.f150635k.draw(new Canvas(this.f150627c));
        }
        if (this.f150626b == null) {
            this.f150634j.setBounds(new Rect(0, 0, getWidth(), this.f150636l));
            this.f150626b = Bitmap.createBitmap(getWidth(), this.f150636l, Bitmap.Config.ARGB_8888);
            this.f150634j.draw(new Canvas(this.f150626b));
        }
        super.onDraw(canvas);
        if (c() == 1 || c() == 2) {
            this.f150632h.setAlpha(250);
            if (c() == 1) {
                canvas.drawBitmap(this.f150627c, 0.0f, this.f150637m, this.f150632h);
                return;
            } else {
                canvas.drawBitmap(this.f150626b, 0.0f, this.f150637m, this.f150632h);
                return;
            }
        }
        if (c() != 3) {
            return;
        }
        if (this.f150632h.getAlpha() <= 25) {
            this.f150632h.setAlpha(0);
            i(0);
        } else {
            C5574a c5574a = this.f150632h;
            c5574a.setAlpha(c5574a.getAlpha() - 25);
            canvas.drawBitmap(this.f150627c, 0.0f, this.f150637m, this.f150632h);
            this.f150631g.postDelayed(this.f150625a, 17L);
        }
    }

    @Override // android.view.View, o5.InterfaceC5327a
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (this.f150633i != 2) {
            b();
            i(1);
            this.f150631g.postDelayed(this.f150625a, 2000L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f150628d == null || this.f150633i == 0) {
            return false;
        }
        b();
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!e(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
            this.f150628d.g();
            i(2);
            setPressed(true);
            return true;
        }
        if (action == 1) {
            i(1);
            setPressed(false);
            this.f150631g.postDelayed(this.f150625a, 2000L);
            return false;
        }
        if (action != 2 || this.f150633i != 2) {
            return false;
        }
        setPressed(true);
        this.f150628d.g();
        int y10 = (int) motionEvent.getY();
        int i11 = this.f150636l;
        int i12 = y10 - (i11 / 2);
        if (i12 >= 0) {
            int i13 = i11 + i12;
            int i14 = this.f150638n;
            i10 = i13 > i14 ? i14 - i11 : i12;
        }
        this.f150637m = i10;
        h();
        invalidate();
        return true;
    }

    public FastScrollerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150625a = new Runnable() { // from class: w5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f240109a.i(3);
            }
        };
        this.f150631g = new Handler();
        this.f150633i = 0;
        this.f150637m = 0.0f;
        if (isInEditMode()) {
            return;
        }
        this.f150635k = context.getResources().getDrawable(b.h.f215432D0);
        this.f150634j = context.getResources().getDrawable(b.h.f215435E0);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(b.d.f214555D1, typedValue, true);
        Drawable drawableMutate = this.f150635k.mutate();
        int i10 = typedValue.data;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(i10, mode);
        this.f150634j.mutate().setColorFilter(typedValue.data, mode);
        this.f150636l = this.f150635k.getIntrinsicHeight();
        C5574a c5574a = new C5574a(true, false);
        this.f150632h = c5574a;
        c5574a.setAlpha(250);
    }
}
