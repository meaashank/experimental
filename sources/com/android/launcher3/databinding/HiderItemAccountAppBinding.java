package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderItemAccountAppBinding implements b {

    @NonNull
    public final ImageView accountAppIcon;

    @NonNull
    public final TextView accountAppName;

    @NonNull
    public final TextView accountAppVis;

    @NonNull
    private final LinearLayout rootView;

    private HiderItemAccountAppBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.accountAppIcon = imageView;
        this.accountAppName = textView;
        this.accountAppVis = textView2;
    }

    @NonNull
    public static HiderItemAccountAppBinding bind(@NonNull View view) {
        int i10 = R.id.account_app_icon;
        ImageView imageView = (ImageView) c.a(view, R.id.account_app_icon);
        if (imageView != null) {
            i10 = R.id.account_app_name;
            TextView textView = (TextView) c.a(view, R.id.account_app_name);
            if (textView != null) {
                i10 = R.id.account_app_vis;
                TextView textView2 = (TextView) c.a(view, R.id.account_app_vis);
                if (textView2 != null) {
                    return new HiderItemAccountAppBinding((LinearLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderItemAccountAppBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderItemAccountAppBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_item_account_app, viewGroup, false);
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
