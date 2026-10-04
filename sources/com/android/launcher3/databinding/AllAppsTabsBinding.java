package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.allapps.AllAppsPagedView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AllAppsTabsBinding implements b {

    @NonNull
    public final AllAppsPagedView allAppsTabsViewPager;

    @NonNull
    private final AllAppsPagedView rootView;

    private AllAppsTabsBinding(@NonNull AllAppsPagedView allAppsPagedView, @NonNull AllAppsPagedView allAppsPagedView2) {
        this.rootView = allAppsPagedView;
        this.allAppsTabsViewPager = allAppsPagedView2;
    }

    @NonNull
    public static AllAppsTabsBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AllAppsPagedView allAppsPagedView = (AllAppsPagedView) view;
        return new AllAppsTabsBinding(allAppsPagedView, allAppsPagedView);
    }

    @NonNull
    public static AllAppsTabsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AllAppsTabsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.all_apps_tabs, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public AllAppsPagedView getRoot() {
        return this.rootView;
    }
}
