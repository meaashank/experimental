package com.android.launcher3.databinding;

import D2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SystemShortcutIconOnlyBinding implements b {

    @NonNull
    private final ImageView rootView;

    private SystemShortcutIconOnlyBinding(@NonNull ImageView imageView) {
        this.rootView = imageView;
    }

    @NonNull
    public static SystemShortcutIconOnlyBinding bind(@NonNull View view) {
        if (view != null) {
            return new SystemShortcutIconOnlyBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static SystemShortcutIconOnlyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SystemShortcutIconOnlyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.system_shortcut_icon_only, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}
