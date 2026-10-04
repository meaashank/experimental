package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CorePalette {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TonalPalette f150787a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public TonalPalette f150788a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public TonalPalette f150789a3;
    public TonalPalette error;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TonalPalette f150790n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public TonalPalette f150791n2;

    private CorePalette(int i10, boolean z10) {
        Hct hctFromInt = Hct.fromInt(i10);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z10) {
            this.f150787a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f150788a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f150789a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f150790n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f150791n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f150787a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f150788a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f150789a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f150790n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f150791n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }

    public static CorePalette contentOf(int i10) {
        return new CorePalette(i10, true);
    }

    public static CorePalette of(int i10) {
        return new CorePalette(i10, false);
    }
}
