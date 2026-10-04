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
import com.prism.commons.ui.CheckBox;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutActivityUserTermsCnBinding implements b {

    @NonNull
    public final CheckBox cbCheckBoxConfirm;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final LinearLayout llBtArea;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvAgree;

    @NonNull
    public final TextView tvBrand;

    @NonNull
    public final TextView tvDisagree;

    @NonNull
    public final TextView tvTermsPolicySummary;

    private LayoutActivityUserTermsCnBinding(@NonNull RelativeLayout relativeLayout, @NonNull CheckBox checkBox, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.cbCheckBoxConfirm = checkBox;
        this.ivIcon = imageView;
        this.llBtArea = linearLayout;
        this.tvAgree = textView;
        this.tvBrand = textView2;
        this.tvDisagree = textView3;
        this.tvTermsPolicySummary = textView4;
    }

    @NonNull
    public static LayoutActivityUserTermsCnBinding bind(@NonNull View view) {
        int i10 = R.id.cb_check_box_confirm;
        CheckBox checkBox = (CheckBox) c.a(view, R.id.cb_check_box_confirm);
        if (checkBox != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) c.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.ll_bt_area;
                LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.ll_bt_area);
                if (linearLayout != null) {
                    i10 = R.id.tv_agree;
                    TextView textView = (TextView) c.a(view, R.id.tv_agree);
                    if (textView != null) {
                        i10 = R.id.tv_brand;
                        TextView textView2 = (TextView) c.a(view, R.id.tv_brand);
                        if (textView2 != null) {
                            i10 = R.id.tv_disagree;
                            TextView textView3 = (TextView) c.a(view, R.id.tv_disagree);
                            if (textView3 != null) {
                                i10 = R.id.tv_terms_policy_summary;
                                TextView textView4 = (TextView) c.a(view, R.id.tv_terms_policy_summary);
                                if (textView4 != null) {
                                    return new LayoutActivityUserTermsCnBinding((RelativeLayout) view, checkBox, imageView, linearLayout, textView, textView2, textView3, textView4);
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
    public static LayoutActivityUserTermsCnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutActivityUserTermsCnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_activity_user_terms_cn, viewGroup, false);
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
