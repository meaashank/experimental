package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.popup.PopupContainerWithArrow;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PopupContainerBinding implements b {

    @NonNull
    public final PopupContainerWithArrow deepShortcutsContainer;

    @NonNull
    private final PopupContainerWithArrow rootView;

    private PopupContainerBinding(@NonNull PopupContainerWithArrow popupContainerWithArrow, @NonNull PopupContainerWithArrow popupContainerWithArrow2) {
        this.rootView = popupContainerWithArrow;
        this.deepShortcutsContainer = popupContainerWithArrow2;
    }

    @NonNull
    public static PopupContainerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        PopupContainerWithArrow popupContainerWithArrow = (PopupContainerWithArrow) view;
        return new PopupContainerBinding(popupContainerWithArrow, popupContainerWithArrow);
    }

    @NonNull
    public static PopupContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static PopupContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.popup_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public PopupContainerWithArrow getRoot() {
        return this.rootView;
    }
}
