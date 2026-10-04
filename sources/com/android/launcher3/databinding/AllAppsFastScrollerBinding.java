package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.d;
import com.android.launcher3.views.RecyclerViewFastScroller;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AllAppsFastScrollerBinding implements b {

    @NonNull
    public final RecyclerViewFastScroller fastScroller;

    @NonNull
    public final TextView fastScrollerPopup;

    @NonNull
    private final View rootView;

    private AllAppsFastScrollerBinding(@NonNull View view, @NonNull RecyclerViewFastScroller recyclerViewFastScroller, @NonNull TextView textView) {
        this.rootView = view;
        this.fastScroller = recyclerViewFastScroller;
        this.fastScrollerPopup = textView;
    }

    @NonNull
    public static AllAppsFastScrollerBinding bind(@NonNull View view) {
        int i10 = R.id.fast_scroller;
        RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) c.a(view, R.id.fast_scroller);
        if (recyclerViewFastScroller != null) {
            i10 = R.id.fast_scroller_popup;
            TextView textView = (TextView) c.a(view, R.id.fast_scroller_popup);
            if (textView != null) {
                return new AllAppsFastScrollerBinding(view, recyclerViewFastScroller, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static AllAppsFastScrollerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException(d.f107893V1);
        }
        layoutInflater.inflate(R.layout.all_apps_fast_scroller, viewGroup);
        return bind(viewGroup);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
