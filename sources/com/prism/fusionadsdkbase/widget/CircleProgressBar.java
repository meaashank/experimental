package com.prism.fusionadsdkbase.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.prism.fusionadsdkbase.i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class CircleProgressBar extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final float f164143A = 90.0f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f164144B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f164145C = 1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int f164146D = 2;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int f164147E = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f164148F = 1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f164149G = 2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f164150H = -90;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final int f164151I = 45;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final float f164152J = 4.0f;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final float f164153K = 11.0f;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final float f164154L = 1.0f;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f164155M = "#f2a670";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String f164156N = "#e3e3e5";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f164157y = 100;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f164158z = 360.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f164159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f164160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f164161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f164162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f164163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f164164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f164165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f164166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f164167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f164169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f164170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f164171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f164172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f164173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f164174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f164175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f164176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f164177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f164178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f164179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f164180v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f164181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Paint.Cap f164182x;

    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int progress;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.progress);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.progress = parcel.readInt();
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f164183a = "%d";

        public b() {
        }

        @Override // com.prism.fusionadsdkbase.widget.CircleProgressBar.c
        public CharSequence a(int i10, int i11) {
            int i12 = i11 - i10;
            if (i12 < 1000 && i12 > 0) {
                i12 = 1000;
            }
            return String.format("%d", Integer.valueOf(i12 / 1000));
        }

        public b(a aVar) {
        }
    }

    public interface c {
        CharSequence a(int i10, int i11);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public CircleProgressBar(Context context) {
        this(context, null);
    }

    public void A(int i10) {
        this.f164180v = i10;
        this.f164161c.setStyle(i10 == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        this.f164162d.setStyle(this.f164180v == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        invalidate();
    }

    public final void B() {
        Shader radialGradient = null;
        if (this.f164173o == this.f164174p) {
            this.f164161c.setShader(null);
            this.f164161c.setColor(this.f164173o);
            return;
        }
        int i10 = this.f164181w;
        if (i10 == 0) {
            RectF rectF = this.f164159a;
            float f10 = rectF.left;
            LinearGradient linearGradient = new LinearGradient(f10, rectF.top, f10, rectF.bottom, this.f164173o, this.f164174p, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, this.f164165g, this.f164166h);
            linearGradient.setLocalMatrix(matrix);
            radialGradient = linearGradient;
        } else if (i10 == 1) {
            radialGradient = new RadialGradient(this.f164165g, this.f164166h, this.f164164f, this.f164173o, this.f164174p, Shader.TileMode.CLAMP);
        } else if (i10 == 2) {
            float f11 = (float) (-((this.f164182x == Paint.Cap.BUTT && this.f164180v == 2) ? 0.0d : Math.toDegrees((float) (((((double) this.f164171m) / 3.141592653589793d) * 2.0d) / ((double) this.f164164f)))));
            radialGradient = new SweepGradient(this.f164165g, this.f164166h, new int[]{this.f164173o, this.f164174p}, new float[]{0.0f, 1.0f});
            Matrix matrix2 = new Matrix();
            matrix2.setRotate(f11, this.f164165g, this.f164166h);
            radialGradient.setLocalMatrix(matrix2);
        }
        this.f164161c.setShader(radialGradient);
    }

    public final void a(Canvas canvas) {
        int i10 = this.f164169k;
        float f10 = (float) (6.283185307179586d / ((double) i10));
        float f11 = this.f164164f;
        float f12 = f11 - this.f164170l;
        int i11 = (int) ((this.f164167i / this.f164168j) * i10);
        for (int i12 = 0; i12 < this.f164169k; i12++) {
            double d10 = i12 * (-f10);
            float fCos = (((float) Math.cos(d10)) * f12) + this.f164165g;
            float fSin = this.f164166h - (((float) Math.sin(d10)) * f12);
            float fCos2 = (((float) Math.cos(d10)) * f11) + this.f164165g;
            float fSin2 = this.f164166h - (((float) Math.sin(d10)) * f11);
            if (!this.f164178t || i12 >= i11) {
                canvas.drawLine(fCos, fSin, fCos2, fSin2, this.f164162d);
            }
            if (i12 < i11) {
                canvas.drawLine(fCos, fSin, fCos2, fSin2, this.f164161c);
            }
        }
    }

    public final void b(Canvas canvas) {
        int i10 = this.f164180v;
        if (i10 == 1) {
            e(canvas);
        } else if (i10 != 2) {
            a(canvas);
        } else {
            d(canvas);
        }
    }

    public final void c(Canvas canvas) {
        c cVar = this.f164179u;
        if (cVar == null) {
            return;
        }
        CharSequence charSequenceA = cVar.a(this.f164167i, this.f164168j);
        if (TextUtils.isEmpty(charSequenceA)) {
            return;
        }
        this.f164163e.setTextSize(this.f164172n);
        this.f164163e.setColor(this.f164175q);
        String str = (String) charSequenceA;
        this.f164163e.getTextBounds(String.valueOf(charSequenceA), 0, str.length(), this.f164160b);
        canvas.drawText(charSequenceA, 0, str.length(), this.f164165g, this.f164166h + (this.f164160b.height() / 2), this.f164163e);
    }

    public final void d(Canvas canvas) {
        if (this.f164178t) {
            float f10 = (this.f164167i * 360.0f) / this.f164168j;
            canvas.drawArc(this.f164159a, f10, 360.0f - f10, false, this.f164162d);
        } else {
            canvas.drawArc(this.f164159a, 0.0f, 360.0f, false, this.f164162d);
        }
        canvas.drawArc(this.f164159a, 0.0f, (this.f164167i * 360.0f) / this.f164168j, false, this.f164161c);
    }

    public final void e(Canvas canvas) {
        if (this.f164178t) {
            float f10 = (this.f164167i * 360.0f) / this.f164168j;
            canvas.drawArc(this.f164159a, f10, 360.0f - f10, true, this.f164162d);
        } else {
            canvas.drawArc(this.f164159a, 0.0f, 360.0f, true, this.f164162d);
        }
        canvas.drawArc(this.f164159a, 0.0f, (this.f164167i * 360.0f) / this.f164168j, true, this.f164161c);
    }

    public int f() {
        return this.f164168j;
    }

    public int g() {
        return this.f164167i;
    }

    public int h() {
        return this.f164177s;
    }

    public final void i(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.n.f163778P3);
        this.f164169k = typedArrayObtainStyledAttributes.getInt(i.n.f163798R3, 45);
        this.f164180v = typedArrayObtainStyledAttributes.getInt(i.n.f163908c4, 0);
        this.f164181w = typedArrayObtainStyledAttributes.getInt(i.n.f163838V3, 0);
        int i10 = i.n.f163868Y3;
        this.f164182x = typedArrayObtainStyledAttributes.hasValue(i10) ? Paint.Cap.values()[typedArrayObtainStyledAttributes.getInt(i10, 0)] : Paint.Cap.BUTT;
        this.f164170l = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.n.f163808S3, com.prism.fusionadsdkbase.widget.b.a(getContext(), 4.0f));
        this.f164172n = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.n.f163898b4, com.prism.fusionadsdkbase.widget.b.a(getContext(), 11.0f));
        this.f164171m = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.n.f163878Z3, com.prism.fusionadsdkbase.widget.b.a(getContext(), 1.0f));
        this.f164173o = typedArrayObtainStyledAttributes.getColor(i.n.f163848W3, Color.parseColor(f164155M));
        this.f164174p = typedArrayObtainStyledAttributes.getColor(i.n.f163828U3, Color.parseColor(f164155M));
        this.f164175q = typedArrayObtainStyledAttributes.getColor(i.n.f163888a4, Color.parseColor(f164155M));
        this.f164176r = typedArrayObtainStyledAttributes.getColor(i.n.f163818T3, Color.parseColor(f164156N));
        this.f164177s = typedArrayObtainStyledAttributes.getInt(i.n.f163858X3, -90);
        this.f164178t = typedArrayObtainStyledAttributes.getBoolean(i.n.f163788Q3, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void j() {
        this.f164163e.setTextAlign(Paint.Align.CENTER);
        this.f164163e.setTextSize(this.f164172n);
        this.f164161c.setStyle(this.f164180v == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        this.f164161c.setStrokeWidth(this.f164171m);
        this.f164161c.setColor(this.f164173o);
        this.f164161c.setStrokeCap(this.f164182x);
        this.f164162d.setStyle(this.f164180v == 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        this.f164162d.setStrokeWidth(this.f164171m);
        this.f164162d.setColor(this.f164176r);
        this.f164162d.setStrokeCap(this.f164182x);
    }

    public boolean k() {
        return this.f164178t;
    }

    public void l(Paint.Cap cap) {
        this.f164182x = cap;
        this.f164161c.setStrokeCap(cap);
        this.f164162d.setStrokeCap(cap);
        invalidate();
    }

    public void m(boolean z10) {
        this.f164178t = z10;
        invalidate();
    }

    public void n(int i10) {
        this.f164169k = i10;
        invalidate();
    }

    public void o(float f10) {
        this.f164170l = f10;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(this.f164177s, this.f164165g, this.f164166h);
        b(canvas);
        canvas.restore();
        c(canvas);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        q(savedState.progress);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.progress = this.f164167i;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float f10 = i10 / 2;
        this.f164165g = f10;
        float f11 = i11 / 2;
        this.f164166h = f11;
        float fMin = Math.min(f10, f11);
        this.f164164f = fMin;
        RectF rectF = this.f164159a;
        float f12 = this.f164166h;
        rectF.top = f12 - fMin;
        rectF.bottom = f12 + fMin;
        float f13 = this.f164165g;
        rectF.left = f13 - fMin;
        rectF.right = f13 + fMin;
        B();
        RectF rectF2 = this.f164159a;
        float f14 = this.f164171m;
        rectF2.inset(f14 / 2.0f, f14 / 2.0f);
    }

    public void p(int i10) {
        this.f164168j = i10;
        invalidate();
    }

    public void q(int i10) {
        this.f164167i = i10;
        invalidate();
    }

    public void r(int i10) {
        this.f164176r = i10;
        this.f164162d.setColor(i10);
        invalidate();
    }

    public void s(int i10) {
        this.f164174p = i10;
        B();
        invalidate();
    }

    public void t(c cVar) {
        this.f164179u = cVar;
        invalidate();
    }

    public void u(int i10) {
        this.f164173o = i10;
        B();
        invalidate();
    }

    public void v(float f10) {
        this.f164171m = f10;
        this.f164159a.inset(f10 / 2.0f, f10 / 2.0f);
        invalidate();
    }

    public void w(int i10) {
        this.f164175q = i10;
        invalidate();
    }

    public void x(float f10) {
        this.f164172n = f10;
        invalidate();
    }

    public void y(int i10) {
        this.f164181w = i10;
        B();
        invalidate();
    }

    public void z(int i10) {
        this.f164177s = i10;
        invalidate();
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f164159a = new RectF();
        this.f164160b = new Rect();
        this.f164161c = new Paint(1);
        this.f164162d = new Paint(1);
        this.f164163e = new TextPaint(1);
        this.f164168j = 100;
        this.f164179u = new b();
        i(context, attributeSet);
        j();
    }
}
