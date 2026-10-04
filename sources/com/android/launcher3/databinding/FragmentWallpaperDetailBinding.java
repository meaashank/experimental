package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.app.hider.master.promax.R;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentWallpaperDetailBinding implements b {

    @NonNull
    public final Button btnSetWallpaper;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final MaterialToolbar toolbar;

    @NonNull
    public final ViewPager2 viewPager;

    private FragmentWallpaperDetailBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull MaterialToolbar materialToolbar, @NonNull ViewPager2 viewPager2) {
        this.rootView = coordinatorLayout;
        this.btnSetWallpaper = button;
        this.toolbar = materialToolbar;
        this.viewPager = viewPager2;
    }

    @NonNull
    public static FragmentWallpaperDetailBinding bind(@NonNull View view) {
        int i10 = R.id.btn_set_wallpaper;
        Button button = (Button) c.a(view, R.id.btn_set_wallpaper);
        if (button != null) {
            i10 = R.id.toolbar;
            MaterialToolbar materialToolbar = (MaterialToolbar) c.a(view, R.id.toolbar);
            if (materialToolbar != null) {
                i10 = R.id.view_pager;
                ViewPager2 viewPager2 = (ViewPager2) c.a(view, R.id.view_pager);
                if (viewPager2 != null) {
                    return new FragmentWallpaperDetailBinding((CoordinatorLayout) view, button, materialToolbar, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FragmentWallpaperDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentWallpaperDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_wallpaper_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}
