package com.google.android.material.elevation;

import G0.C1162y;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes4.dex */
public class ElevationOverlayProvider {
    private static final float FORMULA_MULTIPLIER = 4.5f;
    private static final float FORMULA_OFFSET = 2.0f;
    private static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    private final int colorSurface;
    private final float displayDensity;
    private final int elevationOverlayAccentColor;
    private final int elevationOverlayColor;
    private final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(@NonNull Context context) {
        this(MaterialAttributes.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), MaterialColors.getColor(context, R.attr.elevationOverlayColor, 0), MaterialColors.getColor(context, R.attr.elevationOverlayAccentColor, 0), MaterialColors.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean isThemeSurfaceColor(@InterfaceC4337k int i10) {
        return C1162y.D(i10, 255) == this.colorSurface;
    }

    public int calculateOverlayAlpha(float f10) {
        return Math.round(calculateOverlayAlphaFraction(f10) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f10) {
        if (this.displayDensity <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @InterfaceC4337k
    public int compositeOverlay(@InterfaceC4337k int i10, float f10, @NonNull View view) {
        return compositeOverlay(i10, getParentAbsoluteElevation(view) + f10);
    }

    @InterfaceC4337k
    public int compositeOverlayIfNeeded(@InterfaceC4337k int i10, float f10, @NonNull View view) {
        return compositeOverlayIfNeeded(i10, getParentAbsoluteElevation(view) + f10);
    }

    @InterfaceC4337k
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10, @NonNull View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f10);
    }

    public float getParentAbsoluteElevation(@NonNull View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    @InterfaceC4337k
    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    @InterfaceC4337k
    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    @InterfaceC4337k
    public int compositeOverlay(@InterfaceC4337k int i10, float f10) {
        int i11;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f10);
        int iAlpha = Color.alpha(i10);
        int iLayer = MaterialColors.layer(C1162y.D(i10, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i11 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, C1162y.D(i11, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return C1162y.D(iLayer, iAlpha);
    }

    @InterfaceC4337k
    public int compositeOverlayIfNeeded(@InterfaceC4337k int i10, float f10) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i10)) ? compositeOverlay(i10, f10) : i10;
    }

    @InterfaceC4337k
    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10) {
        return compositeOverlayIfNeeded(this.colorSurface, f10);
    }

    public ElevationOverlayProvider(boolean z10, @InterfaceC4337k int i10, @InterfaceC4337k int i11, @InterfaceC4337k int i12, float f10) {
        this.elevationOverlayEnabled = z10;
        this.elevationOverlayColor = i10;
        this.elevationOverlayAccentColor = i11;
        this.colorSurface = i12;
        this.displayDensity = f10;
    }
}
