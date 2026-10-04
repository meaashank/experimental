package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderFragmentAccountsBinding implements b {

    @NonNull
    public final LinearLayout accountsContent;

    @NonNull
    public final LinearLayout accountsEmpty;

    @NonNull
    public final TextView accountsEmptyDesc;

    @NonNull
    public final TextView accountsEmptyTitle;

    @NonNull
    public final RecyclerView accountsList;

    @NonNull
    public final LinearLayout accountsLoading;

    @NonNull
    public final TextView accountsSummary;

    @NonNull
    private final FrameLayout rootView;

    private HiderFragmentAccountsBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3) {
        this.rootView = frameLayout;
        this.accountsContent = linearLayout;
        this.accountsEmpty = linearLayout2;
        this.accountsEmptyDesc = textView;
        this.accountsEmptyTitle = textView2;
        this.accountsList = recyclerView;
        this.accountsLoading = linearLayout3;
        this.accountsSummary = textView3;
    }

    @NonNull
    public static HiderFragmentAccountsBinding bind(@NonNull View view) {
        int i10 = R.id.accounts_content;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.accounts_content);
        if (linearLayout != null) {
            i10 = R.id.accounts_empty;
            LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.accounts_empty);
            if (linearLayout2 != null) {
                i10 = R.id.accounts_empty_desc;
                TextView textView = (TextView) c.a(view, R.id.accounts_empty_desc);
                if (textView != null) {
                    i10 = R.id.accounts_empty_title;
                    TextView textView2 = (TextView) c.a(view, R.id.accounts_empty_title);
                    if (textView2 != null) {
                        i10 = R.id.accounts_list;
                        RecyclerView recyclerView = (RecyclerView) c.a(view, R.id.accounts_list);
                        if (recyclerView != null) {
                            i10 = R.id.accounts_loading;
                            LinearLayout linearLayout3 = (LinearLayout) c.a(view, R.id.accounts_loading);
                            if (linearLayout3 != null) {
                                i10 = R.id.accounts_summary;
                                TextView textView3 = (TextView) c.a(view, R.id.accounts_summary);
                                if (textView3 != null) {
                                    return new HiderFragmentAccountsBinding((FrameLayout) view, linearLayout, linearLayout2, textView, textView2, recyclerView, linearLayout3, textView3);
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
    public static HiderFragmentAccountsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderFragmentAccountsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_fragment_accounts, viewGroup, false);
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
