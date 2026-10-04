package com.github.appintro.indicator;

import android.content.Context;
import android.view.View;
import e.InterfaceC4337k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IndicatorController {
    @InterfaceC4337k
    int getSelectedIndicatorColor();

    @InterfaceC4337k
    int getUnselectedIndicatorColor();

    void initialize(int i10);

    @NotNull
    View newInstance(@NotNull Context context);

    void selectPosition(int i10);

    void setSelectedIndicatorColor(int i10);

    void setUnselectedIndicatorColor(int i10);
}
