package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;
import com.prism.hider.negativescreen.MinusOneScreenView;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderNegativeScreenContainerBinding implements b {

    @NonNull
    public final MinusOneScreenView negativeScreenContainer;

    @NonNull
    private final MinusOneScreenView rootView;

    private HiderNegativeScreenContainerBinding(@NonNull MinusOneScreenView minusOneScreenView, @NonNull MinusOneScreenView minusOneScreenView2) {
        this.rootView = minusOneScreenView;
        this.negativeScreenContainer = minusOneScreenView2;
    }

    @NonNull
    public static HiderNegativeScreenContainerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MinusOneScreenView minusOneScreenView = (MinusOneScreenView) view;
        return new HiderNegativeScreenContainerBinding(minusOneScreenView, minusOneScreenView);
    }

    @NonNull
    public static HiderNegativeScreenContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderNegativeScreenContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_negative_screen_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public MinusOneScreenView getRoot() {
        return this.rootView;
    }
}
