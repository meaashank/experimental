package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.H;
import g.C4426a;
import l.AbstractC5126b;

/* JADX INFO: loaded from: classes.dex */
public class w extends androidx.activity.o implements InterfaceC1487d {
    private AbstractC1490g mDelegate;
    private final H.a mKeyDispatcher;

    public w(@NonNull Context context) {
        this(context, 0);
    }

    public static int getThemeResId(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4426a.b.f200831Z0, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().J();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.H.e(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@e.C int i10) {
        return (T) getDelegate().q(i10);
    }

    @NonNull
    public AbstractC1490g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC1490g.m(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().A();
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        getDelegate().D();
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().C();
        super.onCreate(bundle);
        getDelegate().I(bundle);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().O();
    }

    @Override // androidx.appcompat.app.InterfaceC1487d
    @Nullable
    public AbstractC5126b onWindowStartingSupportActionMode(AbstractC5126b.a aVar) {
        return null;
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(@e.G int i10) {
        getDelegate().V(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().f0(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().R(i10);
    }

    public w(@NonNull Context context, int i10) {
        super(context, getThemeResId(context, i10));
        this.mKeyDispatcher = new H.a() { // from class: androidx.appcompat.app.v
            @Override // androidx.core.view.H.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f85483a.superDispatchKeyEvent(keyEvent);
            }
        };
        AbstractC1490g delegate = getDelegate();
        delegate.e0(getThemeResId(context, i10));
        delegate.I(null);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(@NonNull View view) {
        getDelegate().W(view);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().X(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        getDelegate().f0(getContext().getString(i10));
    }

    public w(@NonNull Context context, boolean z10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.mKeyDispatcher = new H.a() { // from class: androidx.appcompat.app.v
            @Override // androidx.core.view.H.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f85483a.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z10);
        setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.InterfaceC1487d
    public void onSupportActionModeFinished(AbstractC5126b abstractC5126b) {
    }

    @Override // androidx.appcompat.app.InterfaceC1487d
    public void onSupportActionModeStarted(AbstractC5126b abstractC5126b) {
    }
}
