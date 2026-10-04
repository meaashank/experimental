package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderActivityGuide2Binding implements b {

    @NonNull
    public final ImageView guide2Img;

    @NonNull
    public final TextView guide2Tv1;

    @NonNull
    public final TextView guide2Tv2;

    @NonNull
    private final RelativeLayout rootView;

    private HiderActivityGuide2Binding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.guide2Img = imageView;
        this.guide2Tv1 = textView;
        this.guide2Tv2 = textView2;
    }

    @NonNull
    public static HiderActivityGuide2Binding bind(@NonNull View view) {
        int i10 = R.id.guide_2_img;
        ImageView imageView = (ImageView) c.a(view, R.id.guide_2_img);
        if (imageView != null) {
            i10 = R.id.guide_2_tv1;
            TextView textView = (TextView) c.a(view, R.id.guide_2_tv1);
            if (textView != null) {
                i10 = R.id.guide_2_tv2;
                TextView textView2 = (TextView) c.a(view, R.id.guide_2_tv2);
                if (textView2 != null) {
                    return new HiderActivityGuide2Binding((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderActivityGuide2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderActivityGuide2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_activity_guide2, viewGroup, false);
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
