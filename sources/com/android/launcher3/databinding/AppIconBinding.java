package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.views.DoubleShadowBubbleTextView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AppIconBinding implements b {

    @NonNull
    private final DoubleShadowBubbleTextView rootView;

    private AppIconBinding(@NonNull DoubleShadowBubbleTextView doubleShadowBubbleTextView) {
        this.rootView = doubleShadowBubbleTextView;
    }

    @NonNull
    public static AppIconBinding bind(@NonNull View view) {
        if (view != null) {
            return new AppIconBinding((DoubleShadowBubbleTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static AppIconBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AppIconBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.app_icon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public DoubleShadowBubbleTextView getRoot() {
        return this.rootView;
    }
}
