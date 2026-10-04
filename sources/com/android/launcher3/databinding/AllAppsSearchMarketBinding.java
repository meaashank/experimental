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
public final class AllAppsSearchMarketBinding implements b {

    @NonNull
    private final TextView rootView;

    @NonNull
    public final TextView searchMarketText;

    private AllAppsSearchMarketBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.searchMarketText = textView2;
    }

    @NonNull
    public static AllAppsSearchMarketBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new AllAppsSearchMarketBinding(textView, textView);
    }

    @NonNull
    public static AllAppsSearchMarketBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AllAppsSearchMarketBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.all_apps_search_market, viewGroup, false);
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
