package H0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import e.T;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@T(21)
public class n extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f45445h = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f45446i;

    public n(Drawable drawable) {
        super(drawable);
        g();
    }

    public final void g() {
        if (f45446i == null) {
            try {
                f45446i = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e10) {
                Log.w(f45445h, "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Rect getDirtyBounds() {
        return this.f45444f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        this.f45444f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f45444f;
        if (drawable == null || (method = f45446i) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e10) {
            Log.w(f45445h, "Error calling Drawable#isProjected() method", e10);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f45444f.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f45444f.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // H0.m, android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // H0.m, android.graphics.drawable.Drawable, H0.k
    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f45444f.setTint(i10);
        }
    }

    @Override // H0.m, android.graphics.drawable.Drawable, H0.k
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f45444f.setTintList(colorStateList);
        }
    }

    @Override // H0.m, android.graphics.drawable.Drawable, H0.k
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f45444f.setTintMode(mode);
        }
    }

    public n(o oVar, Resources resources) {
        super(oVar, resources);
        g();
    }
}
