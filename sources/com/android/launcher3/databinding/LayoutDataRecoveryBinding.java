package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutDataRecoveryBinding implements b {

    @NonNull
    public final RadioGroup rgResolutions;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvAgree;

    private LayoutDataRecoveryBinding(@NonNull RelativeLayout relativeLayout, @NonNull RadioGroup radioGroup, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.rgResolutions = radioGroup;
        this.tvAgree = textView;
    }

    @NonNull
    public static LayoutDataRecoveryBinding bind(@NonNull View view) {
        int i10 = R.id.rg_resolutions;
        RadioGroup radioGroup = (RadioGroup) c.a(view, R.id.rg_resolutions);
        if (radioGroup != null) {
            i10 = R.id.tv_agree;
            TextView textView = (TextView) c.a(view, R.id.tv_agree);
            if (textView != null) {
                return new LayoutDataRecoveryBinding((RelativeLayout) view, radioGroup, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static LayoutDataRecoveryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutDataRecoveryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_data_recovery, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
