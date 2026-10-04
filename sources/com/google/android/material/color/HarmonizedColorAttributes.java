package com.google.android.material.color;

import androidx.annotation.NonNull;
import com.google.android.material.R;
import e.InterfaceC4332f;
import e.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class HarmonizedColorAttributes {
    private static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {R.attr.colorError, R.attr.colorOnError, R.attr.colorErrorContainer, R.attr.colorOnErrorContainer};
    private final int[] attributes;

    @a0
    private final int themeOverlay;

    private HarmonizedColorAttributes(@NonNull @InterfaceC4332f int[] iArr, @a0 int i10) {
        if (i10 != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i10;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@NonNull @InterfaceC4332f int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @NonNull
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, R.style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] getAttributes() {
        return this.attributes;
    }

    @a0
    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@NonNull @InterfaceC4332f int[] iArr, @a0 int i10) {
        return new HarmonizedColorAttributes(iArr, i10);
    }
}
