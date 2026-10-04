package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;
import com.prism.commons.ui.settings.SettingEntryRightIconLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderItemFeedbackBinding implements b {

    @NonNull
    private final SettingEntryRightIconLayout rootView;

    private HiderItemFeedbackBinding(@NonNull SettingEntryRightIconLayout settingEntryRightIconLayout) {
        this.rootView = settingEntryRightIconLayout;
    }

    @NonNull
    public static HiderItemFeedbackBinding bind(@NonNull View view) {
        if (view != null) {
            return new HiderItemFeedbackBinding((SettingEntryRightIconLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static HiderItemFeedbackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderItemFeedbackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_item_feedback, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public SettingEntryRightIconLayout getRoot() {
        return this.rootView;
    }
}
