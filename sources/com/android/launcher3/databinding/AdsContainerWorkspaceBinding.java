package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;
import com.prism.hider.ad.ui.AdsContainerView;

/* JADX INFO: loaded from: classes2.dex */
public final class AdsContainerWorkspaceBinding implements b {

    @NonNull
    public final AdsContainerView adsContainerWorkspace;

    @NonNull
    private final AdsContainerView rootView;

    private AdsContainerWorkspaceBinding(@NonNull AdsContainerView adsContainerView, @NonNull AdsContainerView adsContainerView2) {
        this.rootView = adsContainerView;
        this.adsContainerWorkspace = adsContainerView2;
    }

    @NonNull
    public static AdsContainerWorkspaceBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AdsContainerView adsContainerView = (AdsContainerView) view;
        return new AdsContainerWorkspaceBinding(adsContainerView, adsContainerView);
    }

    @NonNull
    public static AdsContainerWorkspaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AdsContainerWorkspaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.ads_container_workspace, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public AdsContainerView getRoot() {
        return this.rootView;
    }
}
