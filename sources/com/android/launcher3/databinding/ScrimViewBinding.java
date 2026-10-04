package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.views.ScrimView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ScrimViewBinding implements b {

    @NonNull
    private final ScrimView rootView;

    @NonNull
    public final ScrimView scrimView;

    private ScrimViewBinding(@NonNull ScrimView scrimView, @NonNull ScrimView scrimView2) {
        this.rootView = scrimView;
        this.scrimView = scrimView2;
    }

    @NonNull
    public static ScrimViewBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ScrimView scrimView = (ScrimView) view;
        return new ScrimViewBinding(scrimView, scrimView);
    }

    @NonNull
    public static ScrimViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ScrimViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.scrim_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public ScrimView getRoot() {
        return this.rootView;
    }
}
