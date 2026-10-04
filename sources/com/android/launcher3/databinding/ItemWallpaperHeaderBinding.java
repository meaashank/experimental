package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemWallpaperHeaderBinding implements b {

    @NonNull
    public final LinearLayoutCompat llHead;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final RecyclerView rvHistory;

    private ItemWallpaperHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.llHead = linearLayoutCompat;
        this.rvHistory = recyclerView;
    }

    @NonNull
    public static ItemWallpaperHeaderBinding bind(@NonNull View view) {
        int i10 = R.id.ll_head;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) c.a(view, R.id.ll_head);
        if (linearLayoutCompat != null) {
            i10 = R.id.rv_history;
            RecyclerView recyclerView = (RecyclerView) c.a(view, R.id.rv_history);
            if (recyclerView != null) {
                return new ItemWallpaperHeaderBinding((ConstraintLayout) view, linearLayoutCompat, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemWallpaperHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWallpaperHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_wallpaper_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
