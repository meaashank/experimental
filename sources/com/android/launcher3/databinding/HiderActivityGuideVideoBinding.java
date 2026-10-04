package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityGuideVideoBinding implements b {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final WebView wvContent;

    private HiderActivityGuideVideoBinding(@NonNull LinearLayout linearLayout, @NonNull WebView webView) {
        this.rootView = linearLayout;
        this.wvContent = webView;
    }

    @NonNull
    public static HiderActivityGuideVideoBinding bind(@NonNull View view) {
        WebView webView = (WebView) c.a(view, R.id.wv_content);
        if (webView != null) {
            return new HiderActivityGuideVideoBinding((LinearLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.wv_content)));
    }

    @NonNull
    public static HiderActivityGuideVideoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityGuideVideoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_guide_video, viewGroup, false);
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
