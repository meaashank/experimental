package com.prism.commons.ui.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import c6.C2947b;

/* JADX INFO: loaded from: classes5.dex */
public class SettingEntrySwitchLayout extends SettingEntryLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SwitchCompat f162023h;

    public SettingEntrySwitchLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.prism.commons.ui.settings.SettingEntryLayout, com.prism.commons.ui.FromLayoutFileLayout
    public int a() {
        return C2947b.k.f129436Z;
    }

    @Override // com.prism.commons.ui.settings.SettingEntryLayout, com.prism.commons.ui.FromLayoutFileLayout
    public void b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super.b(context, attributeSet);
        this.f162023h = (SwitchCompat) findViewById(C2947b.h.f129155h5);
    }

    public void i(boolean z10) {
        this.f162023h.setChecked(z10);
    }

    public void j(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f162023h.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // com.prism.commons.ui.settings.SettingEntryLayout, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f162023h.setEnabled(z10);
    }

    public SettingEntrySwitchLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
