package H0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends Drawable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f45423n = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f45424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45425b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapShader f45428e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f45430g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45436m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45426c = 119;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f45427d = new Paint(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f45429f = new Matrix();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f45431h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f45432i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45433j = true;

    public i(Resources resources, Bitmap bitmap) {
        this.f45425b = 160;
        if (resources != null) {
            this.f45425b = resources.getDisplayMetrics().densityDpi;
        }
        this.f45424a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f45428e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f45436m = -1;
            this.f45435l = -1;
            this.f45428e = null;
        }
    }

    public static boolean j(float f10) {
        return f10 > 0.05f;
    }

    public final void a() {
        this.f45435l = this.f45424a.getScaledWidth(this.f45425b);
        this.f45436m = this.f45424a.getScaledHeight(this.f45425b);
    }

    @Nullable
    public final Bitmap b() {
        return this.f45424a;
    }

    public float c() {
        return this.f45430g;
    }

    public int d() {
        return this.f45426c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f45424a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.f45427d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f45431h, this.f45427d);
            return;
        }
        RectF rectF = this.f45432i;
        float f10 = this.f45430g;
        canvas.drawRoundRect(rectF, f10, f10, this.f45427d);
    }

    @NonNull
    public final Paint e() {
        return this.f45427d;
    }

    public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.f45427d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f45427d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f45427d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f45436m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f45435l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f45426c != 119 || this.f45434k || (bitmap = this.f45424a) == null || bitmap.hasAlpha() || this.f45427d.getAlpha() < 255 || j(this.f45430g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.f45434k;
    }

    public void k(boolean z10) {
        this.f45427d.setAntiAlias(z10);
        invalidateSelf();
    }

    public void l(boolean z10) {
        this.f45434k = z10;
        this.f45433j = true;
        if (!z10) {
            m(0.0f);
            return;
        }
        s();
        this.f45427d.setShader(this.f45428e);
        invalidateSelf();
    }

    public void m(float f10) {
        if (this.f45430g == f10) {
            return;
        }
        this.f45434k = false;
        if (j(f10)) {
            this.f45427d.setShader(this.f45428e);
        } else {
            this.f45427d.setShader(null);
        }
        this.f45430g = f10;
        invalidateSelf();
    }

    public void n(int i10) {
        if (this.f45426c != i10) {
            this.f45426c = i10;
            this.f45433j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        if (this.f45434k) {
            s();
        }
        this.f45433j = true;
    }

    public void p(int i10) {
        if (this.f45425b != i10) {
            if (i10 == 0) {
                i10 = 160;
            }
            this.f45425b = i10;
            if (this.f45424a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(@NonNull Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(@NonNull DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    public final void s() {
        this.f45430g = Math.min(this.f45436m, this.f45435l) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f45427d.getAlpha()) {
            this.f45427d.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45427d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f45427d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f45427d.setFilterBitmap(z10);
        invalidateSelf();
    }

    public void t() {
        i iVar;
        if (this.f45433j) {
            if (this.f45434k) {
                int iMin = Math.min(this.f45435l, this.f45436m);
                iVar = this;
                iVar.f(this.f45426c, iMin, iMin, getBounds(), this.f45431h);
                int iMin2 = Math.min(iVar.f45431h.width(), iVar.f45431h.height());
                iVar.f45431h.inset(Math.max(0, (iVar.f45431h.width() - iMin2) / 2), Math.max(0, (iVar.f45431h.height() - iMin2) / 2));
                iVar.f45430g = iMin2 * 0.5f;
            } else {
                iVar = this;
                iVar.f(iVar.f45426c, iVar.f45435l, iVar.f45436m, getBounds(), iVar.f45431h);
            }
            iVar.f45432i.set(iVar.f45431h);
            if (iVar.f45428e != null) {
                Matrix matrix = iVar.f45429f;
                RectF rectF = iVar.f45432i;
                matrix.setTranslate(rectF.left, rectF.top);
                iVar.f45429f.preScale(iVar.f45432i.width() / iVar.f45424a.getWidth(), iVar.f45432i.height() / iVar.f45424a.getHeight());
                iVar.f45428e.setLocalMatrix(iVar.f45429f);
                iVar.f45427d.setShader(iVar.f45428e);
            }
            iVar.f45433j = false;
        }
    }
}
