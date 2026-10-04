package i;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import e.InterfaceC4337k;
import e.InterfaceC4348w;
import g.C4426a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class e extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f202746m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f202747n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f202748o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f202749p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f202750q = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f202751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f202752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f202753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f202754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f202755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f202756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f202757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f202758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f202759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f202760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f202761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f202762l;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public e(Context context) {
        Paint paint = new Paint();
        this.f202751a = paint;
        this.f202757g = new Path();
        this.f202759i = false;
        this.f202762l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C4426a.m.f201762C3, C4426a.b.f200920o1, C4426a.l.f201709v1);
        p(typedArrayObtainStyledAttributes.getColor(C4426a.m.f201794G3, 0));
        o(typedArrayObtainStyledAttributes.getDimension(C4426a.m.f201826K3, 0.0f));
        s(typedArrayObtainStyledAttributes.getBoolean(C4426a.m.f201818J3, true));
        r(Math.round(typedArrayObtainStyledAttributes.getDimension(C4426a.m.f201810I3, 0.0f)));
        this.f202758h = typedArrayObtainStyledAttributes.getDimensionPixelSize(C4426a.m.f201802H3, 0);
        this.f202753c = Math.round(typedArrayObtainStyledAttributes.getDimension(C4426a.m.f201786F3, 0.0f));
        this.f202752b = Math.round(typedArrayObtainStyledAttributes.getDimension(C4426a.m.f201770D3, 0.0f));
        this.f202754d = typedArrayObtainStyledAttributes.getDimension(C4426a.m.f201778E3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float k(float f10, float f11, float f12) {
        return C4541d.a(f11, f10, f12, f10);
    }

    public float a() {
        return this.f202752b;
    }

    public float b() {
        return this.f202754d;
    }

    public float c() {
        return this.f202753c;
    }

    public float d() {
        return this.f202751a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f202762l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? getLayoutDirection() == 0 : getLayoutDirection() == 1))) {
            z10 = true;
        }
        float f10 = this.f202752b;
        float fK = k(this.f202753c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f202760j);
        float fK2 = k(this.f202753c, this.f202754d, this.f202760j);
        float fRound = Math.round(k(0.0f, this.f202761k, this.f202760j));
        float fK3 = k(0.0f, f202750q, this.f202760j);
        float fK4 = k(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f202760j);
        double d10 = fK;
        double d11 = fK3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(Math.sin(d11) * d10);
        this.f202757g.rewind();
        float fK5 = k(this.f202751a.getStrokeWidth() + this.f202755e, -this.f202761k, this.f202760j);
        float f11 = (-fK2) / 2.0f;
        this.f202757g.moveTo(f11 + fRound, 0.0f);
        this.f202757g.rLineTo(fK2 - (fRound * 2.0f), 0.0f);
        this.f202757g.moveTo(f11, fK5);
        this.f202757g.rLineTo(fRound2, fRound3);
        this.f202757g.moveTo(f11, -fK5);
        this.f202757g.rLineTo(fRound2, -fRound3);
        this.f202757g.close();
        canvas.save();
        float strokeWidth = this.f202751a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f202755e + ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2));
        if (this.f202756f) {
            canvas.rotate(fK4 * (this.f202759i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f202757g, this.f202751a);
        canvas.restore();
    }

    @InterfaceC4337k
    public int e() {
        return this.f202751a.getColor();
    }

    public int f() {
        return this.f202762l;
    }

    public float g() {
        return this.f202755e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f202758h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f202758h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f202751a;
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f202760j;
    }

    public boolean j() {
        return this.f202756f;
    }

    public void l(float f10) {
        if (this.f202752b != f10) {
            this.f202752b = f10;
            invalidateSelf();
        }
    }

    public void m(float f10) {
        if (this.f202754d != f10) {
            this.f202754d = f10;
            invalidateSelf();
        }
    }

    public void n(float f10) {
        if (this.f202753c != f10) {
            this.f202753c = f10;
            invalidateSelf();
        }
    }

    public void o(float f10) {
        if (this.f202751a.getStrokeWidth() != f10) {
            this.f202751a.setStrokeWidth(f10);
            this.f202761k = (float) (Math.cos(f202750q) * ((double) (f10 / 2.0f)));
            invalidateSelf();
        }
    }

    public void p(@InterfaceC4337k int i10) {
        if (i10 != this.f202751a.getColor()) {
            this.f202751a.setColor(i10);
            invalidateSelf();
        }
    }

    public void q(int i10) {
        if (i10 != this.f202762l) {
            this.f202762l = i10;
            invalidateSelf();
        }
    }

    public void r(float f10) {
        if (f10 != this.f202755e) {
            this.f202755e = f10;
            invalidateSelf();
        }
    }

    public void s(boolean z10) {
        if (this.f202756f != z10) {
            this.f202756f = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f202751a.getAlpha()) {
            this.f202751a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f202751a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        if (this.f202760j != f10) {
            this.f202760j = f10;
            invalidateSelf();
        }
    }

    public void t(boolean z10) {
        if (this.f202759i != z10) {
            this.f202759i = z10;
            invalidateSelf();
        }
    }
}
