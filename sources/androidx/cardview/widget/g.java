package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import z.C5849a;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double f86651q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f86652r = 1.5f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static a f86653s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86654a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f86656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f86657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f86658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f86659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Path f86660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f86661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f86662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f86663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f86664k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f86666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f86667n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f86665l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f86668o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f86669p = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f86655b = new Paint(5);

    public interface a {
        void a(Canvas canvas, RectF rectF, float f10, Paint paint);
    }

    public g(Resources resources, ColorStateList colorStateList, float f10, float f11, float f12) {
        this.f86666m = resources.getColor(C5849a.b.f241167d);
        this.f86667n = resources.getColor(C5849a.b.f241166c);
        this.f86654a = resources.getDimensionPixelSize(C5849a.c.f241168a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f86656c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f86659f = (int) (f10 + 0.5f);
        this.f86658e = new RectF();
        Paint paint2 = new Paint(this.f86656c);
        this.f86657d = paint2;
        paint2.setAntiAlias(false);
        s(f11, f12);
    }

    public static float c(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        return (float) (((1.0d - f86651q) * ((double) f11)) + ((double) f10));
    }

    public static float d(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f86651q) * ((double) f11)) + ((double) (f10 * 1.5f)));
    }

    public final void a(Rect rect) {
        float f10 = this.f86661h;
        float f11 = 1.5f * f10;
        this.f86658e.set(rect.left + f10, rect.top + f11, rect.right - f10, rect.bottom - f11);
        b();
    }

    public final void b() {
        float f10 = this.f86659f;
        RectF rectF = new RectF(-f10, -f10, f10, f10);
        RectF rectF2 = new RectF(rectF);
        float f11 = this.f86662i;
        rectF2.inset(-f11, -f11);
        Path path = this.f86660g;
        if (path == null) {
            this.f86660g = new Path();
        } else {
            path.reset();
        }
        this.f86660g.setFillType(Path.FillType.EVEN_ODD);
        this.f86660g.moveTo(-this.f86659f, 0.0f);
        this.f86660g.rLineTo(-this.f86662i, 0.0f);
        this.f86660g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f86660g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f86660g.close();
        float f12 = this.f86659f;
        float f13 = f12 / (this.f86662i + f12);
        Paint paint = this.f86656c;
        float f14 = this.f86659f + this.f86662i;
        int i10 = this.f86666m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f14, new int[]{i10, i10, this.f86667n}, new float[]{0.0f, f13, 1.0f}, tileMode));
        Paint paint2 = this.f86657d;
        float f15 = this.f86659f;
        float f16 = this.f86662i;
        float f17 = (-f15) + f16;
        float f18 = (-f15) - f16;
        int i11 = this.f86666m;
        paint2.setShader(new LinearGradient(0.0f, f17, 0.0f, f18, new int[]{i11, i11, this.f86667n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.f86657d.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f86665l) {
            a(getBounds());
            this.f86665l = false;
        }
        canvas.translate(0.0f, this.f86663j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f86663j) / 2.0f);
        f86653s.a(canvas, this.f86658e, this.f86659f, this.f86655b);
    }

    public final void e(Canvas canvas) {
        Canvas canvas2;
        float f10 = this.f86659f;
        float f11 = (-f10) - this.f86662i;
        float f12 = (this.f86663j / 2.0f) + f10 + this.f86654a;
        float f13 = 2.0f * f12;
        boolean z10 = this.f86658e.width() - f13 > 0.0f;
        boolean z11 = this.f86658e.height() - f13 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f86658e;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.drawPath(this.f86660g, this.f86656c);
        if (z10) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, f11, this.f86658e.width() - f13, -this.f86659f, this.f86657d);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave);
        int iSave2 = canvas2.save();
        RectF rectF2 = this.f86658e;
        canvas2.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.f86660g, this.f86656c);
        if (z10) {
            canvas2.drawRect(0.0f, f11, this.f86658e.width() - f13, (-this.f86659f) + this.f86662i, this.f86657d);
        }
        canvas2.restoreToCount(iSave2);
        int iSave3 = canvas2.save();
        RectF rectF3 = this.f86658e;
        canvas2.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.f86660g, this.f86656c);
        if (z11) {
            canvas2.drawRect(0.0f, f11, this.f86658e.height() - f13, -this.f86659f, this.f86657d);
        }
        canvas2.restoreToCount(iSave3);
        int iSave4 = canvas2.save();
        RectF rectF4 = this.f86658e;
        canvas2.translate(rectF4.right - f12, rectF4.top + f12);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.f86660g, this.f86656c);
        if (z11) {
            canvas2.drawRect(0.0f, f11, this.f86658e.height() - f13, -this.f86659f, this.f86657d);
        }
        canvas2.restoreToCount(iSave4);
    }

    public ColorStateList f() {
        return this.f86664k;
    }

    public float g() {
        return this.f86659f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(d(this.f86661h, this.f86659f, this.f86668o));
        int iCeil2 = (int) Math.ceil(c(this.f86661h, this.f86659f, this.f86668o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.f86661h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f86664k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public float j() {
        float f10 = this.f86661h;
        return (((this.f86661h * 1.5f) + this.f86654a) * 2.0f) + (Math.max(f10, ((f10 * 1.5f) / 2.0f) + this.f86659f + this.f86654a) * 2.0f);
    }

    public float k() {
        float f10 = this.f86661h;
        return ((this.f86661h + this.f86654a) * 2.0f) + (Math.max(f10, (f10 / 2.0f) + this.f86659f + this.f86654a) * 2.0f);
    }

    public float l() {
        return this.f86663j;
    }

    public void m(boolean z10) {
        this.f86668o = z10;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f86664k = colorStateList;
        this.f86655b.setColor(colorStateList.getColorForState(getState(), this.f86664k.getDefaultColor()));
    }

    public void o(@Nullable ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f86665l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f86664k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f86655b.getColor() == colorForState) {
            return false;
        }
        this.f86655b.setColor(colorForState);
        this.f86665l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f10 + ". Must be >= 0");
        }
        float f11 = (int) (f10 + 0.5f);
        if (this.f86659f == f11) {
            return;
        }
        this.f86659f = f11;
        this.f86665l = true;
        invalidateSelf();
    }

    public void q(float f10) {
        s(this.f86663j, f10);
    }

    public void r(float f10) {
        s(f10, this.f86661h);
    }

    public final void s(float f10, float f11) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f10 + ". Must be >= 0");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f11 + ". Must be >= 0");
        }
        float fT = t(f10);
        float fT2 = t(f11);
        if (fT > fT2) {
            if (!this.f86669p) {
                this.f86669p = true;
            }
            fT = fT2;
        }
        if (this.f86663j == fT && this.f86661h == fT2) {
            return;
        }
        this.f86663j = fT;
        this.f86661h = fT2;
        this.f86662i = (int) ((fT * 1.5f) + this.f86654a + 0.5f);
        this.f86665l = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f86655b.setAlpha(i10);
        this.f86656c.setAlpha(i10);
        this.f86657d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f86655b.setColorFilter(colorFilter);
    }

    public final int t(float f10) {
        int i10 = (int) (f10 + 0.5f);
        return i10 % 2 == 1 ? i10 - 1 : i10;
    }
}
