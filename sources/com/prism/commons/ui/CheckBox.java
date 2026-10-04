package com.prism.commons.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;

/* JADX INFO: loaded from: classes5.dex */
public class CheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f162012a;

    public CheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void b(boolean z10) {
        super.setOnCheckedChangeListener(null);
        super.setChecked(z10);
        super.setOnCheckedChangeListener(this.f162012a);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f162012a = onCheckedChangeListener;
        super.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public CheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public CheckBox(Context context) {
        super(context, null);
    }
}
