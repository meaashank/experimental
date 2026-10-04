package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.BubbleTextView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AllAppsIconBinding implements b {

    @NonNull
    public final BubbleTextView icon;

    @NonNull
    private final BubbleTextView rootView;

    private AllAppsIconBinding(@NonNull BubbleTextView bubbleTextView, @NonNull BubbleTextView bubbleTextView2) {
        this.rootView = bubbleTextView;
        this.icon = bubbleTextView2;
    }

    @NonNull
    public static AllAppsIconBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BubbleTextView bubbleTextView = (BubbleTextView) view;
        return new AllAppsIconBinding(bubbleTextView, bubbleTextView);
    }

    @NonNull
    public static AllAppsIconBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AllAppsIconBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.all_apps_icon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public BubbleTextView getRoot() {
        return this.rootView;
    }
}
