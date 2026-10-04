package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.views.OptionsPopupView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class LongpressOptionsMenuBinding implements b {

    @NonNull
    public final OptionsPopupView deepShortcutsContainer;

    @NonNull
    private final OptionsPopupView rootView;

    private LongpressOptionsMenuBinding(@NonNull OptionsPopupView optionsPopupView, @NonNull OptionsPopupView optionsPopupView2) {
        this.rootView = optionsPopupView;
        this.deepShortcutsContainer = optionsPopupView2;
    }

    @NonNull
    public static LongpressOptionsMenuBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        OptionsPopupView optionsPopupView = (OptionsPopupView) view;
        return new LongpressOptionsMenuBinding(optionsPopupView, optionsPopupView);
    }

    @NonNull
    public static LongpressOptionsMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LongpressOptionsMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.longpress_options_menu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public OptionsPopupView getRoot() {
        return this.rootView;
    }
}
