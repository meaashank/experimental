package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC2494t0;
import e.InterfaceC4346u;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton implements InterfaceC2494t0, D, androidx.core.widget.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1499e f85913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f85914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1504j f85915c;

    public AppCompatToggleButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private C1504j a() {
        if (this.f85915c == null) {
            this.f85915c = new C1504j(this);
        }
        return this.f85915c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1499e c1499e = this.f85913a;
        if (c1499e != null) {
            c1499e.b();
        }
        r rVar = this.f85914b;
        if (rVar != null) {
            rVar.b();
        }
    }

    @Override // androidx.core.view.InterfaceC2494t0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C1499e c1499e = this.f85913a;
        if (c1499e != null) {
            return c1499e.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC2494t0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1499e c1499e = this.f85913a;
        if (c1499e != null) {
            return c1499e.d();
        }
        return null;
    }

    @Override // androidx.core.widget.u
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f85914b.j();
    }

    @Override // androidx.core.widget.u
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f85914b.k();
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

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1499e c1499e = this.f85913a;
        if (c1499e != null) {
            c1499e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4346u int i10) {
        super.setBackgroundResource(i10);
        C1499e c1499e = this.f85913a;
        if (c1499e != null) {
            c1499e.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f85914b;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    @e.T(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        r rVar = this.f85914b;
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
        C1499e c1499e = this.f85913a;
        if (c1499e != null) {
            c1499e.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC2494t0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C1499e c1499e = this.f85913a;
        if (c1499e != null) {
            c1499e.j(mode);
        }
    }

    @Override // androidx.core.widget.u
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f85914b.w(colorStateList);
        this.f85914b.b();
    }

    @Override // androidx.core.widget.u
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f85914b.x(mode);
        this.f85914b.b();
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Q.a(this, getContext());
        C1499e c1499e = new C1499e(this);
        this.f85913a = c1499e;
        c1499e.e(attributeSet, i10);
        r rVar = new r(this);
        this.f85914b = rVar;
        rVar.m(attributeSet, i10);
        a().c(attributeSet, i10);
    }
}
