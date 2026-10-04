package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.allapps.FloatingHeaderView;
import com.android.launcher3.allapps.PersonalWorkSlidingTabStrip;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AllAppsFloatingHeaderBinding implements b {

    @NonNull
    public final FloatingHeaderView allAppsHeader;

    @NonNull
    private final FloatingHeaderView rootView;

    @NonNull
    public final Button tabPersonal;

    @NonNull
    public final Button tabWork;

    @NonNull
    public final PersonalWorkSlidingTabStrip tabs;

    private AllAppsFloatingHeaderBinding(@NonNull FloatingHeaderView floatingHeaderView, @NonNull FloatingHeaderView floatingHeaderView2, @NonNull Button button, @NonNull Button button2, @NonNull PersonalWorkSlidingTabStrip personalWorkSlidingTabStrip) {
        this.rootView = floatingHeaderView;
        this.allAppsHeader = floatingHeaderView2;
        this.tabPersonal = button;
        this.tabWork = button2;
        this.tabs = personalWorkSlidingTabStrip;
    }

    @NonNull
    public static AllAppsFloatingHeaderBinding bind(@NonNull View view) {
        FloatingHeaderView floatingHeaderView = (FloatingHeaderView) view;
        int i10 = R.id.tab_personal;
        Button button = (Button) c.a(view, R.id.tab_personal);
        if (button != null) {
            i10 = R.id.tab_work;
            Button button2 = (Button) c.a(view, R.id.tab_work);
            if (button2 != null) {
                i10 = R.id.tabs;
                PersonalWorkSlidingTabStrip personalWorkSlidingTabStrip = (PersonalWorkSlidingTabStrip) c.a(view, R.id.tabs);
                if (personalWorkSlidingTabStrip != null) {
                    return new AllAppsFloatingHeaderBinding(floatingHeaderView, floatingHeaderView, button, button2, personalWorkSlidingTabStrip);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static AllAppsFloatingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static AllAppsFloatingHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.all_apps_floating_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public FloatingHeaderView getRoot() {
        return this.rootView;
    }
}
