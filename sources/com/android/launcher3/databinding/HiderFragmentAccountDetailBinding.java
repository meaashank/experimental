package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderFragmentAccountDetailBinding implements b {

    @NonNull
    public final LinearLayout accountDetailApps;

    @NonNull
    public final TextView accountDetailAppsHead;

    @NonNull
    public final TextView accountDetailCopy;

    @NonNull
    public final ImageView accountDetailIcon;

    @NonNull
    public final TextView accountDetailName;

    @NonNull
    public final LinearLayout accountDetailRemove;

    @NonNull
    public final TextView accountDetailRemoveDesc;

    @NonNull
    public final TextView accountDetailType;

    @NonNull
    private final ScrollView rootView;

    private HiderFragmentAccountDetailBinding(@NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = scrollView;
        this.accountDetailApps = linearLayout;
        this.accountDetailAppsHead = textView;
        this.accountDetailCopy = textView2;
        this.accountDetailIcon = imageView;
        this.accountDetailName = textView3;
        this.accountDetailRemove = linearLayout2;
        this.accountDetailRemoveDesc = textView4;
        this.accountDetailType = textView5;
    }

    @NonNull
    public static HiderFragmentAccountDetailBinding bind(@NonNull View view) {
        int i10 = R.id.account_detail_apps;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.account_detail_apps);
        if (linearLayout != null) {
            i10 = R.id.account_detail_apps_head;
            TextView textView = (TextView) c.a(view, R.id.account_detail_apps_head);
            if (textView != null) {
                i10 = R.id.account_detail_copy;
                TextView textView2 = (TextView) c.a(view, R.id.account_detail_copy);
                if (textView2 != null) {
                    i10 = R.id.account_detail_icon;
                    ImageView imageView = (ImageView) c.a(view, R.id.account_detail_icon);
                    if (imageView != null) {
                        i10 = R.id.account_detail_name;
                        TextView textView3 = (TextView) c.a(view, R.id.account_detail_name);
                        if (textView3 != null) {
                            i10 = R.id.account_detail_remove;
                            LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.account_detail_remove);
                            if (linearLayout2 != null) {
                                i10 = R.id.account_detail_remove_desc;
                                TextView textView4 = (TextView) c.a(view, R.id.account_detail_remove_desc);
                                if (textView4 != null) {
                                    i10 = R.id.account_detail_type;
                                    TextView textView5 = (TextView) c.a(view, R.id.account_detail_type);
                                    if (textView5 != null) {
                                        return new HiderFragmentAccountDetailBinding((ScrollView) view, linearLayout, textView, textView2, imageView, textView3, linearLayout2, textView4, textView5);
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
    public static HiderFragmentAccountDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderFragmentAccountDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_fragment_account_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }
}
