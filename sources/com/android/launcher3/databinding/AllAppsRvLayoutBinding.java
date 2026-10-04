package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.allapps.AllAppsRecyclerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AllAppsRvLayoutBinding implements b {

    @NonNull
    public final AllAppsRecyclerView appsListView;

    @NonNull
    private final AllAppsRecyclerView rootView;

    private AllAppsRvLayoutBinding(@NonNull AllAppsRecyclerView allAppsRecyclerView, @NonNull AllAppsRecyclerView allAppsRecyclerView2) {
        this.rootView = allAppsRecyclerView;
        this.appsListView = allAppsRecyclerView2;
    }

    @NonNull
    public static AllAppsRvLayoutBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AllAppsRecyclerView allAppsRecyclerView = (AllAppsRecyclerView) view;
        return new AllAppsRvLayoutBinding(allAppsRecyclerView, allAppsRecyclerView);
    }

    @NonNull
    public static AllAppsRvLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AllAppsRvLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.all_apps_rv_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public AllAppsRecyclerView getRoot() {
        return this.rootView;
    }
}
