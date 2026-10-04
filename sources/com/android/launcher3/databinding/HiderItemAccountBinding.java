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
public final class HiderItemAccountBinding implements b {

    @NonNull
    public final TextView accountApps;

    @NonNull
    public final ImageView accountIcon;

    @NonNull
    public final TextView accountName;

    @NonNull
    public final TextView accountType;

    @NonNull
    private final LinearLayout rootView;

    private HiderItemAccountBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.accountApps = textView;
        this.accountIcon = imageView;
        this.accountName = textView2;
        this.accountType = textView3;
    }

    @NonNull
    public static HiderItemAccountBinding bind(@NonNull View view) {
        int i10 = R.id.account_apps;
        TextView textView = (TextView) c.a(view, R.id.account_apps);
        if (textView != null) {
            i10 = R.id.account_icon;
            ImageView imageView = (ImageView) c.a(view, R.id.account_icon);
            if (imageView != null) {
                i10 = R.id.account_name;
                TextView textView2 = (TextView) c.a(view, R.id.account_name);
                if (textView2 != null) {
                    i10 = R.id.account_type;
                    TextView textView3 = (TextView) c.a(view, R.id.account_type);
                    if (textView3 != null) {
                        return new HiderItemAccountBinding((LinearLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderItemAccountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderItemAccountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_item_account, viewGroup, false);
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
