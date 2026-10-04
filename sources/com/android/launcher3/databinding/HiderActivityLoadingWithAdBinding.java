package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityLoadingWithAdBinding implements b {

    @NonNull
    public final ImageView appIcon;

    @NonNull
    public final FrameLayout flAdPlaceholder;

    @NonNull
    public final ProgressBar pbGuestStarting;

    @NonNull
    public final RelativeLayout rlContent;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvProgressInfo;

    private HiderActivityLoadingWithAdBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.appIcon = imageView;
        this.flAdPlaceholder = frameLayout2;
        this.pbGuestStarting = progressBar;
        this.rlContent = relativeLayout;
        this.tvProgressInfo = textView;
    }

    @NonNull
    public static HiderActivityLoadingWithAdBinding bind(@NonNull View view) {
        int i10 = R.id.app_icon;
        ImageView imageView = (ImageView) c.a(view, R.id.app_icon);
        if (imageView != null) {
            i10 = R.id.fl_ad_placeholder;
            FrameLayout frameLayout = (FrameLayout) c.a(view, R.id.fl_ad_placeholder);
            if (frameLayout != null) {
                i10 = R.id.pb_guest_starting;
                ProgressBar progressBar = (ProgressBar) c.a(view, R.id.pb_guest_starting);
                if (progressBar != null) {
                    i10 = R.id.rl_content;
                    RelativeLayout relativeLayout = (RelativeLayout) c.a(view, R.id.rl_content);
                    if (relativeLayout != null) {
                        i10 = R.id.tv_progress_info;
                        TextView textView = (TextView) c.a(view, R.id.tv_progress_info);
                        if (textView != null) {
                            return new HiderActivityLoadingWithAdBinding((FrameLayout) view, imageView, frameLayout, progressBar, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivityLoadingWithAdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityLoadingWithAdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_loading_with_ad, viewGroup, false);
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
