package com.google.android.material.color;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import e.a0;

/* JADX INFO: loaded from: classes4.dex */
public class ColorContrastOptions {

    @a0
    private final int highContrastThemeOverlayResourceId;

    @a0
    private final int mediumContrastThemeOverlayResourceId;

    public static class Builder {

        @a0
        private int highContrastThemeOverlayResourceId;

        @a0
        private int mediumContrastThemeOverlayResourceId;

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHighContrastThemeOverlay(@a0 int i10) {
            this.highContrastThemeOverlayResourceId = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMediumContrastThemeOverlay(@a0 int i10) {
            this.mediumContrastThemeOverlayResourceId = i10;
            return this;
        }
    }

    @a0
    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    @a0
    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }
}
