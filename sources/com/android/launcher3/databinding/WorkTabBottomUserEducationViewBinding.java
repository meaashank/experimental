package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.views.BottomUserEducationView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkTabBottomUserEducationViewBinding implements b {

    @NonNull
    public final ImageView closeBottomUserTip;

    @NonNull
    private final BottomUserEducationView rootView;

    private WorkTabBottomUserEducationViewBinding(@NonNull BottomUserEducationView bottomUserEducationView, @NonNull ImageView imageView) {
        this.rootView = bottomUserEducationView;
        this.closeBottomUserTip = imageView;
    }

    @NonNull
    public static WorkTabBottomUserEducationViewBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) c.a(view, R.id.close_bottom_user_tip);
        if (imageView != null) {
            return new WorkTabBottomUserEducationViewBinding((BottomUserEducationView) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.close_bottom_user_tip)));
    }

    @NonNull
    public static WorkTabBottomUserEducationViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static WorkTabBottomUserEducationViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.work_tab_bottom_user_education_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public BottomUserEducationView getRoot() {
        return this.rootView;
    }
}
