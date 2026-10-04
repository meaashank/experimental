package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityGameBinding implements b {

    @NonNull
    public final ProgressBar loading;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ConstraintLayout showAds;

    @NonNull
    public final WebView webView;

    private HiderActivityGameBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull WebView webView) {
        this.rootView = frameLayout;
        this.loading = progressBar;
        this.showAds = constraintLayout;
        this.webView = webView;
    }

    @NonNull
    public static HiderActivityGameBinding bind(@NonNull View view) {
        int i10 = R.id.loading;
        ProgressBar progressBar = (ProgressBar) c.a(view, R.id.loading);
        if (progressBar != null) {
            i10 = R.id.show_ads;
            ConstraintLayout constraintLayout = (ConstraintLayout) c.a(view, R.id.show_ads);
            if (constraintLayout != null) {
                i10 = R.id.web_view;
                WebView webView = (WebView) c.a(view, R.id.web_view);
                if (webView != null) {
                    return new HiderActivityGameBinding((FrameLayout) view, progressBar, constraintLayout, webView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivityGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_game, viewGroup, false);
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
