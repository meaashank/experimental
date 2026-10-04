package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetsScrollContainerBinding implements b {

    @NonNull
    private final HorizontalScrollView rootView;

    @NonNull
    public final LinearLayout widgetsCellList;

    @NonNull
    public final HorizontalScrollView widgetsScrollContainer;

    private WidgetsScrollContainerBinding(@NonNull HorizontalScrollView horizontalScrollView, @NonNull LinearLayout linearLayout, @NonNull HorizontalScrollView horizontalScrollView2) {
        this.rootView = horizontalScrollView;
        this.widgetsCellList = linearLayout;
        this.widgetsScrollContainer = horizontalScrollView2;
    }

    @NonNull
    public static WidgetsScrollContainerBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.widgets_cell_list);
        if (linearLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.widgets_cell_list)));
        }
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view;
        return new WidgetsScrollContainerBinding(horizontalScrollView, linearLayout, horizontalScrollView);
    }

    @NonNull
    public static WidgetsScrollContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WidgetsScrollContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.widgets_scroll_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public HorizontalScrollView getRoot() {
        return this.rootView;
    }
}
