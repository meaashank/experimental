package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.allapps.search.AppsSearchContainerLayout;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchContainerAllAppsBinding implements b {

    @NonNull
    private final AppsSearchContainerLayout rootView;

    @NonNull
    public final AppsSearchContainerLayout searchContainerAllApps;

    private SearchContainerAllAppsBinding(@NonNull AppsSearchContainerLayout appsSearchContainerLayout, @NonNull AppsSearchContainerLayout appsSearchContainerLayout2) {
        this.rootView = appsSearchContainerLayout;
        this.searchContainerAllApps = appsSearchContainerLayout2;
    }

    @NonNull
    public static SearchContainerAllAppsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppsSearchContainerLayout appsSearchContainerLayout = (AppsSearchContainerLayout) view;
        return new SearchContainerAllAppsBinding(appsSearchContainerLayout, appsSearchContainerLayout);
    }

    @NonNull
    public static SearchContainerAllAppsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SearchContainerAllAppsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.search_container_all_apps, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public AppsSearchContainerLayout getRoot() {
        return this.rootView;
    }
}
