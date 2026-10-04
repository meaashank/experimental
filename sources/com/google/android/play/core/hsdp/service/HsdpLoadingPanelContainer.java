package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {

    @Nullable
    private Runnable zza;

    public HsdpLoadingPanelContainer(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.zza;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.zza);
        }
    }

    public void setOnConfigurationChangedListener(@NonNull Runnable runnable) {
        this.zza = runnable;
    }

    public HsdpLoadingPanelContainer(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HsdpLoadingPanelContainer(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public HsdpLoadingPanelContainer(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
