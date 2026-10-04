package com.android.launcher3;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.android.launcher3.util.UiThreadHelper;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedEditText extends EditText {
    private OnBackKeyListener mBackKeyListener;
    private boolean mForceDisableSuggestions;
    private boolean mShowImeAfterFirstLayout;

    public interface OnBackKeyListener {
        boolean onBackKey();
    }

    public ExtendedEditText(Context context) {
        super(context);
        this.mForceDisableSuggestions = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean showSoftInput() {
        return requestFocus() && ((InputMethodManager) getContext().getSystemService(G7.a.f45348f)).showSoftInput(this, 1);
    }

    public void dispatchBackKey() {
        UiThreadHelper.hideKeyboardAsync(getContext(), getWindowToken());
        OnBackKeyListener onBackKeyListener = this.mBackKeyListener;
        if (onBackKeyListener != null) {
            onBackKeyListener.onBackKey();
        }
    }

    public void forceDisableSuggestions(boolean z10) {
        this.mForceDisableSuggestions = z10;
    }

    @Override // android.widget.TextView
    public boolean isSuggestionsEnabled() {
        return !this.mForceDisableSuggestions && super.isSuggestionsEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i10, keyEvent);
        }
        OnBackKeyListener onBackKeyListener = this.mBackKeyListener;
        if (onBackKeyListener != null) {
            return onBackKeyListener.onBackKey();
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.mShowImeAfterFirstLayout) {
            post(new Runnable() { // from class: com.android.launcher3.ExtendedEditText.1
                @Override // java.lang.Runnable
                public void run() {
                    ExtendedEditText.this.showSoftInput();
                    ExtendedEditText.this.mShowImeAfterFirstLayout = false;
                }
            });
        }
    }

    public void reset() {
        View viewFocusSearch;
        if (!TextUtils.isEmpty(getText())) {
            setText("");
        }
        if (isFocused() && (viewFocusSearch = focusSearch(130)) != null) {
            viewFocusSearch.requestFocus();
        }
        UiThreadHelper.hideKeyboardAsync(getContext(), getWindowToken());
    }

    public void setOnBackKeyListener(OnBackKeyListener onBackKeyListener) {
        this.mBackKeyListener = onBackKeyListener;
    }

    public void showKeyboard() {
        this.mShowImeAfterFirstLayout = !showSoftInput();
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mForceDisableSuggestions = false;
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mForceDisableSuggestions = false;
    }
}
