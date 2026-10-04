package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ItemWallpaperGalleryBinding implements b {

    @NonNull
    public final CardView itemCard;

    @NonNull
    public final AppCompatImageView itemImg;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemWallpaperGalleryBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = constraintLayout;
        this.itemCard = cardView;
        this.itemImg = appCompatImageView;
    }

    @NonNull
    public static ItemWallpaperGalleryBinding bind(@NonNull View view) {
        int i10 = R.id.item_card;
        CardView cardView = (CardView) c.a(view, R.id.item_card);
        if (cardView != null) {
            i10 = R.id.item_img;
            AppCompatImageView appCompatImageView = (AppCompatImageView) c.a(view, R.id.item_img);
            if (appCompatImageView != null) {
                return new ItemWallpaperGalleryBinding((ConstraintLayout) view, cardView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemWallpaperGalleryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWallpaperGalleryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_wallpaper_gallery, viewGroup, false);
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
