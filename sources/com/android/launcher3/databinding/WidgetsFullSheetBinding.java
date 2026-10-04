package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.views.RecyclerViewFastScroller;
import com.android.launcher3.views.TopRoundedCornerView;
import com.android.launcher3.widget.WidgetsFullSheet;
import com.android.launcher3.widget.WidgetsRecyclerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetsFullSheetBinding implements b {

    @NonNull
    public final TopRoundedCornerView container;

    @NonNull
    public final RecyclerViewFastScroller fastScroller;

    @NonNull
    public final TextView fastScrollerPopup;

    @NonNull
    private final WidgetsFullSheet rootView;

    @NonNull
    public final WidgetsRecyclerView widgetsListView;

    private WidgetsFullSheetBinding(@NonNull WidgetsFullSheet widgetsFullSheet, @NonNull TopRoundedCornerView topRoundedCornerView, @NonNull RecyclerViewFastScroller recyclerViewFastScroller, @NonNull TextView textView, @NonNull WidgetsRecyclerView widgetsRecyclerView) {
        this.rootView = widgetsFullSheet;
        this.container = topRoundedCornerView;
        this.fastScroller = recyclerViewFastScroller;
        this.fastScrollerPopup = textView;
        this.widgetsListView = widgetsRecyclerView;
    }

    @NonNull
    public static WidgetsFullSheetBinding bind(@NonNull View view) {
        int i10 = R.id.container;
        TopRoundedCornerView topRoundedCornerView = (TopRoundedCornerView) c.a(view, R.id.container);
        if (topRoundedCornerView != null) {
            i10 = R.id.fast_scroller;
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) c.a(view, R.id.fast_scroller);
            if (recyclerViewFastScroller != null) {
                i10 = R.id.fast_scroller_popup;
                TextView textView = (TextView) c.a(view, R.id.fast_scroller_popup);
                if (textView != null) {
                    i10 = R.id.widgets_list_view;
                    WidgetsRecyclerView widgetsRecyclerView = (WidgetsRecyclerView) c.a(view, R.id.widgets_list_view);
                    if (widgetsRecyclerView != null) {
                        return new WidgetsFullSheetBinding((WidgetsFullSheet) view, topRoundedCornerView, recyclerViewFastScroller, textView, widgetsRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static WidgetsFullSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WidgetsFullSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.widgets_full_sheet, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public WidgetsFullSheet getRoot() {
        return this.rootView;
    }
}
