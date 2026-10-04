package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.dragndrop.LivePreviewWidgetCell;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AddItemConfirmationActivityBinding implements b {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LivePreviewWidgetCell widgetCell;

    private AddItemConfirmationActivityBinding(@NonNull LinearLayout linearLayout, @NonNull LivePreviewWidgetCell livePreviewWidgetCell) {
        this.rootView = linearLayout;
        this.widgetCell = livePreviewWidgetCell;
    }

    @NonNull
    public static AddItemConfirmationActivityBinding bind(@NonNull View view) {
        LivePreviewWidgetCell livePreviewWidgetCell = (LivePreviewWidgetCell) c.a(view, R.id.widget_cell);
        if (livePreviewWidgetCell != null) {
            return new AddItemConfirmationActivityBinding((LinearLayout) view, livePreviewWidgetCell);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.widget_cell)));
    }

    @NonNull
    public static AddItemConfirmationActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AddItemConfirmationActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.add_item_confirmation_activity, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
