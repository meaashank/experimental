package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.allapps.AllAppsContainerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AllAppsBinding implements b {

    @NonNull
    public final AllAppsExtensionBinding allAppsExtension;

    @NonNull
    public final LinearLayout allAppsFooter;

    @NonNull
    public final AllAppsContainerView appsView;

    @NonNull
    private final AllAppsContainerView rootView;

    @NonNull
    public final SearchContainerAllAppsBinding searchContainerAllApps;

    private AllAppsBinding(@NonNull AllAppsContainerView allAppsContainerView, @NonNull AllAppsExtensionBinding allAppsExtensionBinding, @NonNull LinearLayout linearLayout, @NonNull AllAppsContainerView allAppsContainerView2, @NonNull SearchContainerAllAppsBinding searchContainerAllAppsBinding) {
        this.rootView = allAppsContainerView;
        this.allAppsExtension = allAppsExtensionBinding;
        this.allAppsFooter = linearLayout;
        this.appsView = allAppsContainerView2;
        this.searchContainerAllApps = searchContainerAllAppsBinding;
    }

    @NonNull
    public static AllAppsBinding bind(@NonNull View view) {
        int i10 = R.id.all_apps_extension;
        View viewA = c.a(view, R.id.all_apps_extension);
        if (viewA != null) {
            AllAppsExtensionBinding allAppsExtensionBindingBind = AllAppsExtensionBinding.bind(viewA);
            i10 = R.id.all_apps_footer;
            LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.all_apps_footer);
            if (linearLayout != null) {
                AllAppsContainerView allAppsContainerView = (AllAppsContainerView) view;
                i10 = R.id.search_container_all_apps;
                View viewA2 = c.a(view, R.id.search_container_all_apps);
                if (viewA2 != null) {
                    return new AllAppsBinding(allAppsContainerView, allAppsExtensionBindingBind, linearLayout, allAppsContainerView, SearchContainerAllAppsBinding.bind(viewA2));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static AllAppsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AllAppsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.all_apps, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public AllAppsContainerView getRoot() {
        return this.rootView;
    }
}
