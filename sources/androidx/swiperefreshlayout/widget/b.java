package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f117562i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f117563j = 11.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f117564k = 3.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f117565l = 12;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f117566m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f117567n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float f117568o = 7.5f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f117569p = 2.5f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f117570q = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f117571r = 5;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float f117573t = 0.75f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f117574u = 0.5f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f117575v = 1332;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final float f117576w = 216.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f117577x = 0.8f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final float f117578y = 0.01f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final float f117579z = 0.20999998f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f117580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f117581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Resources f117582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animator f117583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f117584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f117585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Interpolator f117560g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f117561h = new B1.b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f117572s = {-16777216};

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f117586a;

        public a(d dVar) {
            this.f117586a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.E(fFloatValue, this.f117586a);
            b.this.b(fFloatValue, this.f117586a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    public class C0333b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f117588a;

        public C0333b(d dVar) {
            this.f117588a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f117588a, true);
            this.f117588a.M();
            this.f117588a.v();
            b bVar = b.this;
            if (!bVar.f117585f) {
                bVar.f117584e += 1.0f;
                return;
            }
            bVar.f117585f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f117588a.I(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f117584e = 0.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f117590a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f117591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f117592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f117593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f117594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f117595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f117596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f117597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f117598i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f117599j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f117600k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f117601l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f117602m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f117603n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f117604o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f117605p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f117606q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f117607r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f117608s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f117609t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f117610u;

        public d() {
            Paint paint = new Paint();
            this.f117591b = paint;
            Paint paint2 = new Paint();
            this.f117592c = paint2;
            Paint paint3 = new Paint();
            this.f117593d = paint3;
            this.f117594e = 0.0f;
            this.f117595f = 0.0f;
            this.f117596g = 0.0f;
            this.f117597h = 5.0f;
            this.f117605p = 1.0f;
            this.f117609t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A(int i10) {
            this.f117593d.setColor(i10);
        }

        public void B(float f10) {
            this.f117606q = f10;
        }

        public void C(int i10) {
            this.f117610u = i10;
        }

        public void D(ColorFilter colorFilter) {
            this.f117591b.setColorFilter(colorFilter);
        }

        public void E(int i10) {
            this.f117599j = i10;
            this.f117610u = this.f117598i[i10];
        }

        public void F(@NonNull int[] iArr) {
            this.f117598i = iArr;
            E(0);
        }

        public void G(float f10) {
            this.f117595f = f10;
        }

        public void H(float f10) {
            this.f117596g = f10;
        }

        public void I(boolean z10) {
            if (this.f117603n != z10) {
                this.f117603n = z10;
            }
        }

        public void J(float f10) {
            this.f117594e = f10;
        }

        public void K(Paint.Cap cap) {
            this.f117591b.setStrokeCap(cap);
        }

        public void L(float f10) {
            this.f117597h = f10;
            this.f117591b.setStrokeWidth(f10);
        }

        public void M() {
            this.f117600k = this.f117594e;
            this.f117601l = this.f117595f;
            this.f117602m = this.f117596g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f117590a;
            float f10 = this.f117606q;
            float fMin = (this.f117597h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f117607r * this.f117605p) / 2.0f, this.f117597h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f117594e;
            float f12 = this.f117596g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f117595f + f12) * 360.0f) - f13;
            this.f117591b.setColor(this.f117610u);
            this.f117591b.setAlpha(this.f117609t);
            float f15 = this.f117597h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f117593d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f117591b);
            b(canvas, f13, f14, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f117603n) {
                Path path = this.f117604o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f117604o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f117607r * this.f117605p) / 2.0f;
                this.f117604o.moveTo(0.0f, 0.0f);
                this.f117604o.lineTo(this.f117607r * this.f117605p, 0.0f);
                Path path3 = this.f117604o;
                float f13 = this.f117607r;
                float f14 = this.f117605p;
                path3.lineTo((f13 * f14) / 2.0f, this.f117608s * f14);
                this.f117604o.offset((rectF.centerX() + fMin) - f12, (this.f117597h / 2.0f) + rectF.centerY());
                this.f117604o.close();
                this.f117592c.setColor(this.f117610u);
                this.f117592c.setAlpha(this.f117609t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f117604o, this.f117592c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f117609t;
        }

        public float d() {
            return this.f117608s;
        }

        public float e() {
            return this.f117605p;
        }

        public float f() {
            return this.f117607r;
        }

        public int g() {
            return this.f117593d.getColor();
        }

        public float h() {
            return this.f117606q;
        }

        public int[] i() {
            return this.f117598i;
        }

        public float j() {
            return this.f117595f;
        }

        public int k() {
            return this.f117598i[l()];
        }

        public int l() {
            return (this.f117599j + 1) % this.f117598i.length;
        }

        public float m() {
            return this.f117596g;
        }

        public boolean n() {
            return this.f117603n;
        }

        public float o() {
            return this.f117594e;
        }

        public int p() {
            return this.f117598i[this.f117599j];
        }

        public float q() {
            return this.f117601l;
        }

        public float r() {
            return this.f117602m;
        }

        public float s() {
            return this.f117600k;
        }

        public Paint.Cap t() {
            return this.f117591b.getStrokeCap();
        }

        public float u() {
            return this.f117597h;
        }

        public void v() {
            E(l());
        }

        public void w() {
            this.f117600k = 0.0f;
            this.f117601l = 0.0f;
            this.f117602m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        public void x(int i10) {
            this.f117609t = i10;
        }

        public void y(float f10, float f11) {
            this.f117607r = (int) f10;
            this.f117608s = (int) f11;
        }

        public void z(float f10) {
            if (f10 != this.f117605p) {
                this.f117605p = f10;
            }
        }
    }

    public b(@NonNull Context context) {
        context.getClass();
        this.f117582c = context.getResources();
        d dVar = new d();
        this.f117580a = dVar;
        dVar.F(f117572s);
        B(2.5f);
        D();
    }

    public void A(@NonNull Paint.Cap cap) {
        this.f117580a.K(cap);
        invalidateSelf();
    }

    public void B(float f10) {
        this.f117580a.L(f10);
        invalidateSelf();
    }

    public void C(int i10) {
        if (i10 == 0) {
            y(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            y(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void D() {
        d dVar = this.f117580a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f117560g);
        valueAnimatorOfFloat.addListener(new C0333b(dVar));
        this.f117583d = valueAnimatorOfFloat;
    }

    public void E(float f10, d dVar) {
        if (f10 > 0.75f) {
            dVar.C(c((f10 - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    public final void a(float f10, d dVar) {
        E(f10, dVar);
        float fFloor = (float) (Math.floor(dVar.r() / 0.8f) + 1.0d);
        dVar.J((((dVar.q() - 0.01f) - dVar.s()) * f10) + dVar.s());
        dVar.G(dVar.q());
        dVar.H(((fFloor - dVar.r()) * f10) + dVar.r());
    }

    public void b(float f10, d dVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f117585f) {
            a(f10, dVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fR = dVar.r();
            if (f10 < 0.5f) {
                interpolation = dVar.s();
                interpolation2 = (f117561h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fS = dVar.s() + 0.79f;
                interpolation = fS - (((1.0f - f117561h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fS;
            }
            float f11 = (0.20999998f * f10) + fR;
            float f12 = (f10 + this.f117584e) * 216.0f;
            dVar.J(interpolation);
            dVar.G(interpolation2);
            dVar.H(f11);
            this.f117581b = f12;
        }
    }

    public final int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    public boolean d() {
        return this.f117580a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f117581b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f117580a.a(canvas, bounds);
        canvas.restore();
    }

    public float e() {
        return this.f117580a.d();
    }

    public float f() {
        return this.f117580a.e();
    }

    public float g() {
        return this.f117580a.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f117580a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f117580a.g();
    }

    public float i() {
        return this.f117580a.h();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f117583d.isRunning();
    }

    @NonNull
    public int[] j() {
        return this.f117580a.i();
    }

    public float k() {
        return this.f117580a.j();
    }

    public float l() {
        return this.f117580a.m();
    }

    public final float m() {
        return this.f117581b;
    }

    public float n() {
        return this.f117580a.o();
    }

    @NonNull
    public Paint.Cap o() {
        return this.f117580a.t();
    }

    public float p() {
        return this.f117580a.u();
    }

    public void q(float f10, float f11) {
        this.f117580a.y(f10, f11);
        invalidateSelf();
    }

    public void r(boolean z10) {
        this.f117580a.I(z10);
        invalidateSelf();
    }

    public void s(float f10) {
        this.f117580a.z(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f117580a.x(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f117580a.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f117583d.cancel();
        this.f117580a.M();
        if (this.f117580a.j() != this.f117580a.o()) {
            this.f117585f = true;
            this.f117583d.setDuration(666L);
            this.f117583d.start();
        } else {
            this.f117580a.E(0);
            this.f117580a.w();
            this.f117583d.setDuration(1332L);
            this.f117583d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f117583d.cancel();
        this.f117581b = 0.0f;
        this.f117580a.I(false);
        this.f117580a.E(0);
        this.f117580a.w();
        invalidateSelf();
    }

    public void t(int i10) {
        this.f117580a.A(i10);
        invalidateSelf();
    }

    public void u(float f10) {
        this.f117580a.B(f10);
        invalidateSelf();
    }

    public void v(@NonNull int... iArr) {
        this.f117580a.F(iArr);
        this.f117580a.E(0);
        invalidateSelf();
    }

    public void w(float f10) {
        this.f117580a.H(f10);
        invalidateSelf();
    }

    public final void x(float f10) {
        this.f117581b = f10;
    }

    public final void y(float f10, float f11, float f12, float f13) {
        d dVar = this.f117580a;
        float f14 = this.f117582c.getDisplayMetrics().density;
        dVar.L(f11 * f14);
        dVar.B(f10 * f14);
        dVar.E(0);
        dVar.y(f12 * f14, f13 * f14);
    }

    public void z(float f10, float f11) {
        this.f117580a.J(f10);
        this.f117580a.G(f11);
        invalidateSelf();
    }
}
