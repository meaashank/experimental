package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AppwidgetErrorBinding implements b {

    @NonNull
    private final TextView rootView;

    private AppwidgetErrorBinding(@NonNull TextView textView) {
        this.rootView = textView;
    }

    @NonNull
    public static AppwidgetErrorBinding bind(@NonNull View view) {
        if (view != null) {
            return new AppwidgetErrorBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static AppwidgetErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AppwidgetErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.appwidget_error, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
