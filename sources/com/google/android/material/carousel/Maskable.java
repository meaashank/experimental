package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.InterfaceC4348w;

/* JADX INFO: loaded from: classes4.dex */
interface Maskable {
    @NonNull
    RectF getMaskRectF();

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10);

    void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener);
}
