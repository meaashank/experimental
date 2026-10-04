package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.widget.WidgetsBottomSheet;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetsBottomSheetBinding implements b {

    @NonNull
    private final WidgetsBottomSheet rootView;

    @NonNull
    public final TextView title;

    @NonNull
    public final WidgetsScrollContainerBinding widgets;

    private WidgetsBottomSheetBinding(@NonNull WidgetsBottomSheet widgetsBottomSheet, @NonNull TextView textView, @NonNull WidgetsScrollContainerBinding widgetsScrollContainerBinding) {
        this.rootView = widgetsBottomSheet;
        this.title = textView;
        this.widgets = widgetsScrollContainerBinding;
    }

    @NonNull
    public static WidgetsBottomSheetBinding bind(@NonNull View view) {
        int i10 = R.id.title;
        TextView textView = (TextView) c.a(view, R.id.title);
        if (textView != null) {
            i10 = R.id.widgets;
            View viewA = c.a(view, R.id.widgets);
            if (viewA != null) {
                return new WidgetsBottomSheetBinding((WidgetsBottomSheet) view, textView, WidgetsScrollContainerBinding.bind(viewA));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static WidgetsBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WidgetsBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.widgets_bottom_sheet, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public WidgetsBottomSheet getRoot() {
        return this.rootView;
    }
}
