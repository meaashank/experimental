package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.BubbleTextView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetsListRowViewBinding implements b {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final BubbleTextView section;

    @NonNull
    public final LinearLayout widgetsCellListContainer;

    private WidgetsListRowViewBinding(@NonNull LinearLayout linearLayout, @NonNull BubbleTextView bubbleTextView, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.section = bubbleTextView;
        this.widgetsCellListContainer = linearLayout2;
    }

    @NonNull
    public static WidgetsListRowViewBinding bind(@NonNull View view) {
        BubbleTextView bubbleTextView = (BubbleTextView) c.a(view, R.id.section);
        if (bubbleTextView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.section)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new WidgetsListRowViewBinding(linearLayout, bubbleTextView, linearLayout);
    }

    @NonNull
    public static WidgetsListRowViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WidgetsListRowViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.widgets_list_row_view, viewGroup, false);
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
