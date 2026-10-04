package com.prism.hider.vault.commons.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.EditText;
import com.prism.hider.vault.commons.ui.e;

/* JADX INFO: loaded from: classes6.dex */
public class PassWordInputView extends EditText {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f173595E = "PassWordInputView";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f173596A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f173597B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f173598C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f173599D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f173600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f173601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f173602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f173603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f173604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f173605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f173606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f173607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f173608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f173609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f173610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f173611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f173612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f173613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f173614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f173615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f173616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f173617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewType f173618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RectF f173619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RectF f173620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RectF f173621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f173622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f173623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f173624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f173625z;

    public enum ViewType {
        DEFAULT,
        UNDERLINE,
        SQUARE,
        BIASLINE
    }

    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return true;
        }
    }

    public class b extends Animation {
        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            super.applyTransformation(f10, transformation);
            PassWordInputView.this.f173613n = f10;
            PassWordInputView.this.postInvalidate();
        }

        public b() {
        }
    }

    public PassWordInputView(Context context) {
        this(context, null);
    }

    public int b(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public float c(Paint paint, String str) {
        paint.getTextBounds(str, 0, str.length(), new Rect());
        return r0.height();
    }

    public final Point d(Paint paint, char c10) {
        Rect rect = new Rect();
        paint.getTextBounds("" + c10, 0, 1, rect);
        return new Point(rect.width(), rect.height());
    }

    public float e(Paint paint, String str) {
        paint.getTextBounds(str, 0, str.length(), new Rect());
        return r0.width();
    }

    public void f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.o.Pr, 0, 0);
        this.f173611l = typedArrayObtainStyledAttributes.getInt(e.o.Rr, 0);
        this.f173622w = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.o.Qr, 0);
        this.f173598C = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.o.Tr, 0);
        this.f173599D = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.o.Sr, 0);
        b bVar = new b();
        this.f173609j = bVar;
        bVar.setDuration(this.f173607h);
        this.f173604e = b(4.0f);
        this.f173605f = b(6.0f);
        this.f173608i = (int) getTextSize();
        this.f173610k = 0;
        Paint paint = new Paint();
        this.f173600a = paint;
        paint.setAntiAlias(true);
        this.f173600a.setStyle(Paint.Style.STROKE);
        this.f173600a.setColor(-7829368);
        Paint paint2 = new Paint();
        this.f173601b = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = this.f173601b;
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        this.f173601b.setColor(-1);
        Paint paint4 = new Paint();
        this.f173602c = paint4;
        paint4.setAntiAlias(true);
        this.f173602c.setStyle(style);
        this.f173619t = new RectF();
        this.f173620u = new RectF();
        this.f173621v = new RectF();
    }

    public void g(int i10) {
        this.f173623x = i10;
    }

    public final Bitmap h(Bitmap bitmap, int i10, float f10) {
        return Bitmap.createScaledBitmap(bitmap, i10, (int) (i10 * f10), true);
    }

    public void i(int i10) {
        this.f173625z = i10;
    }

    public void j(int i10) {
        this.f173617r = i10;
    }

    public void k(int i10) {
        this.f173597B = i10;
    }

    public void l(int i10) {
        this.f173608i = i10;
    }

    public void m(ViewType viewType) {
        this.f173618s = viewType;
    }

    public void n(int i10) {
        this.f173604e = i10;
    }

    public void o(boolean z10) {
        this.f173614o = z10;
        this.f173616q = -1;
        this.f173615p = null;
        postInvalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0234 A[LOOP:2: B:49:0x0234->B:64:0x027c, LOOP_START, PHI: r11
      0x0234: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:34:0x01bf, B:64:0x027c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.hider.vault.commons.ui.PassWordInputView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.f173611l * this.f173622w, ((this.f173598C + 18) * 2) + this.f173608i);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (charSequence.toString().length() - this.f173610k >= 0) {
            this.f173612m = true;
        } else {
            this.f173612m = false;
        }
        int length = charSequence.toString().length();
        this.f173610k = length;
        if (length <= this.f173611l) {
            if (this.f173609j == null) {
                invalidate();
            } else {
                clearAnimation();
                startAnimation(this.f173609j);
            }
        }
    }

    public void p(boolean z10, int i10) {
        this.f173614o = z10;
        this.f173616q = i10;
        this.f173615p = null;
        postInvalidate();
    }

    public void q(boolean z10, String str) {
        this.f173614o = z10;
        this.f173616q = -1;
        this.f173615p = str;
        postInvalidate();
    }

    public void r(int i10) {
        this.f173596A = i10;
    }

    public void s(int i10) {
        this.f173624y = i10;
    }

    public PassWordInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PassWordInputView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f173603d = 1;
        this.f173607h = 200;
        this.f173612m = true;
        this.f173614o = false;
        this.f173615p = null;
        this.f173616q = -1;
        this.f173617r = 120;
        this.f173618s = ViewType.DEFAULT;
        this.f173622w = 0;
        this.f173624y = -1;
        this.f173625z = -7829368;
        this.f173596A = -1;
        this.f173597B = Color.argb(155, 0, 0, 0);
        this.f173598C = 9;
        this.f173599D = 12;
        this.f173623x = context.getColor(e.C0691e.f174824W0);
        f(context, attributeSet);
        setOnLongClickListener(new a());
    }
}
