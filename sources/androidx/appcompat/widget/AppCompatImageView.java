package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC2494t0;
import e.InterfaceC4346u;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements InterfaceC2494t0, androidx.core.widget.v {
    private final C1499e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C1506l mImageHelper;

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            c1499e.b();
        }
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            c1506l.c();
        }
    }

    @Override // androidx.core.view.InterfaceC2494t0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            return c1499e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC2494t0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            return c1499e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            return c1506l.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            return c1506l.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            c1499e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4346u int i10) {
        super.setBackgroundResource(i10);
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            c1499e.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            c1506l.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null && drawable != null && !this.mHasLevel) {
            c1506l.h(drawable);
        }
        super.setImageDrawable(drawable);
        C1506l c1506l2 = this.mImageHelper;
        if (c1506l2 != null) {
            c1506l2.c();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@InterfaceC4346u int i10) {
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            c1506l.i(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            c1506l.c();
        }
    }

    @Override // androidx.core.view.InterfaceC2494t0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            c1499e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC2494t0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            c1499e.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            c1506l.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.v
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        C1506l c1506l = this.mImageHelper;
        if (c1506l != null) {
            c1506l.l(mode);
        }
    }

    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        T.b(context);
        this.mHasLevel = false;
        Q.a(this, getContext());
        C1499e c1499e = new C1499e(this);
        this.mBackgroundTintHelper = c1499e;
        c1499e.e(attributeSet, i10);
        C1506l c1506l = new C1506l(this);
        this.mImageHelper = c1506l;
        c1506l.g(attributeSet, i10);
    }
}
