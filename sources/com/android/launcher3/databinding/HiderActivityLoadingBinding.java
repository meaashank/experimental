package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityLoadingBinding implements b {

    @NonNull
    public final ImageView appIcon;

    @NonNull
    public final RelativeLayout rlContent;

    @NonNull
    private final FrameLayout rootView;

    private HiderActivityLoadingBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout) {
        this.rootView = frameLayout;
        this.appIcon = imageView;
        this.rlContent = relativeLayout;
    }

    @NonNull
    public static HiderActivityLoadingBinding bind(@NonNull View view) {
        int i10 = R.id.app_icon;
        ImageView imageView = (ImageView) c.a(view, R.id.app_icon);
        if (imageView != null) {
            i10 = R.id.rl_content;
            RelativeLayout relativeLayout = (RelativeLayout) c.a(view, R.id.rl_content);
            if (relativeLayout != null) {
                return new HiderActivityLoadingBinding((FrameLayout) view, imageView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivityLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_loading, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
