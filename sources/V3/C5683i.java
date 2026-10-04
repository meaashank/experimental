package v3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import e.T;

/* JADX INFO: renamed from: v3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5683i extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f239800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f239801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f239802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f239803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f239804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f239805f;

    /* JADX INFO: renamed from: v3.i$a */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f239806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f239807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f239808c;

        public a(a aVar) {
            this(aVar.f239806a, aVar.f239807b, aVar.f239808c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new C5683i(this, this.f239806a.newDrawable());
        }

        public a(Drawable.ConstantState constantState, int i10, int i11) {
            this.f239806a = constantState;
            this.f239807b = i10;
            this.f239808c = i11;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new C5683i(this, this.f239806a.newDrawable(resources));
        }
    }

    public C5683i(Drawable drawable, int i10, int i11) {
        this(new a(drawable.getConstantState(), i10, i11), drawable);
    }

    public final void a() {
        this.f239800a.setRectToRect(this.f239801b, this.f239802c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f239803d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.concat(this.f239800a);
        this.f239803d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @T(19)
    public int getAlpha() {
        return this.f239803d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f239803d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f239803d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f239804e;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f239803d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f239804e.f239808c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f239804e.f239807b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f239803d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f239803d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f239803d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f239803d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f239803d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f239805f && super.mutate() == this) {
            this.f239803d = this.f239803d.mutate();
            this.f239804e = new a(this.f239804e);
            this.f239805f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable, long j10) {
        super.scheduleSelf(runnable, j10);
        this.f239803d.scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f239803d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f239802c.set(i10, i11, i12, i13);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f239803d.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, @NonNull PorterDuff.Mode mode) {
        this.f239803d.setColorFilter(i10, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z10) {
        this.f239803d.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f239803d.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return this.f239803d.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f239803d.unscheduleSelf(runnable);
    }

    public C5683i(a aVar, Drawable drawable) {
        y3.m.f(aVar, "Argument must not be null");
        this.f239804e = aVar;
        y3.m.f(drawable, "Argument must not be null");
        this.f239803d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f239800a = new Matrix();
        this.f239801b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f239802c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f239803d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        this.f239802c.set(rect);
        a();
    }
}
