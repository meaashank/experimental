package H0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;

/* JADX INFO: loaded from: classes2.dex */
public class m extends Drawable implements Drawable.Callback, l, k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PorterDuff.Mode f45438g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f45440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f45442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f45444f;

    public m(@NonNull o oVar, @Nullable Resources resources) {
        this.f45442d = oVar;
        e(resources);
    }

    @Override // H0.l
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f45444f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f45444f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            o oVar = this.f45442d;
            if (oVar != null) {
                oVar.f45448b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // H0.l
    public final Drawable b() {
        return this.f45444f;
    }

    public boolean c() {
        return !(this instanceof n);
    }

    @NonNull
    public final o d() {
        return new o(this.f45442d);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f45444f.draw(canvas);
    }

    public final void e(@Nullable Resources resources) {
        Drawable.ConstantState constantState;
        o oVar = this.f45442d;
        if (oVar == null || (constantState = oVar.f45448b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (c()) {
            o oVar = this.f45442d;
            ColorStateList colorStateList = oVar.f45449c;
            PorterDuff.Mode mode = oVar.f45450d;
            if (colorStateList == null || mode == null) {
                this.f45441c = false;
                clearColorFilter();
                return false;
            }
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f45441c || colorForState != this.f45439a || mode != this.f45440b) {
                setColorFilter(colorForState, mode);
                this.f45439a = colorForState;
                this.f45440b = mode;
                this.f45441c = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        o oVar = this.f45442d;
        return changingConfigurations | (oVar != null ? oVar.getChangingConfigurations() : 0) | this.f45444f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        o oVar = this.f45442d;
        if (oVar == null || !oVar.a()) {
            return null;
        }
        this.f45442d.f45447a = getChangingConfigurations();
        return this.f45442d;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f45444f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f45444f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f45444f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @T(23)
    public int getLayoutDirection() {
        return this.f45444f.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f45444f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f45444f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f45444f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f45444f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public int[] getState() {
        return this.f45444f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f45444f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f45444f.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        o oVar;
        ColorStateList colorStateList = (!c() || (oVar = this.f45442d) == null) ? null : oVar.f45449c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f45444f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f45444f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f45443e && super.mutate() == this) {
            this.f45442d = d();
            Drawable drawable = this.f45444f;
            if (drawable != null) {
                drawable.mutate();
            }
            o oVar = this.f45442d;
            if (oVar != null) {
                Drawable drawable2 = this.f45444f;
                oVar.f45448b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f45443e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45444f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @T(23)
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f45444f.setLayoutDirection(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.f45444f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f45444f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        this.f45444f.setAutoMirrored(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f45444f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f45444f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f45444f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f45444f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        return f(iArr) || this.f45444f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, H0.k
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, H0.k
    public void setTintList(ColorStateList colorStateList) {
        this.f45442d.f45449c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, H0.k
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.f45442d.f45450d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f45444f.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public m(@Nullable Drawable drawable) {
        this.f45442d = d();
        a(drawable);
    }
}
