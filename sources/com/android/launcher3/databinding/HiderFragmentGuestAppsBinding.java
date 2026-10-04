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
public final class HiderFragmentGuestAppsBinding implements b {

    @NonNull
    public final LinearLayout guestAppsContent;

    @NonNull
    public final LinearLayout guestAppsEmpty;

    @NonNull
    public final RecyclerView guestAppsList;

    @NonNull
    public final LinearLayout guestAppsLoading;

    @NonNull
    public final TextView guestAppsSummary;

    @NonNull
    private final FrameLayout rootView;

    private HiderFragmentGuestAppsBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.guestAppsContent = linearLayout;
        this.guestAppsEmpty = linearLayout2;
        this.guestAppsList = recyclerView;
        this.guestAppsLoading = linearLayout3;
        this.guestAppsSummary = textView;
    }

    @NonNull
    public static HiderFragmentGuestAppsBinding bind(@NonNull View view) {
        int i10 = R.id.guest_apps_content;
        LinearLayout linearLayout = (LinearLayout) c.a(view, R.id.guest_apps_content);
        if (linearLayout != null) {
            i10 = R.id.guest_apps_empty;
            LinearLayout linearLayout2 = (LinearLayout) c.a(view, R.id.guest_apps_empty);
            if (linearLayout2 != null) {
                i10 = R.id.guest_apps_list;
                RecyclerView recyclerView = (RecyclerView) c.a(view, R.id.guest_apps_list);
                if (recyclerView != null) {
                    i10 = R.id.guest_apps_loading;
                    LinearLayout linearLayout3 = (LinearLayout) c.a(view, R.id.guest_apps_loading);
                    if (linearLayout3 != null) {
                        i10 = R.id.guest_apps_summary;
                        TextView textView = (TextView) c.a(view, R.id.guest_apps_summary);
                        if (textView != null) {
                            return new HiderFragmentGuestAppsBinding((FrameLayout) view, linearLayout, linearLayout2, recyclerView, linearLayout3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderFragmentGuestAppsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderFragmentGuestAppsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_fragment_guest_apps, viewGroup, false);
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
