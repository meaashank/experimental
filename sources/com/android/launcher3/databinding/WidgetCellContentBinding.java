package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.d;
import com.android.launcher3.widget.WidgetImageView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetCellContentBinding implements b {

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView widgetDims;

    @NonNull
    public final TextView widgetName;

    @NonNull
    public final WidgetImageView widgetPreview;

    private WidgetCellContentBinding(@NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WidgetImageView widgetImageView) {
        this.rootView = view;
        this.widgetDims = textView;
        this.widgetName = textView2;
        this.widgetPreview = widgetImageView;
    }

    @NonNull
    public static WidgetCellContentBinding bind(@NonNull View view) {
        int i10 = R.id.widget_dims;
        TextView textView = (TextView) c.a(view, R.id.widget_dims);
        if (textView != null) {
            i10 = R.id.widget_name;
            TextView textView2 = (TextView) c.a(view, R.id.widget_name);
            if (textView2 != null) {
                i10 = R.id.widget_preview;
                WidgetImageView widgetImageView = (WidgetImageView) c.a(view, R.id.widget_preview);
                if (widgetImageView != null) {
                    return new WidgetCellContentBinding(view, textView, textView2, widgetImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static WidgetCellContentBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException(d.f107893V1);
        }
        layoutInflater.inflate(R.layout.widget_cell_content, viewGroup);
        return bind(viewGroup);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
