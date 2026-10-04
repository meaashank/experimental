package com.google.android.material.textfield;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements TextInputLayout.LengthCounter {
    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public final int countLength(Editable editable) {
        return TextInputLayout.b(editable);
    }
}
