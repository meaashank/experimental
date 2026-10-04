package com.google.android.material.transition.platform;

import e.T;

/* JADX INFO: loaded from: classes4.dex */
@T(21)
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    public FitModeResult(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.startScale = f10;
        this.endScale = f11;
        this.currentStartWidth = f12;
        this.currentStartHeight = f13;
        this.currentEndWidth = f14;
        this.currentEndHeight = f15;
    }
}
