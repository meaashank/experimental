package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes.dex */
@T(21)
public class f extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f86640a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f86642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f86643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f86644e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f86647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f86648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f86649j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86645f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f86646g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f86650k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f86641b = new Paint(5);

    public f(ColorStateList colorStateList, float f10) {
        this.f86640a = f10;
        e(colorStateList);
        this.f86642c = new RectF();
        this.f86643d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList b() {
        return this.f86647h;
    }

    public float c() {
        return this.f86644e;
    }

    public float d() {
        return this.f86640a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f86641b;
        if (this.f86648i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f86648i);
            z10 = true;
        }
        RectF rectF = this.f86642c;
        float f10 = this.f86640a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public final void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f86647h = colorStateList;
        this.f86641b.setColor(colorStateList.getColorForState(getState(), this.f86647h.getDefaultColor()));
    }

    public void f(@Nullable ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    public void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f86644e && this.f86645f == z10 && this.f86646g == z11) {
            return;
        }
        this.f86644e = f10;
        this.f86645f = z10;
        this.f86646g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f86643d, this.f86640a);
    }

    public void h(float f10) {
        if (f10 == this.f86640a) {
            return;
        }
        this.f86640a = f10;
        i(null);
        invalidateSelf();
    }

    public final void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f86642c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f86643d.set(rect);
        if (this.f86645f) {
            this.f86643d.inset((int) Math.ceil(g.c(this.f86644e, this.f86640a, this.f86646g)), (int) Math.ceil(g.d(this.f86644e, this.f86640a, this.f86646g)));
            this.f86642c.set(this.f86643d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f86649j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f86647h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f86647h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f86641b.getColor();
        if (z10) {
            this.f86641b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f86649j;
        if (colorStateList2 == null || (mode = this.f86650k) == null) {
            return z10;
        }
        this.f86648i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f86641b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f86641b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f86649j = colorStateList;
        this.f86648i = a(colorStateList, this.f86650k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f86650k = mode;
        this.f86648i = a(this.f86649j, mode);
        invalidateSelf();
    }
}
