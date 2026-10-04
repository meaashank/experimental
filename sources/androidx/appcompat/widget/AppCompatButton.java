package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC2494t0;
import e.InterfaceC4346u;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC2494t0, androidx.core.widget.b, androidx.core.widget.u, D {

    @NonNull
    private C1504j mAppCompatEmojiTextHelper;
    private final C1499e mBackgroundTintHelper;
    private final r mTextHelper;

    public AppCompatButton(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private C1504j a() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C1504j(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (h0.f86390c) {
            return super.getAutoSizeMaxTextSize();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (h0.f86390c) {
            return super.getAutoSizeMinTextSize();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (h0.f86390c) {
            return super.getAutoSizeStepGranularity();
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (h0.f86390c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        r rVar = this.mTextHelper;
        return rVar != null ? rVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (h0.f86390c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.q.F(super.getCustomSelectionActionModeCallback());
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r rVar = this.mTextHelper;
        if (rVar == null || h0.f86390c || !rVar.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        a().d(z10);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (h0.f86390c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (h0.f86390c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (h0.f86390c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.v(i10);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.appcompat.widget.D
    public void setEmojiCompatEnabled(boolean z10) {
        a().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(a().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.s(z10);
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (h0.f86390c) {
            super.setTextSize(i10, f10);
            return;
        }
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.A(i10, f10);
        }
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C4426a.b.f200919o0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        T.b(context);
        Q.a(this, getContext());
        C1499e c1499e = new C1499e(this);
        this.mBackgroundTintHelper = c1499e;
        c1499e.e(attributeSet, i10);
        r rVar = new r(this);
        this.mTextHelper = rVar;
        rVar.m(attributeSet, i10);
        rVar.b();
        a().c(attributeSet, i10);
    }
}
