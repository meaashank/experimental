package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.allapps.WorkModeSwitch;
import com.android.launcher3.views.WorkFooterContainer;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkTabFooterBinding implements b {

    @NonNull
    public final ImageView icon;

    @NonNull
    public final TextView managedByLabel;

    @NonNull
    private final WorkFooterContainer rootView;

    @NonNull
    public final TextView title;

    @NonNull
    public final ImageView workFooterDivider;

    @NonNull
    public final WorkModeSwitch workModeToggle;

    private WorkTabFooterBinding(@NonNull WorkFooterContainer workFooterContainer, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull WorkModeSwitch workModeSwitch) {
        this.rootView = workFooterContainer;
        this.icon = imageView;
        this.managedByLabel = textView;
        this.title = textView2;
        this.workFooterDivider = imageView2;
        this.workModeToggle = workModeSwitch;
    }

    @NonNull
    public static WorkTabFooterBinding bind(@NonNull View view) {
        int i10 = R.id.icon;
        ImageView imageView = (ImageView) c.a(view, R.id.icon);
        if (imageView != null) {
            i10 = com.app.hider.master.promax.R.id.managed_by_label;
            TextView textView = (TextView) c.a(view, com.app.hider.master.promax.R.id.managed_by_label);
            if (textView != null) {
                i10 = R.id.title;
                TextView textView2 = (TextView) c.a(view, R.id.title);
                if (textView2 != null) {
                    i10 = com.app.hider.master.promax.R.id.work_footer_divider;
                    ImageView imageView2 = (ImageView) c.a(view, com.app.hider.master.promax.R.id.work_footer_divider);
                    if (imageView2 != null) {
                        i10 = com.app.hider.master.promax.R.id.work_mode_toggle;
                        WorkModeSwitch workModeSwitch = (WorkModeSwitch) c.a(view, com.app.hider.master.promax.R.id.work_mode_toggle);
                        if (workModeSwitch != null) {
                            return new WorkTabFooterBinding((WorkFooterContainer) view, imageView, textView, textView2, imageView2, workModeSwitch);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static WorkTabFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WorkTabFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(com.app.hider.master.promax.R.layout.work_tab_footer, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public WorkFooterContainer getRoot() {
        return this.rootView;
    }
}
