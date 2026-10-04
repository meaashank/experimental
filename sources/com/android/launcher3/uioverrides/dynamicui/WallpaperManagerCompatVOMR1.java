package com.android.launcher3.uioverrides.dynamicui;

import android.annotation.TargetApi;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.app.WallpaperManager$OnColorsChangedListener;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(27)
public class WallpaperManagerCompatVOMR1 extends WallpaperManagerCompat {
    private static final String TAG = "WMCompatVOMR1";
    private Method mWCColorHintsMethod;
    private final WallpaperManager mWm;

    public WallpaperManagerCompatVOMR1(Context context) throws Throwable {
        this.mWm = (WallpaperManager) context.getSystemService(WallpaperManager.class);
        f.a();
        try {
            this.mWCColorHintsMethod = f.a().getDeclaredMethod("getColorHints", null);
        } catch (Exception e10) {
            Log.e(TAG, "getColorHints not available", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WallpaperColorsCompat convertColorsObject(WallpaperColors wallpaperColors) {
        if (wallpaperColors == null) {
            return null;
        }
        Color primaryColor = wallpaperColors.getPrimaryColor();
        Color secondaryColor = wallpaperColors.getSecondaryColor();
        Color tertiaryColor = wallpaperColors.getTertiaryColor();
        int iIntValue = 0;
        int argb = primaryColor != null ? primaryColor.toArgb() : 0;
        int argb2 = secondaryColor != null ? secondaryColor.toArgb() : 0;
        int argb3 = tertiaryColor != null ? tertiaryColor.toArgb() : 0;
        try {
            Method method = this.mWCColorHintsMethod;
            if (method != null) {
                iIntValue = ((Integer) method.invoke(wallpaperColors, null)).intValue();
            }
        } catch (Exception e10) {
            Log.e(TAG, "error calling color hints", e10);
        }
        return new WallpaperColorsCompat(argb, argb2, argb3, iIntValue);
    }

    @Override // com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat
    public void addOnColorsChangedListener(final WallpaperManagerCompat.OnColorsChangedListenerCompat onColorsChangedListenerCompat) {
        this.mWm.addOnColorsChangedListener(new WallpaperManager$OnColorsChangedListener() { // from class: com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompatVOMR1.1
            public void onColorsChanged(WallpaperColors wallpaperColors, int i10) {
                onColorsChangedListenerCompat.onColorsChanged(WallpaperManagerCompatVOMR1.this.convertColorsObject(wallpaperColors), i10);
            }
        }, null);
    }

    @Override // com.android.launcher3.uioverrides.dynamicui.WallpaperManagerCompat
    @Nullable
    public WallpaperColorsCompat getWallpaperColors(int i10) {
        return convertColorsObject(this.mWm.getWallpaperColors(i10));
    }
}
