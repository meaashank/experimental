package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityGuidePinBinding implements b {

    @NonNull
    public final TextView guideChar;

    @NonNull
    public final FrameLayout guidePinRoot;

    @NonNull
    public final ImageView ivFrom;

    @NonNull
    public final ImageView ivTo;

    @NonNull
    public final LinearLayout llArrow;

    @NonNull
    public final LinearLayout llFrom;

    @NonNull
    public final LinearLayout llIcons;

    @NonNull
    public final LinearLayout llTo;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvSetup;

    @NonNull
    public final TextView tvTo;

    private HiderActivityGuidePinBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = frameLayout;
        this.guideChar = textView;
        this.guidePinRoot = frameLayout2;
        this.ivFrom = imageView;
        this.ivTo = imageView2;
        this.llArrow = linearLayout;
        this.llFrom = linearLayout2;
        this.llIcons = linearLayout3;
        this.llTo = linearLayout4;
        this.tvSetup = textView2;
        this.tvTo = textView3;
    }

    @NonNull
    public static HiderActivityGuidePinBinding bind(@NonNull View view) {
        int i10 = R.id.guide_char;
        TextView textView = (TextView) c.a(view, R.id.guide_char);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i10 = R.id.iv_from;
            ImageView imageView = (ImageView) c.a(view, R.id.iv_from);
            if (imageView != null) {
                i10 = R.id.iv_to;
                ImageView imageView2 = (ImageView) c.a(view, R.id.iv_to);
                if (imageView2 != null) {
                    i10 = R.id.ll_arrow;
                    LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.ll_arrow);
                    if (linearLayout != null) {
                        i10 = R.id.ll_from;
                        LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.ll_from);
                        if (linearLayout2 != null) {
                            i10 = R.id.ll_icons;
                            LinearLayout linearLayout3 = (LinearLayout) c.a(view, R.id.ll_icons);
                            if (linearLayout3 != null) {
                                i10 = R.id.ll_to;
                                LinearLayout linearLayout4 = (LinearLayout) c.a(view, R.id.ll_to);
                                if (linearLayout4 != null) {
                                    i10 = R.id.tv_setup;
                                    TextView textView2 = (TextView) c.a(view, R.id.tv_setup);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_to;
                                        TextView textView3 = (TextView) c.a(view, R.id.tv_to);
                                        if (textView3 != null) {
                                            return new HiderActivityGuidePinBinding(frameLayout, textView, frameLayout, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView2, textView3);
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
    public static HiderActivityGuidePinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityGuidePinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_guide_pin, viewGroup, false);
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
