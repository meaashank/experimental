package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutHiderPermissionNeedBinding implements b {

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final LinearLayout llBtArea;

    @NonNull
    public final LinearLayout llTitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContinue;

    @NonNull
    public final TextView tvNeedDesc;

    @NonNull
    public final TextView tvSubtitle;

    @NonNull
    public final TextView tvTitle;

    private LayoutHiderPermissionNeedBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.ivIcon = imageView;
        this.llBtArea = linearLayout;
        this.llTitle = linearLayout2;
        this.tvContinue = textView;
        this.tvNeedDesc = textView2;
        this.tvSubtitle = textView3;
        this.tvTitle = textView4;
    }

    @NonNull
    public static LayoutHiderPermissionNeedBinding bind(@NonNull View view) {
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) c.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.ll_bt_area;
            LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.ll_bt_area);
            if (linearLayout != null) {
                i10 = R.id.ll_title;
                LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.ll_title);
                if (linearLayout2 != null) {
                    i10 = R.id.tv_continue;
                    TextView textView = (TextView) c.a(view, R.id.tv_continue);
                    if (textView != null) {
                        i10 = R.id.tv_need_desc;
                        TextView textView2 = (TextView) c.a(view, R.id.tv_need_desc);
                        if (textView2 != null) {
                            i10 = R.id.tv_subtitle;
                            TextView textView3 = (TextView) c.a(view, R.id.tv_subtitle);
                            if (textView3 != null) {
                                i10 = R.id.tv_title;
                                TextView textView4 = (TextView) c.a(view, R.id.tv_title);
                                if (textView4 != null) {
                                    return new LayoutHiderPermissionNeedBinding((RelativeLayout) view, imageView, linearLayout, linearLayout2, textView, textView2, textView3, textView4);
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
    public static LayoutHiderPermissionNeedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutHiderPermissionNeedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_hider_permission_need, viewGroup, false);
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
