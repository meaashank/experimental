package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.app.hider.master.promax.R;
import com.prism.hider.ui.ViewPagerIndicator;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityHowToHideBinding implements b {

    @NonNull
    public final ViewPagerIndicator indicator;

    @NonNull
    public final ViewPager pager;

    @NonNull
    private final RelativeLayout rootView;

    private HiderActivityHowToHideBinding(@NonNull RelativeLayout relativeLayout, @NonNull ViewPagerIndicator viewPagerIndicator, @NonNull ViewPager viewPager) {
        this.rootView = relativeLayout;
        this.indicator = viewPagerIndicator;
        this.pager = viewPager;
    }

    @NonNull
    public static HiderActivityHowToHideBinding bind(@NonNull View view) {
        int i10 = R.id.indicator;
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) c.a(view, R.id.indicator);
        if (viewPagerIndicator != null) {
            i10 = R.id.pager;
            ViewPager viewPager = (ViewPager) c.a(view, R.id.pager);
            if (viewPager != null) {
                return new HiderActivityHowToHideBinding((RelativeLayout) view, viewPagerIndicator, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivityHowToHideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityHowToHideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_how_to_hide, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
