package com.prism.commons.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.compose.ui.graphics.colorspace.C2016d;
import c6.C2947b;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class ArcProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f161983q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f161984r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f161985s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f161986t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f161987u = -1381654;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f161988v = -256;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f161989w = 60;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f161990x = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f161992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f161993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f161994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f161995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f161996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RectF f161997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f161998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f161999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f162000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f162001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f162002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f162003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f162004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Canvas f162005o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f162006p;

    public interface a {
        void a(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10);
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f162007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f162008b;

        public b(Context context, int i10) {
            Drawable drawable = context.getDrawable(i10);
            int iMax = Math.max(1, drawable.getIntrinsicWidth());
            int iMax2 = Math.max(1, drawable.getIntrinsicHeight());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f162007a = bitmapCreateBitmap;
            drawable.setBounds(0, 0, iMax, iMax2);
            drawable.draw(new Canvas(bitmapCreateBitmap));
        }

        @Override // com.prism.commons.ui.ArcProgressBar.a
        public void a(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10) {
            if (this.f162008b == null) {
                Bitmap bitmap = this.f162007a;
                float f13 = rectF.right;
                float f14 = f12 * 2.0f;
                this.f162008b = Bitmap.createScaledBitmap(bitmap, (int) (f13 - f14), (int) (f13 - f14), false);
            }
            Bitmap bitmap2 = this.f162008b;
            Paint paint = new Paint(1);
            canvas.drawCircle(f10, f11, C2016d.a(f12, 2.0f, rectF.right, 2.0f), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f162008b.getHeight()), f10 - (r11.getWidth() / 2.0f), f11 - (r11.getHeight() / 2.0f), paint);
        }
    }

    public ArcProgressBar(Context context) {
        this(context, null);
    }

    public int a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics());
    }

    public void b(a aVar) {
        this.f162006p = aVar;
    }

    public void c(int i10) {
        this.f162000j = i10;
        this.f161994d = i10;
        this.f161999i.setColor(i10);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f162004n;
        if (bitmap != null) {
            bitmap.recycle();
            this.f162004n = null;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        float f10;
        Canvas canvas2;
        int i10;
        try {
            canvas.save();
            float progress = (getProgress() * 1.0f) / getMax();
            float f11 = (this.f161997g.right / 2.0f) + (this.f161995e / 2.0f);
            if (this.f162006p != null) {
                if (this.f162005o == null) {
                    int i11 = ((int) this.f161993c) * 2;
                    this.f162004n = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
                    this.f162005o = new Canvas(this.f162004n);
                }
                this.f162005o.drawColor(0, PorterDuff.Mode.CLEAR);
                f10 = f11;
                this.f162006p.a(this.f162005o, this.f161997g, f10, f11, this.f161995e, getProgress());
                canvas.drawBitmap(this.f162004n, 0.0f, 0.0f, (Paint) null);
            } else {
                f10 = f11;
            }
            int i12 = this.f161996f;
            int i13 = i12 / 2;
            int i14 = 360 - i12;
            int i15 = i14 / this.f162003m;
            int i16 = (int) (i15 * progress);
            if (this.f161991a == 0) {
                float f12 = i14 * progress;
                this.f161999i.setColor(this.f162001k);
                float f13 = i13 + 90;
                canvas.drawArc(this.f161997g, f13, f12, false, this.f161999i);
                this.f161999i.setColor(this.f162000j);
                canvas.drawArc(this.f161997g, f13 + f12, (360 - this.f161996f) - f12, false, this.f161999i);
                canvas2 = canvas;
            } else {
                if (this.f161992b) {
                    i10 = 0;
                    canvas2 = canvas;
                    canvas2.drawArc(this.f161997g, i13 + 90, i14, false, this.f161999i);
                } else {
                    canvas2 = canvas;
                    i10 = 0;
                }
                canvas2.rotate(i13 + Opcodes.GETFIELD, f10, f10);
                while (i10 < i15) {
                    if (i10 < i16) {
                        this.f161998h.setColor(this.f162001k);
                    } else {
                        this.f161998h.setColor(this.f162000j);
                    }
                    float f14 = this.f161995e;
                    float f15 = f14 / 2.0f;
                    canvas2.drawLine(f10, f15 + f14, f10, f14 - f15, this.f161998h);
                    canvas2.rotate(this.f162003m, f10, f10);
                    i10++;
                }
            }
            canvas2.restore();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode != 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec((int) ((this.f161993c * 2.0f) + (this.f161995e * 2)), 1073741824);
            }
            if (mode2 != 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec((int) ((this.f161993c * 2.0f) + (this.f161995e * 2)), 1073741824);
            }
            super.onMeasure(i10, i11);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int i14 = this.f161995e;
        float f10 = this.f161993c;
        this.f161997g = new RectF(i14, i14, (f10 * 2.0f) - i14, (f10 * 2.0f) - i14);
        Log.e("DEMO", "right=" + this.f161997g.right + ", mRadius=" + (this.f161993c * 2.0f));
    }

    public ArcProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ArcProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f161991a = 1;
        this.f161996f = 60;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2947b.o.f130819Y3);
        this.f161995e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C2947b.o.f130878c4, a(15));
        this.f162000j = typedArrayObtainStyledAttributes.getColor(C2947b.o.f130908e4, f161987u);
        this.f162001k = typedArrayObtainStyledAttributes.getColor(C2947b.o.f130923f4, -256);
        this.f162002l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C2947b.o.f130985j4, a(2));
        this.f162003m = typedArrayObtainStyledAttributes.getInt(C2947b.o.f130968i4, 4);
        this.f161993c = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C2947b.o.f130953h4, a(72));
        this.f161994d = typedArrayObtainStyledAttributes.getColor(C2947b.o.f130833Z3, f161987u);
        this.f162003m = Math.max(Math.min(this.f162003m, 8), 2);
        this.f161992b = typedArrayObtainStyledAttributes.getBoolean(C2947b.o.f130863b4, false);
        this.f161996f = typedArrayObtainStyledAttributes.getInt(C2947b.o.f130893d4, 60);
        this.f161991a = typedArrayObtainStyledAttributes.getInt(C2947b.o.f130938g4, 1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(C2947b.o.f130848a4, false);
        Paint paint = new Paint(1);
        this.f161999i = paint;
        paint.setColor(this.f161994d);
        if (z10) {
            this.f161999i.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f161999i.setStrokeWidth(this.f161995e);
        this.f161999i.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.f161998h = paint2;
        paint2.setStrokeWidth(this.f162002l);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f162009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f162010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f162011c;

        public c(int i10, int i11, String str) {
            this.f162009a = i10;
            this.f162010b = i11;
            this.f162011c = str;
        }

        @Override // com.prism.commons.ui.ArcProgressBar.a
        public void a(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10) {
            Paint paint = new Paint(1);
            paint.setStrokeWidth(35.0f);
            paint.setTextSize(this.f162010b);
            paint.setColor(this.f162009a);
            canvas.drawText(this.f162011c, f10 - (paint.measureText(this.f162011c) / 2.0f), f11 - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        }

        public c() {
            this.f162009a = -7829368;
            this.f162010b = 50;
            this.f162011c = "";
        }
    }
}
