package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderItemAccountHeadBinding implements b {

    @NonNull
    public final TextView accountGroupHead;

    @NonNull
    private final TextView rootView;

    private HiderItemAccountHeadBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.accountGroupHead = textView2;
    }

    @NonNull
    public static HiderItemAccountHeadBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new HiderItemAccountHeadBinding(textView, textView);
    }

    @NonNull
    public static HiderItemAccountHeadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderItemAccountHeadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_item_account_head, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
