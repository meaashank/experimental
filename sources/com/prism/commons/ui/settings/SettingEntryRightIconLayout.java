package com.prism.commons.ui.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import c6.C2947b;

/* JADX INFO: loaded from: classes5.dex */
public class SettingEntryRightIconLayout extends SettingEntryLayout {
    public SettingEntryRightIconLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.prism.commons.ui.settings.SettingEntryLayout, com.prism.commons.ui.FromLayoutFileLayout
    public int a() {
        return C2947b.k.f129434Y;
    }

    @Override // com.prism.commons.ui.settings.SettingEntryLayout, com.prism.commons.ui.FromLayoutFileLayout
    public void b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super.b(context, attributeSet);
        ImageView imageView = (ImageView) findViewById(C2947b.h.f129147g5);
        Drawable drawable = context.getTheme().obtainStyledAttributes(attributeSet, C2947b.o.Bt, 0, 0).getDrawable(C2947b.o.Ct);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void i(int i10) {
        ((ImageView) findViewById(C2947b.h.f129147g5)).setImageResource(i10);
    }

    public void j(Drawable drawable) {
        ((ImageView) findViewById(C2947b.h.f129147g5)).setImageDrawable(drawable);
    }

    @Override // com.prism.commons.ui.settings.SettingEntryLayout, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        ImageView imageView = (ImageView) findViewById(C2947b.h.f129147g5);
        if (imageView != null) {
            imageView.setEnabled(z10);
        }
    }

    public SettingEntryRightIconLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
