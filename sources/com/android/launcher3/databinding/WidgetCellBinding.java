package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.widget.WidgetCell;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetCellBinding implements b {

    @NonNull
    private final WidgetCell rootView;

    private WidgetCellBinding(@NonNull WidgetCell widgetCell) {
        this.rootView = widgetCell;
    }

    @NonNull
    public static WidgetCellBinding bind(@NonNull View view) {
        if (view != null) {
            return new WidgetCellBinding((WidgetCell) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static WidgetCellBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WidgetCellBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.widget_cell, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public WidgetCell getRoot() {
        return this.rootView;
    }
}
