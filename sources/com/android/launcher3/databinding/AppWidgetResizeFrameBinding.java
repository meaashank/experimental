package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.AppWidgetResizeFrame;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AppWidgetResizeFrameBinding implements b {

    @NonNull
    private final AppWidgetResizeFrame rootView;

    private AppWidgetResizeFrameBinding(@NonNull AppWidgetResizeFrame appWidgetResizeFrame) {
        this.rootView = appWidgetResizeFrame;
    }

    @NonNull
    public static AppWidgetResizeFrameBinding bind(@NonNull View view) {
        if (view != null) {
            return new AppWidgetResizeFrameBinding((AppWidgetResizeFrame) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static AppWidgetResizeFrameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AppWidgetResizeFrameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.app_widget_resize_frame, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public AppWidgetResizeFrame getRoot() {
        return this.rootView;
    }
}
