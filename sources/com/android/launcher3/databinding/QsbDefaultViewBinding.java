package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class QsbDefaultViewBinding implements b {

    @NonNull
    public final TextView btnQsbSearch;

    @NonNull
    public final ImageView btnQsbSetup;

    @NonNull
    private final FrameLayout rootView;

    private QsbDefaultViewBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.rootView = frameLayout;
        this.btnQsbSearch = textView;
        this.btnQsbSetup = imageView;
    }

    @NonNull
    public static QsbDefaultViewBinding bind(@NonNull View view) {
        int i10 = R.id.btn_qsb_search;
        TextView textView = (TextView) c.a(view, R.id.btn_qsb_search);
        if (textView != null) {
            i10 = R.id.btn_qsb_setup;
            ImageView imageView = (ImageView) c.a(view, R.id.btn_qsb_setup);
            if (imageView != null) {
                return new QsbDefaultViewBinding((FrameLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static QsbDefaultViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static QsbDefaultViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.qsb_default_view, viewGroup, false);
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
