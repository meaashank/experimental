package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C2507z0;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.InterfaceC2456g0;
import androidx.core.view.InterfaceC2494t0;
import b1.C2776c;
import e.InterfaceC4346u;
import g.C4426a;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC2494t0, InterfaceC2456g0, D, androidx.core.widget.u {

    @NonNull
    private final C1503i mAppCompatEmojiEditTextHelper;
    private final C1499e mBackgroundTintHelper;
    private final androidx.core.widget.r mDefaultOnReceiveContentListener;

    @Nullable
    private a mSuperCaller;
    private final C1511q mTextClassifierHelper;
    private final r mTextHelper;

    @e.T(api = 26)
    public class a {
        public a() {
        }

        @Nullable
        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    @e.T(26)
    @e.e0
    public final a a() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    @NonNull
    @e.T(api = 26)
    public TextClassifier getTextClassifier() {
        C1511q c1511q;
        return (Build.VERSION.SDK_INT >= 28 || (c1511q = this.mTextClassifierHelper) == null) ? a().a() : c1511q.a();
    }

    public void initEmojiKeyListener(C1503i c1503i) {
        KeyListener keyListener = getKeyListener();
        if (c1503i.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c1503i.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // androidx.appcompat.widget.D
    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.c();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] strArrK0;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        C1505k.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrK0 = C2507z0.k0(this)) != null) {
            C2776c.i(editorInfo, strArrK0);
            inputConnectionOnCreateInputConnection = b1.f.e(inputConnectionOnCreateInputConnection, editorInfo, b1.f.c(this));
        }
        return this.mAppCompatEmojiEditTextHelper.e(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C1509o.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.InterfaceC2456g0
    @Nullable
    public ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat contentInfoCompat) {
        return this.mDefaultOnReceiveContentListener.a(this, contentInfoCompat);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C1509o.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
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
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.appcompat.widget.D
    public void setEmojiCompatEnabled(boolean z10) {
        this.mAppCompatEmojiEditTextHelper.f(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
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
            a().b(textClassifier);
        } else {
            c1511q.f86413b = textClassifier;
        }
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C4426a.b.f200945t1);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
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
        C1511q c1511q = new C1511q();
        c1511q.f86412a = this;
        this.mTextClassifierHelper = c1511q;
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.r();
        C1503i c1503i = new C1503i(this);
        this.mAppCompatEmojiEditTextHelper = c1503i;
        c1503i.d(attributeSet, i10);
        initEmojiKeyListener(c1503i);
    }
}
