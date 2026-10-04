package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.qsb.QsbContainerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchContainerWorkspaceBinding implements b {

    @NonNull
    private final QsbContainerView rootView;

    @NonNull
    public final QsbContainerView searchContainerWorkspace;

    private SearchContainerWorkspaceBinding(@NonNull QsbContainerView qsbContainerView, @NonNull QsbContainerView qsbContainerView2) {
        this.rootView = qsbContainerView;
        this.searchContainerWorkspace = qsbContainerView2;
    }

    @NonNull
    public static SearchContainerWorkspaceBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        QsbContainerView qsbContainerView = (QsbContainerView) view;
        return new SearchContainerWorkspaceBinding(qsbContainerView, qsbContainerView);
    }

    @NonNull
    public static SearchContainerWorkspaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SearchContainerWorkspaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.search_container_workspace, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public QsbContainerView getRoot() {
        return this.rootView;
    }
}
