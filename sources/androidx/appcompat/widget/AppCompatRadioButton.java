package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC2494t0;
import e.InterfaceC4346u;
import g.C4426a;
import h.C4472a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton implements androidx.core.widget.t, InterfaceC2494t0, D, androidx.core.widget.u {
    private C1504j mAppCompatEmojiTextHelper;
    private final C1499e mBackgroundTintHelper;
    private final C1501g mCompoundButtonHelper;
    private final r mTextHelper;

    public AppCompatRadioButton(Context context) {
        this(context, null);
    }

    @NonNull
    private C1504j a() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C1504j(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1499e c1499e = this.mBackgroundTintHelper;
        if (c1499e != null) {
            c1499e.b();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C1501g c1501g = this.mCompoundButtonHelper;
        return c1501g != null ? c1501g.b(compoundPaddingLeft) : compoundPaddingLeft;
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

    @Override // androidx.core.widget.t
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        C1501g c1501g = this.mCompoundButtonHelper;
        if (c1501g != null) {
            return c1501g.c();
        }
        return null;
    }

    @Override // androidx.core.widget.t
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C1501g c1501g = this.mCompoundButtonHelper;
        if (c1501g != null) {
            return c1501g.d();
        }
        return null;
    }

    @Override // androidx.core.widget.u
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    @Override // androidx.core.widget.u
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // androidx.appcompat.widget.D
    public boolean isEmojiCompatEnabled() {
        return a().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        a().d(z10);
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C1501g c1501g = this.mCompoundButtonHelper;
        if (c1501g != null) {
            c1501g.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    @e.T(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // androidx.appcompat.widget.D
    public void setEmojiCompatEnabled(boolean z10) {
        a().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(a().a(inputFilterArr));
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

    @Override // androidx.core.widget.t
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        C1501g c1501g = this.mCompoundButtonHelper;
        if (c1501g != null) {
            c1501g.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.t
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        C1501g c1501g = this.mCompoundButtonHelper;
        if (c1501g != null) {
            c1501g.h(mode);
        }
    }

    @Override // androidx.core.widget.u
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.u
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C4426a.b.f200743H2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        T.b(context);
        Q.a(this, getContext());
        C1501g c1501g = new C1501g(this);
        this.mCompoundButtonHelper = c1501g;
        c1501g.e(attributeSet, i10);
        C1499e c1499e = new C1499e(this);
        this.mBackgroundTintHelper = c1499e;
        c1499e.e(attributeSet, i10);
        r rVar = new r(this);
        this.mTextHelper = rVar;
        rVar.m(attributeSet, i10);
        a().c(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@InterfaceC4346u int i10) {
        setButtonDrawable(C4472a.b(getContext(), i10));
    }
}
