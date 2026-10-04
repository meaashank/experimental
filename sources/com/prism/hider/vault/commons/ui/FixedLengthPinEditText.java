package com.prism.hider.vault.commons.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.prism.hider.vault.commons.ui.e;

/* JADX INFO: loaded from: classes6.dex */
public class FixedLengthPinEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173594a;

    public FixedLengthPinEditText(Context context) {
        this(context, null);
    }

    public int b() {
        return this.f173594a;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
    }

    public FixedLengthPinEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedLengthPinEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.o.lg, i10, 0);
        this.f173594a = typedArrayObtainStyledAttributes.getInt(e.o.mg, 0);
        typedArrayObtainStyledAttributes.recycle();
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f173594a)});
    }
}
