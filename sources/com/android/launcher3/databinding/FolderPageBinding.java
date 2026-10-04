package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.CellLayout;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class FolderPageBinding implements b {

    @NonNull
    private final CellLayout rootView;

    private FolderPageBinding(@NonNull CellLayout cellLayout) {
        this.rootView = cellLayout;
    }

    @NonNull
    public static FolderPageBinding bind(@NonNull View view) {
        if (view != null) {
            return new FolderPageBinding((CellLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FolderPageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FolderPageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.folder_page, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public CellLayout getRoot() {
        return this.rootView;
    }
}
