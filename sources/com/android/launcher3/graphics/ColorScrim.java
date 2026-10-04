package com.android.launcher3.graphics;

import G0.C1162y;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.view.animation.Interpolator;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.uioverrides.WallpaperColorInfo;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class ColorScrim extends ViewScrim {
    private final int mColor;
    private int mCurrentColor;
    private final Interpolator mInterpolator;

    public ColorScrim(View view, int i10, Interpolator interpolator) {
        super(view);
        this.mColor = i10;
        this.mInterpolator = interpolator;
    }

    public static ColorScrim createExtractedColorScrim(View view) {
        WallpaperColorInfo wallpaperColorInfo = WallpaperColorInfo.getInstance(view.getContext());
        ColorScrim colorScrim = new ColorScrim(view, C1162y.D(wallpaperColorInfo.getSecondaryColor(), view.getResources().getInteger(R.integer.extracted_color_gradient_alpha)), Interpolators.LINEAR);
        colorScrim.attach();
        return colorScrim;
    }

    @Override // com.android.launcher3.graphics.ViewScrim
    public void draw(Canvas canvas, int i10, int i11) {
        if (this.mProgress > 0.0f) {
            canvas.drawColor(this.mCurrentColor);
        }
    }

    @Override // com.android.launcher3.graphics.ViewScrim
    public void onProgressChanged() {
        this.mCurrentColor = C1162y.D(this.mColor, Math.round(this.mInterpolator.getInterpolation(this.mProgress) * Color.alpha(this.mColor)));
    }
}
