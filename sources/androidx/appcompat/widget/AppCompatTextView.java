package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.InterfaceC2494t0;
import e.InterfaceC4346u;
import h.C4472a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC2494t0, androidx.core.widget.u, androidx.core.widget.b, D {
    private final C1499e mBackgroundTintHelper;

    @NonNull
    private C1504j mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Nullable
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;

    @Nullable
    private a mSuperCaller;
    private final C1511q mTextClassifierHelper;
    private final r mTextHelper;

    public interface a {
        TextClassifier a();

        void b(@e.P int i10);

        void c(@e.P int i10);

        void d(@Nullable TextClassifier textClassifier);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10);

        void setAutoSizeTextTypeWithDefaults(int i10);
    }

    @e.T(api = 26)
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier a() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void d(@Nullable TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeWithDefaults(int i10) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    @e.T(api = 28)
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void b(@e.P int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void c(@e.P int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private C1504j d() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C1504j(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public final void c() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.q.C(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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
            return getSuperCaller().getAutoSizeMaxTextSize();
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
            return getSuperCaller().getAutoSizeMinTextSize();
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
            return getSuperCaller().getAutoSizeStepGranularity();
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
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        r rVar = this.mTextHelper;
        return rVar != null ? rVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (h0.f86390c) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.q.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.q.j(this);
    }

    @e.T(api = 26)
    @e.e0
    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.mSuperCaller = new c();
            } else if (i10 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        c();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @e.T(api = 26)
    public TextClassifier getTextClassifier() {
        C1511q c1511q;
        return (Build.VERSION.SDK_INT >= 28 || (c1511q = this.mTextClassifierHelper) == null) ? getSuperCaller().a() : c1511q.a();
    }

    @NonNull
    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return androidx.core.widget.q.o(this);
    }

    @Override // androidx.appcompat.widget.D
    public boolean isEmojiCompatEnabled() {
        return d().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        C1505k.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
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
        d().d(z10);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (h0.f86390c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
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
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
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
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i10);
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

    @Override // android.widget.TextView
    @e.T(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.appcompat.widget.D
    public void setEmojiCompatEnabled(boolean z10) {
        d().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(d().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@e.D(from = 0) @e.P int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            androidx.core.widget.q.y(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@e.D(from = 0) @e.P int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i10);
        } else {
            androidx.core.widget.q.z(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@e.D(from = 0) @e.P int i10) {
        androidx.core.widget.q.A(this, i10);
    }

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat) {
        androidx.core.widget.q.C(this, precomputedTextCompat);
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
    @e.T(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        C1511q c1511q;
        if (Build.VERSION.SDK_INT >= 28 || (c1511q = this.mTextClassifierHelper) == null) {
            getSuperCaller().d(textClassifier);
        } else {
            c1511q.f86413b = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull PrecomputedTextCompat.Params params) {
        androidx.core.widget.q.E(this, params);
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

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i10) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface typefaceB = (typeface == null || i10 <= 0) ? null : G0.V.b(getContext(), typeface, i10);
        this.mIsSetTypefaceProcessing = true;
        if (typefaceB != null) {
            typeface = typefaceB;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        T.b(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        Q.a(this, getContext());
        C1499e c1499e = new C1499e(this);
        this.mBackgroundTintHelper = c1499e;
        c1499e.e(attributeSet, i10);
        r rVar = new r(this);
        this.mTextHelper = rVar;
        rVar.m(attributeSet, i10);
        rVar.b();
        C1511q c1511q = new C1511q();
        c1511q.f86412a = this;
        this.mTextClassifierHelper = c1511q;
        d().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    @e.T(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? C4472a.b(context, i10) : null, i11 != 0 ? C4472a.b(context, i11) : null, i12 != 0 ? C4472a.b(context, i12) : null, i13 != 0 ? C4472a.b(context, i13) : null);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C4472a.b(context, i10) : null, i11 != 0 ? C4472a.b(context, i11) : null, i12 != 0 ? C4472a.b(context, i12) : null, i13 != 0 ? C4472a.b(context, i13) : null);
        r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.p();
        }
    }
}
