package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderPartGuestSizeRowsBinding implements b {

    @NonNull
    public final TextView detailClearCache;

    @NonNull
    public final TextView detailSizeApp;

    @NonNull
    public final TextView detailSizeAppDesc;

    @NonNull
    public final TextView detailSizeCache;

    @NonNull
    public final TextView detailSizeCacheDesc;

    @NonNull
    public final TextView detailSizeData;

    @NonNull
    public final TextView detailSizeDataDesc;

    @NonNull
    private final LinearLayout rootView;

    private HiderPartGuestSizeRowsBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = linearLayout;
        this.detailClearCache = textView;
        this.detailSizeApp = textView2;
        this.detailSizeAppDesc = textView3;
        this.detailSizeCache = textView4;
        this.detailSizeCacheDesc = textView5;
        this.detailSizeData = textView6;
        this.detailSizeDataDesc = textView7;
    }

    @NonNull
    public static HiderPartGuestSizeRowsBinding bind(@NonNull View view) {
        int i10 = R.id.detail_clear_cache;
        TextView textView = (TextView) c.a(view, R.id.detail_clear_cache);
        if (textView != null) {
            i10 = R.id.detail_size_app;
            TextView textView2 = (TextView) c.a(view, R.id.detail_size_app);
            if (textView2 != null) {
                i10 = R.id.detail_size_app_desc;
                TextView textView3 = (TextView) c.a(view, R.id.detail_size_app_desc);
                if (textView3 != null) {
                    i10 = R.id.detail_size_cache;
                    TextView textView4 = (TextView) c.a(view, R.id.detail_size_cache);
                    if (textView4 != null) {
                        i10 = R.id.detail_size_cache_desc;
                        TextView textView5 = (TextView) c.a(view, R.id.detail_size_cache_desc);
                        if (textView5 != null) {
                            i10 = R.id.detail_size_data;
                            TextView textView6 = (TextView) c.a(view, R.id.detail_size_data);
                            if (textView6 != null) {
                                i10 = R.id.detail_size_data_desc;
                                TextView textView7 = (TextView) c.a(view, R.id.detail_size_data_desc);
                                if (textView7 != null) {
                                    return new HiderPartGuestSizeRowsBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static HiderPartGuestSizeRowsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderPartGuestSizeRowsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_part_guest_size_rows, viewGroup, false);
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
