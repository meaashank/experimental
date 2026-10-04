package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivitySplashWithProgressBinding implements b {

    @NonNull
    public final LinearLayout llSplash;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout rrSplash;

    @NonNull
    public final ImageView splashLogo;

    @NonNull
    public final ProgressBar splashProgress;

    @NonNull
    public final TextView splashProgressPercent;

    @NonNull
    public final TextView splashProgressStatus;

    private HiderActivitySplashWithProgressBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.llSplash = linearLayout;
        this.rrSplash = relativeLayout2;
        this.splashLogo = imageView;
        this.splashProgress = progressBar;
        this.splashProgressPercent = textView;
        this.splashProgressStatus = textView2;
    }

    @NonNull
    public static HiderActivitySplashWithProgressBinding bind(@NonNull View view) {
        int i10 = R.id.ll_splash;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.ll_splash);
        if (linearLayout != null) {
            i10 = R.id.rr_splash;
            RelativeLayout relativeLayout = (RelativeLayout) c.a(view, R.id.rr_splash);
            if (relativeLayout != null) {
                i10 = R.id.splash_logo;
                ImageView imageView = (ImageView) c.a(view, R.id.splash_logo);
                if (imageView != null) {
                    i10 = R.id.splash_progress;
                    ProgressBar progressBar = (ProgressBar) c.a(view, R.id.splash_progress);
                    if (progressBar != null) {
                        i10 = R.id.splash_progress_percent;
                        TextView textView = (TextView) c.a(view, R.id.splash_progress_percent);
                        if (textView != null) {
                            i10 = R.id.splash_progress_status;
                            TextView textView2 = (TextView) c.a(view, R.id.splash_progress_status);
                            if (textView2 != null) {
                                return new HiderActivitySplashWithProgressBinding((RelativeLayout) view, linearLayout, relativeLayout, imageView, progressBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivitySplashWithProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivitySplashWithProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_splash_with_progress, viewGroup, false);
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
