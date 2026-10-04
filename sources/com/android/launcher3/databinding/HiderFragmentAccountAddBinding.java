package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderFragmentAccountAddBinding implements b {

    @NonNull
    public final LinearLayout accountAddEmpty;

    @NonNull
    public final LinearLayout accountAddList;

    @NonNull
    public final LinearLayout accountAddLoading;

    @NonNull
    public final ScrollView accountAddScroll;

    @NonNull
    private final FrameLayout rootView;

    private HiderFragmentAccountAddBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ScrollView scrollView) {
        this.rootView = frameLayout;
        this.accountAddEmpty = linearLayout;
        this.accountAddList = linearLayout2;
        this.accountAddLoading = linearLayout3;
        this.accountAddScroll = scrollView;
    }

    @NonNull
    public static HiderFragmentAccountAddBinding bind(@NonNull View view) {
        int i10 = R.id.account_add_empty;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.account_add_empty);
        if (linearLayout != null) {
            i10 = R.id.account_add_list;
            LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.account_add_list);
            if (linearLayout2 != null) {
                i10 = R.id.account_add_loading;
                LinearLayout linearLayout3 = (LinearLayout) c.a(view, R.id.account_add_loading);
                if (linearLayout3 != null) {
                    i10 = R.id.account_add_scroll;
                    ScrollView scrollView = (ScrollView) c.a(view, R.id.account_add_scroll);
                    if (scrollView != null) {
                        return new HiderFragmentAccountAddBinding((FrameLayout) view, linearLayout, linearLayout2, linearLayout3, scrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderFragmentAccountAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderFragmentAccountAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_fragment_account_add, viewGroup, false);
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
