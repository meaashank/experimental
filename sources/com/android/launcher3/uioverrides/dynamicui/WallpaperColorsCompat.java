package com.android.launcher3.uioverrides.dynamicui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperColorsCompat {
    public static final int HINT_SUPPORTS_DARK_TEXT = 1;
    public static final int HINT_SUPPORTS_DARK_THEME = 2;
    private final int mColorHints;
    private final int mPrimaryColor;
    private final int mSecondaryColor;
    private final int mTertiaryColor;

    public WallpaperColorsCompat(int i10, int i11, int i12, int i13) {
        this.mPrimaryColor = i10;
        this.mSecondaryColor = i11;
        this.mTertiaryColor = i12;
        this.mColorHints = i13;
    }

    public int getColorHints() {
        return this.mColorHints;
    }

    public int getPrimaryColor() {
        return this.mPrimaryColor;
    }

    public int getSecondaryColor() {
        return this.mSecondaryColor;
    }

    public int getTertiaryColor() {
        return this.mTertiaryColor;
    }
}
