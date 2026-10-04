package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.d;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderPartSettingContactUsBinding implements b {

    @NonNull
    private final View rootView;

    private HiderPartSettingContactUsBinding(@NonNull View view) {
        this.rootView = view;
    }

    @NonNull
    public static HiderPartSettingContactUsBinding bind(@NonNull View view) {
        if (view != null) {
            return new HiderPartSettingContactUsBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static HiderPartSettingContactUsBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException(d.f107893V1);
        }
        layoutInflater.inflate(R.layout.hider_part_setting_contact_us, viewGroup);
        return bind(viewGroup);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
