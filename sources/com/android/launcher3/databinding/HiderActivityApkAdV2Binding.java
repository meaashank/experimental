package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityApkAdV2Binding implements b {

    @NonNull
    public final LinearLayout adInfoPanel;

    @NonNull
    public final FrameLayout adMediaContainer;

    @NonNull
    public final FrameLayout btnClose;

    @NonNull
    public final ImageButton btnMediaSound;

    @NonNull
    public final FrameLayout ctaContainer;

    @NonNull
    public final ImageView ivAd;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final View mediaBottomScrim;

    @NonNull
    public final ProgressBar pbButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final TextView tvAdTag;

    @NonNull
    public final TextView tvButton;

    @NonNull
    public final TextView tvDesc;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final WebView wvAdHtml;

    private HiderActivityApkAdV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageButton imageButton, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull ProgressBar progressBar, @NonNull Toolbar toolbar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull WebView webView) {
        this.rootView = constraintLayout;
        this.adInfoPanel = linearLayout;
        this.adMediaContainer = frameLayout;
        this.btnClose = frameLayout2;
        this.btnMediaSound = imageButton;
        this.ctaContainer = frameLayout3;
        this.ivAd = imageView;
        this.ivIcon = imageView2;
        this.mediaBottomScrim = view;
        this.pbButton = progressBar;
        this.toolbar = toolbar;
        this.tvAdTag = textView;
        this.tvButton = textView2;
        this.tvDesc = textView3;
        this.tvTitle = textView4;
        this.wvAdHtml = webView;
    }

    @NonNull
    public static HiderActivityApkAdV2Binding bind(@NonNull View view) {
        int i10 = R.id.ad_info_panel;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.ad_info_panel);
        if (linearLayout != null) {
            i10 = R.id.ad_media_container;
            FrameLayout frameLayout = (FrameLayout) c.a(view, R.id.ad_media_container);
            if (frameLayout != null) {
                i10 = R.id.btn_close;
                FrameLayout frameLayout2 = (FrameLayout) c.a(view, R.id.btn_close);
                if (frameLayout2 != null) {
                    i10 = R.id.btn_media_sound;
                    ImageButton imageButton = (ImageButton) c.a(view, R.id.btn_media_sound);
                    if (imageButton != null) {
                        i10 = R.id.cta_container;
                        FrameLayout frameLayout3 = (FrameLayout) c.a(view, R.id.cta_container);
                        if (frameLayout3 != null) {
                            i10 = R.id.iv_ad;
                            ImageView imageView = (ImageView) c.a(view, R.id.iv_ad);
                            if (imageView != null) {
                                i10 = R.id.iv_icon;
                                ImageView imageView2 = (ImageView) c.a(view, R.id.iv_icon);
                                if (imageView2 != null) {
                                    i10 = R.id.media_bottom_scrim;
                                    View viewA = c.a(view, R.id.media_bottom_scrim);
                                    if (viewA != null) {
                                        i10 = R.id.pb_button;
                                        ProgressBar progressBar = (ProgressBar) c.a(view, R.id.pb_button);
                                        if (progressBar != null) {
                                            i10 = R.id.toolbar;
                                            Toolbar toolbar = (Toolbar) c.a(view, R.id.toolbar);
                                            if (toolbar != null) {
                                                i10 = R.id.tv_ad_tag;
                                                TextView textView = (TextView) c.a(view, R.id.tv_ad_tag);
                                                if (textView != null) {
                                                    i10 = R.id.tv_button;
                                                    TextView textView2 = (TextView) c.a(view, R.id.tv_button);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_desc;
                                                        TextView textView3 = (TextView) c.a(view, R.id.tv_desc);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tv_title;
                                                            TextView textView4 = (TextView) c.a(view, R.id.tv_title);
                                                            if (textView4 != null) {
                                                                i10 = R.id.wv_ad_html;
                                                                WebView webView = (WebView) c.a(view, R.id.wv_ad_html);
                                                                if (webView != null) {
                                                                    return new HiderActivityApkAdV2Binding((ConstraintLayout) view, linearLayout, frameLayout, frameLayout2, imageButton, frameLayout3, imageView, imageView2, viewA, progressBar, toolbar, textView, textView2, textView3, textView4, webView);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivityApkAdV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityApkAdV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_apk_ad_v2, viewGroup, false);
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
