package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.CellLayout;
import com.android.launcher3.Hotseat;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HotseatBinding implements b {

    @NonNull
    public final CellLayout layout;

    @NonNull
    private final Hotseat rootView;

    private HotseatBinding(@NonNull Hotseat hotseat, @NonNull CellLayout cellLayout) {
        this.rootView = hotseat;
        this.layout = cellLayout;
    }

    @NonNull
    public static HotseatBinding bind(@NonNull View view) {
        CellLayout cellLayout = (CellLayout) c.a(view, R.id.layout);
        if (cellLayout != null) {
            return new HotseatBinding((Hotseat) view, cellLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.layout)));
    }

    @NonNull
    public static HotseatBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HotseatBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hotseat, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public Hotseat getRoot() {
        return this.rootView;
    }
}
