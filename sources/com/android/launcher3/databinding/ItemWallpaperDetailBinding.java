package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemWallpaperDetailBinding implements b {

    @NonNull
    public final AppCompatImageView itemImg;

    @NonNull
    private final LinearLayout rootView;

    private ItemWallpaperDetailBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = linearLayout;
        this.itemImg = appCompatImageView;
    }

    @NonNull
    public static ItemWallpaperDetailBinding bind(@NonNull View view) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) c.a(view, R.id.item_img);
        if (appCompatImageView != null) {
            return new ItemWallpaperDetailBinding((LinearLayout) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.item_img)));
    }

    @NonNull
    public static ItemWallpaperDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWallpaperDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_wallpaper_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
