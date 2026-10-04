package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationGutterBinding implements b {

    @NonNull
    private final View rootView;

    private NotificationGutterBinding(@NonNull View view) {
        this.rootView = view;
    }

    @NonNull
    public static NotificationGutterBinding bind(@NonNull View view) {
        if (view != null) {
            return new NotificationGutterBinding(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static NotificationGutterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static NotificationGutterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.notification_gutter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
